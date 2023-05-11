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
- **Final method:** meant not to be overriden by derived class
- **Final class:** meant not to be extended (inherited) by other classes