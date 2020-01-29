# Head First Design Pattern
### Chapter 2. The Observer Pattern
#### Keynotes


#### Observer Design Pattern
> Observer Pattern Definition here
##### 
<ul></ul>
<ul></ul>


#### Java inbuilt Observer Pattern APIs
<ul> For an Object to become an observer, As usual, implement the Observer interface (this time the java.util.Observer interface) and call addObserver() on any Observable object. Likewise, to remove yourself as an observer just call deleteObserver().</ul>
<ul> For the Observable to send notifications, First of all you need to be Observable by extending the java.util.Observable superclass. From there it is a two step process:
<ul>You first must call the setChanged() method to signify that the state has changed in your object</ul>
<ul>Then, call one of two notifyObservers() methods:</ul>
</ul>