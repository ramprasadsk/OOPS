Java OOPs concept

1. Class – Blueprint for Objects
A class is a logical template that defines what an object will have (data) and what it can do (methods).
A class does not occupy memory until an object is created from it.
Key Rules:
A class can contain variables, methods, constructors, and blocks.
A class can be public or default, but only one public class per file.
A class name should start with a capital letter.
A class can exist without objects, but objects cannot exist without a class.
Restrictions:
You cannot access non-static members without an object.
You cannot create objects of an abstract class.
Example Scenario:
A Car class defines properties like speed and color and behaviors like drive and brake.
This class itself is only a plan and not a real car.

2. Object – Instance of a Class
An object is a real-world entity created from a class that occupies memory and has its own state and behavior.
Key Rules:
Objects are created using the new keyword.
Each object has its own copy of instance variables.
Multiple objects can be created from the same class.
Restrictions:
Object creation is not allowed for abstract classes.
Static members do not belong to objects.
Example Scenario:
A BMW car with speed 100 km/h is an object created from the Car class.

3. Inheritance – One Class Gets Properties of Another
Inheritance allows one class (child) to reuse the properties and methods of another class (parent), promoting code reusability.
Key Rules:
Achieved using the extends keyword.
Java supports single inheritance for classes.
Constructors are not inherited, but called using super.
Restrictions:
Private members are not accessible in child class.
Multiple inheritance is not allowed using classes.
Example Scenario:
A Bike class inherits properties from Vehicle.

4. Polymorphism – Same Method Behaves Differently
Polymorphism means one method name, multiple behaviors, depending on the object calling it.
Types:
Compile-time Polymorphism – Method Overloading.
Runtime Polymorphism – Method Overriding.
Key Rules:
Overriding requires inheritance.
Method signature must be the same.
Overridden method cannot reduce access level.
Restrictions:
Static methods cannot be overridden.
Final methods cannot be overridden.
Example Scenario:
A Vehicle drives differently depending on the type.

5. Encapsulation – Wrapping Data and Methods Together
Encapsulation means protecting data by keeping it private and allowing access only through methods.
Key Rules:
Variables should be marked private.
Access should be via getters and setters.
It improves security and control.
Restrictions:
Direct access to private variables is not allowed.
Logic validation must be handled in setters.
Example Scenario:
A bank account balance should not be directly modified.

6. Abstraction – Hiding Implementation Details
Abstraction means showing only essential features and hiding internal working.
Key Rules:
Achieved using abstract classes and interfaces.
Abstract methods must be overridden.
Abstract class can have both abstract and non-abstract methods.
Restrictions:
You cannot create objects of abstract classes.
Abstract methods cannot have a body.
Example Scenario:
A user knows how to drive a car but not the engine details.

7. Association – Relationship Between Classes
Association represents a general relationship where objects interact but do not depend on each other.
Key Rules:
Objects have independent lifecycles.
Can be one-to-one, one-to-many, or many-to-many.
Example Scenario:
A teacher and student relationship.

8. Aggregation – Weak “Has-A” Relationship
Aggregation is a special form of association where one object uses another, but both can exist independently.
Key Rules:
Represented using object references.
Child object can exist without parent.
Example Scenario:
A library has books, but books can exist without the library.

9. Composition – Strong “Has-A” Relationship
Composition is a stronger form of aggregation where the child object depends on the parent.
Key Rules:
Child object is created inside parent.
If parent is destroyed, child is destroyed.
Restrictions:
Child lifecycle is tightly bound to parent.
Example Scenario:
A house has rooms; without a house, rooms don’t exist.