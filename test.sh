#!/bin/bash

echo "Cleaning previous build..."
mvn clean

echo "Compiling project..."
mvn compile

echo "Running tests..."
mvn test
