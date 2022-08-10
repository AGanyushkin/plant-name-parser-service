/*
    https://www.gardenersworld.com/plants/gardening-for-beginners-latin-plant-names/
*/

grammar PlantNames;

WS : [ \t\r\n]+ -> skip ;

DOT : '.' ;
dot : DOT ;
PARENTS : ['"«»\u201C\u201D] ;
BRACKET : [()] ;
COMMA : ',' ;

/* numbers ------------------------------------------------------------ */
fragment DIGIT : [0-9] ;

///* roman numbers ------------------------------------------------------ */
//roman  : (oneThousand)* hundreds? tens? units? ;
//// --- I, II, III, IV, IX or V VI, VII, VIII
//units : one ((one)* | five  | ten) | five (one)* ;
//// --- X, XX, XXX, XL, XC or L, LX, LXX, LXXX
//tens  : ten ((ten)* | fifty | oneHundred) | fifty (ten)* ;
//// --- C, CC, CCC, CD, CM or D, DC, DCC, DCCC
//hundreds : oneHundred ((oneHundred)* | fiveHundred | oneThousand) | fiveHundred (oneHundred)* ;
//// --- atomic definitions
//one         : 'I' ;
//five        : 'V' ;
//ten         : 'X' ;
//fifty       : 'L' ;
//oneHundred  : 'C' ;
//fiveHundred : 'D' ;
//oneThousand : 'M' ;

/* strings ------------------------------------------------------------ */
INSETDELIMITER : [x\u00D7] ;

// \u00f6\u00d6\u00c4\u00e4
// https://en.wikipedia.org/wiki/Latin_script_in_Unicode
// Latin Extended-B : \u0180-\u024F
// Latin Extended-A : \u0100-\u017F
// Latin-1 Supplement : \u0080-\u00FF, letters : \u00C0-\u00FF
// Cyrillic : \u0400-\u04FF
STR : [0-9a-zA-Z\-\u0400-\u04FF\u00C0-\u00FF]+ ;

/* -------------------------------------------------------------------- */

insetdelimiter : INSETDELIMITER ;

namestr : STR ;

genus : namestr ;
species : namestr ;

SUBSPECIESPREFIX : ('subsp' | 'подв') DOT;
subspecies : SUBSPECIESPREFIX namestr+ ;

VARIETYPREFIX : ('var' | 'разн') DOT;
variety : VARIETYPREFIX namestr+ ;

abbr : STR DOT ;
SEL : 'sel' DOT ; // selection
cultivarname : namestr* (namestr+ | abbr+ ) namestr* ;
cultivar : (PARENTS cultivarname PARENTS) | (SEL cultivarname) ;

FORMPREFIX : ('f' | 'ф') DOT;
form : FORMPREFIX namestr+ ;

alternative : BRACKET namestr+ BRACKET ;

plantname :
    genus
    insetdelimiter?
    alternative?
    species?
    alternative?
    subspecies?
    variety?
    cultivar?
    form?
    EOF
    ;
