# Gilded Rose Refactoring Kata

This Kata was originally created by [Terry Hughes](http://twitter.com/TerryHughes). It is already on GitHub [here](https://github.com/NotMyself/GildedRose). See also [Bobby Johnson's description of the kata](http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/).

I picked up this Java Refactoring Kata from [Emily Bache](https://twitter.com/emilybache) in her GitHub multilingual [Gilded Rose Refactoring Kata](https://github.com/emilybache/GildedRose-Refactoring-Kata) page. Emily translated the original C# Kata into other programming languages, where I started training the Java Kata.

The main goal of this kata is to train your refactoring skills. But, also, is really useful for practicing writing good tests using different frameworks, approaches and it gives you a  better practice at handling a legacy code situation. Emily added text fixtures for Text-Based approval testing with TextTest (see [the TextTests](https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/texttests) from Emily's GitHub).


## How to use this Kata

First of all, you can download the starter folder with the original Java Gilded Rose kata. The final folder contains my code, which one of the final results possible in this refactoring Kata.

**NOTES**
>My code contains some Spanish comments.

Then, the simplest way is to clone the code (or rewrite the file) and start coding. You must look at the ["Gilded Rose Requirements"](https://github.com/guimarbe/GildedRose-Refactoring-Kata/GildedRoseRequirements.txt) which explains what the code is for. You will also need some tests if you want to make sure you don't break the code while you refactor.

Emily provided some failing unit test in a popular test framework as a starting point. You can write some unit test by yourself. The idea of this exercise is to practice and improve your skills at designing test cases and refactoring, not focusing to re-write the code from scratch. Running the tests often and incrementally improving the design is key.


## Text-Based Approval Testing
Take a look at the original commentary about text-based approval testing from Emily's GitHub. 

>This is a testing approach which is very useful when refactoring legacy code. Before you change the code, you run it, and gather the output of the code as a plain text file. You review the text, and if it correctly describes the behaviour as you understand it, you can "approve" it, and save it as a "Golden Master". Then after you change the code, you run it again, and compare the new output against the Golden Master. Any differences, and the test fails.

>It's basically the same idea as "assertEquals(expected, actual)" in a unit test, except the text you are comparing is typically much longer, and the "expected" value is saved from actual output, rather than being defined in advance.

>Typically a piece of legacy code may not produce suitable textual output from the start, so you may need to modify it before you can write your first text-based approval test. That could involve inserting log statements into the code, or just writing a "main" method that executes the code and prints out what the result is afterwards. It's this latter approach we are using here to test GildedRose."
	- *Emily Bache*

## Build with
I personally used this tools to code the Gilded Rose Kata:
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/)
* [Apache Maven](https://maven.apache.org/)

## Authors
* [Terry Hughes](http://twitter.com/TerryHughes) - Original author
* [Emily Bache](https://twitter.com/emilybache) - Translated to Java and add some unit tests

### Articles from the authors
* ["Why Most Solutions to Gilded Rose Miss The Bigger Picture"](http://iamnotmyself.com/2012/12/07/why-most-solutions-to-gilded-rose-miss-the-bigger-picture), by Bobby Johnson.
* ["Writing Good Tests for the Gilded Rose Kata"](http://coding-is-like-cooking.info/2013/03/writing-good-tests-for-the-gilded-rose-kata/), by Emily Bache.
