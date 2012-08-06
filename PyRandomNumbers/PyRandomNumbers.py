#!/usr/bin/python

import random

def getRandInt(lo, hi):
    diff = hi - lo
    retVal = int(random.random() * diff) + lo
    return retVal

remaining = 3
hasWon = False;
secretNumber = getRandInt(1, 10)

print "~~~RandomNumbers~~~"
for i in range(3, 0, -1):
    print "You have " + str(i) + " guesses left."
    guess = raw_input("Guess: ")
    guess = int(guess)
    if guess == secretNumber:
        print "You Win!"
        hasWon = True
        break
    elif guess < secretNumber:
        print "Too low."
    else:
        print "Too high."
    print ""

if hasWon == True:
    print "Congrats"
else:
    print "Too bad. The secret number was " + str(secretNumber) + "."
