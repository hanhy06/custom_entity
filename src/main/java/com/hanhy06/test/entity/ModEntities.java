package com.hanhy06.test.entity;

import com.hanhy06.test.Test;
import com.hanhy06.test.entity.custom.TestEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static EntityType<TestEntity> TestEntity = registerEntityType(
            Test.MOD_ID,
            "test_entity",
            TestEntity::new,
            SpawnGroup.MISC
    );

    public static <T extends Entity> EntityType<T> registerEntityType(
            String modId,
            String name,
            EntityType.EntityFactory<T> factory,
            SpawnGroup spawnGroup) {
        // Identifier.of를 사용하여 Identifier 생성
        Identifier id = Identifier.of(modId, name);

        // RegistryKey 생성
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, id);

        // EntityType 생성
        EntityType<T> entityType = EntityType.Builder.create(factory, spawnGroup).build(key);

        // Registry에 등록
        return Registry.register(Registries.ENTITY_TYPE, key, entityType);
    }
}
