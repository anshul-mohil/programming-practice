when multiple colleagues/objects wants to interact with each other
but communication logic is complex, we use mediator design pattern.

Here mediator maintain communication mechanism ie. who all will communicate and how.

Colleague objects maintain/compose with mediator object and use mediator object impl
for communicating with colleagues. Here any Colleague object does not require to 
maintain list of colleague it is communicating with. 

List of Colleague objects is maintained by mediator. Colleagues use specific 
mediator which defines communication mechanism and colleagues with it can communicate.




