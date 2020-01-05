# Head First Design Pattern
### Chapter 1. Welcome to Design Patterns
#### Keynotes
<ol> Inheritance can bring unintentional side effects to subclasses when changed.</ol>
<ol> Inheritance alone is not a good idea when changes are frequents.</ol>


#### Strategy Design Pattern
> Strategy pattern is a family of algorithms, encapsulates each one, and makes them interchangeable. Stretegy lets the algorithm vary independently from client that use them.
##### Identify the aspects of your application that vary and separate them from what stays the same
<ul>Take the part that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting one that don't.</ul>
<ul>Fewer unintended consequences from code changes and more flexibility in your systems!</ul>


##### Program to interface/supertype, not an implementation
<ul>Subclasses doesn't need to know the actual implementation.</ul>
<ul>Subclasses should use interface so that their runtime behaviour can be changed.</ul>
<ul>For e.g. 
<b>Programming to implmentation is like</b> <br/>
<code>Dog d = new Dog();
d.makesound();</code>

<b>Programming to interaface/supertype is </b><br/>
<code>Animal animal = new Dog();
animal.makesound();</code>

<b>Even better use concrete implementation at runtime</b><br/>
<code>animal = getAnimal();
animal.makesound();</code>
</ul>

##### Favour composition(HAS-A) over inheritance(IS-A)
<ul>Lets you change behavior at runtime</ul>
<ul>HAS-A can be better than IS-A sometime</ul>

