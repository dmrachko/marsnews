/**
 ********************************************************************************
 *** MarsnewsLanguageUtils.java                                               ***
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

import java.util.List;
import java.util.Arrays;
import org.apache.log4j.BasicConfigurator;

public class MarsnewsLanguageUtils{


	private static final List<String> supportedLanguages = Arrays.asList(new String[]{
		"de",
		"en",
	});

	public static List<String> getSupportedLanguages(){
		return supportedLanguages;
	}

	public static void copyAttributesFromLanguage2Language(String sourceLang, String targetLanguage){
	}

	public static void main(String[] a) throws Exception{
		BasicConfigurator.configure();
		String sourceLang, targetLang;
		if (a.length!=2)
			throw new RuntimeException("Wrong number of arguments, please use MarsnewsLanguageUtils sourcelanguage targetlanguage");
		sourceLang = a[0].toUpperCase();
		checkParameter(sourceLang);
		targetLang = a[1].toUpperCase();
		checkParameter(targetLang);

		copy(sourceLang, targetLang);
	}

	private static void checkParameter(String lang){
		if (supportedLanguages.indexOf(lang)==-1)
			throw new RuntimeException("Language "+lang+"not supported");
	}

	private static void copy(String sourceLanguage, String targetLanguage) throws Exception {
		//initialize and copy

	}
}
