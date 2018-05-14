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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EchoIncoterm}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEchoIncoterm extends GenericItem
{
	/** Qualifier of the <code>EchoIncoterm.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>EchoIncoterm.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>EchoIncoterm.hybrisName</code> attribute **/
	public static final String HYBRISNAME = "hybrisName";
	/** Qualifier of the <code>EchoIncoterm.active</code> attribute **/
	public static final String ACTIVE = "active";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(HYBRISNAME, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.active</code> attribute.
	 * @return the active - Flag indicating whether this incoterm is active or not
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.active</code> attribute.
	 * @return the active - Flag indicating whether this incoterm is active or not
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.active</code> attribute. 
	 * @return the active - Flag indicating whether this incoterm is active or not
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.active</code> attribute. 
	 * @return the active - Flag indicating whether this incoterm is active or not
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.active</code> attribute. 
	 * @param value the active - Flag indicating whether this incoterm is active or not
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.active</code> attribute. 
	 * @param value the active - Flag indicating whether this incoterm is active or not
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.active</code> attribute. 
	 * @param value the active - Flag indicating whether this incoterm is active or not
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.active</code> attribute. 
	 * @param value the active - Flag indicating whether this incoterm is active or not
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.hybrisName</code> attribute.
	 * @return the hybrisName
	 */
	public String getHybrisName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEchoIncoterm.getHybrisName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, HYBRISNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.hybrisName</code> attribute.
	 * @return the hybrisName
	 */
	public String getHybrisName()
	{
		return getHybrisName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.hybrisName</code> attribute. 
	 * @return the localized hybrisName
	 */
	public Map<Language,String> getAllHybrisName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,HYBRISNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.hybrisName</code> attribute. 
	 * @return the localized hybrisName
	 */
	public Map<Language,String> getAllHybrisName()
	{
		return getAllHybrisName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.hybrisName</code> attribute. 
	 * @param value the hybrisName
	 */
	public void setHybrisName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEchoIncoterm.setHybrisName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, HYBRISNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.hybrisName</code> attribute. 
	 * @param value the hybrisName
	 */
	public void setHybrisName(final String value)
	{
		setHybrisName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.hybrisName</code> attribute. 
	 * @param value the hybrisName
	 */
	public void setAllHybrisName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,HYBRISNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.hybrisName</code> attribute. 
	 * @param value the hybrisName
	 */
	public void setAllHybrisName(final Map<Language,String> value)
	{
		setAllHybrisName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEchoIncoterm.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoIncoterm.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEchoIncoterm.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoIncoterm.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
