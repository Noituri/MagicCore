package dreavedir.magiccore.entities.Lindarnir;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Lindarnir - Dreavedir
 * Created using Tabula 7.0.0
 */
public class ModelLindarnir extends ModelBase {
    public ModelRenderer leg_left;
    public ModelRenderer leg_right;
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer arm_right;
    public ModelRenderer arm_left;
    public ModelRenderer hat1;
    public ModelRenderer hat2;
    public ModelRenderer hat3;
    public ModelRenderer hat4;
    public ModelRenderer hat5;
    public ModelRenderer staff_body;
    public ModelRenderer staff_body_decor;
    public ModelRenderer staff_body_decor_1;
    public ModelRenderer staff_body_decor_2;
    public ModelRenderer staff_head;
    public ModelRenderer staff_head_decor;
    public ModelRenderer staff_head_decor_1;
    public ModelRenderer staff_head_decor_2;
    public ModelRenderer staff_head_decor_3;
    public ModelRenderer staff_head_decor_4;
    public ModelRenderer staff_head_decor_5;
    public ModelRenderer staff_head_decor_6;
    public ModelRenderer staff_head_decor_7;
    public ModelRenderer staff_head_core;
    public ModelRenderer staff_head_arm;
    public ModelRenderer staff_head_arm_1;
    public ModelRenderer staff_head_arm_2;
    public ModelRenderer staff_head_arm_3;
    public ModelRenderer staff_head_arm1;
    public ModelRenderer staff_head_arm1_1;
    public ModelRenderer staff_head_arm1_2;
    public ModelRenderer staff_head_arm1_3;

    public ModelLindarnir() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.staff_head_decor = new ModelRenderer(this, 0, 0);
        this.staff_head_decor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor.addBox(-1.5F, -8.0F, -1.5F, 1, 1, 1, 0.0F);
        this.staff_head_arm1_3 = new ModelRenderer(this, 16, 42);
        this.staff_head_arm1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm1_3.addBox(0.5F, 0.7F, -7.3F, 1, 1, 4, 0.0F);
        this.setRotateAngle(staff_head_arm1_3, -1.0471975511965976F, 0.0F, 0.0F);
        this.staff_head_core = new ModelRenderer(this, 54, 2);
        this.staff_head_core.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_core.addBox(0.5F, -9.0F, 0.5F, 1, 2, 1, 0.0F);
        this.staff_head_arm1_2 = new ModelRenderer(this, 16, 40);
        this.staff_head_arm1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm1_2.addBox(4.2F, 2.4F, 0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(staff_head_arm1_2, 0.0F, 0.0F, -1.0471975511965976F);
        this.staff_head_decor_1 = new ModelRenderer(this, 28, 0);
        this.staff_head_decor_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_1.addBox(0.5F, -8.0F, -1.5F, 1, 1, 1, 0.0F);
        this.staff_head_arm_3 = new ModelRenderer(this, 24, 16);
        this.staff_head_arm_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm_3.addBox(0.5F, -3.0F, -3.0F, 1, 1, 2, 0.0F);
        this.staff_body = new ModelRenderer(this, 48, 21);
        this.staff_body.setRotationPoint(-6.9F, 4.5F, -9.5F);
        this.staff_body.addBox(0.0F, 0.0F, 0.0F, 2, 20, 2, 0.0F);
        this.setRotateAngle(staff_body, 0.9105382707654417F, 0.0F, 0.0F);
        this.staff_head_decor_2 = new ModelRenderer(this, 32, 0);
        this.staff_head_decor_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_2.addBox(2.5F, -8.0F, -1.5F, 1, 1, 1, 0.0F);
        this.staff_head_arm_1 = new ModelRenderer(this, 57, 4);
        this.staff_head_arm_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm_1.addBox(3.0F, -3.0F, -1.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(staff_head_arm_1, 0.0F, -1.5707963267948966F, 0.0F);
        this.arm_left = new ModelRenderer(this, 0, 32);
        this.arm_left.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm_left.addBox(4.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F);
        this.staff_head_decor_6 = new ModelRenderer(this, 28, 2);
        this.staff_head_decor_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_6.addBox(2.5F, -8.0F, 2.5F, 1, 1, 1, 0.0F);
        this.hat4 = new ModelRenderer(this, 16, 32);
        this.hat4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat4.addBox(-2.0F, -18.0F, -2.0F, 4, 2, 4, 0.0F);
        this.hat5 = new ModelRenderer(this, 12, 0);
        this.hat5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat5.addBox(-0.1F, -19.9F, -1.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(hat5, -0.045553093477052F, 0.22759093446006054F, -0.045553093477052F);
        this.hat2 = new ModelRenderer(this, 0, 50);
        this.hat2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat2.addBox(-4.0F, -13.6F, -4.7F, 8, 3, 8, 0.0F);
        this.setRotateAngle(hat2, -0.091106186954104F, 0.0F, 0.0F);
        this.leg_right = new ModelRenderer(this, 16, 0);
        this.leg_right.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.leg_right.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 16);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -10.0F, -4.0F, 8, 8, 8, 0.0F);
        this.staff_head_decor_3 = new ModelRenderer(this, 54, 0);
        this.staff_head_decor_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_3.addBox(-1.5F, -8.0F, 2.5F, 1, 1, 1, 0.0F);
        this.staff_head_decor_5 = new ModelRenderer(this, 0, 2);
        this.staff_head_decor_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_5.addBox(-1.5F, -8.0F, 0.5F, 1, 1, 1, 0.0F);
        this.staff_head_arm = new ModelRenderer(this, 32, 4);
        this.staff_head_arm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm.addBox(-3.0F, -3.0F, 0.5F, 2, 1, 1, 0.0F);
        this.staff_head_decor_7 = new ModelRenderer(this, 32, 2);
        this.staff_head_decor_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_7.addBox(2.5F, -8.0F, 0.5F, 1, 1, 1, 0.0F);
        this.staff_head_arm_2 = new ModelRenderer(this, 0, 16);
        this.staff_head_arm_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm_2.addBox(3.0F, -3.0F, 0.5F, 2, 1, 1, 0.0F);
        this.staff_body_decor_1 = new ModelRenderer(this, 28, 59);
        this.staff_body_decor_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.staff_body_decor_1.addBox(-1.0F, 0.0F, -1.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(staff_body_decor_1, -0.13962634015954636F, -0.05235987755982988F, -0.03490658503988659F);
        this.hat1 = new ModelRenderer(this, 16, 39);
        this.hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat1.addBox(-5.0F, -11.0F, -5.0F, 10, 1, 10, 0.0F);
        this.hat3 = new ModelRenderer(this, 32, 50);
        this.hat3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat3.addBox(-3.0F, -16.2F, -3.6F, 6, 3, 6, 0.0F);
        this.setRotateAngle(hat3, 0.0F, 0.136659280431156F, 0.0F);
        this.staff_head_arm1 = new ModelRenderer(this, 24, 21);
        this.staff_head_arm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm1.addBox(-7.3F, 0.4F, 0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(staff_head_arm1, 0.0F, 0.0F, 1.0471975511965976F);
        this.body = new ModelRenderer(this, 32, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, -2.0F, -3.0F, 8, 15, 6, 0.0F);
        this.staff_head_decor_4 = new ModelRenderer(this, 58, 0);
        this.staff_head_decor_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_decor_4.addBox(0.5F, -8.0F, 2.5F, 1, 1, 1, 0.0F);
        this.arm_right = new ModelRenderer(this, 32, 21);
        this.arm_right.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm_right.addBox(-8.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F);
        this.staff_head_arm1_1 = new ModelRenderer(this, 16, 38);
        this.staff_head_arm1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head_arm1_1.addBox(4.2F, 2.3F, -1.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(staff_head_arm1_1, 0.0F, 0.0F, -1.0471975511965976F);
        this.staff_body_decor = new ModelRenderer(this, 46, 43);
        this.staff_body_decor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_body_decor.addBox(-1.0F, 1.0F, -1.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(staff_body_decor, 0.0F, 0.0F, -0.10471975511965977F);
        this.staff_head = new ModelRenderer(this, 0, 61);
        this.staff_head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.staff_head.addBox(-1.0F, -7.0F, -1.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(staff_head, -0.091106186954104F, 0.0F, 0.0F);
        this.staff_body_decor_2 = new ModelRenderer(this, 44, 59);
        this.staff_body_decor_2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.staff_body_decor_2.addBox(-1.0F, 0.0F, -1.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(staff_body_decor_2, 0.06981317007977318F, 0.13962634015954636F, -0.017453292519943295F);
        this.leg_left = new ModelRenderer(this, 0, 0);
        this.leg_left.mirror = true;
        this.leg_left.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leg_left.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.staff_head.addChild(this.staff_head_decor);
        this.staff_head_arm_3.addChild(this.staff_head_arm1_3);
        this.staff_head.addChild(this.staff_head_core);
        this.staff_head_arm_2.addChild(this.staff_head_arm1_2);
        this.staff_head.addChild(this.staff_head_decor_1);
        this.staff_head.addChild(this.staff_head_arm_3);
        this.staff_head.addChild(this.staff_head_decor_2);
        this.staff_head.addChild(this.staff_head_arm_1);
        this.staff_head.addChild(this.staff_head_decor_6);
        this.hat3.addChild(this.hat4);
        this.hat4.addChild(this.hat5);
        this.hat1.addChild(this.hat2);
        this.staff_head.addChild(this.staff_head_decor_3);
        this.staff_head.addChild(this.staff_head_decor_5);
        this.staff_head.addChild(this.staff_head_arm);
        this.staff_head.addChild(this.staff_head_decor_7);
        this.staff_head.addChild(this.staff_head_arm_2);
        this.staff_body.addChild(this.staff_body_decor_1);
        this.hat2.addChild(this.hat3);
        this.staff_head_arm.addChild(this.staff_head_arm1);
        this.staff_head.addChild(this.staff_head_decor_4);
        this.staff_head_arm_1.addChild(this.staff_head_arm1_1);
        this.staff_body.addChild(this.staff_body_decor);
        this.staff_body.addChild(this.staff_head);
        this.staff_body.addChild(this.staff_body_decor_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.staff_body.render(f5);
        this.arm_left.render(f5);
        this.leg_right.render(f5);
        this.head.render(f5);
        this.hat1.render(f5);
        this.body.render(f5);
        this.arm_right.render(f5);
        this.leg_left.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
