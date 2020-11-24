package ch.urbanfox.freqtrade;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import ch.urbanfox.freqtrade.analyze.AnalyzeService;
import ch.urbanfox.freqtrade.exchange.FreqTradeExchangeService;
import ch.urbanfox.freqtrade.trade.TradeService;

import ch.urbanfox.freqtrade.telegram.TelegramService;
import org.junit.Before;
import org.junit.Test;


public class FreqTradeMainRunnerTest {
    private FreqTradeMainRunner mainRunner;
    private FreqTradeProperties properties;
    private AnalyzeService analyzeService;
    private FreqTradeExchangeService exchangeService;
    private TelegramService telegramService;
    private TradeService tradeService;

    @Before
    public void setUp() {
        properties = mock(FreqTradeProperties.class);
        tradeService = mock(TradeService.class);
        analyzeService = mock(AnalyzeService.class);
        exchangeService = mock(FreqTradeExchangeService.class);
        telegramService = mock(TelegramService.class);
        mainRunner = new FreqTradeMainRunner(properties, analyzeService, exchangeService, tradeService, telegramService);
    }

    @Test
    public void testProcess() {

    }

    @Test
    public void testCloseTradeIfFulfilled() {

    }

    @Test
    public void testExecuteSell() {

    }

    @Test
    public void testShouldSell() {

    }

    @Test
    public void testHandleSell() {

    }

    @Test
    public void testHandleTrade() {

    }

    @Test
    public void testGetTargetBid() {

    }

    @Test
    public void testCreateTest() {

    }

    // NOTE: there is no need to test "main", "setState", or "getState"
}