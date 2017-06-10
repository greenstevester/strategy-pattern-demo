package net.greensill.strategy

import net.greensill.strategy.algorithmfamily.RuleByFascism

class GovernmentStrategyTest extends spock.lang.Specification {

    def 'simple spock test to see if a government is fascist'() {

        given:
        def americanGovernment = new WesternGovernment("USA")

        when: "a bad president is elected"
        americanGovernment.elect(new HeadOfState("trump"))
        americanGovernment.run()

        then: "expect a fascist ruler"
        americanGovernment.getRulingBehaviour() instanceof RuleByFascism

    }

}
