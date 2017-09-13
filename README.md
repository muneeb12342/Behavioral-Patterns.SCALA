# Behavioral-Patterns.SCALA
## Chain of Responsibility
- It decouples the sender of a request from its reciever and give more than one objects , an opportunity to control that request
- The request is processed by a chain until any object handles it 
- e.g A Loan request,this request is processed by my objects like a clerk,manager etc untill any object will handle it

## Command Pattern
- It is used to encapsulate all the Information which is required to call a method e.g method name,object name,values etc
- It is useful to delay ,sequence or log method calls.
- e.g A remote which is used to Light ON and Light OFF the bulb.

## Dependency Injection
- One object supplies all the dependencies of the another Object
- It allow to avoid hard coded dependencies and to substitute dependencies  either at a run time or at a compile time

## Null Object
- It represents the absence of an object by defining a neutral "do nothing" behavior
- It works with built in constructors

## Strategy
- It defines the family of algorithms and let the algorithm vary independently from the clients that use it
- The path is handy when you choose algorithm at the run time

## Value Object
- It is immutable Object
- It represents a simple entity whose equality is not based on indentity 
- Value Objects are equal if their all fields are equal
- it is used to present numbers,dates,colors etc
