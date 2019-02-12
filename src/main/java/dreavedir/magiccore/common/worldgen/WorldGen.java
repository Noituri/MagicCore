package dreavedir.magiccore.common.worldgen;

import dreavedir.magiccore.common.config.OreGenConfig;
import dreavedir.magiccore.common.utils.Dimensions;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
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
                        OreGenConfig.GEN_RATE_MAGIC_HEART_ORE,
                        OreGenConfig.GEN_MIN_HEIGHT_MAGIC_HEART_ORE,
                        OreGenConfig.GEN_MAX_HEIGHT_MAGIC_HEART_ORE,
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
