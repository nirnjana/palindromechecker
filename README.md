# palindromechecker
palindrome checker app
📘 PALINDROME CHECKER APPLICATION

Project Title: PalindromeChecker App
Language: Java
Execution Type: Console-Based Application

✅ UC1 – Application Startup & Welcome Screen
🎯 Goal

Display application name and version when the program starts.

👤 Actor

User

🔄 Flow

Program starts.

JVM invokes main() method.

Application name is displayed.

Application version is displayed.

Control moves to next use case.

🧠 Key Concepts

Class

public static void main(String[] args)

Static keyword

Console output (System.out.println)

Program flow control

📊 Data Structure

None (Console execution)

✅ UC2 – Basic Palindrome Check (Direct Comparison)
🎯 Goal

Check palindrome using simple forward-backward comparison.

🔄 Flow

Accept string input.

Compare first and last characters.

Continue inward comparison.

Display result.

🧠 Key Concepts

String indexing

Looping

Conditional statements

📊 Data Structure

String

✅ UC3 – Palindrome Check Using String Reverse
🎯 Goal

Reverse the string manually and compare.

🔄 Flow

Reverse string using for loop.

Compare original and reversed string.

Display result.

🧠 Key Concepts

For loop

String immutability

String concatenation (+)

equals() method

📊 Data Structure

String

✅ UC4 – Character Array Based Palindrome Check
🎯 Goal

Convert string to char[] and apply two-pointer technique.

🔄 Flow

Convert string to char[].

Use two pointers (start & end).

Compare characters.

Continue until middle.

🧠 Key Concepts

Character array (char[])

Array indexing

Two-pointer technique

Efficient comparison

📊 Data Structure

char[]

✅ UC5 – Using StringBuilder Reverse Method
🎯 Goal

Use built-in reverse functionality.

🔄 Flow

Convert string to StringBuilder.

Call .reverse().

Compare with original string.

🧠 Key Concepts

StringBuilder

Built-in methods

Object comparison

📊 Data Structure

StringBuilder

✅ UC6 – Queue + Stack Based Palindrome Check
🎯 Goal

Demonstrate FIFO vs LIFO behavior.

🔄 Flow

Enqueue characters into Queue.

Push characters into Stack.

Compare dequeue and pop results.

🧠 Key Concepts

Queue (FIFO)

Stack (LIFO)

Enqueue / Dequeue

Push / Pop

Logical comparison

📊 Data Structures

Queue, Stack

✅ UC7 – Deque-Based Optimized Palindrome Checker
🎯 Goal

Use Deque to compare front and rear directly.

🔄 Flow

Insert characters into Deque.

Remove first and last elements.

Compare until empty.

🧠 Key Concepts

Deque (Double Ended Queue)

Front & Rear access

Efficient data handling

📊 Data Structure

Deque

✅ UC8 – Linked List Based Palindrome Checker
🎯 Goal

Check palindrome using singly linked list.

🔄 Flow

Convert string to linked list.

Find middle using fast & slow pointer.

Reverse second half.

Compare both halves.

🧠 Key Concepts

Singly Linked List

Node traversal

Fast & slow pointer

In-place reversal

📊 Data Structure

Singly Linked List

✅ UC9 – Recursive Palindrome Checker
🎯 Goal

Check palindrome using recursion.

🔄 Flow

Compare start & end characters.

Recursive call with reduced indices.

Stop when base condition met.

🧠 Key Concepts

Recursion

Base condition

Call stack

Problem reduction

📊 Data Structure

Call Stack

✅ UC10 – Case-Insensitive & Space-Ignored Palindrome
🎯 Goal

Ignore spaces and case differences.

🔄 Flow

Convert string to lowercase.

Remove spaces using regex.

Apply palindrome logic.

🧠 Key Concepts

String preprocessing

Regular expressions

Normalization

📊 Data Structure

String / Array

✅ UC11 – Object-Oriented Palindrome Service
🎯 Goal

Encapsulate palindrome logic in a service class.

🔄 Flow

Create PalindromeChecker class.

Implement checkPalindrome() method.

Use object to invoke method.

🧠 Key Concepts

Encapsulation

Single Responsibility Principle

Method abstraction

📊 Data Structure

Internal (Array / Stack)

✅ UC12 – Strategy Pattern for Palindrome Algorithms
🎯 Goal

Choose palindrome algorithm dynamically at runtime.

🔄 Flow

Define PalindromeStrategy interface.

Implement multiple strategy classes.

Inject strategy at runtime.

🧠 Key Concepts

Interface

Polymorphism

Strategy Pattern

Runtime behavior change

📊 Data Structure

Varies per strategy

✅ UC13 – Performance Comparison
🎯 Goal

Compare execution time of different palindrome methods.

🔄 Flow

Execute multiple algorithms.

Capture execution time using System.nanoTime().

Display comparison results.

🧠 Key Concepts

System.nanoTime()

Algorithm analysis

Performance benchmarking

📊 Data Structure

Primitive variables (long)
