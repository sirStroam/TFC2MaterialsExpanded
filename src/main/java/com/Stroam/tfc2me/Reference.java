package com.Stroam.tfc2me;

public class Reference 
{
	public static final String ModID = "tfc2me";
	public static final String ModName = "TFC Material Expansion";
	
	public static final int VersionMajor = 0;
	public static final int VersionMinor = 1;
	public static final int VersionRevision = 0;

	public static final String ModVersion = VersionMajor+"."+VersionMinor+"."+VersionRevision;

	public static final String ModDependencies = "required-after:tfc2_coremod;after:harvestcraft";
	public static final String SERVER_PROXY_CLASS = "com.Stroam.tfc2me.CommonProxy";
	public static final String CLIENT_PROXY_CLASS = "com.Stroam.tfc2me.ClientProxy";

	public static final String AssetPath = "/assets/" + ModID + "/";
	public static final String AssetPathGui = "textures/gui/";

	public static String getResID()
	{
		return ModID + ":";
	}

}
