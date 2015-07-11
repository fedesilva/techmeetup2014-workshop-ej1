
# Scala Workshop - Tech Meetup 2014

## Exercise 1

#### Goal

En `src/test/resources` you will find a text file, `HistorySong.txt`. This file contains text in a semi-structured format. That is, some lines have some structure and others not.

The content is a transcription (less some data) of a file originally generated to analyze the performance of a real system: a recommender for an online radio.

The goal of the exercise is detecting if there are duplicated songs, and if there are: 
* Emit which ones.
* How many distinct songs (not entries, songs).
* How many times each one is repeated.

It is enough to emit ids (columns song id or seed id).

#### Tests and implementation

In `src/test/scala/` you will find a file `DuplicatesTest` with the tests to validate the implementation.
In `src/test/scala/` in the file `Duplicates` you will find stub functions which you need to complete.

#### Some suggested techniques 

* String splitting and pattern matching against arrays.
* Pattern matching with regular expressions.


