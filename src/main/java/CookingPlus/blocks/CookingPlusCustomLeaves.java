package CookingPlus.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import CookingPlus.CookingPlusConfig;

public class CookingPlusCustomLeaves extends BlockLeaves implements IShearable {

	int[] surroundings;
	
	public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
	public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");
	protected boolean fancyGraphics;
	
	public CookingPlusCustomLeaves(String name) {
		super();
		this.setUnlocalizedName(name);
		this.setHardness(0.2F);
	    this.setLightOpacity(1);
	    this.setSoundType(SoundType.GROUND);
	    this.setTickRandomly(true);
	    this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
	    Blocks.FIRE.setFireInfo(this, 30, 60);
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos myPos) {
		return true;
	}
	
	public int getDecayRange(){
		return 0;
	}
	

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		List<ItemStack> ShearedDrop = new ArrayList<ItemStack>();

		ShearedDrop.add(new ItemStack(Item.getItemFromBlock(getLeaves())));
		return ShearedDrop;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isRainingAt(pos.up()) && !worldIn.getBlockState(pos.down()).isFullyOpaque() && rand.nextInt(15) == 1)
        {
            double d0 = (double)((float)pos.getX() + rand.nextFloat());
            double d1 = (double)pos.getY() - 0.05D;
            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
            worldIn.spawnParticle(EnumParticleTypes.DRIP_WATER, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
        }
        fancyGraphics = Minecraft.getMinecraft().gameSettings.fancyGraphics;
       
    }
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (((Boolean)state.getValue(CHECK_DECAY)).booleanValue() && ((Boolean)state.getValue(DECAYABLE)).booleanValue())
            {
                byte b0 = 4;
                int i = b0 + 1;
                int j = pos.getX();
                int k = pos.getY();
                int l = pos.getZ();
                byte b1 = 32;
                int i1 = b1 * b1;
                int j1 = b1 / 2;

                if (this.surroundings == null)
                {
                    this.surroundings = new int[b1 * b1 * b1];
                }

                int k1;

                if (worldIn.isAreaLoaded(new BlockPos(j - i, k - i, l - i), new BlockPos(j + i, k + i, l + i)))
                {
                    int l1;
                    int i2;

                    for (k1 = -b0; k1 <= b0; ++k1)
                    {
                        for (l1 = -b0; l1 <= b0; ++l1)
                        {
                            for (i2 = -b0; i2 <= b0; ++i2)
                            {
                                BlockPos tmp = new BlockPos(j + k1, k + l1, l + i2);
                                Block block = worldIn.getBlockState(tmp).getBlock();

                                if (!block.canSustainLeaves(worldIn.getBlockState(tmp), worldIn, tmp))
                                {
                                    if (block.isLeaves(worldIn.getBlockState(tmp), worldIn, tmp))
                                    {
                                        this.surroundings[(k1 + j1) * i1 + (l1 + j1) * b1 + i2 + j1] = -2;
                                    }
                                    else
                                    {
                                        this.surroundings[(k1 + j1) * i1 + (l1 + j1) * b1 + i2 + j1] = -1;
                                    }
                                }
                                else
                                {
                                    this.surroundings[(k1 + j1) * i1 + (l1 + j1) * b1 + i2 + j1] = 0;
                                }
                            }
                        }
                    }

                    for (k1 = 1; k1 <= 4; ++k1)
                    {
                        for (l1 = -b0; l1 <= b0; ++l1)
                        {
                            for (i2 = -b0; i2 <= b0; ++i2)
                            {
                                for (int j2 = -b0; j2 <= b0; ++j2)
                                {
                                    if (this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + j2 + j1] == k1 - 1)
                                    {
                                        if (this.surroundings[(l1 + j1 - 1) * i1 + (i2 + j1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1 - 1) * i1 + (i2 + j1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1 + 1) * i1 + (i2 + j1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1 + 1) * i1 + (i2 + j1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1 - 1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1 - 1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1 + 1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1 + 1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + (j2 + j1 - 1)] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + (j2 + j1 - 1)] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + j2 + j1 + 1] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + j2 + j1 + 1] = k1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                k1 = this.surroundings[j1 * i1 + j1 * b1 + j1];

                if (k1 >= 0)
                {
                    worldIn.setBlockState(pos, state.withProperty(CHECK_DECAY, Boolean.valueOf(false)), 4);
                }
                else
                {
                    this.destroy(worldIn, pos);
                }
            }
        }
    }
	
	@Override
	public void beginLeavesDecay(IBlockState state, World world, BlockPos pos)
    {
        if (!(Boolean)state.getValue(CHECK_DECAY))
        {
            world.setBlockState(pos, state.withProperty(CHECK_DECAY, true), 4);
        }
        //world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }

	@Override
	public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return true;
    }
	
	@Override
	public int quantityDropped(Random p_149745_1_)
	 {
	    return p_149745_1_.nextInt(20) == 0 ? 1 : 0;
	 }

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	 {
	      return getSapling();
	 }

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos myPos, IBlockState myState, int fortune) {
		List<ItemStack> ret = super.getDrops(world, myPos, myState,fortune);
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		
		if (rand.nextInt(100) > GetFruitChance())
		{
			ret.add(new ItemStack(getFruit()));
		}
		
		if (rand.nextInt(100) <= GetSaplingChance())
		{
            ret.add(new ItemStack(getItemDropped(myState, rand, fortune), 1));
		}

		return ret;
	}

	public Item getFruit(){
		return null;
	}
	
	public Item getSapling(){
		return null;
	}
	
	public Block getLeaves(){
		return null;
	}

	protected void destroy(World worldIn, BlockPos pos)
    {
        this.dropBlockAsItem(worldIn, pos, worldIn.getBlockState(pos), 0);
        worldIn.setBlockToAir(pos);
    }

	public String GetName(){
		return null;
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
	        return this.getDefaultState().withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0)).withProperty(CHECK_DECAY, Boolean.valueOf(fancyGraphics));
	}
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getStateFromMeta(meta).withProperty(DECAYABLE, Boolean.valueOf(false));
    }
	
	@Override
	public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0;

        if (!((Boolean)state.getValue(DECAYABLE)).booleanValue())
        {
            i |= 4;
            //System.out.println(i);
        }

        if (((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
        {
            i |= 8;
            //System.out.println(i);
        }
        //System.out.println(i + "i meta");

        return i;
    }
	
	@Override
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
    }
	
	public String getName()
	{
		return null;
	}
	

	@Override
	public EnumType getWoodType(int meta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int GetFruitChance(){
		return 100 - CookingPlusConfig.FruitDropRate;
	}
	
	public int GetSaplingChance(){
		return 5;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public void setGraphicsLevel(boolean fancy)
    {
        this.fancyGraphics = fancy;
    }
	
	//LETS FIX THESE OPAQUE CUBES
	@Override
    public boolean isVisuallyOpaque()
    {
        return false;
    }
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	
	//LETS FIX THESE FULL CUBES
	@Override
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	
    
    //LETS FIX OUR LEAVES
    @Override
    public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return canSustainLeaves(world, pos);
    }
    
	public boolean canSustainLeaves(IBlockAccess world, BlockPos pos)
    {
        return false;
    }
	
	
	 @SideOnly(Side.CLIENT)
	 @Override
	 public BlockRenderLayer getBlockLayer()
	 {
	     return BlockRenderLayer.CUTOUT_MIPPED;
	 }
	 
	 @SideOnly(Side.CLIENT)
	 @Override
	 public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	 {
	        return true;
	 }
	 
	 @Override
	 public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
	 {
		 return false;
	 }
}
