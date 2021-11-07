package mrthomas20121.cast_axe;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CastAxe.mod_id, bus= Mod.EventBusSubscriber.Bus.MOD)
public class CastAxeRegistry {

    public static ItemGroup tab = new ItemGroup("cast_axe") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(cast_iron_ingot);
        }
    };

    public static Item cast_iron_axe;
    public static Item cast_iron_pickaxe;
    public static Item cast_iron_shovel;

    public static Item cast_iron_ingot;
    public static Item cast_iron_dust;
    public static Item cast_iron_plate;
    public static Item cast_iron_gear;
    public static Item cast_iron_nugget;
    public static Item cast_iron_rod;

    public static Block cast_iron_block = new Block(AbstractBlock.Properties.of(Material.METAL));

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        cast_iron_axe = register("cast_iron_axe", new AxeItem(ItemTiers.CAST_IRON, 2.0F, -3.0F, (new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_pickaxe = register("cast_iron_pickaxe", new PickaxeItem(ItemTiers.CAST_IRON, 2, -3.0F, (new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_shovel = register("cast_iron_shovel", new ShovelItem(ItemTiers.CAST_IRON, 2, -3.0F, (new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_ingot = register("cast_iron_ingot", new Item((new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_dust = register("cast_iron_dust", new Item((new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_plate = register("cast_iron_plate", new Item((new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_gear = register("cast_iron_gear", new Item((new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_nugget = register("cast_iron_nugget", new Item((new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        cast_iron_rod = register("cast_iron_rod", new Item((new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
        register("cast_iron_block", new BlockItem(cast_iron_block, (new Item.Properties()).tab(tab).rarity(Rarity.RARE)), event.getRegistry());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        cast_iron_block = register("cast_iron_block", new Block(AbstractBlock.Properties.of(Material.METAL)), event.getRegistry());
    }

    private static Item register(String registry_name, Item item, IForgeRegistry<Item> r) {
        item.setRegistryName(CastAxe.mod_id, registry_name);
        r.register(item);
        return item;
    }

    private static Block register(String registry_name, Block block, IForgeRegistry<Block> r) {
        block.setRegistryName(CastAxe.mod_id, registry_name);
        r.register(block);
        return block;
    }
}
