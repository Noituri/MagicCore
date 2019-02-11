package dreavedir.magiccore.common.worldgen;

import dreavedir.magiccore.common.MagicCoreBlocks;
import dreavedir.magiccore.common.config.ModConfig;
import dreavedir.magiccore.common.utils.Dimensions;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

    //TODO organize this

    public static WorldGen INSTANCE = new WorldGen();

    public WorldGen() {}

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case Dimensions.NETHER:
                break;
            case Dimensions.OVERWORLD:
                MagicHeartOre.generate(
                        ModConfig.GEN_RATE_MAGIC_HEART_ORE,
                        ModConfig.GEN_MIN_HEIGHT_MAGIC_HEART_ORE,
                        ModConfig.GEN_MAX_HEIGHT_MAGIC_HEART_ORE,
                        world,
                        random,
                        chunkX,
                        chunkZ
                );
                break;
            case Dimensions.END:
                break;
            default:
                break;
        }
    }
}
