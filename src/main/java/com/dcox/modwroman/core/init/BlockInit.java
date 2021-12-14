package com.dcox.modwroman.core.init;

import com.dcox.modwroman.ModwRoman;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			ModwRoman.MOD_ID);
	
	
    public static final RegistryObject<Block> MYSLIME_BLOCK = BLOCKS.register("myslime_block",
    		() -> new Block(AbstractBlock.Properties.of(Material.ICE_SOLID).friction(0.98F)));
    
    
    public static final RegistryObject<Block> DYLANS_DOOR = BLOCKS.register("dylans_door",
    		() -> new DoorBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2)
    				.requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(6f)));


}
