package ch.urbanfox.freqtrade.exchange;

import ch.urbanfox.freqtrade.FreqTradeProperties;
import ch.urbanfox.freqtrade.exchange.FreqTradeExchangeService;
import ch.urbanfox.freqtrade.exchange.FreqTradeExchangeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.knowm.xchange.bittrex.service.BittrexMarketDataService;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.Order;
import org.knowm.xchange.dto.trade.LimitOrder;
import org.knowm.xchange.service.account.AccountService;
import org.knowm.xchange.service.trade.TradeService;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import org.knowm.xchange.Exchange;

import java.io.IOException;
import java.math.BigDecimal;


public class FreqTradeExchangeServiceTest {
    private FreqTradeExchangeService exchangeService;
    private FreqTradeProperties properties;
    private Exchange exchange;
    private BittrexMarketDataService marketDataService;
    private AccountService accountService;
    private TradeService tradeService;

    @Before
    public void setUp() {
        properties = mock(FreqTradeProperties.class);
        exchange = mock(Exchange.class);
        marketDataService = mock(BittrexMarketDataService.class);
        accountService = mock(AccountService.class);
        tradeService = mock(TradeService.class);
        exchangeService = new FreqTradeExchangeServiceImpl(properties, exchange, marketDataService, accountService, tradeService);
    }

    @Test
    public void testBuy_isNotDryRun() throws IOException {
        CurrencyPair pair = CurrencyPair.BTC_USD;
        BigDecimal rate = BigDecimal.valueOf(11_600);
        BigDecimal amount = BigDecimal.valueOf(12);

        // mock properties
        // here, we set up properties so that it expects a call to its
        // "isDryRun" method, which should return with "false"
        expect(properties.isDryRun()).andReturn(false);

        // we use "replay" to finish constructing the mock
        replay(properties);

        // mock trade service
        LimitOrder expectedOrder = new LimitOrder(Order.OrderType.BID, amount, pair, null, null, rate);
        String stubAnswer = "OK!";
        expect(tradeService.placeLimitOrder(expectedOrder)).andReturn(stubAnswer);
        replay(tradeService);

        // execute the SUT
        String result = exchangeService.buy(pair, rate, amount);

        // verify that the expected interactions occurred
        verify(properties);
        verify(tradeService);

        // check that we got the correct result
        assertEquals(stubAnswer, result);
    }

    @Test
    public void testSell() {
        assertEquals(false, true);
    }

    @Test
    public void testGetBalance() {
        assertEquals(false, true);
    }
}
