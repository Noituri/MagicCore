package dreavedir.magiccore.common.worldgen;

import dreavedir.magiccore.common.MagicCoreBlocks;
import dreavedir.magiccore.common.config.OreGenConfig;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class MagicHeartOre {
    public static void generate(int rates, int minHeight, int maxHeight, World world, Random random, int chunkX, int chunkZ ) {
        if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) return;

        WorldGenMinable magicHeartOre = new WorldGenMinable(MagicCoreBlocks.blockMagicHeartOre.getDefaultState(), OreGenConfig.GEN_AMOUNT_MAGIC_HEART_ORE, BlockMatcher.forBlock(Blocks.STONE));

        for (int i = 0; i < rates; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(maxHeight - minHeight + 1);
            int z = chunkZ * 16 + random.nextInt(16);

            magicHeartOre.generate(world, random, new BlockPos(x, y, z));
        }
    }
}
