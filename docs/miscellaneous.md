## Miscellaneous Topics
- Static import

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