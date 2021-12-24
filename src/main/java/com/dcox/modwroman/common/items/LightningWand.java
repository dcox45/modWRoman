package com.dcox.modwroman.common.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class LightningWand extends Item{

	public LightningWand(Properties p_i48487_1_) {
		super(p_i48487_1_);
		// TODO Auto-generated constructor stub
	}
	
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
	      ItemStack itemstack = player.getItemInHand(hand);
	      if (!world.isClientSide) {
	    	  RayTraceResult lookingAt = Minecraft.getInstance().hitResult;

	    	  if (lookingAt != null && lookingAt.getType() == RayTraceResult.Type.BLOCK) {
	    	      Vector3d pos = lookingAt.getLocation();
	    	      // now the coordinates you want are in pos. Example of use:
	    	      LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
		    	  bolt.setPos(pos.x, pos.y,pos.z);
		    	  
		    	  world.addFreshEntity(bolt);
		    	  
	    	      // this is a bit oversimplified - you have to send a packet to the server, since only the client knows the BlockPos, but only the server can change blocks
	    	  } else {
	    	      return null;
	    	  }

	            
          
          
	    	  
	    	
//
	      }
	      return ActionResult.sidedSuccess(itemstack, world.isClientSide());
	}
	
	

}
