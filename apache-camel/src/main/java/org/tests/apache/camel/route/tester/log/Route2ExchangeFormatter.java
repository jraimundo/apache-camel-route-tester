package org.tests.apache.camel.route.tester.log;

import org.apache.camel.Exchange;
import org.apache.camel.processor.DefaultExchangeFormatter;

public class Route2ExchangeFormatter extends DefaultExchangeFormatter {

    @Override
    public String format(Exchange exchange) {
        String exchangeId = exchange.getExchangeId();

        return "request from " + exchangeId + " sent to route 2.";
    }

}
