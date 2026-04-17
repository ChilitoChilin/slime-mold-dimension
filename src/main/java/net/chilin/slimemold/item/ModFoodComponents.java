package net.chilin.slimemold.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CRAB_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).build();

    public static final FoodComponent BLUE_BERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).snack().build();

}
