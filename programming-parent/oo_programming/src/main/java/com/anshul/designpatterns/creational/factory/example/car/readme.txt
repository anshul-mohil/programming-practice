Factory design pattern:


If I need to create different instances of an super interface,abstract class or class
at run time based on ask(type given) then I will use Factory design pattern.



Super class   ( Toyota Car)

subclasses (M22Sedan)    (SUV200)               FACTORY(creates class at runtime based on which implementation you asked)

FactoryClass: Is a class to create these implementation when asked by user as : I want Toyota car implementation of type sedan.. and
factory will give you M22Sedan..

Factory is used when object creation is an complecated process by managing dependencies and initilization logic. also
we want to segregate runtime implementation class passed from class which is actually using it.


Most IMPORTANT:
Now user of objects can code based on super type and call factory to provide super type specific implementation.


valueOf() method in wrapper class is factory design pattern.. It creates new object each time after changing
give value to wrapper class form.