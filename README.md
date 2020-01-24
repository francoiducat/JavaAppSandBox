# JavaAppSandBox
Java App SandBox used for playing with java methods


## Identifiers

Allowed : MyClass, MY_CLASS, $MyClass, MyClass_123

## Variables Primitives

- Java Primitives variables types : the most efficient variable to use
- Java stores primitive variables directly in memory
- Non-primitive variables are references to where the value is stored
- Primitives require less memory to store
- Primitives are more efficient to retrieve

|  Primitive |  Description | Default  | Size   |  Range |
|---|---|---|---|---|
|  boolean | True or False  |  | 1  bit | True or False   |
|  byte |  Integer, takes 1 byte of memory | 0  | 16 bits  | -127 to 128  |
|  char |  Unicode character | \u0000  | 16 bits  |  ASCII values 0 to 256 |
|  short |  Integer, takes 2 bytes of memory | 0  | 16 bits  |   |
|  int |  Integer, takes 4 bytes of memory | 0  | 32 bits  |   |
|  long | Integer, takes 8 bytes of memory  | 0  | 64 bits  |   |
|  float |  Floating point number | 0,0  | 32 bits  |   |
|  double | Floating point number  | 0,0  | 64 bits  |   |
    
## Unicode 

- Unicode is a character encoding standard
- Character encoding is a mapping of binary values to human readable values
- Example :

| Human Character | binary representation | unicode code point | java unicode |
|---|---|---|---|
| A | 01000001| U+0041 | \u0041 |
| B | 01000010| U+0042 | \u0042 |
| C | 01000011| U+0043 | \u0043 |


- Unicode is one of MANY character encoding standards
- Reference (https://en.wikibooks.org/wiki/Unicode/Character_reference/0000-0FFF)
## Bits and Bytes

- A bit stores just a 0 or 1
- 16 bits space provides for over 60000 characters
- 8 bits = 1 byte
- One byte can store one character, e.g. 'A'
    - 1 bit - 2 patterns
    - 2 bits - 4 patterns
    - 3 bits - 8 patterns
    - 4 bits - 16 patterns
    - 5 bits - 32 patterns
    - 6 bits - 64 patterns
    - 7 bits - 128 patterns
    - 8 bits - 256 patterns (one byte)
- With 256 different patterns, we can store a number in the range 0..255
    
## BDD

Behavior Driven Development : describes the expected behavior of software, it's expressive. (Given, When, Then)

Spock : BDD Framework

## Testing Components

### Mocks
Fake implementation of a class
### Spy
Like a mock, but real object is used

