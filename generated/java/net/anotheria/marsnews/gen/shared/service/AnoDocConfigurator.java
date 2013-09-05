/**
 ********************************************************************************
 *** AnoDocConfigurator.java                                                  ***
 *** Generator: net.anotheria.asg.generator.ConfiguratorGenerator             ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                      ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net               ***
 *** All Rights Reserved.                                                     ***
 ********************************************************************************
 *** Don't edit this code, if you aren't sure                                 ***
 *** that you do exactly know what you are doing!                             ***
 *** It's better to invest time in the generator, as into the generated code. ***
 ********************************************************************************
 */

package net.anotheria.marsnews.gen.shared.service;

import net.anotheria.anodoc.service.IModuleFactory;
import net.anotheria.anodoc.service.IModuleService;
import net.anotheria.anodoc.service.ModuleServiceFactory;
import net.anotheria.anodoc.util.CommonHashtableModuleStorage;
import net.anotheria.marsnews.gen.rankedcountries.data.*;

public class AnoDocConfigurator{

	/**
	 * Returns the selected encoding. Using method instead of constant to prevent compilation dependencies
	 */
	public static final String getEncoding(){ return "utf-8"; }

	private static void addCommonStorage(String moduleId, IModuleService service, IModuleFactory factory, String storageDirConfigKey){
		service.attachModuleFactory(moduleId, factory );
		if (storageDirConfigKey==null)
			service.attachModuleStorage(moduleId, new CommonHashtableModuleStorage(moduleId+".dat", factory));
		else
			service.attachModuleStorage(moduleId, new CommonHashtableModuleStorage(moduleId+".dat", factory, storageDirConfigKey));
	}

	private static volatile boolean configured;

	public static void configure(){
		if (configured)
			return;
		configured = true;
		net.anotheria.anodoc.util.context.ContextManager.setFactory(new net.anotheria.marsnews.gen.util.MarsnewsCallContextFactory());
		IModuleService service = ModuleServiceFactory.createModuleService();
		MetaFactoryConfigurator.configure();
	}
}
