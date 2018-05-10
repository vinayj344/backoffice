/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 10, 2018 6:04:35 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.EchoContractLine;
import org.training.jalo.EchoContractType;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EchoContract}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEchoContract extends GenericItem
{
	/** Qualifier of the <code>EchoContract.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>EchoContract.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>EchoContract.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>EchoContract.contractType</code> attribute **/
	public static final String CONTRACTTYPE = "contractType";
	/** Qualifier of the <code>EchoContract.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>EchoContract.contractDescription</code> attribute **/
	public static final String CONTRACTDESCRIPTION = "contractDescription";
	/** Qualifier of the <code>EchoContract.echoContractLines</code> attribute **/
	public static final String ECHOCONTRACTLINES = "echoContractLines";
	/**
	* {@link OneToManyHandler} for handling 1:n ECHOCONTRACTLINES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EchoContractLine> ECHOCONTRACTLINESHANDLER = new OneToManyHandler<EchoContractLine>(
	TrainingConstants.TC.ECHOCONTRACTLINE,
	true,
	"echoContract",
	"entryNumber",
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(CONTRACTTYPE, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(CONTRACTDESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.active</code> attribute.
	 * @return the active - Flag indicating whether this contract is active or not
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.active</code> attribute.
	 * @return the active - Flag indicating whether this contract is active or not
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.active</code> attribute. 
	 * @return the active - Flag indicating whether this contract is active or not
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.active</code> attribute. 
	 * @return the active - Flag indicating whether this contract is active or not
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract is active or not
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract is active or not
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract is active or not
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract is active or not
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.code</code> attribute.
	 * @return the code - The contract code (unique)
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.code</code> attribute.
	 * @return the code - The contract code (unique)
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.code</code> attribute. 
	 * @param value the code - The contract code (unique)
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.code</code> attribute. 
	 * @param value the code - The contract code (unique)
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.contractDescription</code> attribute.
	 * @return the contractDescription - The contract code (unique)
	 */
	public String getContractDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.contractDescription</code> attribute.
	 * @return the contractDescription - The contract code (unique)
	 */
	public String getContractDescription()
	{
		return getContractDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.contractDescription</code> attribute. 
	 * @param value the contractDescription - The contract code (unique)
	 */
	public void setContractDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.contractDescription</code> attribute. 
	 * @param value the contractDescription - The contract code (unique)
	 */
	public void setContractDescription(final String value)
	{
		setContractDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.contractType</code> attribute.
	 * @return the contractType - The contract type
	 */
	public EchoContractType getContractType(final SessionContext ctx)
	{
		return (EchoContractType)getProperty( ctx, CONTRACTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.contractType</code> attribute.
	 * @return the contractType - The contract type
	 */
	public EchoContractType getContractType()
	{
		return getContractType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.contractType</code> attribute. 
	 * @param value the contractType - The contract type
	 */
	public void setContractType(final SessionContext ctx, final EchoContractType value)
	{
		setProperty(ctx, CONTRACTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.contractType</code> attribute. 
	 * @param value the contractType - The contract type
	 */
	public void setContractType(final EchoContractType value)
	{
		setContractType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.echoContractLines</code> attribute.
	 * @return the echoContractLines
	 */
	public List<EchoContractLine> getEchoContractLines(final SessionContext ctx)
	{
		return (List<EchoContractLine>)ECHOCONTRACTLINESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.echoContractLines</code> attribute.
	 * @return the echoContractLines
	 */
	public List<EchoContractLine> getEchoContractLines()
	{
		return getEchoContractLines( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.echoContractLines</code> attribute. 
	 * @param value the echoContractLines
	 */
	public void setEchoContractLines(final SessionContext ctx, final List<EchoContractLine> value)
	{
		ECHOCONTRACTLINESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.echoContractLines</code> attribute. 
	 * @param value the echoContractLines
	 */
	public void setEchoContractLines(final List<EchoContractLine> value)
	{
		setEchoContractLines( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to echoContractLines. 
	 * @param value the item to add to echoContractLines
	 */
	public void addToEchoContractLines(final SessionContext ctx, final EchoContractLine value)
	{
		ECHOCONTRACTLINESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to echoContractLines. 
	 * @param value the item to add to echoContractLines
	 */
	public void addToEchoContractLines(final EchoContractLine value)
	{
		addToEchoContractLines( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from echoContractLines. 
	 * @param value the item to remove from echoContractLines
	 */
	public void removeFromEchoContractLines(final SessionContext ctx, final EchoContractLine value)
	{
		ECHOCONTRACTLINESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from echoContractLines. 
	 * @param value the item to remove from echoContractLines
	 */
	public void removeFromEchoContractLines(final EchoContractLine value)
	{
		removeFromEchoContractLines( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.validFrom</code> attribute.
	 * @return the validFrom - Start Date for this contract (not valid before this date)
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.validFrom</code> attribute.
	 * @return the validFrom - Start Date for this contract (not valid before this date)
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.validFrom</code> attribute. 
	 * @param value the validFrom - Start Date for this contract (not valid before this date)
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.validFrom</code> attribute. 
	 * @param value the validFrom - Start Date for this contract (not valid before this date)
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.validTo</code> attribute.
	 * @return the validTo - End Date for this contract (not valid after this date)
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContract.validTo</code> attribute.
	 * @return the validTo - End Date for this contract (not valid after this date)
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.validTo</code> attribute. 
	 * @param value the validTo - End Date for this contract (not valid after this date)
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContract.validTo</code> attribute. 
	 * @param value the validTo - End Date for this contract (not valid after this date)
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
