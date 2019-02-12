package dreavedir.magiccore.client.renderer.entities;

import dreavedir.magiccore.common.entities.Lindarnir.EntityLindarnir;
import dreavedir.magiccore.client.models.entities.ModelLindarnir;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLindarnir extends RenderLiving<EntityLindarnir> {

    public static final RenderLindarnir.Factory FACTORY = new RenderLindarnir.Factory();

    public RenderLindarnir(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelLindarnir(), 0.8F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLindarnir entity) {
        return new ResourceLocation("magiccore:textures/entity/fordebug.png");
    }

    public static class Factory implements IRenderFactory<EntityLindarnir> {
        @Override
        public Render<? super EntityLindarnir> createRenderFor(RenderManager manager) {
            return new RenderLindarnir(manager);
        }
    }
}
