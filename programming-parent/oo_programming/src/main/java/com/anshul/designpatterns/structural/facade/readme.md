Node: This example is facade with factory design pattern

Provide a unified interface to a set of interfaces in a subsystem. 
Facade Pattern defines a higher-level interface that makes the subsystem easier to use.



Facade Design Pattern Important Points

1. Facade design pattern is more like a helper for client applications, 
it does not hide subsystem interfaces from the client. Whether to use 
Facade or not is completely dependent on client code.
2. Facade design pattern can be applied at any point of development,
usually when the number of interfaces grow and system gets complex.
3. Subsystem interfaces are not aware of Facade and they shouldn’t 
have any reference of the Facade interface.
4. Facade design pattern should be applied for similar kind of 
interfaces, its purpose is to provide a single interface rather 
than multiple interfaces that does the similar kind of jobs.
5. We can use Factory pattern with Facade to provide better interface 
to client systems.