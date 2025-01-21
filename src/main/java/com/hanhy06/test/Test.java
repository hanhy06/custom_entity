package com.hanhy06.test;

import com.hanhy06.test.entity.ModEntities;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test implements ModInitializer {
	public static final String MOD_ID = "test";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModEntities.registerModEntities();
	}
}