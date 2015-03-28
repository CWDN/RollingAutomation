package io.github.cwdn;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Rolling Automation
 * Licensed under MIT
 *
 * @author CWDN
 * @version 0.0.1
 */
@Mod(modid = RollingAutomation.MODID, version = RollingAutomation.VERSION)
public class RollingAutomation {

    public static final String MODID = "Rolling Automation";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("Rolling Automation is Live");
    }
}
