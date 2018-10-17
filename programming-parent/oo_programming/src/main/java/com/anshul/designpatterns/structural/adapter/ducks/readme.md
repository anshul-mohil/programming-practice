Adapter pattern when we need to expose a different contract(using inheritance) than
internal object.

Lets say Turkey and Duck classes have different contracts
and we would like to use them under Lets say Turkey interface
then we would write DuckAdapter and encapsulate Duck into it 
as composition.

encapsulate behaviour of one object and expose it through
interface contract of other class.