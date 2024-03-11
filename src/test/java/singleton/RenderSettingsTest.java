package singleton;


import org.example.singleton.RenderSettings;
import org.example.singleton.SizeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RenderSettingsTest {
    @Test
    public void anti_aliasingTrueTest() {
        RenderSettings.getInstance().setAnti_aliasing(true);
        assertEquals(true, RenderSettings.getInstance().getAnti_aliasing());
    }

    @Test
    public void widthTrueTest() {
        RenderSettings.getInstance().setWidth(400);
        assertEquals(400, RenderSettings.getInstance().getWidth());
    }

    @Test
    public void heightTrueTest() {
        RenderSettings.getInstance().setHeight(800);
        assertEquals(800, RenderSettings.getInstance().getHeight());
    }

    @Test
    public void sizeUnitPixelsTrue() {
        RenderSettings.getInstance().setSizeUnit(SizeUnit.pixels);
        assertEquals(SizeUnit.pixels, RenderSettings.getInstance().getSizeUnit());
    }
}
