GOF
Use sharing to support large numbers of fine-grained objects efficiently.


1. In our example, the client code is not forced to create object using 
Flyweight factory but we can force that to 
make sure client code uses flyweight pattern implementation but its 
a complete design decision for particular application.
2. Flyweight pattern introduces complexity and if number of shared 
objects are huge then there is a trade of between memory and time, 
so we need to use it judiciously based on our requirements.
3. Flyweight pattern implementation is not useful when the number of 
intrinsic properties of Object is huge, making implementation of Factory class complex.



code example is from :
https://www.oodesign.com/flyweight-pattern-wargame-example-java-sourcecode.html
