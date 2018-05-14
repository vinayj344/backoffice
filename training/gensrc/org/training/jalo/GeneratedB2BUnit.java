/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 13, 2018 11:45:48 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem B2BUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2BUnit extends GenericItem
{
	/** Qualifier of the <code>B2BUnit.locName2</code> attribute **/
	public static final String LOCNAME2 = "locName2";
	/** Qualifier of the <code>B2BUnit.servicelevel</code> attribute **/
	public static final String SERVICELEVEL = "servicelevel";
	/** Qualifier of the <code>B2BUnit.IndustryCode</code> attribute **/
	public static final String INDUSTRYCODE = "IndustryCode";
	/** Qualifier of the <code>B2BUnit.C4CAccountID</code> attribute **/
	public static final String C4CACCOUNTID = "C4CAccountID";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LOCNAME2, AttributeMode.INITIAL);
		tmp.put(SERVICELEVEL, AttributeMode.INITIAL);
		tmp.put(INDUSTRYCODE, AttributeMode.INITIAL);
		tmp.put(C4CACCOUNTID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.C4CAccountID</code> attribute.
	 * @return the C4CAccountID - Service Level
	 */
	public String getC4CAccountID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, C4CACCOUNTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.C4CAccountID</code> attribute.
	 * @return the C4CAccountID - Service Level
	 */
	public String getC4CAccountID()
	{
		return getC4CAccountID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.C4CAccountID</code> attribute. 
	 * @param value the C4CAccountID - Service Level
	 */
	public void setC4CAccountID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, C4CACCOUNTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.C4CAccountID</code> attribute. 
	 * @param value the C4CAccountID - Service Level
	 */
	public void setC4CAccountID(final String value)
	{
		setC4CAccountID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.IndustryCode</code> attribute.
	 * @return the IndustryCode - Service Level
	 */
	public String getIndustryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDUSTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.IndustryCode</code> attribute.
	 * @return the IndustryCode - Service Level
	 */
	public String getIndustryCode()
	{
		return getIndustryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.IndustryCode</code> attribute. 
	 * @param value the IndustryCode - Service Level
	 */
	public void setIndustryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDUSTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.IndustryCode</code> attribute. 
	 * @param value the IndustryCode - Service Level
	 */
	public void setIndustryCode(final String value)
	{
		setIndustryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.locName2</code> attribute.
	 * @return the locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public String getLocName2(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedB2BUnit.getLocName2 requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LOCNAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.locName2</code> attribute.
	 * @return the locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public String getLocName2()
	{
		return getLocName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.locName2</code> attribute. 
	 * @return the localized locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public Map<Language,String> getAllLocName2(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LOCNAME2,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.locName2</code> attribute. 
	 * @return the localized locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public Map<Language,String> getAllLocName2()
	{
		return getAllLocName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.locName2</code> attribute. 
	 * @param value the locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public void setLocName2(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedB2BUnit.setLocName2 requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LOCNAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.locName2</code> attribute. 
	 * @param value the locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public void setLocName2(final String value)
	{
		setLocName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.locName2</code> attribute. 
	 * @param value the locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public void setAllLocName2(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LOCNAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.locName2</code> attribute. 
	 * @param value the locName2 - The second localized name of this B2BUnit (Sold-to)
	 */
	public void setAllLocName2(final Map<Language,String> value)
	{
		setAllLocName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.servicelevel</code> attribute.
	 * @return the servicelevel - Service Level
	 */
	public String getServicelevel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERVICELEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.servicelevel</code> attribute.
	 * @return the servicelevel - Service Level
	 */
	public String getServicelevel()
	{
		return getServicelevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.servicelevel</code> attribute. 
	 * @param value the servicelevel - Service Level
	 */
	public void setServicelevel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERVICELEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.servicelevel</code> attribute. 
	 * @param value the servicelevel - Service Level
	 */
	public void setServicelevel(final String value)
	{
		setServicelevel( getSession().getSessionContext(), value );
	}
	
}
