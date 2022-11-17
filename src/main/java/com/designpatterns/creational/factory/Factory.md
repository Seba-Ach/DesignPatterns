# Factory Pattern
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, 
but allows subclasses to alter the type of objects that will be created.
https://refactoring.guru/design-patterns/factory-method

The Factory Method pattern suggests that you replace direct object
construction calls (using the new operator) with calls to a special factory
method.

#When to use
Use the Factory Method when you want to provide users of your library or 
framework with a way to extend its internal components.

#Implementation
V1: This is a common implementation I have come across online. For each 
Car type we have the respective CarFactory to create such an object. This way
we can use the interface classes to interact between them.

V2: This is a similar approach to V1 but removing the need for explicitly defining
a new Factory class for each Car class. Accessing the Factory methods via an internal
class. Allowing the creating of any Car via its interface class that returns an instance
of its subclasses. We can either use: ```Car.Factory.newElectricCar();``` to directly
create an Electric car or we can also use ```Car.Factory.newCar("ev");``` specifying what
type of car we want. It doesn't make sense to have both, you decide which one you prefer
taking into consideration a more holistic view of the system you are building.