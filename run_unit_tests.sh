#!/bin/bash

tests = "
    JoeFoxTest.Templates.TemplateTest
"

for test in "$tests"
do
    java org.junit.runner.JUnitCore $test
done
