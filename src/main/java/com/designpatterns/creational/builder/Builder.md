# Builder Pattern
The pattern organizes object construction into a set of steps. To create an object, you execute 
a series of these steps on a builder object. The important part is that you don’t need to call all of the 
steps. You can call only those steps that are necessary for producing a particular configuration of an object. 

https://refactoring.guru/design-patterns/builder


#Implementation
StudentLombok: using the [Lombok](https://www.baeldung.com/intro-to-project-lombok) and its @Builder annotation which
saves a lot of boilerplate code. 

Student: using inner class builder and creating a constraint on the dateOfRegistration field which creates a more fluid
interface for when created a new Student object who is registering.
