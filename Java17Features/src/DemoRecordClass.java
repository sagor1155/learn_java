public class DemoRecordClass {
    public static void runDemo() {
        Person person = new Person(1, "Robert");
        System.out.println(person.getName());

        Employee employee = new Employee(1, "John");
        System.out.println(employee.name());
    }

}

// Without record class
class Person {
    private final Integer id;
    private final String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// with record class
// record classes can be used for data storage classes
// The classes that only holds data and don't perform any data processing and/or business logics
record Employee(Integer id, String name) { }