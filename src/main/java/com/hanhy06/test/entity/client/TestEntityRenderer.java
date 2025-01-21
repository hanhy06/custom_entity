package com.hanhy06.test.entity.client;

import com.hanhy06.test.entity.custom.TestEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class TestEntityRenderer extends EntityRenderer<TestEntity,TestEntityRenderState> {
    protected TestEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public TestEntityRenderState createRenderState() {
        return null;
    }
}
