#!/bin/bash

mkdir -p build

# Use ANTLR to generate supporting Java class definitions
cd src
java -Xmx500M -cp "../lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool RPNCalculator.g4 -no-listener -visitor -o ../build
cd ..

# Move source code to build folder and compile all classes
cp src/*.java build
javac -classpath ./lib/antlr-4.7.1-complete.jar build/*.java

echo "Successfully compiled."

# Run program with test.data
java -cp ./build:./lib/antlr-4.7.1-complete.jar RPNParse test.data
