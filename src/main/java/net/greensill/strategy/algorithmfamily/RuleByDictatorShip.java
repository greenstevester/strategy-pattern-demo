package net.greensill.strategy.algorithmfamily;

public class RuleByDictatorShip implements GovernmentRulingBehaviour {

    public void rule()  { System.out.println("This WesternGovernment Rules by dictatorship"); }

    @Override
    public String toString() {
        return "RuleByDictatorShip";
    }
}
