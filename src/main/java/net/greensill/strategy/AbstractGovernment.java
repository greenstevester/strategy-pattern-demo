package net.greensill.strategy;

import net.greensill.strategy.algorithmfamily.GovernmentRulingBehaviour;

import java.util.function.Predicate;

/**
 *
 * This abstract class is really a client that can use the family of ruling algorithms interchangeably
 *
 */
public abstract class AbstractGovernment {

    // Here we use delegation via interface instance variables, instead of inheritance
    // provides ability to encapsulate a family of "provide" algorithms
    protected GovernmentRulingBehaviour rulingBehaviour;

    protected String name;

    public AbstractGovernment(String name) {
        this.name = name;
        System.out.println("WesternGovernment:" + name + " created ");
    }

    public void setRulingBehaviour(GovernmentRulingBehaviour rulingBehaviour) {
        this.rulingBehaviour = rulingBehaviour;
    }

    public GovernmentRulingBehaviour getRulingBehaviour() {
        return this.rulingBehaviour;
    }

    abstract void elect(HeadOfState head);

    public void run() { this.rulingBehaviour.rule();  }

    @Override
    public String toString() {
        return "WesternGovernment:" + "name=[" + name + ']' + "rulingBehaviour=[" + rulingBehaviour + ']';
    }

    public static Predicate<HeadOfState> isFascist() {
        return p -> p.getName().equalsIgnoreCase("trump");
    }

    public static Predicate<HeadOfState> isPopulist() {
        return p -> p.getName().equalsIgnoreCase("lepen") || p.getName().equalsIgnoreCase("blocker");
    }
}
