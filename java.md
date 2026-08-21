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

