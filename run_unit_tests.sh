#!/bin/bash

# Enter the namespace of the class to test minus the JoeFox. component
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
