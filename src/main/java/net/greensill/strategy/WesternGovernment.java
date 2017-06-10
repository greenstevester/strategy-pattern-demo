package net.greensill.strategy;

import net.greensill.strategy.algorithmfamily.RuleByDemocracy;
import net.greensill.strategy.algorithmfamily.RuleByFascism;
import net.greensill.strategy.algorithmfamily.RuleByRightWingPopulists;

public class WesternGovernment extends AbstractGovernment {

    // This client class uses another algorithm (RuleByDemocracy) in the constructor
    // and therefore sets the behaviour in this instance at design time
    public WesternGovernment(String name) {
        super(name);
        setRulingBehaviour(new RuleByDemocracy());
    }

    public void elect(HeadOfState head) {

        if ( WesternGovernment.isFascist().test(head) ) {
            setRulingBehaviour(new RuleByFascism());
        } else if ( WesternGovernment.isPopulist().test(head) ) {
            setRulingBehaviour(new RuleByRightWingPopulists());
        }

    }


}
