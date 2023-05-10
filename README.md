# JAVA Programming

## Basic syntax: 
- Case sensitivity: java is case sensitive 
- Class name: first letter upper case, each inner word's first letter is upper case (`MyFirstJavaClass`)
- Method name: first letter lower case, each inner word's first letter is upper case (`myMethodName()`)
- Program file name: Name of the program file should exactly match the class name if it's a public class. 
- Java program processing starts from the `main()` method which is a mandatory part of every Java program. 
    `public static void main(String args[]){}` 

## Identifiers:
- All Java components require names. Names used for classes, variables, and methods are called identifiers.
- In Java, there are several points to remember about identifiers. They are as follows −
    - All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
    - After the first character, identifiers can have any combination of characters.
    - A key word cannot be used as an identifier.
    - Most importantly, identifiers are case-sensitive.
    - Examples of legal identifiers: `age`, `$salary`, `_value`, `__1_value`.
    - Examples of illegal identifiers: `123abc`, `-salary`.

## Modifiers:
Like other languages, it is possible to modify classes, methods, etc., by using modifiers.
There are two categories of modifiers −
- Access Modifiers − `default`, `public`, `protected`, `private`
- Non-access Modifiers − `final`, `abstract`

## Variables:
Following are the types of variables in Java:
- Local Variables
- Class Variables (Static Variables)
- Instance Variables (Non-static Variables)


## Source File Declaration Rules:
- There can be only one public class per source file.
- A source file can have multiple non-public classes.
- The public class name should be the name of the source file as well which should be appended by `.java` at the end. 
    For example: the class name is public class Employee{} then the source file should be as Employee.java.
- If the class is defined inside a package, then the package statement should be the first statement in the source file.
- If import statements are present, then they must be written between the package statement and the class declaration. 
- If there are no package  statements, then the import statement should be the first line in the source file.
- Import and package statements will imply to all the classes present in the source file. 
    It is not possible to declare different import and/or package statements to different classes in the source file.


## OOP 


## Java 8 to 17 all feature changes
#### Ref 
- https://www.happycoders.eu/java/java-10-features/
- https://reflectoring.io/java-release-notes/
- https://www.baeldung.com/java-migrate-8-to-17


## Java 8 Features:
- Interface default and static method
- ForEach
- Lambda expression
- Streams API (https://www.baeldung.com/java-8-streams)
-

## Java 17 Features:
- Sealed classes (https://www.youtube.com/watch?v=glvYULuaf-k&t=1s)
- Record class (https://www.youtube.com/watch?v=pmVgs8wOk5o)
- Switch statement and expression (https://www.youtube.com/watch?v=AZb1wLIQ1R4)

#### Ref
- https://www.baeldung.com/java-17-new-features
