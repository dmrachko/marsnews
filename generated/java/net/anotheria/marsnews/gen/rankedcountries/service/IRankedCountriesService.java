/**
 ********************************************************************************
 *** IRankedCountriesService.java                                             ***
 *** Generator: net.anotheria.asg.generator.model.ServiceGenerator            ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                      ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net               ***
 *** All Rights Reserved.                                                     ***
 ********************************************************************************
 *** Don't edit this code, if you aren't sure                                 ***
 *** that you do exactly know what you are doing!                             ***
 *** It's better to invest time in the generator, as into the generated code. ***
 ********************************************************************************
 */

package net.anotheria.marsnews.gen.rankedcountries.service;

import java.util.List;
import net.anotheria.util.sorter.SortType;
import net.anotheria.marsnews.gen.rankedcountries.data.RankedCountry;
import net.anotheria.util.xml.XMLNode;
import net.anotheria.util.slicer.Segment;
import net.anotheria.anodoc.query2.DocumentQuery;
import net.anotheria.anodoc.query2.QueryResult;
import net.anotheria.anodoc.query2.QueryProperty;
import net.anotheria.asg.service.ASGService;

public interface IRankedCountriesService extends ASGService{

// Generated by: class net.anotheria.asg.generator.model.ServiceGenerator.generateInterface

	/**
	 * Returns all RankedCountrys objects stored.
	 */
	public List<RankedCountry> getRankedCountrys() throws RankedCountriesServiceException;

	/**
	 * Returns all RankedCountrys objects sorted by given sortType.
	 */
	public List<RankedCountry> getRankedCountrys(SortType sortType) throws RankedCountriesServiceException;

	/**
	 * Deletes a RankedCountry object by id.
	 */
	public void deleteRankedCountry(String id) throws RankedCountriesServiceException;

	/**
	 * Deletes a RankedCountry object.
	 */
	public void deleteRankedCountry(RankedCountry rankedcountry) throws RankedCountriesServiceException;

	/**
	 * Deletes multiple RankedCountry object.
	 */
	public void deleteRankedCountrys(List<RankedCountry> list) throws RankedCountriesServiceException;

	/**
	 * Returns the RankedCountry object with the specified id.
	 */
	public RankedCountry getRankedCountry(String id) throws RankedCountriesServiceException, net.anotheria.marsnews.gen.rankedcountries.service.RankedCountryNotFoundInRankedCountriesServiceException;

	/**
	 * Imports a new RankedCountry object.
	 * Returns the created version.
	 */
	public RankedCountry importRankedCountry(RankedCountry rankedcountry) throws RankedCountriesServiceException;

	/**
	 * Imports multiple new  RankedCountry object.
	 * Returns the created versions.
	 */
	public List<RankedCountry> importRankedCountrys(List<RankedCountry> list) throws RankedCountriesServiceException;

	/**
	 * Creates a new RankedCountry object.
	 * Returns the created version.
	 */
	public RankedCountry createRankedCountry(RankedCountry rankedcountry) throws RankedCountriesServiceException;

	/**
	 * Creates multiple new RankedCountry objects.
	 * Returns the created versions.
	 */
	public List<RankedCountry> createRankedCountrys(List<RankedCountry> list) throws RankedCountriesServiceException;

	/**
	 * Updates a RankedCountry object.
	 * Returns the updated version.
	 */
	public RankedCountry updateRankedCountry(RankedCountry rankedcountry) throws RankedCountriesServiceException;

	/**
	 * Updates mutiple RankedCountry objects.
	 * Returns the updated versions.
	 */
	public List<RankedCountry> updateRankedCountrys(List<RankedCountry> list) throws RankedCountriesServiceException;

	/**
	 * Returns all RankedCountry objects, where property with given name equals object.
	 */
	public List<RankedCountry> getRankedCountrysByProperty(String propertyName, Object value) throws RankedCountriesServiceException;

	/**
	 * Returns all RankedCountry objects, where property with given name equals object, sorted
	 */
	public List<RankedCountry> getRankedCountrysByProperty(String propertyName, Object value, SortType sortType) throws RankedCountriesServiceException;

	/**
	 * Executes a query
	 */
	public QueryResult executeQueryOnRankedCountrys(DocumentQuery query) throws RankedCountriesServiceException;

	/**
	 * Returns all RankedCountry objects, where property matches.
	 */
	public List<RankedCountry> getRankedCountrysByProperty(QueryProperty... property) throws RankedCountriesServiceException;

	/**
	 * Returns all RankedCountry objects, where property matches, sorted
	 */
	public List<RankedCountry> getRankedCountrysByProperty(SortType sortType, QueryProperty... property) throws RankedCountriesServiceException;

	/**
	 * Returns all RankedCountrys count.
	 */
	public int getRankedCountrysCount() throws RankedCountriesServiceException;

	/**
	 * Returns RankedCountrys objects segment.
	 */
	public List<RankedCountry> getRankedCountrys(Segment aSegment) throws RankedCountriesServiceException;

	/**
	 * Returns RankedCountry objects segment, where property matches.
	 */
	public List<RankedCountry> getRankedCountrysByProperty(Segment aSegment, QueryProperty... aProperty) throws RankedCountriesServiceException;

	/**
	 * Returns RankedCountry objects segment, where property matches, sorted.
	 */
	public List<RankedCountry> getRankedCountrysByProperty(Segment aSegment, SortType aSortType, QueryProperty... aProperty) throws RankedCountriesServiceException;

	/**
	 * creates an xml element with selected contained data
	 */
	public XMLNode exportRankedCountrysToXML(List<RankedCountry> listRankedCountrys)  throws RankedCountriesServiceException;
	/**
	 * Executes a query on all data objects (documents, vo) which are part of this module and managed by this service
	 */
	public QueryResult executeQueryOnAllObjects(DocumentQuery query) throws RankedCountriesServiceException;
	/**
	 * creates an xml element with all contained data.
	 */
	public XMLNode exportToXML() throws RankedCountriesServiceException;

}
