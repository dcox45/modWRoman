package com.dcox.modwroman.common.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class FlameThrower extends Item{

	public FlameThrower(Properties p_i48487_1_) {
		super(p_i48487_1_);
		// TODO Auto-generated constructor stub
	}
	
	
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
	      ItemStack itemstack = player.getItemInHand(hand);
	      if (!world.isClientSide) {
	    	  
	    	  // GOOD FOR CARPET BOMBING
	    	  
	    	Vector3d vector3d = player.getViewVector(1.0F);
	    	  
            for(int i = 0; i < 100; i++) {
		    	FireballEntity fireballentity = new FireballEntity(world, player, player.getLookAngle().x, player.getLookAngle().y, player.getLookAngle().z);
	            
//		    	fireballentity.setPos(player.getX() + i, player.getY(), player.getZ() + 2.0D);  
		    	fireballentity.explosionPower = 50; 
		    	fireballentity.setPos(player.getX() + vector3d.x * 2.0D*i, player.getY(0.5D)+ vector3d.y*i, fireballentity.getZ() + vector3d.z*i);
	            world.addFreshEntity(fireballentity);
	            
            
            }
	    	  
	    	  //accurate but not spread out 
	    	  
//            for(int i = 0; i < 10; i++) {
//		    	FireballEntity fireballentity = new FireballEntity(world, player, player.getLookAngle().x + i, player.getLookAngle().y + i, player.getLookAngle().z + i);
//	            fireballentity.setPos(player.getX(), player.getY() + 1, player.getZ() );  
//	            fireballentity.noPhysics = true; 
//	            fireballentity.explosionPower = 3;
//	           
//	            
//	            	
//	            world.addFreshEntity(fireballentity);
//            
//            }
// 
	      }
	      return ActionResult.sidedSuccess(itemstack, world.isClientSide());
	}
	
}


	
	
//	public ActionResultType use(ItemUseContext p_195939_1_) {
//	      PlayerEntity playerentity = p_195939_1_.getPlayer();
//	      World world = p_195939_1_.getLevel();
//	      Vector3d playerpos = playerentity.getEyePosition(0);
//	      BlockPos blockpos = p_195939_1_.getPlayer().blockPosition();
//	      BlockState blockstate = world.getBlockState(blockpos);
//	      
//	      //BlockPos blockpos1 = blockpos.relative(p_195939_1_.getClickedFace());
//          
//            //world.playSound(playerentity, blockpos, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
//            for(int i = 0; i < 10; i++) {
////	            BlockState blockstate1 = AbstractFireBlock.getState(world, blockpos);
////	          
////	            world.setBlock(blockpos.offset(i, 2, 0), blockstate1, 11);
//	            //ItemStack itemstack = p_195939_1_.getItemInHand();
//            	
//            	FireballEntity fireballentity = new FireballEntity(world, p_195939_1_.getPlayer(), p_195939_1_.getPlayer().getLookAngle().x, p_195939_1_.getPlayer().getLookAngle().y, p_195939_1_.getPlayer().getLookAngle().z);
//              fireballentity.setPos(p_195939_1_.getPlayer().getX() * i, p_195939_1_.getPlayer().getY(), p_195939_1_.getPlayer().getZ() + 2.0D);
//                
//                world.addFreshEntity(fireballentity);
//            }
//            return ActionResultType.sidedSuccess(world.isClientSide());
//       
//	      }
//	   }


