## Miscellaneous Topics
- Static import
- Static (variable, method, block)
- Final (variable, method, class)
- Serialization
- POJO and Bean
- Reflection
- Comparable

### Static import
With the help of static import, we can access the static members of a class directly without class name or any object.
For Example: we always use sqrt() method of Math class by using Math class i.e. `Math.sqrt()`, but by using static import we can access `sqrt()` method directly.

```java
import static java.lang.System.out;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        out.println(sqrt(4));
    }
}
```

### Final (variable, method, class)
- **Final variable:** meant not to be assigned after its first initialization
- **Final method:** meant not to be overridden by derived class
- **Final class:** meant not to be extended (inherited) by other classes

### Serialization
Serialization in Java is a mechanism of writing the state of an **object** into a **byte-stream**. 
It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.

The reverse operation of serialization is called deserialization where byte-stream is converted into an object. 
The serialization and deserialization process is platform-independent, it means you can serialize an object on one platform and deserialize it on a different platform.

For serializing the object, we call the `writeObject()` method of `ObjectOutputStream` class, 
and for deserialization we call the `readObject()` method of `ObjectInputStream` class.

We must have to implement the Serializable interface for serializing the object.

For more details see the references. 

#### Ref: 
- https://www.javatpoint.com/serialization-in-java

### POJO and Bean

#### POJO:
- Plain Old Java Object
- No reference to any particular framework
- POJO class can be used by any Java program as it's not tied to any framework.
- No naming convention for properties and methods.
- Doesn't follow any real convention for constructing, accessing, or modifying the class's state.

```java
public class EmployeePojo {

    public String firstName;
    public String lastName;
    private LocalDate startDate;

    public EmployeePojo(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getStart() {
        return this.startDate;
    }
}
```

- Reflection with POJO

let's inspect the properties of our POJO:

```java
List<String> propertyNames =
  PropertyUtils.getPropertyDescriptors(EmployeePojo.class).stream()
    .map(PropertyDescriptor::getDisplayName)
    .collect(Collectors.toList());
```

If we were to print out propertyNames to the console, we'd only see:

```java
[start]
```

Here, we see that we only get start as a property of the class. PropertyUtils failed to find the other two.

#### Bean:
A Java Bean is still a POJO but introduces a strict set of rules around how we implement it:

- **Access levels** – properties are private and we expose getters and setters
- **Method names** – getters and setters follow the getX and setX convention (in the case of a boolean, isX can be used for a getter)
- **Default Constructor** – a no-argument constructor must be present so an instance can be created without providing arguments, for example during deserialization
- **Serializable** – implementing the Serializable interface allows us to store the state

```java
public class EmployeeBean implements Serializable {

    private static final long serialVersionUID = -3760445487636086034L;
    private String firstName;
    private String lastName;
    private LocalDate startDate;

    public EmployeeBean() {
    }

    public EmployeeBean(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //  additional getters/setters

}
```

- Reflection with a Bean

    When we inspect the bean with reflection, now we get the full list of the properties:
    ```java
    [firstName, lastName, startDate] 
    ```

- Tradeoffs when using Bean
  - Mutability – Java Beans are mutable due to their setter methods – this could lead to concurrency or consistency issues
  - Boilerplate – we must introduce getters for all properties and setters for most, much of this might be unnecessary 
  - Zero-argument Constructor – we often need arguments in our constructors to ensure the object gets instantiated in a valid state, but the Java Bean standard requires us to provide a zero-argument constructor

For more details check the references. 

#### Ref:
- https://www.baeldung.com/java-pojo-class


### Reflection
Java reflection allows us to inspect and/or modify runtime attributes of classes, interfaces, fields and methods. 
This particularly comes in handy when we don't know their names at compile time.
Additionally, we can instantiate new objects, invoke methods and get/set field values using reflection.

To use java reflection following import is required - 

```java
import java.lang.reflect.*;
```

#### Simple Example
Let's create a simple `Person` class with only `name` and `age` fields and no methods at all.

```java
class Person {
    private String name;
  private int age;
}
```

We'll now use Java reflection to discover the names of all fields of this class.

```java
public static void getClassFieldNames() {
    Object person = new Person();
    Field[] fields = person.getClass().getDeclaredFields();

    List<String> actualFieldNames = Arrays.stream(fields).map(Field::getName).toList();

    System.out.println(actualFieldNames);
}
```

#### Use cases of Java Reflection
- Inspecting Java Classes
- Inspecting constructors
- Inspecting fields
- Inspecting methods

For more details please read the references below. 

#### Ref:
- https://www.baeldung.com/java-reflection


### Comparable

