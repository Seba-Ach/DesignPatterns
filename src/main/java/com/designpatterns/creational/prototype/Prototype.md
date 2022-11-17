# Prototype Pattern
Prototype is a creational design pattern that lets you copy existing 
objects without making your code dependent on their classes. As well 
as creating a deep copy of the object instance.
https://refactoring.guru/design-patterns/prototype

#Problem
Say you want to copy an object, assigning it to a different variable name sometimes
will not work as intended. Copying it "from the outside" isn't always possible or efficient.
You have to take into consideration whether you want a deep or shallow copy.

This is a common problem when trying to copy an object as primitives are not copied the
same way that Objects are being copied.

#Implementation
All the magic happens inside PrototypeDemo class on line 24:

```SerializationUtils.roundtrip(john);``` 

which creates a deep copy of the Student object. For this you will also need to include the
following dependency: 
```
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
</dependency>
```