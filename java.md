# java stuff

## oop termins

### class
A blueprint/template for creating objects  
`class Person {...}`

### object
An actual instance of a class
`new Person`

### constructor
Initializes a newly created class
`Person(String name) {...}`

### encapsulation
protects an object's internal state and controls access to it
`private double balance`

### inheritance
A class can inherit fields/methods from another class
`class Dog extends Animal`

### polymorphism
The same type/reference can represent differnt objects and produce different behavior
```
Animal dog = new Dog();
Animal cat = new Cat();
```

### abstraction
hides implementation details and exposes only what is necessary
`interface Payment {...}`

### interface
a content that classes can implement
`class Dog implements Animal`

## java language features

### static
Belongs to the class rather than an individual object
`Person.count`

### final
Prevents reassignment/overriding/inheritance depending on where it's used
`final int x = 10;`

### access modifiers
`public`
accessible from anyuwhere, other classes can access it

`private`
accessible only inside the same class

`protected`
accessible from same package and from subclasses

`no modifier`
accessible from same class and same package, not subclasses

### constructor
when constructor is not defined, Java provides a default no-argument constructor  
if you define any constructor, Java no longer automatically provides the no-argument constructor

fields not sent in constructor gets default values:  
int 0  
double 0.0  
boolean false  
char \u0000  
Object null  
String null

## collections

### arrayList
```
List<String> names = new ArrayList<>();

// adds name to the list
names.add("John");
names.add("Alice");
names.add("Bob");

// replaces name in position 1
names.set(1, "Kate");

// inserts name in position 1
names.add(1, "Mike");

System.out.println(names); // [John, Mike,  Kate, Bob]
System.out.println(names.get(2)); // Kate
System.out.println(names.size()); // 4
```

### HashMap
```
Map<String, Integer> ages = new HashMap<>();

ages.put("John", 30);
ages.put("Alice", 25);
ages.put("Bob", 40);

for (Map.Entry<String, Integer> entry : ages.entrySet()) {
    System.out.println(entry.getKey());
    System.out.println(entry.getValue());
}
```

## I/O

### simple read/write file
```
Path path = Path.of("message.txt");
Files.writeString(path, "Hello");
Files.writeString(path, " World"); // overwrites
Files.writeString(path, " World", StandardOpenOption.APPEND); // adds
System.out.println(Files.readString(path));

users.txt contains
John
Alice
Bob

Path path = Path.of("users.txt");
List<String> lines = Files.readAllLines(path);
System.out.println(lines.size()); // 3
System.out.println(lines.get(0)); // John
System.out.println(lines.get(2)); // Bob
```

### try with resources
```
// try with resources closes them after
try (BufferedReader reader = Files.newBufferedReader(path)) {
    System.out.println(reader.readLine());
}
```

## lambdas

### intermediate operations
return another Stream, so you can chain them
```
filter()
map()
sorted()
distinct()
```

### terminal operations
produce a result or perform an action, can't chain them
```
count()
toList()
forEach()
```

### removeIf
expects a Predicate\<T>, returns bookean
```
// remove names that starts with an A
names.removeIf(name -> name.startsWith("A"));
```

### forEach
expects a Consumer\<T>, returns void
```
// print all
names.forEach(name -> System.out.println(name);
```

### stream filter/map
```
// gets all even numbers from numbers List  
List<Integer> result = numbers.stream().filter(number -> number % 2 == 0).toList();

// change list
List<Integer> result = numbers.stream().map(number -> number * 2).toList();

// with map can change element type
List<Integer> lengths = names.stream().map(name -> name.length()).toList();

```