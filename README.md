# DCSS_Small_Ad_System

## Building and running unit tests
To build and run the unit tests, I have put together a few small bash scripts.
These will run given that you have junit and hamcrest added to your classpath.

1) Run `. build_classes.sh` to compile the `.java` files in `JoeFox/` and
`JoeFoxTest/`. This will need running every time a change is made to a `.java`
file.

2) Run `. run_unit_tests.sh`. This does the magic for you.

## Pre asignment notes
1) Package things up.

    `package JoeFox.Templates;`

    `import JoeFox.Templates.*;`

2) Core Use Cases. (Use as a core starting point)

    a. Post Advert.

    b. Browse Adverts.

3) Break application into separate components. Start small and work up.

4) Threads could be useful for this with different threads.

5) Wrapper class for Space Operations (MVC)

6) Do basic requirements first. At least two of the additional should be
implemented, the more the merrier though.

7) An identification system would be useful. A username/password template
submitted to the space indefinitely would be ideal.
