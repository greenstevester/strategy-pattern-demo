package net.greensill.strategy.algorithmfamily;

public class RuleByFascism implements GovernmentRulingBehaviour {

    public void rule()  {
        System.out.println("Rules by fascism");
    }

    @Override
    public String toString() {
        return "RuleByFascism";
    }
}
