package com.github.alexmodguy.alexscaves.server.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ACServerConfig {

    public final ForgeConfigSpec.DoubleValue caveBiomeMeanWidth;
    public final ForgeConfigSpec.IntValue caveBiomeMeanSeparation;
    public final ForgeConfigSpec.DoubleValue caveBiomeWidthRandomness;
    public final ForgeConfigSpec.DoubleValue caveBiomeSpacingRandomness;
    public final ForgeConfigSpec.BooleanValue warnGenerationIncompatibility;
    public final ForgeConfigSpec.DoubleValue caveCreatureSpawnCountModifier;
    public final ForgeConfigSpec.IntValue pathfindingThreads;
    public final ForgeConfigSpec.IntValue nucleeperFuseTime;
    public final ForgeConfigSpec.IntValue atlatitanMaxExplosionResistance;
    public final ForgeConfigSpec.BooleanValue devastatingTremorzillaBeam;
    public final ForgeConfigSpec.BooleanValue watcherPossession;
    public final ForgeConfigSpec.IntValue watcherPossessionCooldown;
    public final ForgeConfigSpec.IntValue amberMonolithMeanTime;
    public final ForgeConfigSpec.BooleanValue nuclearFurnaceBlastingOnly;
    public final ForgeConfigSpec.BooleanValue onlyOneResearchNeeded;
    public final ForgeConfigSpec.IntValue caveMapSearchAttempts;
    public final ForgeConfigSpec.IntValue caveMapSearchWidth;
    public final ForgeConfigSpec.IntValue nukeMaxBlockExplosionResistance;
    public final ForgeConfigSpec.BooleanValue nukesSpawnItemDrops;
    public final ForgeConfigSpec.DoubleValue nukeExplosionSizeModifier;
    public final ForgeConfigSpec.BooleanValue totemOfPossessionPlayers;
    public final ForgeConfigSpec.IntValue darknessCloakChargeTime;
    public final ForgeConfigSpec.IntValue darknessCloakFlightTime;
    public final ForgeConfigSpec.DoubleValue magneticTabletLootChance;
    public final ForgeConfigSpec.DoubleValue primordialTabletLootChance;
    public final ForgeConfigSpec.DoubleValue toxicTabletLootChance;
    public final ForgeConfigSpec.DoubleValue abyssalTabletLootChance;
    public final ForgeConfigSpec.DoubleValue forlornTabletLootChance;
    public final ForgeConfigSpec.DoubleValue cabinMapLootChance;
    public final ForgeConfigSpec.BooleanValue cartographersSellCabinMaps;
    public final ForgeConfigSpec.BooleanValue wanderingTradersSellCabinMaps;
    public final ForgeConfigSpec.BooleanValue enchantmentsInLoot;

    public ACServerConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("generation");
        caveBiomeMeanWidth = builder.comment("Average radius (in blocks) of an Alex's Caves cave biome.").translation("cave_biome_mean_width").defineInRange("cave_biome_mean_width", 300D, 10.0D, Double.MAX_VALUE);
        caveBiomeMeanSeparation = builder.comment("Average separation (in blocks) between each Alex's Caves cave biome.").translation("cave_biome_mean_separation").defineInRange("cave_biome_mean_separation", 900, 50, Integer.MAX_VALUE);
        caveBiomeWidthRandomness = builder.comment("How irregularly shaped Alex's Caves cave biomes can generate. 0 = all biomes nearly circular. 1 = biomes completely squiggly in shape.").translation("cave_biome_width_randomness").defineInRange("cave_biome_width_randomness", 0.15D, 0, 1D);
        caveBiomeSpacingRandomness = builder.comment("Average spacing in between Alex's Caves cave biomes. 0 = all biomes nearly perfectly equidistant. 1 = biomes completely randomly spread out, sometimes next to eachother.").translation("cave_biome_spacing_randomness").defineInRange("cave_biome_spacing_randomness", 0.45D, 0, 1D);
        warnGenerationIncompatibility = builder.comment("Whether to warn users when a server starts if an incompatible generation mod is detected.").translation("warn_generation_incompatibility").define("warn_generation_incompatibility", true);
        builder.pop();
        builder.push("mob-spawning");
        caveCreatureSpawnCountModifier = builder.comment("Cave Creatures (All dinosaurs, raycats, etc) spawn at this frequency. Their cap is calculated by multiplying this number with the default mob cap for surface animals.").translation("cave_creature_spawn_count_modifier").defineInRange("cave_creature_spawn_count_modifier", 1.75D, 0, 10D);
        builder.pop();
        builder.push("mob-behavior");
        pathfindingThreads = builder.comment("How many cpu cores big mobs(tremorzilla, atlatitan, grottoceratops etc) should utilize when pathing. Bigger number = less impact on TPS").translation("pathfinding_threads").defineInRange("pathfinding_threads", 5, 1, 100);
        atlatitanMaxExplosionResistance = builder.comment("The maximum explosion resistance that a block can have to be destroyed by an atlatitan stomp. Set to zero to disable all atlatitan block breaking.").translation("atlatitan_max_block_explosion_resistance").defineInRange("atlatitan_max_block_explosion_resistance", 10, 0, Integer.MAX_VALUE);
        nucleeperFuseTime = builder.comment("How long (in game ticks) it takes for a nucleeper to explode.").translation("nucleeper_fuse_time").defineInRange("nucleeper_fuse_time", 300, 20, Integer.MAX_VALUE);
        devastatingTremorzillaBeam = builder.comment("True if the Tremorzilla beam breaks even more blocks.").translation("devastating_tremorzilla_beam").define("devastating_tremorzilla_beam", true);
        watcherPossession = builder.comment("Whether the Watcher can take control of the camera.").translation("watcher_possession").define("watcher_possession", true);
        watcherPossessionCooldown = builder.comment("How long (in game ticks) between watcher possession attempts.").translation("watcher_possession_cooldown").defineInRange("watcher_possession_cooldown", 300, 20, 24000);
        builder.pop();
        builder.push("block-behavior");
        amberMonolithMeanTime = builder.comment("How long (in game ticks) it usually takes for an amber monolith to spawn an animal.").translation("amber_monolith_mean_time").defineInRange("amber_monolith_mean_time", 32000, 1000, Integer.MAX_VALUE);
        nuclearFurnaceBlastingOnly = builder.comment("True if the Nuclear Furnace only uses 'Blasting' recipes, false to use all smelting recipes.").translation("nuclear_furnace_blasting_only").define("nuclear_furnace_blasting_only", true);
        builder.pop();
        builder.push("item-behavior");
        onlyOneResearchNeeded = builder.comment("True if one Cave Codex is all that is needed to unlock every Cave Compendium entry.").translation("only_one_research_needed").define("only_one_research_needed", false);
        caveMapSearchAttempts = builder.comment("How many attempts to find a biome a cave map engages in when used. Increase this to increase the search radius, or decrease it to make them faster.").translation("cave_map_search_attempts").defineInRange("cave_map_search_attempts", 128000, 64, Integer.MAX_VALUE);
        caveMapSearchWidth = builder.comment("How wide each search attempt scans for a biome. Increasing this generally makes cave biome maps faster - at the cost of losing fidelity(may skip biomes smaller than this in block width).").translation("cave_map_search_width").defineInRange("cave_map_search_width", 64, 4, 256);
        nukeMaxBlockExplosionResistance = builder.comment("The maximum explosion resistance that a block can have to be destroyed by a nuclear explosion. Set to zero to disable all nuclear explosion block breaking.").translation("nuke_max_block_explosion_resistance").defineInRange("nuke_max_block_explosion_resistance", 1000, 0, Integer.MAX_VALUE);
        nukesSpawnItemDrops = builder.comment("Whether some block items are dropped by nuclear explosions. False if all destroyed blocks do not drop items.").translation("nuke_spawn_item_drops").define("nuke_spawn_item_drops", true);
        nukeExplosionSizeModifier = builder.comment("The scale of nuclear bomb destruction. multiply this by 16 to get the radius of a nuclear bomb explosion.").translation("nuclear_explosion_size_modifier").defineInRange("nuclear_explosion_size_modifier", 3.0D, 0.0, Double.MAX_VALUE);
        totemOfPossessionPlayers = builder.comment("Whether the Totem of Possession can be applied to players.").translation("totem_of_possession_works_on_players").define("totem_of_possession_works_on_players", true);
        darknessCloakChargeTime = builder.comment("The amount of time (in ticks) it takes to charge up the Cloak of Darkness ability.").translation("darkness_cloak_charge_time").defineInRange("darkness_cloak_charge_time", 1000, 20, Integer.MAX_VALUE);
        darknessCloakFlightTime = builder.comment("The amount of time (in ticks) that players can fly with the Cloak of Darkness ability.").translation("darkness_cloak_fly_time").defineInRange("darkness_cloak_fly_time", 200, 20, Integer.MAX_VALUE);
        builder.pop();
        builder.push("vanilla-changes");
        magneticTabletLootChance = builder.comment("percent chance of bastion having a cave tablet for magnetic caves in its loot table:").translation("magnetic_tablet_loot_chance").defineInRange("magnetic_tablet_loot_chance", 0.45D, 0.0, 1.0D);
        primordialTabletLootChance = builder.comment("percent chance of suspicious sand having a cave tablet for primordial caves in its loot table:").translation("primordial_tablet_loot_chance").defineInRange("primordial_tablet_loot_chance", 0.15D, 0.0, 1.0D);
        toxicTabletLootChance = builder.comment("percent chance of jungle temple having a cave tablet for toxic caves in its loot table:").translation("toxic_tablet_loot_chance").defineInRange("toxic_tablet_loot_chance", 0.5D, 0.0, 1.0D);
        abyssalTabletLootChance = builder.comment("percent chance of underwater ruins having a cave tablet for abyssal chasm in its loot table:").translation("abyssal_tablet_loot_chance").defineInRange("abyssal_tablet_loot_chance", 0.4D, 0.0, 1.0D);
        forlornTabletLootChance = builder.comment("percent chance of mansion having a cave tablet for forlorn hollows in its loot table:").translation("forlorn_tablet_loot_chance").defineInRange("forlorn_tablet_loot_chance", 0.75D, 0.0, 1.0D);
        cabinMapLootChance = builder.comment("percent chance of abandoned mineshaft chests having a map to a nearby underground mineshaft in their loot table:").translation("cabin_map_loot_chance").defineInRange("cabin_map_loot_chance", 0.15D, 0.0, 1.0D);
        cartographersSellCabinMaps = builder.comment("Whether the Cartographer Villagers can sell maps to Underground Cabins.").translation("cartographers_sell_cabin_maps").define("cartographers_sell_cabin_maps", true);
        wanderingTradersSellCabinMaps = builder.comment("Whether the Wandering Traders can sell maps to Underground Cabins.").translation("wandering_traders_sell_cabin_maps").define("wandering_traders_sell_cabin_maps", true);
        enchantmentsInLoot = builder.comment("Whether the Enchantments added by AC appear in vanilla loot tables.").translation("enchantments_in_loot").define("enchantments_in_loot", false);
        builder.pop();
    }
}
