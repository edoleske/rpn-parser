# RPN-Parser

This is a parser for expressions in Reverse Polish Notation using the ANTLR4 language recognition framework. Bash scripts are designed to be run from project root directory (01.1).

The following operators are supported:
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Exponents (^)
- Variable Assignment (=)
- Basic Trigonometric Functions (sin, cos, tan)
- Parenthesis (())

### root (01.1):
- build.sh : Bash script used to build program from source files, uses javac and java system commands
- run.sh : Bash script used to execute program after compilation
- test.data : List of RPN expressions that program parses and evaluates
### src:
- RPNParse.java : The entry point of the execution, which iterates over expressions given per line in test.data
- RPNCalculator.g4 : A grammar file used by the ANTLR4 framework for definitions
- RPNBaseVisitor.java : Definitions for operator rules defined in the grammar, overrides visit methods generated by ANTLR4

Authored by Ethan O'Leske, 2020. 
This program was built with OpenJDK 11.0.7. 
ANTLR 4.7.1 courtesy of The ANTLR Project (http://antlr.org). 