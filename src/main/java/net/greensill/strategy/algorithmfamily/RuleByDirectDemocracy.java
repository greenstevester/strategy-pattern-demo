package net.greensill.strategy.algorithmfamily;

public class RuleByDirectDemocracy implements GovernmentRulingBehaviour {

    public void rule()  {
        System.out.println("This WesternGovernment Rules by direct democracy");
    }

    @Override
    public String toString() {
        return "RuleByDirectDemocracy";
    }
}
