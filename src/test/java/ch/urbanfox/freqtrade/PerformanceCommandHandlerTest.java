package ch.urbanfox.freqtrade;

import static org.easymock.EasyMock.*;

import ch.urbanfox.freqtrade.telegram.TelegramService;
import ch.urbanfox.freqtrade.telegram.command.PerformanceCommandHandler;
import ch.urbanfox.freqtrade.trade.TradeService;
import org.junit.Before;
import org.junit.Test;

public class PerformanceCommandHandlerTest {
    private PerformanceCommandHandler handler;
    private FreqTradeMainRunner runner;
    private TradeService tradeService;
    private TelegramService telegramService;

    @Before
    public void setUp() {
        tradeService = mock(TradeService.class);
        telegramService = mock(TelegramService.class);
        runner = mock(FreqTradeMainRunner.class);
        handler = new PerformanceCommandHandler(runner, tradeService, telegramService);
    }

    @Test
    public void testEventListener() {

    }
}
