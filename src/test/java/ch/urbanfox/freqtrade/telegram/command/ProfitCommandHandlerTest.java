package ch.urbanfox.freqtrade.telegram.command;

import static org.easymock.EasyMock.*;

import ch.urbanfox.freqtrade.exchange.FreqTradeExchangeService;
import ch.urbanfox.freqtrade.telegram.command.ProfitCommandHandler;
import ch.urbanfox.freqtrade.telegram.TelegramService;
import ch.urbanfox.freqtrade.trade.TradeService;
import org.junit.Before;
import org.junit.Test;

public class ProfitCommandHandlerTest {
    private ProfitCommandHandler handler;
    private TradeService tradeService;
    private FreqTradeExchangeService exchangeService;
    private TelegramService telegramService;

    @Before
    public void setUp() {
        telegramService = mock(TelegramService.class);
        exchangeService = mock(FreqTradeExchangeService.class);
        tradeService = mock(TradeService.class);
        handler = new ProfitCommandHandler(exchangeService, tradeService, telegramService);
    }

    @Test
    public void testEventListener() {

    }
}
