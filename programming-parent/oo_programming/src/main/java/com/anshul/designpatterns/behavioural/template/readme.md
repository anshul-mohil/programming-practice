OutputStream and InputStream classes implemnted template pattern.

They provide abstract method to provide functionality by subclasses

Also provide write/read data machanism without defining how to ie. they have
several write methods chained together but last method which is responsible
for writing input data into something is abstract and each subclass provides
its own implementation.