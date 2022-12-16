__plant-name-parser-service__ - parse and provide structured view for plant names in string representation

In this project __ANTLR v4__ was used to implement name parser. 

# Development

Run configurations for IntelliJ Idea are here: `./runConfigurations`

# Service API

## Docs
You can find here: `./docs`

And in swagger: http://localhost:8080/swagger-ui.html

## Monitoring
health check : http://localhost:8080/actuator/health

build info   : http://localhost:8080/actuator/info

_also, Spring Boot Actuator can be configured with additional reports_

## Requests
Example request
```json
POST http://localhost:8080/api/v1/parse
Content-Type: application/json

{
  "text": "betula pendula"
}
```
Example response
```json
HTTP/1.1 200
Content-Type: application/json
Transfer-Encoding: chunked
Date: Wed, 10 Aug 2022 12:58:46 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"genus": {
"text": "betula"
},
"species": {
"text": "pendula"
},
"subspecies": null,
"alternative": null,
"variety": null,
"cultivar": null,
"form": null
}
```
Error response
```
HTTP/1.1 500 
Content-Length: 0
Date: Wed, 10 Aug 2022 13:00:35 GMT
Connection: close

<Response body is empty>
```

# Docker

Build artifact
```bash
docker build --build-arg APPLICATION_VERSION="v1.0.0" -t plant-name-parser-service:v1.0.0 .
```

Run artifact
```bash
docker run -i -t --rm --name plant-name-parser-service -p 8080:8080 \
 --memory=1G --cpus=1 \
 plant-name-parser-service:v1.0.0
 

# Adjust system requirements
docker run -i -t --rm --name plant-name-parser-service -p 8080:8080 \
 --memory=2G --cpus=1 \
 -e JAVA_OPTS="-Xms2G -Xmx2G -server" \
 plant-name-parser-service:v1.0.0
```

# Configuration with environment variables

__PORT__ - default 8080
__API_DOCS_ENABLED__ - enable api-docs, default true
__MANAGEMENT_ENDPOINT_HEALTH__ - enable management health endpoint, default false
__MANAGEMENT_ENDPOINT_INFO__ - enable management info endpoint, default false
