package com.Stroam.tfc2me.core;

import com.Stroam.tfc2me.blocks.halftimber.Daub_Cob;
import net.minecraft.block.Block;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TimberRegistry {

    public static Block
            daub_cob_arrow0, daub_cob_arrow1, daub_cob_arrow2, daub_cob_arrow3,
            daub_cob_barndoor0, daub_cob_barndoor1, daub_cob_barndoor2, daub_cob_barndoor3,
            daub_cob_barndoor4, daub_cob_barndoor5, daub_cob_barndoor6, daub_cob_barndoor7,
            daub_cob_bottom_l, daub_cob_bottom, daub_cob_bottom_r,
            daub_cob_left, daub_cob_right,
            daub_cob_parallel_hor, daub_cob_parallel_vert,
            daub_cob_slash_back, daub_cob_slash,
            daub_cob_square, daub_cob_square_x, daub_cob_x,
            daub_cob_top_l, daub_cob_top, daub_cob_top_r,
            daub_cob_triangle0, daub_cob_triangle1, daub_cob_triangle2, daub_cob_triangle3,
            daub_cob_xbottom, daub_cob_xleft, daub_cob_xright, daub_cob_xtop,
            daub_cob_xdoor0, daub_cob_xdoor1, daub_cob_xdoor2, daub_cob_xdoor3;

    public static Block
            plaster_arrow0, plaster_arrow1, plaster_arrow2, plaster_arrow3,
            plaster_barndoor0, plaster_barndoor1, plaster_barndoor2, plaster_barndoor3,
            plaster_barndoor4, plaster_barndoor5, plaster_barndoor6, plaster_barndoor7,
            plaster_bottom_l, plaster_bottom, plaster_bottom_r,
            plaster_left, plaster_right,
            plaster_parallel_hor, plaster_parallel_vert,
            plaster_slash_back, plaster_slash,
            plaster_square, plaster_square_x, plaster_x,
            plaster_top_l, plaster_top, plaster_top_r,
            plaster_triangle0, plaster_triangle1, plaster_triangle2, plaster_triangle3,
            plaster_xbottom, plaster_xleft, plaster_xright, plaster_xtop,
            plaster_xdoor0, plaster_xdoor1, plaster_xdoor2, plaster_xdoor3;

    public static void init() {
        daub_cob_arrow0 = new Daub_Cob("arrow0","Bottom Left Framed Arrow",0);
        daub_cob_arrow1 = new Daub_Cob("arrow1","Top Left Framed Arrow",1);
        daub_cob_arrow2 = new Daub_Cob("arrow2","Bottom Right Framed Arrow",2);
        daub_cob_arrow3 = new Daub_Cob("arrow3","Top Right Framed Arrow",3);
        daub_cob_barndoor0 = new Daub_Cob("barndoor0","Lower Left Barndoor",4);
        daub_cob_barndoor1 = new Daub_Cob("barndoor1","Left Sideways Barndoor",5);
        daub_cob_barndoor2 = new Daub_Cob("barndoor2","Right Sideways Barndoor",6);
        daub_cob_barndoor3 = new Daub_Cob("barndoor3","Upper Left Barndoor",7);
        daub_cob_barndoor4 = new Daub_Cob("barndoor4","Lower Right Barndoor",8);
        daub_cob_barndoor5 = new Daub_Cob("barndoor5","Left Sideways Barndoor",9);
        daub_cob_barndoor6 = new Daub_Cob("barndoor6","Right Sideways Barndoor",10);
        daub_cob_barndoor7 = new Daub_Cob("barndoor7","Upper Right Barndoor",11);
        daub_cob_bottom_l = new Daub_Cob("bottom_l","Bottom Left Framed",12);
        daub_cob_bottom = new Daub_Cob("bottom","Bottom Framed",13);
        daub_cob_bottom_r = new Daub_Cob("bottom_r","Bottom Right Framed",14);
        daub_cob_left = new Daub_Cob("left","Left Framed",15);
        daub_cob_parallel_hor = new Daub_Cob("parallel_hor","Parallel Horizontals",16);
        daub_cob_parallel_vert = new Daub_Cob("parallel_vert","Parallel Verticals",17);
        daub_cob_right = new Daub_Cob("right","Right Framed",18);
        daub_cob_slash_back = new Daub_Cob("slash_back","\\ Diagonal",19);
        daub_cob_slash = new Daub_Cob("slash","/ Diagonal",20);
        daub_cob_square = new Daub_Cob("square","Square Framed",21);
        daub_cob_square_x = new Daub_Cob("square_x","Square Framed X",22);
        daub_cob_top_l = new Daub_Cob("top_l","Top Left Framed",23);
        daub_cob_top = new Daub_Cob("top","Top Framed",24);
        daub_cob_top_r = new Daub_Cob("top_r","Top Right Framed",25);
        daub_cob_triangle0 = new Daub_Cob("triangle0","Bottom Left Triangle",26);
        daub_cob_triangle1 = new Daub_Cob("triangle1","Top Left Triangle",27);
        daub_cob_triangle2 = new Daub_Cob("triangle2","Bottom Right Triangle",28);
        daub_cob_triangle3 = new Daub_Cob("triangle3","Top Right Triangle",29);
        daub_cob_xbottom = new Daub_Cob("xbottom","Bottomless Framed",30);
        daub_cob_xdoor0 = new Daub_Cob("xdoor0","Lower X Framed Barndoor",31);
        daub_cob_xdoor1 = new Daub_Cob("xdoor1","Right Sideways X Framed Barndoor",32);
        daub_cob_xdoor2 = new Daub_Cob("xdoor2","Left Sideways X Framed Barndoor",33);
        daub_cob_xdoor3 = new Daub_Cob("xdoor3","Upper X Framed Barndoor",34);
        daub_cob_xleft = new Daub_Cob("xleft","Left-less Framed",35);
        daub_cob_x = new Daub_Cob("x","Frame-less X",36);
        daub_cob_xright = new Daub_Cob("xright","Right-less Framed",37);
        daub_cob_xtop = new Daub_Cob("xtop","Topless Framed",38);
/*
        plaster_arrow0 = new Plaster("arrow0","Bottom Left Framed Arrow",0);
        plaster_arrow1 = new Plaster("arrow1","Top Left Framed Arrow",1);
        plaster_arrow2 = new Plaster("arrow2","Bottom Right Framed Arrow",2);
        plaster_arrow3 = new Plaster("arrow3","Top Right Framed Arrow",3);
        plaster_barndoor0 = new Plaster("barndoor0","Lower Left Barndoor",4);
        plaster_barndoor1 = new Plaster("barndoor1","Left Sideways Barndoor",5);
        plaster_barndoor2 = new Plaster("barndoor2","Right Sideways Barndoor",6);
        plaster_barndoor3 = new Plaster("barndoor3","Upper Left Barndoor",7);
        plaster_barndoor4 = new Plaster("barndoor4","Lower Right Barndoor",8);
        plaster_barndoor5 = new Plaster("barndoor5","Left Sideways Barndoor",9);
        plaster_barndoor6 = new Plaster("barndoor6","Right Sideways Barndoor",10);
        plaster_barndoor7 = new Plaster("barndoor7","Upper Right Barndoor",11);
        plaster_bottom_l = new Plaster("bottom_l","Bottom Left Framed",12);
        plaster_bottom = new Plaster("bottom","Bottom Framed",13);
        plaster_bottom_r = new Plaster("bottom_r","Bottom Right Framed",14);
        plaster_left = new Plaster("left","Left Framed",15);
        plaster_parallel_hor = new Plaster("parallel_hor","Parallel Horizontals",16);
        plaster_parallel_vert = new Plaster("parallel_vert","Parallel Verticals",17);
        plaster_right = new Plaster("right","Right Framed",18);
        plaster_slash_back = new Plaster("slash_back","\\ Diagonal",19);
        plaster_slash = new Plaster("slash","/ Diagonal",20);
        plaster_square = new Plaster("square","Square Framed",21);
        plaster_square_x = new Plaster("square_x","Square Framed X",22);
        plaster_top_l = new Plaster("top_l","Top Left Framed",23);
        plaster_top = new Plaster("top","Top Framed",24);
        plaster_top_r = new Plaster("top_r","Top Right Framed",25);
        plaster_triangle0 = new Plaster("triangle0","Bottom Left Triangle",26);
        plaster_triangle1 = new Plaster("triangle1","Top Left Triangle",27);
        plaster_triangle2 = new Plaster("triangle2","Bottom Right Triangle",28);
        plaster_triangle3 = new Plaster("triangle3","Top Right Triangle",29);
        plaster_xbottom = new Plaster("xbottom","Bottomless Framed",30);
        plaster_xdoor0 = new Plaster("xdoor0","Lower X Framed Barndoor",31);
        plaster_xdoor1 = new Plaster("xdoor1","Right Sideways X Framed Barndoor",32);
        plaster_xdoor2 = new Plaster("xdoor2","Left Sideways X Framed Barndoor",33);
        plaster_xdoor3 = new Plaster("xdoor3","Upper X Framed Barndoor",34);
        plaster_xleft = new Plaster("xleft","Left-less Framed",35);
        plaster_x = new Plaster("x","Frame-less X",36);
        plaster_xright = new Plaster("xright","Right-less Framed",37);
        plaster_xtop = new Plaster("xtop","Topless Framed",38);*/
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ((Daub_Cob)daub_cob_arrow0).initModel();
        ((Daub_Cob)daub_cob_arrow1).initModel();
        ((Daub_Cob)daub_cob_arrow2).initModel();
        ((Daub_Cob)daub_cob_arrow3).initModel();
        ((Daub_Cob)daub_cob_barndoor0).initModel();
        ((Daub_Cob)daub_cob_barndoor1).initModel();
        ((Daub_Cob)daub_cob_barndoor2).initModel();
        ((Daub_Cob)daub_cob_barndoor3).initModel();
        ((Daub_Cob)daub_cob_barndoor4).initModel();
        ((Daub_Cob)daub_cob_barndoor5).initModel();
        ((Daub_Cob)daub_cob_barndoor6).initModel();
        ((Daub_Cob)daub_cob_barndoor7).initModel();
        ((Daub_Cob)daub_cob_bottom_l).initModel();
        ((Daub_Cob)daub_cob_bottom).initModel();
        ((Daub_Cob)daub_cob_bottom_r).initModel();
        ((Daub_Cob)daub_cob_left).initModel();
        ((Daub_Cob)daub_cob_parallel_hor).initModel();
        ((Daub_Cob)daub_cob_parallel_vert).initModel();
        ((Daub_Cob)daub_cob_right).initModel();
        ((Daub_Cob)daub_cob_slash_back).initModel();
        ((Daub_Cob)daub_cob_slash).initModel();
        ((Daub_Cob)daub_cob_square).initModel();
        ((Daub_Cob)daub_cob_square_x).initModel();
        ((Daub_Cob)daub_cob_top_l).initModel();
        ((Daub_Cob)daub_cob_top).initModel();
        ((Daub_Cob)daub_cob_top_r).initModel();
        ((Daub_Cob)daub_cob_triangle0).initModel();
        ((Daub_Cob)daub_cob_triangle1).initModel();
        ((Daub_Cob)daub_cob_triangle2).initModel();
        ((Daub_Cob)daub_cob_triangle3).initModel();
        ((Daub_Cob)daub_cob_xbottom).initModel();
        ((Daub_Cob)daub_cob_xdoor0).initModel();
        ((Daub_Cob)daub_cob_xdoor1).initModel();
        ((Daub_Cob)daub_cob_xdoor2).initModel();
        ((Daub_Cob)daub_cob_xdoor3).initModel();
        ((Daub_Cob)daub_cob_xleft).initModel();
        ((Daub_Cob)daub_cob_x).initModel();
        ((Daub_Cob)daub_cob_xright).initModel();
        ((Daub_Cob)daub_cob_xtop).initModel();
/*
        ((Plaster)plaster_arrow0).initModel();
        ((Plaster)plaster_arrow1).initModel();
        ((Plaster)plaster_arrow2).initModel();
        ((Plaster)plaster_arrow3).initModel();
        ((Plaster)plaster_barndoor0).initModel();
        ((Plaster)plaster_barndoor1).initModel();
        ((Plaster)plaster_barndoor2).initModel();
        ((Plaster)plaster_barndoor3).initModel();
        ((Plaster)plaster_barndoor4).initModel();
        ((Plaster)plaster_barndoor5).initModel();
        ((Plaster)plaster_barndoor6).initModel();
        ((Plaster)plaster_barndoor7).initModel();
        ((Plaster)plaster_bottom_l).initModel();
        ((Plaster)plaster_bottom).initModel();
        ((Plaster)plaster_bottom_r).initModel();
        ((Plaster)plaster_left).initModel();
        ((Plaster)plaster_parallel_hor).initModel();
        ((Plaster)plaster_parallel_vert).initModel();
        ((Plaster)plaster_right).initModel();
        ((Plaster)plaster_slash_back).initModel();
        ((Plaster)plaster_slash).initModel();
        ((Plaster)plaster_square).initModel();
        ((Plaster)plaster_square_x).initModel();
        ((Plaster)plaster_top_l).initModel();
        ((Plaster)plaster_top).initModel();
        ((Plaster)plaster_top_r).initModel();
        ((Plaster)plaster_triangle0).initModel();
        ((Plaster)plaster_triangle1).initModel();
        ((Plaster)plaster_triangle2).initModel();
        ((Plaster)plaster_triangle3).initModel();
        ((Plaster)plaster_xbottom).initModel();
        ((Plaster)plaster_xdoor0).initModel();
        ((Plaster)plaster_xdoor1).initModel();
        ((Plaster)plaster_xdoor2).initModel();
        ((Plaster)plaster_xdoor3).initModel();
        ((Plaster)plaster_xleft).initModel();
        ((Plaster)plaster_x).initModel();
        ((Plaster)plaster_xright).initModel();
        ((Plaster)plaster_xtop).initModel();*/
    }
}
