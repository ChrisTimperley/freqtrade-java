package ch.urbanfox.freqtrade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@ActiveProfiles(profiles = "test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class FreqTradeApplicationTests {
    @Autowired
    private FreqTradeMainRunner mainRunner;

    @Test
    public void contextLoads() {
        assertEquals(false, mainRunner.getState());
    }

}
