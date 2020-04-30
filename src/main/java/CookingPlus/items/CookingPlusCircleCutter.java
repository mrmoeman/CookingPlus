package CookingPlus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusCircleCutter extends CookingPlusCustomItem {

	private final String name = "circlecutter";
	
	public CookingPlusCircleCutter(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName("circlecutter");
		setCreativeTab(CreativeTabs.MISC);
		//setTextureName(CookingPlusMain.MODID + ":dough");
		setMaxStackSize(1);
	}
	
	@Override
    public String getName()
    {
    	return name;
    }
	
}
