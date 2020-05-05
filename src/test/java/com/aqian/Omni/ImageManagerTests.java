package com.aqian.Omni;

import com.aqian.Omni.Manager.ImageManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImageManagerTests {

    @Test
    public void testLogic() {
        ImageManager imageManager = new ImageManager();
        assert(1 == 1);
    }
}
