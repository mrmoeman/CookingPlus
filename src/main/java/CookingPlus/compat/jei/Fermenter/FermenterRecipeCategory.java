package CookingPlus.compat.jei.Fermenter;

import javax.annotation.Nonnull;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;

public class FermenterRecipeCategory implements IRecipeCategory<FermenterRecipeWrapper> {

	public static final String UID = "cookingplus.fermenter";
	private final IDrawableStatic background;
	private final String localizedName;
	
	private static final int inputSlot = 0;
	private static final int outputSlot = 3;
	
	public FermenterRecipeCategory(IGuiHelper guiHelper) {
		ResourceLocation location = new ResourceLocation("agriculturalrevolution", "textures/gui/jeifermentergui.png");
		background = guiHelper.createDrawable(location, 0, 0, 64, 64, 0, 0, 0, 0);
		localizedName = I18n.format("cookingplus.jei.fermenter");
	}
	
	@Override
	public String getUid() {
		return UID;
	}

	@Override
	public String getTitle() {
		return localizedName;
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void drawExtras(Minecraft minecraft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawAnimations(Minecraft minecraft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout,FermenterRecipeWrapper recipeWrapper) {
		// TODO Auto-generated method stub
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		
		guiItemStacks.init(inputSlot, true, 2, 37);
		guiItemStacks.init(outputSlot, false, 42, 37);
	
		guiItemStacks.setFromRecipe(inputSlot, recipeWrapper.getInputs());
		guiItemStacks.setFromRecipe(outputSlot, recipeWrapper.getOutputs());
	}

}
