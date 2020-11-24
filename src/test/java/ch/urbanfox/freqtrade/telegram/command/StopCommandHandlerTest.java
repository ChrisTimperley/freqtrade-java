package ch.urbanfox.freqtrade.telegram.command;

import static org.easymock.EasyMock.*;

import ch.urbanfox.freqtrade.FreqTradeMainRunner;
import ch.urbanfox.freqtrade.telegram.command.StopCommandHandler;
import ch.urbanfox.freqtrade.telegram.TelegramService;
import org.junit.Before;
import org.junit.Test;

public class StopCommandHandlerTest {
    private StopCommandHandler handler;
    private FreqTradeMainRunner runner;
    private TelegramService telegramService;

    @Before
    public void setUp() {
        telegramService = mock(TelegramService.class);
        runner = mock(FreqTradeMainRunner.class);
        handler = new StopCommandHandler(runner, telegramService);
    }

    @Test
    public void testEventListener() {

    }
}
