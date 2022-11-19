# Facade Pattern
Facade is a structural design pattern that provides a simplified interface to a 
library, a framework, or any other complex set of classes.

https://refactoring.guru/design-patterns/facade

#Implementation
Firstly we have a complex object ```Car``` which is made up of some attributes which are also objects. When creating
a new Car we would first have to construct each separate object and pass those into the constructor. Instead,
by creating a "Facade" within the constructor of Car object to create those objects and allow a more decoupled
constructor. Also, this way creating a new Car object will be a one liner like such:

```
Car car = new Car("Owner", "Red", 2022, "tiredBrand", 20, 6);
```

instead of:

``` 
Wheels tiredBrand = new Wheels("tiredBrand", 22);
Engine engine = new Engine(2022, 6);
Car car1 = new Car("Owner", "Red", 2022, tiredBrand, engine);
```

Second example is within CarMechanic class. Let's assume when we want to service a car we need to do a 
few checks and fixes to a car. We hide the whole service process within the ```serviceCar(Car car)``` method 
creating a Facade that way.
