package net.greensill.strategy;

import net.greensill.strategy.algorithmfamily.RuleByDirectDemocracy;
import net.greensill.strategy.algorithmfamily.RuleByRightWingPopulists;

public class SwissGovernment extends AbstractGovernment {

    // This client class uses one algorithm (RuleByDirectDemocracy) in the constructor
    // and therefore sets the behaviour in this instance at design time
    public SwissGovernment(String name) {
        super(name);
        this.rulingBehaviour = new RuleByDirectDemocracy();
    }

    public void elect(HeadOfState head) {

        if ( WesternGovernment.isPopulist().test(head) ) {
            setRulingBehaviour(new RuleByRightWingPopulists());
        }

    }


}
