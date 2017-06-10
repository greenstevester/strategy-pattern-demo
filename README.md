# Strategy Pattern

The strategy pattern is one of my personal favourites, because it provides flexibility in design via composition instead of inheritance. 
I personally favour composition over inheritance, since it has saved me many times when I was faced with difficult refactorings.
 
## Benefits of the Pattern

Since government ruling behaviors change frequently for each country, a wrong (but common inheritance design decision to perform code reuse) would be to implement 
these changing behaviours into subclasses (e.g adding RuleByDemocracy and then adding RuleByFascism into an AmericanGovernment class)
This inheritance design decision is fraught with problems: 
    1. The specific Rule behaviour must be declared in each new Government model
    2. The on-going maintenance work of these behaviors increases as the number of governments increases
    3. code needs to be duplicated across models, which share the same Rule Behaviours 
    4. It's hard to rationalise about the behavior for each government without digging into the code in each. 

## Strategy Pattern to the rescue

- The strategy pattern uses composition over inheritance as a design decision, in order to decouple between the behavior 
and the class that uses the behavior. 
- Behaviors are then defined as separate interfaces and we create specific classes that implement these interfaces.  
This really helps when modelling government behaviours which change frequently with every newly elected head of state.
- Class behavior can be changed without breaking the classes that use it.
- Classes can switch between behaviors by only changing the specific implementation at design time or run-time. 


# To run from the cmdline
mvn clean compile
mvn exec:java