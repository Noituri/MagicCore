package dreavedir.magiccore.init;

import dreavedir.magiccore.MagicCore;
import dreavedir.magiccore.entities.Lindarnir.RenderLindarnir;
import dreavedir.magiccore.entities.Lindarnir.EntityLindarnir;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static dreavedir.magiccore.utils.EntitiesNames.LINDARNIR;

public class MagicCoreEntities {
    public static void init() {
        int id = 1;
        registerEntity(EntityLindarnir.class, LINDARNIR, id++);
    }

    private static void registerEntity(Class entityClass, String entityName, String primaryColor, String secondaryColor, int id) {
        EntityRegistry.registerModEntity(
                new ResourceLocation(MagicCore.MODID, entityName),
                entityClass,
                entityName,
                id,
                MagicCore.instance,
                64,
                3,
                true,
                Integer.parseInt(primaryColor, 16),
                Integer.parseInt(secondaryColor, 16)
        );
    }

    private static void registerEntity(Class entityClass, String entityName, int id) {
        EntityRegistry.registerModEntity(
                new ResourceLocation(MagicCore.MODID, entityName),
                entityClass,
                entityName,
                id,
                MagicCore.instance,
                64,
                3,
                true
        );
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityLindarnir.class, RenderLindarnir.FACTORY);
    }
}
