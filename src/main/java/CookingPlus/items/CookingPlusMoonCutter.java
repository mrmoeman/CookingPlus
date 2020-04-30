package CookingPlus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusMoonCutter extends CookingPlusCustomItem {

	private final String name = "mooncutter";
	
	public CookingPlusMoonCutter(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName("mooncutter");
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
