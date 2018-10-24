Adapter pattern when we need to expose a different contract(using inheritance) than
internal object.

Lets say Turkey and Duck classes have different contracts
and we would like to use them under Lets say Turkey interface
then we would write DuckAdapter and encapsulate Duck into it 
as composition.
Here Duck becomes adaptee.

encapsulate behaviour of one object and expose it through
interface contract of other class.



In this example

We have 2 adaptee object
MallardDuck and WildTurkey

Above objects can be passed to its respective adapter to expose itself as per 
contract define by some other interface adapter implements

Adapter implements some interface x and hold object of type y to expose y type object with contract x.
Name of such adapter would be YAdapter implements x{}
 