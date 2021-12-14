package com.dcox.modwroman.common.items;


//import jdk.javadoc.internal.doclets.formats.html.markup.HtmlTag.BlockType;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World; 

public class ExampleItem extends Item {
   public ExampleItem(Item.Properties p_i48501_1_) {
      super(p_i48501_1_);
   }
   
   public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
      ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
      p_77659_1_.playSound((PlayerEntity)null, p_77659_2_.getX(), p_77659_2_.getY(), p_77659_2_.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
      p_77659_2_.getCooldowns().addCooldown(this, 20);
      if (!p_77659_1_.isClientSide) {
    	  
    	  
    	  PigEntity flyingPig = new PigEntity(EntityType.PIG, p_77659_1_);
    	  flyingPig.setPos(p_77659_2_.getX(), p_77659_2_.getY(), p_77659_2_.getZ() + 2.0D);
    	  
    	  p_77659_1_.addFreshEntity(flyingPig); 
    	  flyingPig.setSecondsOnFire(10);
//    	  flyingPig.xRot = (float) p_77659_2_.getLookAngle().x; 
//    	  flyingPig.yRot = (float) p_77659_2_.getLookAngle().y;
    	  
    	  flyingPig.setLastHurtByPlayer(p_77659_2_);
    	  //flyingPig.lookAt(EntityType.PIG, p_77659_2_.getLookAngle());
    	  //flyingPig.setSpeed(1000F);
    	  flyingPig.setDeltaMovement(p_77659_2_.getLookAngle().multiply(7, 7, 7));
    	  
    	  
    	  
    	  
    	  
//    	  EnderPearlEntity enderpearlentity = new EnderPearlEntity(p_77659_1_, p_77659_2_);
//    	  enderpearlentity.setItem(itemstack);
//    	  enderpearlentity.shootFromRotation(p_77659_2_, p_77659_2_.xRot, p_77659_2_.yRot, 0.0F, 1.5F, 1.0F);
//    	  p_77659_1_.addFreshEntity(enderpearlentity);
    	  
    	 
      }

      p_77659_2_.awardStat(Stats.ITEM_USED.get(this));
      if (!p_77659_2_.abilities.instabuild) {
         itemstack.shrink(1);
      }

      return ActionResult.sidedSuccess(itemstack, p_77659_1_.isClientSide());
   }
}