package ModelBoxes;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CookingPlusVatModelBox extends ModelBox {

	private TexturedQuad[] MyquadList;
	PositionTextureVertex[] MyvertexPositions;
	
	public CookingPlusVatModelBox(ModelRenderer p_i46359_1_) {
		super(p_i46359_1_, 0, 0, 0, 0,0, 0, 0, 0, 0);
		MyquadList = new TexturedQuad[38];
		
		PositionTextureVertex positiontexturevertex0 = new PositionTextureVertex(6.3199997f ,-14.0f ,6.3199997f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex1 = new PositionTextureVertex(6.3199997f ,2.0f ,6.3199997f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex2 = new PositionTextureVertex(6.3199997f ,2.0f ,8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex3 = new PositionTextureVertex(6.3199997f ,-14.0f ,8.08f ,0.832826f ,0.378887f);
		this.MyquadList[0] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex0 ,positiontexturevertex1 ,positiontexturevertex2 ,positiontexturevertex3});
		this.MyquadList[0].flipFace();
		PositionTextureVertex positiontexturevertex4 = new PositionTextureVertex(8.08f ,-14.0f ,8.08f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex5 = new PositionTextureVertex(8.08f ,2.0f ,8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex6 = new PositionTextureVertex(8.08f ,2.0f ,6.3199997f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex7 = new PositionTextureVertex(8.08f ,-14.0f ,6.3199997f ,0.758916f ,0.378887f);
		this.MyquadList[1] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex4 ,positiontexturevertex5 ,positiontexturevertex6 ,positiontexturevertex7});
		this.MyquadList[1].flipFace();
		PositionTextureVertex positiontexturevertex8 = new PositionTextureVertex(6.3199997f ,-14.0f ,8.08f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex9 = new PositionTextureVertex(6.3199997f ,2.0f ,8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex10 = new PositionTextureVertex(8.08f ,2.0f ,8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex11 = new PositionTextureVertex(8.08f ,-14.0f ,8.08f ,0.832826f ,0.378887f);
		this.MyquadList[2] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex8 ,positiontexturevertex9 ,positiontexturevertex10 ,positiontexturevertex11});
		this.MyquadList[2].flipFace();
		PositionTextureVertex positiontexturevertex12 = new PositionTextureVertex(8.08f ,-14.0f ,6.3199997f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex13 = new PositionTextureVertex(8.08f ,2.0f ,6.3199997f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex14 = new PositionTextureVertex(6.3199997f ,2.0f ,6.3199997f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex15 = new PositionTextureVertex(6.3199997f ,-14.0f ,6.3199997f ,0.758916f ,0.378887f);
		this.MyquadList[3] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex12 ,positiontexturevertex13 ,positiontexturevertex14 ,positiontexturevertex15});
		this.MyquadList[3].flipFace();
		PositionTextureVertex positiontexturevertex16 = new PositionTextureVertex(-6.32f ,-14.0f ,8.08f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex17 = new PositionTextureVertex(-6.32f ,2.0f ,8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex18 = new PositionTextureVertex(-6.32f ,2.0f ,6.3199997f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex19 = new PositionTextureVertex(-6.32f ,-14.0f ,6.3199997f ,0.758916f ,0.378887f);
		this.MyquadList[4] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex16 ,positiontexturevertex17 ,positiontexturevertex18 ,positiontexturevertex19});
		this.MyquadList[4].flipFace();
		PositionTextureVertex positiontexturevertex20 = new PositionTextureVertex(-8.08f ,-14.0f ,6.3199997f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex21 = new PositionTextureVertex(-8.08f ,2.0f ,6.3199997f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex22 = new PositionTextureVertex(-8.08f ,2.0f ,8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex23 = new PositionTextureVertex(-8.08f ,-14.0f ,8.08f ,0.832826f ,0.378887f);
		this.MyquadList[5] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex20 ,positiontexturevertex21 ,positiontexturevertex22 ,positiontexturevertex23});
		this.MyquadList[5].flipFace();
		PositionTextureVertex positiontexturevertex24 = new PositionTextureVertex(-6.32f ,-14.0f ,6.3199997f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex25 = new PositionTextureVertex(-6.32f ,2.0f ,6.3199997f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex26 = new PositionTextureVertex(-8.08f ,2.0f ,6.3199997f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex27 = new PositionTextureVertex(-8.08f ,-14.0f ,6.3199997f ,0.758916f ,0.378887f);
		this.MyquadList[6] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex24 ,positiontexturevertex25 ,positiontexturevertex26 ,positiontexturevertex27});
		this.MyquadList[6].flipFace();
		PositionTextureVertex positiontexturevertex28 = new PositionTextureVertex(-8.08f ,-14.0f ,8.08f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex29 = new PositionTextureVertex(-8.08f ,2.0f ,8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex30 = new PositionTextureVertex(-6.32f ,2.0f ,8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex31 = new PositionTextureVertex(-6.32f ,-14.0f ,8.08f ,0.832826f ,0.378887f);
		this.MyquadList[7] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex28 ,positiontexturevertex29 ,positiontexturevertex30 ,positiontexturevertex31});
		this.MyquadList[7].flipFace();
		PositionTextureVertex positiontexturevertex32 = new PositionTextureVertex(6.3199997f ,-14.0f ,-8.08f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex33 = new PositionTextureVertex(6.3199997f ,2.0f ,-8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex34 = new PositionTextureVertex(6.3199997f ,2.0f ,-6.32f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex35 = new PositionTextureVertex(6.3199997f ,-14.0f ,-6.32f ,0.832826f ,0.378887f);
		this.MyquadList[8] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex32 ,positiontexturevertex33 ,positiontexturevertex34 ,positiontexturevertex35});
		this.MyquadList[8].flipFace();
		PositionTextureVertex positiontexturevertex36 = new PositionTextureVertex(8.08f ,-14.0f ,-6.32f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex37 = new PositionTextureVertex(8.08f ,2.0f ,-6.32f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex38 = new PositionTextureVertex(8.08f ,2.0f ,-8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex39 = new PositionTextureVertex(8.08f ,-14.0f ,-8.08f ,0.758916f ,0.378887f);
		this.MyquadList[9] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex36 ,positiontexturevertex37 ,positiontexturevertex38 ,positiontexturevertex39});
		this.MyquadList[9].flipFace();
		PositionTextureVertex positiontexturevertex40 = new PositionTextureVertex(6.3199997f ,-14.0f ,-6.32f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex41 = new PositionTextureVertex(6.3199997f ,2.0f ,-6.32f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex42 = new PositionTextureVertex(8.08f ,2.0f ,-6.32f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex43 = new PositionTextureVertex(8.08f ,-14.0f ,-6.32f ,0.832826f ,0.378887f);
		this.MyquadList[10] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex40 ,positiontexturevertex41 ,positiontexturevertex42 

		,positiontexturevertex43});
		this.MyquadList[10].flipFace();
		PositionTextureVertex positiontexturevertex44 = new PositionTextureVertex(8.08f ,-14.0f ,-8.08f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex45 = new PositionTextureVertex(8.08f ,2.0f ,-8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex46 = new PositionTextureVertex(6.3199997f ,2.0f ,-8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex47 = new PositionTextureVertex(6.3199997f ,-14.0f ,-8.08f ,0.758916f ,0.378887f);
		this.MyquadList[11] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex44 ,positiontexturevertex45 ,positiontexturevertex46 

		,positiontexturevertex47});
		this.MyquadList[11].flipFace();
		PositionTextureVertex positiontexturevertex48 = new PositionTextureVertex(-6.4f ,5.2f ,6.3999996f ,0.156222f ,0.474472f);
		PositionTextureVertex positiontexturevertex49 = new PositionTextureVertex(-6.4f ,9.999999f ,6.3999996f ,0.156222f ,0.55551004f);
		PositionTextureVertex positiontexturevertex50 = new PositionTextureVertex(6.3999996f ,9.999999f ,6.3999996f ,0.337066f ,0.55551004f);
		PositionTextureVertex positiontexturevertex51 = new PositionTextureVertex(6.3999996f ,5.2f ,6.3999996f ,0.337066f ,0.474472f);
		this.MyquadList[12] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex48 ,positiontexturevertex49 ,positiontexturevertex50 

		,positiontexturevertex51});
		this.MyquadList[12].flipFace();
		PositionTextureVertex positiontexturevertex52 = new PositionTextureVertex(6.3999996f ,5.2f ,-6.4f ,0.337066f ,0.474472f);
		PositionTextureVertex positiontexturevertex53 = new PositionTextureVertex(6.3999996f ,9.999999f ,-6.4f ,0.337066f ,0.55551004f);
		PositionTextureVertex positiontexturevertex54 = new PositionTextureVertex(-6.4f ,9.999999f ,-6.4f ,0.156222f ,0.55551004f);
		PositionTextureVertex positiontexturevertex55 = new PositionTextureVertex(-6.4f ,5.2f ,-6.4f ,0.156222f ,0.474472f);
		this.MyquadList[13] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex52 ,positiontexturevertex53 ,positiontexturevertex54 

		,positiontexturevertex55});
		this.MyquadList[13].flipFace();
		PositionTextureVertex positiontexturevertex56 = new PositionTextureVertex(8.0f ,2.0f ,-7.999999f ,0.359671f ,0.42044598f);
		PositionTextureVertex positiontexturevertex57 = new PositionTextureVertex(8.0f ,5.2f ,-7.999999f ,0.359671f ,0.474472f);
		PositionTextureVertex positiontexturevertex58 = new PositionTextureVertex(-7.999999f ,5.2f ,-7.999999f ,0.133616f ,0.474472f);
		PositionTextureVertex positiontexturevertex59 = new PositionTextureVertex(-7.999999f ,2.0f ,-7.999999f ,0.133616f ,0.42044598f);
		this.MyquadList[14] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex56 ,positiontexturevertex57 ,positiontexturevertex58 

		,positiontexturevertex59});
		this.MyquadList[14].flipFace();
		PositionTextureVertex positiontexturevertex60 = new PositionTextureVertex(-7.999999f ,2.0f ,8.0f ,0.133616f ,0.42044598f);
		PositionTextureVertex positiontexturevertex61 = new PositionTextureVertex(-7.999999f ,5.2f ,8.0f ,0.133616f ,0.474472f);
		PositionTextureVertex positiontexturevertex62 = new PositionTextureVertex(8.0f ,5.2f ,8.0f ,0.359671f ,0.474472f);
		PositionTextureVertex positiontexturevertex63 = new PositionTextureVertex(8.0f ,2.0f ,8.0f ,0.359671f ,0.42044598f);
		this.MyquadList[15] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex60 ,positiontexturevertex61 ,positiontexturevertex62 

		,positiontexturevertex63});
		this.MyquadList[15].flipFace();
		PositionTextureVertex positiontexturevertex64 = new PositionTextureVertex(-6.4f ,-15.6f ,6.3999996f ,0.156222f ,0.123302996f);
		PositionTextureVertex positiontexturevertex65 = new PositionTextureVertex(-7.999999f ,-14.0f ,8.0f ,0.133616f ,0.150316f);
		PositionTextureVertex positiontexturevertex66 = new PositionTextureVertex(8.0f ,-14.0f ,8.0f ,0.359671f ,0.150316f);
		PositionTextureVertex positiontexturevertex67 = new PositionTextureVertex(6.3999996f ,-15.6f ,6.3999996f ,0.337066f ,0.123302996f);
		this.MyquadList[16] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex64 ,positiontexturevertex65 ,positiontexturevertex66 

		,positiontexturevertex67});
		this.MyquadList[16].flipFace();
		PositionTextureVertex positiontexturevertex68 = new PositionTextureVertex(6.3999996f ,-15.6f ,-6.4f ,0.337066f ,0.123302996f);
		PositionTextureVertex positiontexturevertex69 = new PositionTextureVertex(8.0f ,-14.0f ,-7.999999f ,0.359671f ,0.150316f);
		PositionTextureVertex positiontexturevertex70 = new PositionTextureVertex(-7.999999f ,-14.0f ,-7.999999f ,0.133616f ,0.150316f);
		PositionTextureVertex positiontexturevertex71 = new PositionTextureVertex(-6.4f ,-15.6f ,-6.4f ,0.156222f ,0.123302996f);
		this.MyquadList[17] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex68 ,positiontexturevertex69 ,positiontexturevertex70 

		,positiontexturevertex71});
		this.MyquadList[17].flipFace();
		PositionTextureVertex positiontexturevertex72 = new PositionTextureVertex(-6.4f ,-15.6f ,6.3999996f ,0.156222f ,0.123302996f);
		PositionTextureVertex positiontexturevertex73 = new PositionTextureVertex(6.3999996f ,-15.6f ,6.3999996f ,0.337066f ,0.123302996f);
		PositionTextureVertex positiontexturevertex74 = new PositionTextureVertex(0.80160046f ,-18.8016f ,0.80160046f ,0.257969f ,0.06924999f);
		PositionTextureVertex positiontexturevertex75 = new PositionTextureVertex(-0.7983999f ,-18.8016f ,0.80160046f ,0.235364f ,0.06924999f);
		this.MyquadList[18] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex72 ,positiontexturevertex73 ,positiontexturevertex74 

		,positiontexturevertex75});
		this.MyquadList[18].flipFace();
		PositionTextureVertex positiontexturevertex76 = new PositionTextureVertex(6.3999996f ,-15.6f ,-6.4f ,0.337066f ,0.123302996f);
		PositionTextureVertex positiontexturevertex77 = new PositionTextureVertex(-6.4f ,-15.6f ,-6.4f ,0.156222f ,0.123302996f);
		PositionTextureVertex positiontexturevertex78 = new PositionTextureVertex(-0.7983999f ,-18.8016f ,-0.7983999f ,0.235364f ,0.06924999f);
		PositionTextureVertex positiontexturevertex79 = new PositionTextureVertex(0.80160046f ,-18.8016f ,-0.7983999f ,0.257969f ,0.06924999f);
		this.MyquadList[19] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex76 ,positiontexturevertex77 ,positiontexturevertex78 

		,positiontexturevertex79});
		this.MyquadList[19].flipFace();
		PositionTextureVertex positiontexturevertex80 = new PositionTextureVertex(-6.4f ,-15.6f ,-6.4f ,0.156222f ,0.123302996f);
		PositionTextureVertex positiontexturevertex81 = new PositionTextureVertex(-7.999999f ,-14.0f ,-7.999999f ,0.133616f ,0.150316f);
		PositionTextureVertex positiontexturevertex82 = new PositionTextureVertex(-7.999999f ,-14.0f ,8.0f ,0.359671f ,0.150316f);
		PositionTextureVertex positiontexturevertex83 = new PositionTextureVertex(-6.4f ,-15.6f ,6.3999996f ,0.337066f ,0.123302996f);
		this.MyquadList[20] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex80 ,positiontexturevertex81 ,positiontexturevertex82 

		,positiontexturevertex83});
		this.MyquadList[20].flipFace();
		PositionTextureVertex positiontexturevertex84 = new PositionTextureVertex(6.3999996f ,-15.6f ,6.3999996f ,0.337066f ,0.123302996f);
		PositionTextureVertex positiontexturevertex85 = new PositionTextureVertex(8.0f ,-14.0f ,8.0f ,0.359671f ,0.150316f);
		PositionTextureVertex positiontexturevertex86 = new PositionTextureVertex(8.0f ,-14.0f ,-7.999999f ,0.133616f ,0.150316f);
		PositionTextureVertex positiontexturevertex87 = new PositionTextureVertex(6.3999996f ,-15.6f ,-6.4f ,0.156222f ,0.123302996f);
		this.MyquadList[21] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex84 ,positiontexturevertex85 ,positiontexturevertex86 

		,positiontexturevertex87});
		this.MyquadList[21].flipFace();
		PositionTextureVertex positiontexturevertex88 = new PositionTextureVertex(-6.4f ,-15.6f ,-6.4f ,0.156222f ,0.123302996f);
		PositionTextureVertex positiontexturevertex89 = new PositionTextureVertex(-6.4f ,-15.6f ,6.3999996f ,0.337066f ,0.123302996f);
		PositionTextureVertex positiontexturevertex90 = new PositionTextureVertex(-0.7983999f ,-18.8016f ,0.80160046f ,0.257969f ,0.06924999f);
		PositionTextureVertex positiontexturevertex91 = new PositionTextureVertex(-0.7983999f ,-18.8016f ,-0.7983999f ,0.235364f ,0.06924999f);
		this.MyquadList[22] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex88 ,positiontexturevertex89 ,positiontexturevertex90 

		,positiontexturevertex91});
		this.MyquadList[22].flipFace();
		PositionTextureVertex positiontexturevertex92 = new PositionTextureVertex(6.3999996f ,-15.6f ,6.3999996f ,0.337066f ,0.123302996f);
		PositionTextureVertex positiontexturevertex93 = new PositionTextureVertex(6.3999996f ,-15.6f ,-6.4f ,0.156222f ,0.123302996f);
		PositionTextureVertex positiontexturevertex94 = new PositionTextureVertex(0.80160046f ,-18.8016f ,-0.7983999f ,0.235364f ,0.06924999f);
		PositionTextureVertex positiontexturevertex95 = new PositionTextureVertex(0.80160046f ,-18.8016f ,0.80160046f ,0.257969f ,0.06924999f);
		this.MyquadList[23] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex92 ,positiontexturevertex93 ,positiontexturevertex94 

		,positiontexturevertex95});
		this.MyquadList[23].flipFace();
		PositionTextureVertex positiontexturevertex96 = new PositionTextureVertex(8.0f ,2.0f ,8.0f ,0.359671f ,0.42044598f);
		PositionTextureVertex positiontexturevertex97 = new PositionTextureVertex(8.0f ,5.2f ,8.0f ,0.359671f ,0.474472f);
		PositionTextureVertex positiontexturevertex98 = new PositionTextureVertex(8.0f ,5.2f ,-7.999999f ,0.133616f ,0.474472f);
		PositionTextureVertex positiontexturevertex99 = new PositionTextureVertex(8.0f ,2.0f ,-7.999999f ,0.133616f ,0.42044598f);
		this.MyquadList[24] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex96 ,positiontexturevertex97 ,positiontexturevertex98 

		,positiontexturevertex99});
		this.MyquadList[24].flipFace();
		PositionTextureVertex positiontexturevertex100 = new PositionTextureVertex(-7.999999f ,2.0f ,-7.999999f ,0.133616f ,0.42044598f);
		PositionTextureVertex positiontexturevertex101 = new PositionTextureVertex(-7.999999f ,5.2f ,-7.999999f ,0.133616f ,0.474472f);
		PositionTextureVertex positiontexturevertex102 = new PositionTextureVertex(-7.999999f ,5.2f ,8.0f ,0.359671f ,0.474472f);
		PositionTextureVertex positiontexturevertex103 = new PositionTextureVertex(-7.999999f ,2.0f ,8.0f ,0.359671f ,0.42044598f);
		this.MyquadList[25] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex100 ,positiontexturevertex101 ,positiontexturevertex102 

		,positiontexturevertex103});
		this.MyquadList[25].flipFace();
		PositionTextureVertex positiontexturevertex104 = new PositionTextureVertex(-6.4f ,5.2f ,-6.4f ,0.156222f ,0.474472f);
		PositionTextureVertex positiontexturevertex105 = new PositionTextureVertex(-6.4f ,9.999999f ,-6.4f ,0.156222f ,0.55551004f);
		PositionTextureVertex positiontexturevertex106 = new PositionTextureVertex(-6.4f ,9.999999f ,6.3999996f ,0.337066f ,0.55551004f);
		PositionTextureVertex positiontexturevertex107 = new PositionTextureVertex(-6.4f ,5.2f ,6.3999996f ,0.337066f ,0.474472f);
		this.MyquadList[26] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex104 ,positiontexturevertex105 ,positiontexturevertex106 

		,positiontexturevertex107});
		this.MyquadList[26].flipFace();
		PositionTextureVertex positiontexturevertex108 = new PositionTextureVertex(6.3999996f ,5.2f ,6.3999996f ,0.337066f ,0.474472f);
		PositionTextureVertex positiontexturevertex109 = new PositionTextureVertex(6.3999996f ,9.999999f ,6.3999996f ,0.337066f ,0.55551004f);
		PositionTextureVertex positiontexturevertex110 = new PositionTextureVertex(6.3999996f ,9.999999f ,-6.4f ,0.156222f ,0.55551004f);
		PositionTextureVertex positiontexturevertex111 = new PositionTextureVertex(6.3999996f ,5.2f ,-6.4f ,0.156222f ,0.474472f);
		this.MyquadList[27] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex108 ,positiontexturevertex109 ,positiontexturevertex110 

		,positiontexturevertex111});
		this.MyquadList[27].flipFace();
		PositionTextureVertex positiontexturevertex112 = new PositionTextureVertex(-7.999999f ,5.2f ,-7.999999f ,0.674769f ,0.065406024f);
		PositionTextureVertex positiontexturevertex113 = new PositionTextureVertex(8.0f ,5.2f ,-7.999999f ,0.921811f ,0.065406024f);
		PositionTextureVertex positiontexturevertex114 = new PositionTextureVertex(8.0f ,5.2f ,8.0f ,0.921811f ,0.31475198f);
		PositionTextureVertex positiontexturevertex115 = new PositionTextureVertex(-7.999999f ,5.2f ,8.0f ,0.674769f ,0.31475198f);
		this.MyquadList[28] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex112 ,positiontexturevertex113 ,positiontexturevertex114 

		,positiontexturevertex115});
		this.MyquadList[28].flipFace();
		PositionTextureVertex positiontexturevertex116 = new PositionTextureVertex(-6.4f ,5.2f ,-6.4f ,0.699473f ,0.09034097f);
		PositionTextureVertex positiontexturevertex117 = new PositionTextureVertex(-6.4f ,5.2f ,6.3999996f ,0.699473f ,0.28981698f);
		PositionTextureVertex positiontexturevertex118 = new PositionTextureVertex(6.3999996f ,5.2f ,6.3999996f ,0.897107f ,0.28981698f);
		PositionTextureVertex positiontexturevertex119 = new PositionTextureVertex(6.3999996f ,5.2f ,-6.4f ,0.897107f ,0.09034097f);
		this.MyquadList[29] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex116 ,positiontexturevertex117 ,positiontexturevertex118 

		,positiontexturevertex119});
		this.MyquadList[29].flipFace();
		PositionTextureVertex positiontexturevertex120 = new PositionTextureVertex(-6.4f ,9.999999f ,-6.4f ,0.699473f ,0.09034097f);
		PositionTextureVertex positiontexturevertex121 = new PositionTextureVertex(6.3999996f ,9.999999f ,-6.4f ,0.897107f ,0.09034097f);
		PositionTextureVertex positiontexturevertex122 = new PositionTextureVertex(6.3999996f ,9.999999f ,6.3999996f ,0.897107f ,0.28981698f);
		PositionTextureVertex positiontexturevertex123 = new PositionTextureVertex(-6.4f ,9.999999f ,6.3999996f ,0.699473f ,0.28981698f);
		this.MyquadList[30] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex120 ,positiontexturevertex121 ,positiontexturevertex122 

		,positiontexturevertex123});
		this.MyquadList[30].flipFace();
		PositionTextureVertex positiontexturevertex124 = new PositionTextureVertex(-7.999999f ,2.0f ,-7.999999f ,0.674769f ,0.065406024f);
		PositionTextureVertex positiontexturevertex125 = new PositionTextureVertex(-7.999999f ,2.0f ,8.0f ,0.674769f ,0.31475198f);
		PositionTextureVertex positiontexturevertex126 = new PositionTextureVertex(8.0f ,2.0f ,8.0f ,0.921811f ,0.31475198f);
		PositionTextureVertex positiontexturevertex127 = new PositionTextureVertex(8.0f ,2.0f ,-7.999999f ,0.921811f ,0.065406024f);
		this.MyquadList[31] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex124 ,positiontexturevertex125 ,positiontexturevertex126 

		,positiontexturevertex127});
		this.MyquadList[31].flipFace();
		PositionTextureVertex positiontexturevertex128 = new PositionTextureVertex(-7.999999f ,-14.0f ,-7.999999f ,0.674769f ,0.065406024f);
		PositionTextureVertex positiontexturevertex129 = new PositionTextureVertex(8.0f ,-14.0f ,-7.999999f ,0.921811f ,0.065406024f);
		PositionTextureVertex positiontexturevertex130 = new PositionTextureVertex(8.0f ,-14.0f ,8.0f ,0.921811f ,0.31475198f);
		PositionTextureVertex positiontexturevertex131 = new PositionTextureVertex(-7.999999f ,-14.0f ,8.0f ,0.674769f ,0.31475198f);
		this.MyquadList[32] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex128 ,positiontexturevertex129 ,positiontexturevertex130 

		,positiontexturevertex131});
		this.MyquadList[32].flipFace();
		PositionTextureVertex positiontexturevertex132 = new PositionTextureVertex(-0.7983999f ,-18.8016f ,-0.7983999f ,0.785963f ,0.17763698f);
		PositionTextureVertex positiontexturevertex133 = new PositionTextureVertex(-0.7983999f ,-18.8016f ,0.80160046f ,0.785963f ,0.20257097f);
		PositionTextureVertex positiontexturevertex134 = new PositionTextureVertex(0.80160046f ,-18.8016f ,0.80160046f ,0.810667f ,0.20257097f);
		PositionTextureVertex positiontexturevertex135 = new PositionTextureVertex(0.80160046f ,-18.8016f ,-0.7983999f ,0.810667f ,0.17763698f);
		this.MyquadList[33] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex132 ,positiontexturevertex133 ,positiontexturevertex134 

		,positiontexturevertex135});
		this.MyquadList[33].flipFace();
		PositionTextureVertex positiontexturevertex136 = new PositionTextureVertex(-6.32f ,-14.0f ,-6.32f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex137 = new PositionTextureVertex(-6.32f ,2.0f ,-6.32f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex138 = new PositionTextureVertex(-6.32f ,2.0f ,-8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex139 = new PositionTextureVertex(-6.32f ,-14.0f ,-8.08f ,0.758916f ,0.378887f);
		this.MyquadList[34] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex136 ,positiontexturevertex137 ,positiontexturevertex138 

		,positiontexturevertex139});
		this.MyquadList[34].flipFace();
		PositionTextureVertex positiontexturevertex140 = new PositionTextureVertex(-8.08f ,-14.0f ,-8.08f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex141 = new PositionTextureVertex(-8.08f ,2.0f ,-8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex142 = new PositionTextureVertex(-8.08f ,2.0f ,-6.32f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex143 = new PositionTextureVertex(-8.08f ,-14.0f ,-6.32f ,0.832826f ,0.378887f);
		this.MyquadList[35] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex140 ,positiontexturevertex141 ,positiontexturevertex142 

		,positiontexturevertex143});
		this.MyquadList[35].flipFace();
		PositionTextureVertex positiontexturevertex144 = new PositionTextureVertex(-6.32f ,-14.0f ,-8.08f ,0.832826f ,0.378887f);
		PositionTextureVertex positiontexturevertex145 = new PositionTextureVertex(-6.32f ,2.0f ,-8.08f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex146 = new PositionTextureVertex(-8.08f ,2.0f ,-8.08f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex147 = new PositionTextureVertex(-8.08f ,-14.0f ,-8.08f ,0.758916f ,0.378887f);
		this.MyquadList[36] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex144 ,positiontexturevertex145 ,positiontexturevertex146 

		,positiontexturevertex147});
		this.MyquadList[36].flipFace();
		PositionTextureVertex positiontexturevertex148 = new PositionTextureVertex(-8.08f ,-14.0f ,-6.32f ,0.758916f ,0.378887f);
		PositionTextureVertex positiontexturevertex149 = new PositionTextureVertex(-8.08f ,2.0f ,-6.32f ,0.758916f ,0.620643f);
		PositionTextureVertex positiontexturevertex150 = new PositionTextureVertex(-6.32f ,2.0f ,-6.32f ,0.832826f ,0.620643f);
		PositionTextureVertex positiontexturevertex151 = new PositionTextureVertex(-6.32f ,-14.0f ,-6.32f ,0.832826f ,0.378887f);
		this.MyquadList[37] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex148 ,positiontexturevertex149 ,positiontexturevertex150 

		,positiontexturevertex151});
		this.MyquadList[37].flipFace();
		
	}
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void render(VertexBuffer renderer, float scale)
	 {
	     for (int i = 0; i < this.MyquadList.length; ++i)
	     {
	         this.MyquadList[i].draw(renderer, scale);
	     }
	 }
}
