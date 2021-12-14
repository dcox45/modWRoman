package com.dcox.modwroman.core.init;

import com.dcox.modwroman.ModwRoman;
import com.dcox.modwroman.common.items.ExampleItem;
import com.dcox.modwroman.common.items.FlameThrower;
import com.dcox.modwroman.common.items.SpecialItem;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.TallBlockItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModwRoman.MOD_ID);
    
    public static final RegistryObject<ExampleItem> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new ExampleItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<FlameThrower> FLAME_THROWER = ITEMS.register("flame_thrower", () -> new FlameThrower(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    
    public static final RegistryObject<BlockItem> MYSLIMEBLOCK = ITEMS.register("myslime_block", 
			() -> new BlockItem(BlockInit.MYSLIME_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    
    
    public static final RegistryObject<TallBlockItem> DYLANS_DOOR = ITEMS.register("dylans_door", 
			() -> new TallBlockItem(BlockInit.DYLANS_DOOR.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    
    
//    public static final Item ACACIA_DOOR = registerBlock(new TallBlockItem(Blocks.ACACIA_DOOR,
//    		(new Item.Properties()).tab(ItemGroup.TAB_REDSTONE)));

    
    
	
	public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item", 
			() -> new SpecialItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));
			

}
