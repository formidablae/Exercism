# Bank Account

Welcome to Bank Account on Exercism's Scala Track.
If you need help running the tests or submitting your code, check out `HELP.md`.

## Instructions

Simulate a bank account supporting opening/closing, withdrawals, and deposits
of money. Watch out for concurrent transactions!

A bank account can be accessed in multiple ways. Clients can make
deposits and withdrawals using the internet, mobile phones, etc. Shops
can charge against the account.

Create an account that can be accessed from multiple threads/processes
(terminology depends on your programming language).

It should be possible to close an account; operations against a closed
account must fail.

## Instructions

Run the test file, and fix each of the errors in turn. When you get the
first test to pass, go to the first pending or skipped test, and make
that pass as well. When all of the tests are passing, feel free to
submit.

Remember that passing code is just the first step. The goal is to work
towards a solution that is as readable and expressive as you can make
it.

Have fun!

This exercise is testing mutable state that can be accessed saftely from multiple threads. Scala provides a variety of ways to protect 
mutable state. For developers familiar with Java concurrency, Scala can utilize the Java concurrency support such as the Java synchronized block.

## Common Pitfalls

In Scala there are two ways to achieve mutable state: Use a "var" or a mutable object.
Two common mistakes here are:
- Do not use a "var" that is also a mutable object. One is enough, but not both together.
- Don't expose the "var" or mutable object to the outside world. So make them "private" and change the mutable object into immutable before you return it as a value.

## Source

### Created by

- @ricemery

### Contributed to by

- @ErikSchierboom
- @Freshwood
- @kytrinyx
- @nlochschmidt
- @ppartarr
- @rajeshpg