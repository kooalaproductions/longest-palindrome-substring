# Longest Palindrome Substring

## Description

Find the longest palindrom substring from a string

## Workflow

Pass in a string to into a method that checks for palindrome. Create a first simple check if string is less than 2 then it is a palindrome of character 1. Example 'a' is a palindrom itself. Our function `longestPalindrome()` will contain a for loop that will check the length of the string and determine if it is odd or even to invoke another method `checkPalindrome()` that will pass the `string`, `start` and `end`.

`checkPalindrome()` will work from the inside out using `start` to check left characters and `end` to check right characters. The `resultLength` and `resultStart` will be updated as the while loop continues to determine where to print the palindrome within the string.

Finally, after the `resultLength` and `resultStart` is updated the results will be returned `return s.substring(resultStart, resultStart + resultLength)` and will print out the longest palindrome

## Runtime

O(n^2) because it contains a for loop and a while loop
