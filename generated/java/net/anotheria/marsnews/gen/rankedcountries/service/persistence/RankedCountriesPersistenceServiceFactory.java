/**
 ********************************************************************************
 *** RankedCountriesPersistenceServiceFactory.java                            ***
 *** The factory for the IRankedCountriesPersistenceService implementation.   ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                      ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net               ***
 *** All Rights Reserved.                                                     ***
 ********************************************************************************
 *** Don't edit this code, if you aren't sure                                 ***
 *** that you do exactly know what you are doing!                             ***
 *** It's better to invest time in the generator, as into the generated code. ***
 ********************************************************************************
 */

package net.anotheria.marsnews.gen.rankedcountries.service.persistence;


public class RankedCountriesPersistenceServiceFactory{

	// Generated by: class net.anotheria.asg.generator.model.db.JDBCPersistenceServiceGenerator.generateFactory

	public static IRankedCountriesPersistenceService createRankedCountriesPersistenceService(){
		return RankedCountriesPersistenceServiceImpl.getInstance();
	}
}
