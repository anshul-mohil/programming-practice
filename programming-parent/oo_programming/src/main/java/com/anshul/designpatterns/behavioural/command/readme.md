In this design pattern we have Receiver which publish actions and for each action 
we will have separate command implementation. 

1 receiver
multiple command object has a relation with receiver obj
1 invoker has a command object to trigger request from invoker client. 

Hence its up to client to stitch the objects accordingly at runtime to trigger different
type of commands using invoker.



ommand is the core of command design pattern that defines the contract for implementation.
Receiver implementation is separate from command implementation.
Command implementation classes chose the method to invoke on receiver object, for every method in receiver there will be a command implementation. It works as a bridge between receiver and action methods.
Invoker class just forward the request from client to the command object.
Client is responsible to instantiate appropriate command and receiver implementation and then associate them together.
Client is also responsible for instantiating invoker object and associating command object with it and execute the action method.
Command design pattern is easily extendible, we can add new action methods in receivers and create new Command implementations without changing the client code.
The drawback with Command design pattern is that the code gets huge and confusing with high number of action methods and because of so many associations.

