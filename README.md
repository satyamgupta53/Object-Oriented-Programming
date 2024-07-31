## Object Oriented Concepts
**Class** is a template of an Object, a logical construct. **Objects** are instance of a class & exists in physical reality in heap memory. Dot operator links with reference variable with instance variables `instance_variable . reference_variable`. ***New keyword*** is used to create an instance of class, dynamically allocates memory & returns a reference to it. If class is not initialised, by default, all the values within it becomes null. In primitives there is pass by value, unlike objects, where we follow passed by referenced. **final** keyword make any variable as constant. Write constant in capital letter. *When a non-primitive is final, you cannot reassign it*.

Code on the left side of equal to happens in **compile time**, rest runs in **runtime**. Constructor defines what will have when any object is instantiated. ***this*** keyword is used to access any custom reference variable. **Constructor overloading** refers to defining  constructor with different type of variables to provide ease at instantiation. Constructor **chaining** refers to internally calling a constructor from another constructor.** Wrapper classes** are used to create primitives in the format of objects `Integer id = new Integer(12115007)`.

Before **garbage collection**, we cannot destory objects manually, but, can specify actions that need to be performed when this object gets collected using *finalise* method within the class. **Static** is used for the attributes which are common to all the attributes, but, are independent of object. Like population is common to human class, but, it is independent of the object of human class. Also, use class name to access the static variable, as it is common to every object. Static method in short belongs to the class not object. To initialise static variable use a static block. It will only run for the first time, when the class in loaded once. In case of inner classes, outside class cannot be static as it is not dependent on any other class. Static methods are resolved in compile time not run time.

```java
public class StaticBlock {
    static long population = 10;
    static long incomeTax;

    static { // this is the static block snippet
        System.out.println("I am initializing my static variables !");
        incomeTax = population * 125;
    }
}
```
**Singleton** is the type of class which only allows programmer to create one instance object of the class. We make the constructor private which denies creating multiple instances.