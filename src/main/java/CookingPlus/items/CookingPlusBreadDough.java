package CookingPlus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusBreadDough extends CookingPlusCustomItem {

	private final String name = "breaddough";
	
	public CookingPlusBreadDough(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName("breaddough");
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
