package net.greensill.strategy;

import net.greensill.strategy.algorithmfamily.RuleByDictatorShip;

public class GovernmentSimulator {

    public static void main(String[] args) {

        WesternGovernment europeanGovernment = new WesternGovernment("Europe");
        europeanGovernment.run(); // delegates internally to a chosen algorithm using an interface member variable
        System.out.println(europeanGovernment);

        SwissGovernment swissGovernment = new SwissGovernment("Switzerland");
        swissGovernment.run();  // invokes RuleByDirectDemocracy behaviour
        System.out.println(swissGovernment);

        // The Strategy pattern allows us to set the behaviour dynamically at runtime
        WesternGovernment frenchGovernment = new WesternGovernment("France");
        frenchGovernment.run();
        System.out.println(frenchGovernment);

        // change of government by election (i.e. implicitly)
        frenchGovernment.elect(new HeadOfState("LePen"));
        frenchGovernment.run();
        System.out.println(frenchGovernment);

        // change of government ruling behaviour directly and dynamically
        frenchGovernment.setRulingBehaviour(new RuleByDictatorShip());
        frenchGovernment.run();
        System.out.println(frenchGovernment);

        // and finally some sad truth.
        WesternGovernment americanGovernment = new WesternGovernment("USA");
        americanGovernment.elect(new HeadOfState("trump"));
        americanGovernment.run();
        System.out.println(americanGovernment);


    }
}
