Decorator design pattern works to decorate passed object which is of same type as it is.

Its all methods are overridden in such a way that every time when method is called on
decorator it first delegate the call to same method of composite object(passed at 
decorator construction time) and then decorate/add additional logic to that in 
 current class. 