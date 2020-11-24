package ch.urbanfox.freqtrade.telegram.command;

import static org.easymock.EasyMock.*;

import ch.urbanfox.freqtrade.FreqTradeMainRunner;
import ch.urbanfox.freqtrade.telegram.command.StartCommandHandler;
import ch.urbanfox.freqtrade.telegram.TelegramService;
import org.junit.Before;
import org.junit.Test;

public class StartCommandHandlerTest {
    private StartCommandHandler handler;
    private FreqTradeMainRunner runner;
    private TelegramService telegramService;

    @Before
    public void setUp() {
        telegramService = mock(TelegramService.class);
        runner = mock(FreqTradeMainRunner.class);
        handler = new StartCommandHandler(runner, telegramService);
    }

    @Test
    public void testEventListener() {

    }
}
