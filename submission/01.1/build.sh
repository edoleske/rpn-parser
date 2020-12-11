#!/bin/bash

mkdir -p build

# Use ANTLR to generate supporting Java class definitions
java -Xmx500M -cp "antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool RPNCalculator.g4 -no-listener -visitor -o build

# Move source code to build folder and compile all classes
cp *.java build
javac -classpath antlr-4.7.1-complete.jar build/*.java

echo "Successfully compiled."

# Run program with test.data
java -cp ./build:antlr-4.7.1-complete.jar RPNParse test.data
