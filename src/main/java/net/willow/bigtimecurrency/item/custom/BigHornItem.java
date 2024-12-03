package net.willow.bigtimecurrency.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.willow.bigtimecurrency.sounds.ModSounds;

public class BigHornItem extends Item {
    public BigHornItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockPos playerPos = user.getBlockPos();
        world.playSound(null,
                user.getX(),
                user.getY(),
                user.getZ(),
                ModSounds.BIGHORN_HONK,
                SoundCategory.PLAYERS, .5f, 1f);
        user.getItemCooldownManager().set(this, 60);


        return super.use(world, user, hand);
    }

}
