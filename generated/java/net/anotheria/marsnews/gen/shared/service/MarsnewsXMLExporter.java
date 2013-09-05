/**
 ********************************************************************************
 *** MarsnewsXMLExporter.java                                                 ***
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
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicLong;
import net.anotheria.util.xml.XMLNode;
import net.anotheria.util.xml.XMLTree;
import net.anotheria.util.xml.XMLAttribute;
import net.anotheria.util.xml.XMLWriter;
import net.anotheria.util.Date;
import net.anotheria.util.IOUtils;
import net.anotheria.util.StringUtils;
import net.anotheria.asg.exception.ASGRuntimeException;
import org.apache.log4j.BasicConfigurator;
import net.anotheria.marsnews.gen.rankedcountries.service.RankedCountriesServiceFactory;

public class MarsnewsXMLExporter{

	private static AtomicLong exp = new AtomicLong();
	private static String[] LANGUAGES = null;
	static {
		AnoDocConfigurator.configure();
		String expLanguages = System.getProperty("anosite.export.languages");
		if (expLanguages!=null && expLanguages.length()>0)
			LANGUAGES = StringUtils.tokenize(expLanguages, ',');
	}

	/**
	 * Create an XML Document (ano-util) with data from all modules.
	 */
	public static XMLTree createCompleteXMLExport() throws ASGRuntimeException{
		ArrayList<XMLNode> nodes = new ArrayList<XMLNode>();
		nodes.add(RankedCountriesServiceFactory.createRankedCountriesService().exportToXML());
		return createExport(nodes);
	}

	/**
	 * Write XML data from all modules into given stream.
	 */
	public static void writeCompleteXMLExportToStream(OutputStream target) throws IOException, ASGRuntimeException{
		new XMLWriter().write(createCompleteXMLExport(), target);
	}

	/**
	 * Write XML data from all modules into given file.
	 */
	public static void writeCompleteXMLExportToFile(File target) throws IOException, ASGRuntimeException{
		writeToFile(createCompleteXMLExport(), target);
	}

	/**
	 * Create an XML Document (jdom) from RankedCountries data for export.
	 */
	public static XMLTree createRankedCountriesXMLExport() throws ASGRuntimeException{
		ArrayList<XMLNode> nodes = new ArrayList<XMLNode>(1);
		nodes.add(RankedCountriesServiceFactory.createRankedCountriesService().exportToXML());
		return createExport(nodes);
	}

	/**
	 * Write RankedCountries as XML into given stream.
	 */
	public static void writeRankedCountriesXMLExportToStream(OutputStream target) throws IOException, ASGRuntimeException{
		new XMLWriter().write(createRankedCountriesXMLExport(), target);
	}

	/**
	 * Write RankedCountries as XML into given file.
	 */
	public static void writeRankedCountriesXMLExportToFile(File target) throws IOException, ASGRuntimeException{
		writeToFile(createRankedCountriesXMLExport(), target);
	}

	private static void writeToFile(XMLTree tree, File target) throws IOException{
		FileOutputStream fOut = null;
		try{
			fOut = new FileOutputStream(target);
			XMLWriter writer = new XMLWriter();
			OutputStreamWriter oWriter = writer.write(tree, fOut);
			oWriter.close();
		}catch(IOException e){;
			if (fOut!=null){
				try{
					fOut.close();
				}catch(IOException ignored){}
			}
			throw e;
		}
	}

	private static XMLTree createExport(List<XMLNode> nodes){
		XMLTree tree = new XMLTree();
		tree.setEncoding("utf-8");
		XMLNode root = new XMLNode("export");
		root.addAttribute(new XMLAttribute("timestamp", ""+System.currentTimeMillis()));
		root.addAttribute(new XMLAttribute("date", Date.currentDate().toString()));
		tree.setRoot(root);
		root.setChildren(nodes);
		return tree;
	}

	public static void main(String[] a) throws IOException,ASGRuntimeException{
		BasicConfigurator.configure();
		if (a.length==0)
			interactiveMode(a);
		else
			automaticMode(a);
	}

	public static void interactiveMode(String a[]) throws IOException,ASGRuntimeException{
		while(true){
			System.out.println("Please make your choice:");
			System.out.println("0 - Quit");
			System.out.println("1 - Complete export");
			System.out.println("2 - Export RankedCountries [DB]");
			String myInput = IOUtils.readlineFromStdIn();
			XMLTree tree = createExportForInput(myInput);
			if (tree==null)
				System.exit(0);
			FileOutputStream fOut = new FileOutputStream(new File("export-"+exp.incrementAndGet()+".xml"));
			OutputStreamWriter writer = new OutputStreamWriter(fOut, Charset.forName("utf-8"));
			tree.write(writer);
			writer.flush();
			writer.close();
		}
	}

	public static void automaticMode(String a[]) throws IOException,ASGRuntimeException{
		new MarsnewsXMLExporter().writeCompleteXMLExportToFile(new File("marsnews_export.xml"));
	}

	public static final XMLTree createExportForInput(String input) throws ASGRuntimeException{
		if ("0".equals(input))
			return null;
		if ("1".equals(input))
			return createCompleteXMLExport();
		if ("2".equals(input))
			return createRankedCountriesXMLExport();
		throw new RuntimeException("Unrecognized input: " +input);
	}
}