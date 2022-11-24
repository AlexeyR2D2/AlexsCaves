package com.github.alexmodguy.alexscaves.server.item;

import com.github.alexmodguy.alexscaves.AlexsCaves;
import com.github.alexmodguy.alexscaves.server.entity.ACEntityRegistry;
import com.github.alexmodguy.alexscaves.server.misc.ACCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ACItemRegistry {
    public static final DeferredRegister<Item> DEF_REG = DeferredRegister.create(ForgeRegistries.ITEMS, AlexsCaves.MODID);

    public static final RegistryObject<Item> RAW_SCARLET_NEODYMIUM = DEF_REG.register("raw_scarlet_neodymium", () -> new Item(new Item.Properties().tab(ACCreativeTab.INSTANCE)));
    public static final RegistryObject<Item> RAW_AZURE_NEODYMIUM = DEF_REG.register("raw_azure_neodymium", () -> new Item(new Item.Properties().tab(ACCreativeTab.INSTANCE)));
    public static final RegistryObject<Item> SCARLET_NEODYMIUM_INGOT = DEF_REG.register("scarlet_neodymium_ingot", () -> new Item(new Item.Properties().tab(ACCreativeTab.INSTANCE)));
    public static final RegistryObject<Item> AZURE_NEODYMIUM_INGOT = DEF_REG.register("azure_neodymium_ingot", () -> new Item(new Item.Properties().tab(ACCreativeTab.INSTANCE)));

    static {
        spawnEgg("teletor", ACEntityRegistry.TELETOR, 0X433B4A,0X0060EF);
        spawnEgg("magnetron", ACEntityRegistry.MAGNETRON, 0XFF002A,0X203070);
    }

    private static void spawnEgg(String entityName, RegistryObject type, int color1, int color2){
        DEF_REG.register("spawn_egg_" + entityName, () -> new ForgeSpawnEggItem(type, color1,color2, new Item.Properties().tab(ACCreativeTab.INSTANCE)));

    }
}