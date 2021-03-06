package CookingPlus.items.Harvest;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
import CookingPlus.items.CookingPlusCustomEdibleFood;

public class CookingPlusHop extends CookingPlusCustomEdibleFood
{
	
	private final String name = "hops";

    public CookingPlusHop() 
    {
        super(1, 0.3F);	//change this
        GameRegistry.registerItem(this, name);
        setUnlocalizedName("hops");
        //setTextureName("cookingplus:chilli");
        setCreativeTab(CreativeTabs.FOOD);
        setPotionEffect(32, 20, 0, 100);
    }
    
    @Override
    public String getName()
    {
    	return name;
    }
}