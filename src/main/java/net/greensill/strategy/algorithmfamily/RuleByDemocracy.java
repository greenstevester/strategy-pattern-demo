package net.greensill.strategy.algorithmfamily;

public class RuleByDemocracy implements GovernmentRulingBehaviour {

    public void rule()  {
        System.out.println("This WesternGovernment Rules by democracy");
    }

    @Override
    public String toString() {
        return "RuleByDemocracy";
    }
}
