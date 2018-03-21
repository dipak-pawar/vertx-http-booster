#!/usr/bin/env bash

mkdir temp && cd temp
git clone https://github.com/dipak-pawar/arquillian-cube && cd arquillian-cube && git fetch origin fmp_int
git checkout fmp_int
mvn clean install -DskipTests

cd ../.. && rm -rf temp
