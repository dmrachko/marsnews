/**
 ********************************************************************************
 *** RankedCountrySortType.java                                               ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                      ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net               ***
 *** All Rights Reserved.                                                     ***
 ********************************************************************************
 *** Don't edit this code, if you aren't sure                                 ***
 *** that you do exactly know what you are doing!                             ***
 *** It's better to invest time in the generator, as into the generated code. ***
 ********************************************************************************
 */

package net.anotheria.marsnews.gen.rankedcountries.data;

import net.anotheria.util.sorter.SortType;

public class RankedCountrySortType extends SortType{

	public static final int SORT_BY_ID = 1;
	public static final int SORT_BY_RANK = 2;
	public static final int SORT_BY_COUNTRYNAME = 3;
	public static final int SORT_BY_COUNTRYID = 4;
	public static final int SORT_BY_LAND = 5;
	public static final int SORT_BY_NETWORTH = 6;
	public static final int SORT_BY_COLOR = 7;
	public static final int SORT_BY_CLAN = 8;
	public static final int SORT_BY_GOV = 9;
	public static final int SORT_BY_GDI = 10;
	public static final int SORT_BY_DEAD = 11;
	public static final int SORT_BY_PROTECTION = 12;
	public static final int SORT_BY_DEFAULT = SORT_BY_ID;

	public RankedCountrySortType(){
		super(SORT_BY_DEFAULT);
	}

	public RankedCountrySortType(int method){
		super(method);
	}

	public RankedCountrySortType(int method, boolean order){
		super(method, order);
	}

	public static int name2method(String name){
		if ("id".equals(name))
			return SORT_BY_ID;
		if ("rank".equals(name))
			return SORT_BY_RANK;
		if ("countryName".equals(name))
			return SORT_BY_COUNTRYNAME;
		if ("countryId".equals(name))
			return SORT_BY_COUNTRYID;
		if ("land".equals(name))
			return SORT_BY_LAND;
		if ("networth".equals(name))
			return SORT_BY_NETWORTH;
		if ("color".equals(name))
			return SORT_BY_COLOR;
		if ("clan".equals(name))
			return SORT_BY_CLAN;
		if ("gov".equals(name))
			return SORT_BY_GOV;
		if ("gdi".equals(name))
			return SORT_BY_GDI;
		if ("dead".equals(name))
			return SORT_BY_DEAD;
		if ("protection".equals(name))
			return SORT_BY_PROTECTION;
		throw new RuntimeException("Unknown sort type name: "+name);
	}
}