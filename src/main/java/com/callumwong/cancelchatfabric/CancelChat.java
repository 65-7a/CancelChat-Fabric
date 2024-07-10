package com.callumwong.cancelchatfabric;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CancelChat implements DedicatedServerModInitializer {
    public static final String MOD_ID = "cancelchat-fabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeServer() {
        LOGGER.info("Chat messages will be intercepted by CancelChat");
    }
}
