#!/bin/bash

tests="
	JoeFoxTest.Exceptions.UserAuth.InvalidAttemptExceptionTest
	JoeFoxTest.Exceptions.UserAuth.InvalidPasswordExceptionTest
	JoeFoxTest.Exceptions.UserAuth.NoSuchPasswordExceptionTest
    JoeFoxTest.UserAuth.PasswordTest
    JoeFoxTest.Templates.TemplateTest
    JoeFoxTest.Templates.Adverts.AdvertTest
    JoeFoxTest.Templates.UserAuth.UserTest
"

echo ""

for test in $tests
do
    echo $test
    java org.junit.runner.JUnitCore $test
    echo "============================================"
    echo ""
done
