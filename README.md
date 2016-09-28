Exercism Scala
==============

[![GPLv3 License](http://img.shields.io/badge/license-GPLv3-blue.svg)](https://www.gnu.org/copyleft/gpl.html)

[![CircleCI](https://circleci.com/gh/quikkoo/exercism-scala.svg?style=svg)](https://circleci.com/gh/quikkoo/exercism-scala)
[![Build Status](https://snap-ci.com/quikkoo/exercism-scala/branch/master/build_image)](https://snap-ci.com/quikkoo/exercism-scala/branch/master)
[![Codeship Status for quikkoo/exercism-scala](https://app.codeship.com/projects/83f1ed10-631f-0134-f5db-22dce1a7050d/status?branch=master)](https://app.codeship.com/projects/175274)

Scala exercises from [exercism.io](http://exercism.io/)

This is a multi module project for all exercises in scala language,
so it makes easier to  manage and share some of the common features and tasks 
between all exercises,
but each one still can be built individually as well

### Check code

```sh
sbt scalastyle
```

### Run tests

```sh
sbt coverage test coverageReport
```

### Build package

```sh
sbt package
```


Exercises details
-----------------

Eventually some of these exercises are not exactly what you fetch using 
`exercism fetch`, and there are a different reasons for that:

- Some languages have different tests in related to others, 
  so i complete the test suite adding the missing test cases
- Sometimes i use (or i experiment) some different tools and patterns from those 
  used in the original tests
- The code is written aiming to apply some common patterns used by the target 
  language community
- The project is structured using some standard tools, 
  specifically for each technology

Despite these differences, all test suites are essentially the same, it keeps 
the same logic and consistency (in most of cases, i hope).

Feel free to clone this repository and use it to learn or improve your 
development skills, and i also encourage you to create an account on 
[exercism.io](http://exercism.io/)
and share your own solutions and doubts about these exercises and others.

You can also follow the discussion on the exercism track 
[exercism.io/quikkoo](http://exercism.io/quikkoo), 
to suggest me some improvements or to ask questions.
