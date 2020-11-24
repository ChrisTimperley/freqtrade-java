package ch.urbanfox.freqtrade.telegram.command;

import static org.easymock.EasyMock.*;

import ch.urbanfox.freqtrade.FreqTradeMainRunner;
import ch.urbanfox.freqtrade.exchange.FreqTradeExchangeService;
import ch.urbanfox.freqtrade.telegram.TelegramService;
import ch.urbanfox.freqtrade.trade.TradeService;
import org.junit.Before;
import org.junit.Test;

public class StatusCommandHandlerTest {
    private StatusCommandHandler handler;
    private FreqTradeExchangeService exchangeService;
    private FreqTradeMainRunner runner;
    private TradeService tradeService;
    private TelegramService telegramService;

    @Before
    public void setUp() {
        tradeService = mock(TradeService.class);
        telegramService = mock(TelegramService.class);
        exchangeService = mock(FreqTradeExchangeService.class);
        runner = mock(FreqTradeMainRunner.class);
        handler = new StatusCommandHandler(runner, exchangeService, tradeService, telegramService);
    }

    @Test
    public void testEventListener() {

    }
}
