FROM openjdk:11.0.11-jdk-slim as build

ARG APPLICATION_VERSION=1.0.1
WORKDIR /workspace/

COPY gradlew build.gradle settings.gradle ./
COPY gradle gradle
COPY src src

RUN echo $APPLICATION_VERSION > build.version

RUN --mount=type=cache,target=/root/.m2/ \
    --mount=type=cache,sharing=locked,target=/root/.gradle \
    ./gradlew -i -s --no-daemon clean build

FROM openjdk:18.0.1.1-jdk

ARG APPLICATION_VERSION=1.0.1
ENV JAVA_OPTS="-Xms1G -Xmx1G -server"

WORKDIR /workspace/
COPY --from=build /workspace/build/libs/plant-name-parser-service-$APPLICATION_VERSION.jar artifact.jar

EXPOSE 8080
ENTRYPOINT exec java ${JAVA_OPTS} -jar artifact.jar
