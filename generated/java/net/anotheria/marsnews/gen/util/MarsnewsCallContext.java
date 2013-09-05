/**
 ********************************************************************************
 *** MarsnewsCallContext.java                                                 ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                      ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net               ***
 *** All Rights Reserved.                                                     ***
 ********************************************************************************
 *** Don't edit this code, if you aren't sure                                 ***
 *** that you do exactly know what you are doing!                             ***
 *** It's better to invest time in the generator, as into the generated code. ***
 ********************************************************************************
 */

package net.anotheria.marsnews.gen.util;

import net.anotheria.anodoc.util.context.CallContext;
import java.io.Serializable;
import java.util.List;
import net.anotheria.marsnews.gen.shared.service.MarsnewsLanguageUtils;

public class MarsnewsCallContext extends CallContext implements Serializable{

	public String getDefaultLanguage() {
		return "de";
	}
	public List<String> getSupportedLanguages() {
		return MarsnewsLanguageUtils.getSupportedLanguages();
	}
}
