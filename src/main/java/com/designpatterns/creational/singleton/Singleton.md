# Singleton Pattern
Singleton is a creational design pattern, which ensures that only one object of its kind
exists and provides a single point of access to it for any other code.

https://refactoring.guru/design-patterns/singleton

You can’t just use a class that depends on a Singleton in some other context, without carrying over the 
Singleton to the other context. Most of the time, this limitation comes up during the creation of unit tests.

#Implementation
Creating a static instance of said Object within the class itself. Singleton has a variable named instance which
points to the single instance of this class itself. Within getInstance() method we can define our own constraints
for when to "reinitialize" the singleton, maybe we want a timeout for that object (e.g. authentication token).