@echo off
if not exist "%~dp0\build" mkdir %~dp0\build

java -Xmx500M -classpath "antlr-4.7.1-complete.jar;$CLASSPATH" org.antlr.v4.Tool RPNCalculator.g4 -no-listener -visitor -o build

copy *.java build
javac -classpath ".\antlr-4.7.1-complete.jar" build\*.java

echo "Successfully compiled"

java -cp ".\build;.\antlr-4.7.1-complete.jar" RPNParse test.data
