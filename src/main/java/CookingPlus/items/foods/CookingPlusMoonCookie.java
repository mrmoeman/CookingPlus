package CookingPlus.items.foods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
import CookingPlus.items.CookingPlusCustomEdibleFood;

public class CookingPlusMoonCookie extends CookingPlusCustomEdibleFood
{

	private final String name = "mooncookie";
	
    public CookingPlusMoonCookie() 
    {
        super(1, 0.3F);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName("mooncookie");
        setCreativeTab(CreativeTabs.FOOD);
        setPotionEffect(32, 20, 0, 100);
    }
    
    @Override
    public String getName()
    {
    	return name;
    }
}