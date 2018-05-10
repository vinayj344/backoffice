/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 10, 2018 6:04:35 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.EchoContract;
import org.training.jalo.EchoIncoterm;
import org.training.jalo.EchoShippingType;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EchoContractLine}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEchoContractLine extends GenericItem
{
	/** Qualifier of the <code>EchoContractLine.entryNumber</code> attribute **/
	public static final String ENTRYNUMBER = "entryNumber";
	/** Qualifier of the <code>EchoContractLine.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>EchoContractLine.customerDescription</code> attribute **/
	public static final String CUSTOMERDESCRIPTION = "customerDescription";
	/** Qualifier of the <code>EchoContractLine.defaultQuantity</code> attribute **/
	public static final String DEFAULTQUANTITY = "defaultQuantity";
	/** Qualifier of the <code>EchoContractLine.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>EchoContractLine.shippingAddress</code> attribute **/
	public static final String SHIPPINGADDRESS = "shippingAddress";
	/** Qualifier of the <code>EchoContractLine.incoterm</code> attribute **/
	public static final String INCOTERM = "incoterm";
	/** Qualifier of the <code>EchoContractLine.shippingType</code> attribute **/
	public static final String SHIPPINGTYPE = "shippingType";
	/** Qualifier of the <code>EchoContractLine.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>EchoContractLine.incoterm2</code> attribute **/
	public static final String INCOTERM2 = "incoterm2";
	/** Qualifier of the <code>EchoContractLine.availableQuantity</code> attribute **/
	public static final String AVAILABLEQUANTITY = "availableQuantity";
	/** Qualifier of the <code>EchoContractLine.orderedQuantity</code> attribute **/
	public static final String ORDEREDQUANTITY = "orderedQuantity";
	/** Qualifier of the <code>EchoContractLine.contactDescription</code> attribute **/
	public static final String CONTACTDESCRIPTION = "contactDescription";
	/** Qualifier of the <code>EchoContractLine.utilized</code> attribute **/
	public static final String UTILIZED = "utilized";
	/** Qualifier of the <code>EchoContractLine.echoContract</code> attribute **/
	public static final String ECHOCONTRACT = "echoContract";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ECHOCONTRACT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEchoContractLine> ECHOCONTRACTHANDLER = new BidirectionalOneToManyHandler<GeneratedEchoContractLine>(
	TrainingConstants.TC.ECHOCONTRACTLINE,
	false,
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
		tmp.put(ENTRYNUMBER, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(CUSTOMERDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DEFAULTQUANTITY, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(SHIPPINGADDRESS, AttributeMode.INITIAL);
		tmp.put(INCOTERM, AttributeMode.INITIAL);
		tmp.put(SHIPPINGTYPE, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(INCOTERM2, AttributeMode.INITIAL);
		tmp.put(AVAILABLEQUANTITY, AttributeMode.INITIAL);
		tmp.put(ORDEREDQUANTITY, AttributeMode.INITIAL);
		tmp.put(CONTACTDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(UTILIZED, AttributeMode.INITIAL);
		tmp.put(ECHOCONTRACT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.active</code> attribute.
	 * @return the active - Flag indicating whether this contract line is active or not
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.active</code> attribute.
	 * @return the active - Flag indicating whether this contract line is active or not
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.active</code> attribute. 
	 * @return the active - Flag indicating whether this contract line is active or not
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.active</code> attribute. 
	 * @return the active - Flag indicating whether this contract line is active or not
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract line is active or not
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract line is active or not
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract line is active or not
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.active</code> attribute. 
	 * @param value the active - Flag indicating whether this contract line is active or not
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.availableQuantity</code> attribute.
	 * @return the availableQuantity - contract line
	 */
	public String getAvailableQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AVAILABLEQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.availableQuantity</code> attribute.
	 * @return the availableQuantity - contract line
	 */
	public String getAvailableQuantity()
	{
		return getAvailableQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - contract line
	 */
	public void setAvailableQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AVAILABLEQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - contract line
	 */
	public void setAvailableQuantity(final String value)
	{
		setAvailableQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.contactDescription</code> attribute.
	 * @return the contactDescription - contract line
	 */
	public String getContactDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.contactDescription</code> attribute.
	 * @return the contactDescription - contract line
	 */
	public String getContactDescription()
	{
		return getContactDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.contactDescription</code> attribute. 
	 * @param value the contactDescription - contract line
	 */
	public void setContactDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.contactDescription</code> attribute. 
	 * @param value the contactDescription - contract line
	 */
	public void setContactDescription(final String value)
	{
		setContactDescription( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ECHOCONTRACTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.customerDescription</code> attribute.
	 * @return the customerDescription - The customer's description  for the product in this contract line
	 */
	public String getCustomerDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.customerDescription</code> attribute.
	 * @return the customerDescription - The customer's description  for the product in this contract line
	 */
	public String getCustomerDescription()
	{
		return getCustomerDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.customerDescription</code> attribute. 
	 * @param value the customerDescription - The customer's description  for the product in this contract line
	 */
	public void setCustomerDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.customerDescription</code> attribute. 
	 * @param value the customerDescription - The customer's description  for the product in this contract line
	 */
	public void setCustomerDescription(final String value)
	{
		setCustomerDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.defaultQuantity</code> attribute.
	 * @return the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public Long getDefaultQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DEFAULTQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.defaultQuantity</code> attribute.
	 * @return the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public Long getDefaultQuantity()
	{
		return getDefaultQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.defaultQuantity</code> attribute. 
	 * @return the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public long getDefaultQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getDefaultQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.defaultQuantity</code> attribute. 
	 * @return the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public long getDefaultQuantityAsPrimitive()
	{
		return getDefaultQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.defaultQuantity</code> attribute. 
	 * @param value the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public void setDefaultQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DEFAULTQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.defaultQuantity</code> attribute. 
	 * @param value the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public void setDefaultQuantity(final Long value)
	{
		setDefaultQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.defaultQuantity</code> attribute. 
	 * @param value the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public void setDefaultQuantity(final SessionContext ctx, final long value)
	{
		setDefaultQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.defaultQuantity</code> attribute. 
	 * @param value the defaultQuantity - The default purchase quantity  for the product in this contract line
	 */
	public void setDefaultQuantity(final long value)
	{
		setDefaultQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.echoContract</code> attribute.
	 * @return the echoContract
	 */
	public EchoContract getEchoContract(final SessionContext ctx)
	{
		return (EchoContract)getProperty( ctx, ECHOCONTRACT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.echoContract</code> attribute.
	 * @return the echoContract
	 */
	public EchoContract getEchoContract()
	{
		return getEchoContract( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.echoContract</code> attribute. 
	 * @param value the echoContract
	 */
	public void setEchoContract(final SessionContext ctx, final EchoContract value)
	{
		ECHOCONTRACTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.echoContract</code> attribute. 
	 * @param value the echoContract
	 */
	public void setEchoContract(final EchoContract value)
	{
		setEchoContract( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.entryNumber</code> attribute.
	 * @return the entryNumber - The position of this item in the contract
	 */
	public Integer getEntryNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ENTRYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.entryNumber</code> attribute.
	 * @return the entryNumber - The position of this item in the contract
	 */
	public Integer getEntryNumber()
	{
		return getEntryNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.entryNumber</code> attribute. 
	 * @return the entryNumber - The position of this item in the contract
	 */
	public int getEntryNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEntryNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.entryNumber</code> attribute. 
	 * @return the entryNumber - The position of this item in the contract
	 */
	public int getEntryNumberAsPrimitive()
	{
		return getEntryNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.entryNumber</code> attribute. 
	 * @param value the entryNumber - The position of this item in the contract
	 */
	public void setEntryNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ENTRYNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.entryNumber</code> attribute. 
	 * @param value the entryNumber - The position of this item in the contract
	 */
	public void setEntryNumber(final Integer value)
	{
		setEntryNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.entryNumber</code> attribute. 
	 * @param value the entryNumber - The position of this item in the contract
	 */
	public void setEntryNumber(final SessionContext ctx, final int value)
	{
		setEntryNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.entryNumber</code> attribute. 
	 * @param value the entryNumber - The position of this item in the contract
	 */
	public void setEntryNumber(final int value)
	{
		setEntryNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.incoterm</code> attribute.
	 * @return the incoterm - The incoterm for this contract line
	 */
	public EchoIncoterm getIncoterm(final SessionContext ctx)
	{
		return (EchoIncoterm)getProperty( ctx, INCOTERM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.incoterm</code> attribute.
	 * @return the incoterm - The incoterm for this contract line
	 */
	public EchoIncoterm getIncoterm()
	{
		return getIncoterm( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.incoterm</code> attribute. 
	 * @param value the incoterm - The incoterm for this contract line
	 */
	public void setIncoterm(final SessionContext ctx, final EchoIncoterm value)
	{
		setProperty(ctx, INCOTERM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.incoterm</code> attribute. 
	 * @param value the incoterm - The incoterm for this contract line
	 */
	public void setIncoterm(final EchoIncoterm value)
	{
		setIncoterm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.incoterm2</code> attribute.
	 * @return the incoterm2 - The incoterm 2 for this contract line
	 */
	public String getIncoterm2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INCOTERM2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.incoterm2</code> attribute.
	 * @return the incoterm2 - The incoterm 2 for this contract line
	 */
	public String getIncoterm2()
	{
		return getIncoterm2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.incoterm2</code> attribute. 
	 * @param value the incoterm2 - The incoterm 2 for this contract line
	 */
	public void setIncoterm2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INCOTERM2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.incoterm2</code> attribute. 
	 * @param value the incoterm2 - The incoterm 2 for this contract line
	 */
	public void setIncoterm2(final String value)
	{
		setIncoterm2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.orderedQuantity</code> attribute.
	 * @return the orderedQuantity - contract line
	 */
	public String getOrderedQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDEREDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.orderedQuantity</code> attribute.
	 * @return the orderedQuantity - contract line
	 */
	public String getOrderedQuantity()
	{
		return getOrderedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.orderedQuantity</code> attribute. 
	 * @param value the orderedQuantity - contract line
	 */
	public void setOrderedQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDEREDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.orderedQuantity</code> attribute. 
	 * @param value the orderedQuantity - contract line
	 */
	public void setOrderedQuantity(final String value)
	{
		setOrderedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.product</code> attribute.
	 * @return the product - The product in the line
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.product</code> attribute.
	 * @return the product - The product in the line
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.product</code> attribute. 
	 * @param value the product - The product in the line
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.product</code> attribute. 
	 * @param value the product - The product in the line
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.shippingAddress</code> attribute.
	 * @return the shippingAddress - The address (ship-to) to which this product can be shipped
	 */
	public Address getShippingAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, SHIPPINGADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.shippingAddress</code> attribute.
	 * @return the shippingAddress - The address (ship-to) to which this product can be shipped
	 */
	public Address getShippingAddress()
	{
		return getShippingAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.shippingAddress</code> attribute. 
	 * @param value the shippingAddress - The address (ship-to) to which this product can be shipped
	 */
	public void setShippingAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, SHIPPINGADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.shippingAddress</code> attribute. 
	 * @param value the shippingAddress - The address (ship-to) to which this product can be shipped
	 */
	public void setShippingAddress(final Address value)
	{
		setShippingAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.shippingType</code> attribute.
	 * @return the shippingType - The shipping type for this contract line
	 */
	public EchoShippingType getShippingType(final SessionContext ctx)
	{
		return (EchoShippingType)getProperty( ctx, SHIPPINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.shippingType</code> attribute.
	 * @return the shippingType - The shipping type for this contract line
	 */
	public EchoShippingType getShippingType()
	{
		return getShippingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.shippingType</code> attribute. 
	 * @param value the shippingType - The shipping type for this contract line
	 */
	public void setShippingType(final SessionContext ctx, final EchoShippingType value)
	{
		setProperty(ctx, SHIPPINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.shippingType</code> attribute. 
	 * @param value the shippingType - The shipping type for this contract line
	 */
	public void setShippingType(final EchoShippingType value)
	{
		setShippingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.unit</code> attribute.
	 * @return the unit - The purchase unit for the product in this contract line
	 */
	public Unit getUnit(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.unit</code> attribute.
	 * @return the unit - The purchase unit for the product in this contract line
	 */
	public Unit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.unit</code> attribute. 
	 * @param value the unit - The purchase unit for the product in this contract line
	 */
	public void setUnit(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.unit</code> attribute. 
	 * @param value the unit - The purchase unit for the product in this contract line
	 */
	public void setUnit(final Unit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.utilized</code> attribute.
	 * @return the utilized - contract line
	 */
	public Boolean isUtilized(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, UTILIZED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.utilized</code> attribute.
	 * @return the utilized - contract line
	 */
	public Boolean isUtilized()
	{
		return isUtilized( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.utilized</code> attribute. 
	 * @return the utilized - contract line
	 */
	public boolean isUtilizedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUtilized( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EchoContractLine.utilized</code> attribute. 
	 * @return the utilized - contract line
	 */
	public boolean isUtilizedAsPrimitive()
	{
		return isUtilizedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.utilized</code> attribute. 
	 * @param value the utilized - contract line
	 */
	public void setUtilized(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, UTILIZED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.utilized</code> attribute. 
	 * @param value the utilized - contract line
	 */
	public void setUtilized(final Boolean value)
	{
		setUtilized( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.utilized</code> attribute. 
	 * @param value the utilized - contract line
	 */
	public void setUtilized(final SessionContext ctx, final boolean value)
	{
		setUtilized( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EchoContractLine.utilized</code> attribute. 
	 * @param value the utilized - contract line
	 */
	public void setUtilized(final boolean value)
	{
		setUtilized( getSession().getSessionContext(), value );
	}
	
}
