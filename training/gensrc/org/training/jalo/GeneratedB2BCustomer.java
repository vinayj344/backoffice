/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 10, 2018 10:28:35 AM                    ---
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem B2BCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2BCustomer extends GenericItem
{
	/** Qualifier of the <code>B2BCustomer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>B2BCustomer.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>B2BCustomer.acceptedTermsTime</code> attribute **/
	public static final String ACCEPTEDTERMSTIME = "acceptedTermsTime";
	/** Qualifier of the <code>B2BCustomer.acceptedTermsConditions</code> attribute **/
	public static final String ACCEPTEDTERMSCONDITIONS = "acceptedTermsConditions";
	/** Qualifier of the <code>B2BCustomer.saleOrgActive</code> attribute **/
	public static final String SALEORGACTIVE = "saleOrgActive";
	/** Qualifier of the <code>B2BCustomer.sendEmailEnabled</code> attribute **/
	public static final String SENDEMAILENABLED = "sendEmailEnabled";
	/** Qualifier of the <code>B2BCustomer.lastLoginTimeforJob</code> attribute **/
	public static final String LASTLOGINTIMEFORJOB = "lastLoginTimeforJob";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(ACCEPTEDTERMSTIME, AttributeMode.INITIAL);
		tmp.put(ACCEPTEDTERMSCONDITIONS, AttributeMode.INITIAL);
		tmp.put(SALEORGACTIVE, AttributeMode.INITIAL);
		tmp.put(SENDEMAILENABLED, AttributeMode.INITIAL);
		tmp.put(LASTLOGINTIMEFORJOB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute.
	 * @return the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public Boolean isAcceptedTermsConditions(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACCEPTEDTERMSCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute.
	 * @return the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public Boolean isAcceptedTermsConditions()
	{
		return isAcceptedTermsConditions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute. 
	 * @return the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public boolean isAcceptedTermsConditionsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAcceptedTermsConditions( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute. 
	 * @return the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public boolean isAcceptedTermsConditionsAsPrimitive()
	{
		return isAcceptedTermsConditionsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute. 
	 * @param value the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public void setAcceptedTermsConditions(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACCEPTEDTERMSCONDITIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute. 
	 * @param value the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public void setAcceptedTermsConditions(final Boolean value)
	{
		setAcceptedTermsConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute. 
	 * @param value the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public void setAcceptedTermsConditions(final SessionContext ctx, final boolean value)
	{
		setAcceptedTermsConditions( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.acceptedTermsConditions</code> attribute. 
	 * @param value the acceptedTermsConditions - Flag indicating whether Customer has accepted the terms to advance to site
	 */
	public void setAcceptedTermsConditions(final boolean value)
	{
		setAcceptedTermsConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.acceptedTermsTime</code> attribute.
	 * @return the acceptedTermsTime - Attribute records when Customer has accepted the terms to advance to site
	 */
	public Date getAcceptedTermsTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACCEPTEDTERMSTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.acceptedTermsTime</code> attribute.
	 * @return the acceptedTermsTime - Attribute records when Customer has accepted the terms to advance to site
	 */
	public Date getAcceptedTermsTime()
	{
		return getAcceptedTermsTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.acceptedTermsTime</code> attribute. 
	 * @param value the acceptedTermsTime - Attribute records when Customer has accepted the terms to advance to site
	 */
	public void setAcceptedTermsTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACCEPTEDTERMSTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.acceptedTermsTime</code> attribute. 
	 * @param value the acceptedTermsTime - Attribute records when Customer has accepted the terms to advance to site
	 */
	public void setAcceptedTermsTime(final Date value)
	{
		setAcceptedTermsTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.firstName</code> attribute.
	 * @return the firstName - The first name of this B2B Customer User.
	 */
	public String getFirstName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedB2BCustomer.getFirstName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.firstName</code> attribute.
	 * @return the firstName - The first name of this B2B Customer User.
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.firstName</code> attribute. 
	 * @return the localized firstName - The first name of this B2B Customer User.
	 */
	public Map<Language,String> getAllFirstName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,FIRSTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.firstName</code> attribute. 
	 * @return the localized firstName - The first name of this B2B Customer User.
	 */
	public Map<Language,String> getAllFirstName()
	{
		return getAllFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.firstName</code> attribute. 
	 * @param value the firstName - The first name of this B2B Customer User.
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedB2BCustomer.setFirstName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.firstName</code> attribute. 
	 * @param value the firstName - The first name of this B2B Customer User.
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.firstName</code> attribute. 
	 * @param value the firstName - The first name of this B2B Customer User.
	 */
	public void setAllFirstName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.firstName</code> attribute. 
	 * @param value the firstName - The first name of this B2B Customer User.
	 */
	public void setAllFirstName(final Map<Language,String> value)
	{
		setAllFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.lastLoginTimeforJob</code> attribute.
	 * @return the lastLoginTimeforJob - Last login time for job
	 */
	public Date getLastLoginTimeforJob(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTLOGINTIMEFORJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.lastLoginTimeforJob</code> attribute.
	 * @return the lastLoginTimeforJob - Last login time for job
	 */
	public Date getLastLoginTimeforJob()
	{
		return getLastLoginTimeforJob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.lastLoginTimeforJob</code> attribute. 
	 * @param value the lastLoginTimeforJob - Last login time for job
	 */
	public void setLastLoginTimeforJob(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTLOGINTIMEFORJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.lastLoginTimeforJob</code> attribute. 
	 * @param value the lastLoginTimeforJob - Last login time for job
	 */
	public void setLastLoginTimeforJob(final Date value)
	{
		setLastLoginTimeforJob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.lastName</code> attribute.
	 * @return the lastName - The last name of this B2B Customer User.
	 */
	public String getLastName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedB2BCustomer.getLastName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.lastName</code> attribute.
	 * @return the lastName - The last name of this B2B Customer User.
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.lastName</code> attribute. 
	 * @return the localized lastName - The last name of this B2B Customer User.
	 */
	public Map<Language,String> getAllLastName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LASTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.lastName</code> attribute. 
	 * @return the localized lastName - The last name of this B2B Customer User.
	 */
	public Map<Language,String> getAllLastName()
	{
		return getAllLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.lastName</code> attribute. 
	 * @param value the lastName - The last name of this B2B Customer User.
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedB2BCustomer.setLastName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.lastName</code> attribute. 
	 * @param value the lastName - The last name of this B2B Customer User.
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.lastName</code> attribute. 
	 * @param value the lastName - The last name of this B2B Customer User.
	 */
	public void setAllLastName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.lastName</code> attribute. 
	 * @param value the lastName - The last name of this B2B Customer User.
	 */
	public void setAllLastName(final Map<Language,String> value)
	{
		setAllLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.saleOrgActive</code> attribute.
	 * @return the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public Boolean isSaleOrgActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALEORGACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.saleOrgActive</code> attribute.
	 * @return the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public Boolean isSaleOrgActive()
	{
		return isSaleOrgActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.saleOrgActive</code> attribute. 
	 * @return the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public boolean isSaleOrgActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSaleOrgActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.saleOrgActive</code> attribute. 
	 * @return the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public boolean isSaleOrgActiveAsPrimitive()
	{
		return isSaleOrgActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.saleOrgActive</code> attribute. 
	 * @param value the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public void setSaleOrgActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALEORGACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.saleOrgActive</code> attribute. 
	 * @param value the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public void setSaleOrgActive(final Boolean value)
	{
		setSaleOrgActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.saleOrgActive</code> attribute. 
	 * @param value the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public void setSaleOrgActive(final SessionContext ctx, final boolean value)
	{
		setSaleOrgActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.saleOrgActive</code> attribute. 
	 * @param value the saleOrgActive - Flag indicating whether Customer has show all B2B units from sale Organization
	 */
	public void setSaleOrgActive(final boolean value)
	{
		setSaleOrgActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.sendEmailEnabled</code> attribute.
	 * @return the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public Boolean isSendEmailEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENDEMAILENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.sendEmailEnabled</code> attribute.
	 * @return the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public Boolean isSendEmailEnabled()
	{
		return isSendEmailEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.sendEmailEnabled</code> attribute. 
	 * @return the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public boolean isSendEmailEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSendEmailEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.sendEmailEnabled</code> attribute. 
	 * @return the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public boolean isSendEmailEnabledAsPrimitive()
	{
		return isSendEmailEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.sendEmailEnabled</code> attribute. 
	 * @param value the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public void setSendEmailEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENDEMAILENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.sendEmailEnabled</code> attribute. 
	 * @param value the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public void setSendEmailEnabled(final Boolean value)
	{
		setSendEmailEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.sendEmailEnabled</code> attribute. 
	 * @param value the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public void setSendEmailEnabled(final SessionContext ctx, final boolean value)
	{
		setSendEmailEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.sendEmailEnabled</code> attribute. 
	 * @param value the sendEmailEnabled - Attribute to control sending email to test users.
	 */
	public void setSendEmailEnabled(final boolean value)
	{
		setSendEmailEnabled( getSession().getSessionContext(), value );
	}
	
}
