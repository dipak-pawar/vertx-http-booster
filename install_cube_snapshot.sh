#!/usr/bin/env bash

mkdir temp && cd temp
git clone https://github.com/dipak-pawar/arquillian-cube && cd arquillian-cube && git fetch origin test_fmp_int
git checkout test_fmp_int
mvn clean install -DskipTests -pl '!openshift/ftest-openshift-fmp'

cd .. && rm -rf temp
