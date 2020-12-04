#!/bin/bash

mkdir -p build

cd src
java -Xmx500M -cp "../lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool RPNCalculator.g4 -no-listener -visitor -o ../build
cd ..

cp src/*.java build
javac -classpath ./lib/antlr-4.7.1-complete.jar build/*.java

echo "Successfully compiled."

java -cp ./build:./lib/antlr-4.7.1-complete.jar RPNParse
