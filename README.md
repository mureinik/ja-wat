# Ja-WAT?!

Example files for Allon Mureinik's
[Ja-WAT?](http://www.slideshare.net/AllonMureinik/reversim-summit-2016-jawat)
presentation at [Reversim Summit 2016](http://summit2016.reversim.com/).

## How to use this repository

## Prerequisites

* Java compiler >= 1.8
* Maven (tested with 3.3.9, will probably work with any >= 2 build)

## Building

This project uses standard Maven artifacts, so building should be as easy as

```
ja-wat$ mvn install
```

## Running

Each example has its own `main` method, and they can simply be run from Maven's
`target` directory:

```
ja-wat$ java -cp target/classes org.mureinik.jawat.lists.FunWithLists_Strings
```

## Explanations

Explanations of the output you're seeing is given as comments in the source
code.
