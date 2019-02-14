package dreavedir.magiccore.worldgen;

import dreavedir.magiccore.config.ModConfig;
import dreavedir.magiccore.utils.Dimensions;
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
                        ModConfig.oreGenConfig.GEN_RATE_MAGIC_HEART_ORE,
                        ModConfig.oreGenConfig.GEN_MIN_HEIGHT_MAGIC_HEART_ORE,
                        ModConfig.oreGenConfig.GEN_MAX_HEIGHT_MAGIC_HEART_ORE,
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
