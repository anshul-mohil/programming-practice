In this design pattern we have Receiver which publish actions and for each action 
we will have separate command implementation. 

1 receiver
multiple command object has a relation with receiver obj
1 invoker has a command object to trigger request from invoker client. 

Hence its up to client to stitch the objects accordingly at runtime to trigger different
type of commands using invoker.