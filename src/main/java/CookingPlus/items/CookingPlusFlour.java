package CookingPlus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusFlour extends CookingPlusCustomItem {

	private final String name = "flour";
	
	public CookingPlusFlour(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName("flour");
		setCreativeTab(CreativeTabs.MISC);
		//setTextureName(CookingPlusMain.MODID + ":flour");
	}
	
	@Override
    public String getName()
    {
    	return name;
    }
	
}
