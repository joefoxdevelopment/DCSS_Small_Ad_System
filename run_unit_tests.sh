#!/bin/bash

# Enter the package of the class to test minus the JoeFox. prefix and the
# Test suffix
tests="
    Exceptions.UserAuth.InvalidAttemptException
    Exceptions.UserAuth.InvalidPasswordException
    Exceptions.UserAuth.NoSuchPasswordException
    Templates.Adverts.Advert
    Templates.Template
    Templates.UserAuth.User
    UserAuth.Password
    UserAuth.PasswordFactory
"

echo ""

prefix="JoeFoxTest."
suffix="Test"

for test in $tests
do
    echo $test
    java org.junit.runner.JUnitCore "$prefix$test$suffix"
    echo "============================================"
    echo ""
done
