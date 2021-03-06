#**`Design Patterns`**
Design patterns, as name suggest, are solutions for most commonly (and frequently) occurred problems while designing a software. These patterns are mostly “evolved” rather than “discovered”. A lot of learning, by lots of professional, have been summarized into these design patterns. None of these patterns force you anything in regard to implementation; they are just guidelines to solve a particular problem – in a particular way – in particular contexts. Code implementation is your responsibility.
Being so much of importance, let’s learn these design patterns (in context of java) in more detail.

#####1. Creational Design Patterns
#####2. Structural Design Patterns
#####3. Behavioral Design Patterns

##1. Creational Design Patterns
Creational patterns often used in place of direct instantiation with constructors. They make the creation process more adaptable and dynamic. In particular, they can provide a great deal of flexibility about which objects are created, how those objects are created, and how they are initialized.

###DESIGN PATTERN NAME	PURPOSE

####Builder	
Builder design pattern is an alternative way to construct complex objects and should be used only when we want to build different types of immutable objects using same object building process.

####Prototype	
Prototype design pattern is used in scenarios where application needs to create a large number of instances of a class, which have almost same state or differ very little.

####Factory	
Factory design pattern is most suitable when complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes.

####Abstract factory	
Abstract factory pattern is used whenever we need another level of abstraction over a group of factories created using factory pattern.

####Singleton	
Singleton enables an application to have one and only one instance of a class per JVM.


##2. Structural Design Patterns
Structural design patterns show us how to glue different pieces of a system together in a flexible and extensible fashion. These patterns help us guarantee that when one of the parts changes, the entire application structure does not need to change.

###DESIGN PATTERN NAME	PURPOSE

####Adapter	
An adapter convert the interface of a class into another interface clients expect. It lets classes work together that couldn’t otherwise because of incompatible interfaces.

####Bridge	
Bridge design pattern is used to decouple a class into two parts – abstraction and it’s implementation – so that both can evolve in future without affecting each other. It increases the loose coupling between class abstraction and it’s implementation.

####Composite	
Composite design pattern helps to compose the objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

####Decorator	
Decorator design pattern is used to add additional features or behaviors to a particular instance of a class, while not modifying the other instances of same class.

####Facade	
Facade design pattern provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

####Flyweight	
Flyweight design pattern enables use sharing of objects to support large numbers of fine-grained objects efficiently. A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context.

####Proxy	
In proxy design pattern, a proxy object provide a surrogate or placeholder for another object to control access to it. Proxy is heavily used to implement lazy loading related usecases where we do not want to create full object until it is actually needed.


##3. Behavioral Design Patterns
Behavioral patterns abstract an action we want to take on the object or class that takes the action. By changing the object or class, we can change the algorithm used, the objects affected, or the behavior, while still retaining the same basic interface for client classes.

###DESIGN PATTERN NAME	PURPOSE

####Chain of responsibility	
Chain of responsibility design pattern gives more than one object an opportunity to handle a request by linking receiving objects together in form of a chain.

####Command	
Command design pattern is useful to abstract the business logic into discrete actions which we call commands. These command objects help in loose coupling between two classes where one class (invoker) shall call a method on other class (receiver) to perform a business operation.

####Interpreter	
Interpreter pattern specifies how to evaluate sentences in a language, programatically. It helps in building a grammar for a simple language, so that sentences in the language can be interpreted.

####Iterator	
Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

####Mediator	
Mediator pattern defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets us vary their interaction independently.

####Memento	
Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.
####Observer	
Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

####State	
In state pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class. There shall be a separate concrete class per possible state of an object.

####Strategy	
Strategy pattern is used where we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.

####Template method	
Template method pattern defines the sequential steps to execute a multi-step algorithm and optionally can provide a default implementation as well (based on requirements).

####Visitor	
Visitor pattern is used when we want a hierarchy of objects to modify their behavior but without modifying their source code.
