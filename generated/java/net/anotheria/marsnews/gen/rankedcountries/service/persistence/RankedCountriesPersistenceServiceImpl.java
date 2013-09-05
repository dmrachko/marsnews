/**
 ********************************************************************************
 *** RankedCountriesPersistenceServiceImpl.java                               ***
 *** The implementation of the IRankedCountriesPersistenceService.            ***
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

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import net.anotheria.util.sorter.SortType;
import net.anotheria.util.Date;
import net.anotheria.util.slicer.Segment;
import net.anotheria.anodoc.query2.QueryProperty;
import net.anotheria.marsnews.gen.rankedcountries.data.RankedCountry;
import net.anotheria.db.service.BasePersistenceServiceJDBCImpl;
import net.anotheria.db.dao.DAOException;
import java.sql.Connection;
import java.sql.SQLException;

public class RankedCountriesPersistenceServiceImpl extends BasePersistenceServiceJDBCImpl implements IRankedCountriesPersistenceService{

	// Generated by: class net.anotheria.asg.generator.model.db.JDBCPersistenceServiceGenerator.generateImplementation


	private static RankedCountriesPersistenceServiceImpl instance;

	// DAO Objects for data access.
	private RankedCountryDAO rankedcountryDAO;

	private RankedCountriesPersistenceServiceImpl(){
	}

	static final RankedCountriesPersistenceServiceImpl getInstance(){
		if (instance==null){
			instance = new RankedCountriesPersistenceServiceImpl();
		}
		return instance;
	}

	public void init(){
		super.init();
		rankedcountryDAO = new RankedCountryDAO();
		String currentDAO = null;
		try {
			Connection c = getConnection();
			log.info("Initializing DAO for RankedCountry" );
			currentDAO = "RankedCountry";
			rankedcountryDAO.init(c);
		}catch(DAOException e){
			log.fatal("init failed (dao:"+currentDAO+") ",e );
		}catch(SQLException e){
			log.fatal("init failed (sql) ",e );
		}catch(Exception e){
			System.out.println(e.getMessage()+" "+e.getClass());
			log.fatal("init failed (e) ",e );
		}
	}

	/**
	 * Returns all RankedCountrys objects stored.
	 */
	public List<RankedCountry> getRankedCountrys() throws RankedCountriesPersistenceServiceException {
		log.debug("Call getRankedCountrys() ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.getRankedCountrys(c);
		}catch(SQLException e){
			log.error("getRankedCountrys() ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Deletes a RankedCountry object by id.
	 */
	public void deleteRankedCountry(String id) throws RankedCountriesPersistenceServiceException {
		log.debug("Call deleteRankedCountry("+id+") ");
		Connection c = null;
		try {
			c = getConnection();
			rankedcountryDAO.deleteRankedCountry(c, id);
		}catch(SQLException e){
			log.error("deleteRankedCountry("+id+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Deletes multiple  RankedCountry objects.
	 */
	public void deleteRankedCountrys(List<RankedCountry> list) throws RankedCountriesPersistenceServiceException {
		log.debug("Call deleteRankedCountrys("+list+") ");
		Connection c = null;
		try {
			c = getConnection();
			rankedcountryDAO.deleteRankedCountrys(c, list);
			return;
		}catch(SQLException e){
			log.error("deleteRankedCountrys("+list+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Returns the RankedCountry object with the specified id.
	 */
	public RankedCountry getRankedCountry(String id) throws RankedCountriesPersistenceServiceException {
		log.debug("Call getRankedCountry("+id+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.getRankedCountry(c, id);
		}catch(RankedCountryDAONoItemForIdFoundException e){
			throw new RankedCountryNotFoundInRankedCountriesPersistenceServiceException(id);
		}catch(SQLException e){
			log.error("getRankedCountry("+id+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Imports a new RankedCountry object.
	 * Returns the imported version.
	 */
	public RankedCountry importRankedCountry(RankedCountry rankedcountry) throws RankedCountriesPersistenceServiceException {
		log.debug("Call importRankedCountry("+rankedcountry+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.importRankedCountry(c, rankedcountry);
		}catch(SQLException e){
			log.error("importRankedCountry("+rankedcountry+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Imports multiple new RankedCountry objects.
	 * Returns the imported versions.
	 */
	public List<RankedCountry> importRankedCountrys(List<RankedCountry> list) throws RankedCountriesPersistenceServiceException {
		log.debug("Call importRankedCountrys("+list+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.importRankedCountrys(c, list);
		}catch(SQLException e){
			log.error("importRankedCountrys("+list+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Creates a new RankedCountry object.
	 * Returns the created version.
	 */
	public RankedCountry createRankedCountry(RankedCountry rankedcountry) throws RankedCountriesPersistenceServiceException {
		log.debug("Call createRankedCountry("+rankedcountry+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.createRankedCountry(c, rankedcountry);
		}catch(SQLException e){
			log.error("createRankedCountry("+rankedcountry+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Creates multiple new RankedCountry objects.
	 * Returns the created versions.
	 */
	public List<RankedCountry> createRankedCountrys(List<RankedCountry> list) throws RankedCountriesPersistenceServiceException {
		log.debug("Call createRankedCountrys("+list+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.createRankedCountrys(c, list);
		}catch(SQLException e){
			log.error("createRankedCountrys("+list+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Updates a RankedCountry object.
	 * Returns the updated version.
	 */
	public RankedCountry updateRankedCountry(RankedCountry rankedcountry) throws RankedCountriesPersistenceServiceException {
		log.debug("Call updateRankedCountry("+rankedcountry+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.updateRankedCountry(c, rankedcountry);
		}catch(SQLException e){
			log.error("updateRankedCountry("+rankedcountry+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Updates multiple  RankedCountry objects.
	 * Returns the updated versions.
	 */
	public List<RankedCountry> updateRankedCountrys(List<RankedCountry> list) throws RankedCountriesPersistenceServiceException {
		log.debug("Call updateRankedCountrys("+list+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.updateRankedCountrys(c, list);
		}catch(SQLException e){
			log.error("updateRankedCountrys("+list+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Returns all RankedCountry objects which match the given property.
	 */
	public List<RankedCountry> getRankedCountrysByProperty(QueryProperty... properties) throws RankedCountriesPersistenceServiceException {
		log.debug("Call getRankedCountrysByProperty("+properties+") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.getRankedCountrysByProperty(c, Arrays.asList(properties));
		}catch(SQLException e){
			log.error("getRankedCountrysByProperty("+properties+") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Returns RankedCountrys objects count.
	 */
	public int getRankedCountrysCount() throws RankedCountriesPersistenceServiceException {
		log.debug("Call getRankedCountrysCount() ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.getRankedCountrysCount(c);
		}catch(SQLException e){
			log.error("getRankedCountrysCount() ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Returns RankedCountrys objects segment.
	 */
	public List<RankedCountry> getRankedCountrys(Segment aSegment) throws RankedCountriesPersistenceServiceException {
		log.debug("Call getRankedCountrys(" + aSegment + ") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.getRankedCountrys(c, aSegment);
		}catch(SQLException e){
			log.error("getRankedCountrys(" + aSegment + ") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

	/**
	 * Returns RankedCountry objects segment which match the given property.
	 */
	public List<RankedCountry> getRankedCountrysByProperty(Segment aSegment, QueryProperty... aProperties) throws RankedCountriesPersistenceServiceException {
		log.debug("Call getRankedCountrysByProperty(" + aSegment + "," + aProperties + ") ");
		Connection c = null;
		try {
			c = getConnection();
			return rankedcountryDAO.getRankedCountrysByProperty(c, aSegment, Arrays.asList(aProperties));
		}catch(SQLException e){
			log.error("getRankedCountrysByProperty(" + aSegment + "," + aProperties + ") ",e);
			throw new RankedCountriesPersistenceServiceException(e);
		}catch(DAOException e){
			throw new RankedCountriesPersistenceServiceException(e);
		}finally{
			release(c);
		}
	}

}
