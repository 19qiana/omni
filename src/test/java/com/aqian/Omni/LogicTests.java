package com.aqian.Omni;

import Manager.Logic;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LogicTests {

    @Test
    public void testLogic() {
        Logic logic = new Logic();
        logic.Testprint();
        assert(1 == 1);
    }
}
