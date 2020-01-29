# Head First Design Pattern
### Chapter 4. Factory Method Pattern
#### Keynotes


#### Factory Method Pattern
> The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer instantiation to subclasses.

##### Dependency Inversion Principle
> Depend upon abstractions. Do not depend upon concrete classes.

<ul>A “high-level” component is a class with behavior defined in terms of other, “low level” components.
For example, PizzaStore is a high-level component because its behavior is defined in terms of pizzas - it creates all the different pizza objects, prepares, bakes, cuts, and boxes them, while the pizzas it uses are low-level components.</ul>

<ul>The following guidelines can help you avoid OO designs that violate the Dependency Inversion Principle:
<ul> No variable should hold a reference to a concrete class. i.e. If you use new, you’ll be holding
a reference to a concrete class. Use a factory to get around that!</ul>
<ul> No class should derive from a concrete class. i.e. Derive from an abstraction, like an interface or an abstract class.</ul>
<ul> No method should override an implemented method of any of its base classes. i.e If you override an implemented method,then your base class wasn’t really an abstraction to start with. Those methods implemented in the base class are meant to be shared by all your subclasses.</ul>
</ul>

##### Key Points
<ul>When you have code that instantiates concrete classes, this is an area of frequent change. “factories” allows you to encapsulate this behavior of instantiation.</ul>
<ul></ul>


#### The Abstract Factory Pattern
> provides an interface for creating families of related or dependent objects without specifying their concrete classes.
<ul>Often the methods of an Abstract Factory are implemented as factory methods. The job of an Abstract Factory is to define an interface for creating a set of products. Each method in that interface is responsible for creating a concrete product, and we implement a subclass of the Abstract Factory to supply those implementations.</ul>

#### Depend on abstractions. Do not depend on concrete classes.
#### Both Factory Method and Abstract Factory patterns encapsulate object creation and lead to more decoupled, flexible designs.