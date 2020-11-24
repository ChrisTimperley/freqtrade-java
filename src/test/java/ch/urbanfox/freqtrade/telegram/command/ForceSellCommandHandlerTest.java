package ch.urbanfox.freqtrade.telegram.command;

import static org.easymock.EasyMock.*;

import ch.urbanfox.freqtrade.FreqTradeMainRunner;
import ch.urbanfox.freqtrade.exchange.FreqTradeExchangeService;
import ch.urbanfox.freqtrade.telegram.command.ForceSellCommandHandler;
import ch.urbanfox.freqtrade.telegram.TelegramService;
import ch.urbanfox.freqtrade.trade.TradeService;
import org.junit.Before;
import org.junit.Test;

public class ForceSellCommandHandlerTest {
    private ForceSellCommandHandler handler;
    private FreqTradeMainRunner runner;
    private FreqTradeExchangeService exchangeService;
    private TradeService tradeService;
    private TelegramService telegramService;

    @Before
    public void setUp() {
        tradeService = mock(TradeService.class);
        exchangeService = mock(FreqTradeExchangeService.class);
        telegramService = mock(TelegramService.class);
        runner = mock(FreqTradeMainRunner.class);
        handler = new ForceSellCommandHandler(runner, exchangeService, tradeService, telegramService);
    }

    @Test
    public void testEventListener() {

    }
}
