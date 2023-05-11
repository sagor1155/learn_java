## Miscellaneous Topics
- Static import
- Final (variable, method, class)

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

### POJO
- Plain Old Java Object

#### Ref:
- https://www.baeldung.com/java-pojo-class
- 

### Bean

