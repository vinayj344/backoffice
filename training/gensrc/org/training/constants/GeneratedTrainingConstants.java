/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 10, 2018 10:28:35 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedTrainingConstants
{
	public static final String EXTENSIONNAME = "training";
	public static class TC
	{
		public static final String B2BCUSTOMER = "B2BCustomer".intern();
		public static final String B2BGROUPENUM = "B2BGroupEnum".intern();
		public static final String B2BUNIT = "B2BUnit".intern();
		public static final String ECHOASSIGNMENT = "EchoAssignment".intern();
		public static final String ECHOCONTRACT = "EchoContract".intern();
		public static final String ECHOCONTRACTLINE = "EchoContractLine".intern();
		public static final String ECHOCONTRACTTYPE = "EchoContractType".intern();
		public static final String ECHOINCOTERM = "EchoIncoterm".intern();
		public static final String ECHOINVOICESTATUS = "EchoInvoiceStatus".intern();
		public static final String ECHOORDERCONSIGNMENTTYPE = "EchoOrderConsignmentType".intern();
		public static final String ECHOORDERSTATUS = "EchoOrderStatus".intern();
		public static final String ECHOSHIPPINGTYPE = "EchoShippingType".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class B2BGroupEnum
		{
			public static final String DISPLAYPRICES = "displayprices".intern();
			public static final String WAREHOUSEUSER = "warehouseuser".intern();
			public static final String AGENT = "agent".intern();
			public static final String ACCOUNTMANAGER = "accountmanager".intern();
			public static final String CUSTOMERSERVICEGROUP = "customerservicegroup".intern();
			public static final String DISPLAYINVOICES = "displayinvoices".intern();
		}
		public static class EchoAssignment
		{
			public static final String SO = "SO".intern();
			public static final String DELIVERY_NO = "DELIVERY_NO".intern();
			public static final String INVOICE = "INVOICE".intern();
			public static final String SHIPMENT_DOC = "SHIPMENT_DOC".intern();
		}
		public static class EchoInvoiceStatus
		{
			public static final String NOT_DUE = "NOT_DUE".intern();
			public static final String DUE = "DUE".intern();
			public static final String OVERDUE = "OVERDUE".intern();
			public static final String CLOSED = "CLOSED".intern();
		}
		public static class EchoOrderConsignmentType
		{
			public static final String OR = "OR".intern();
			public static final String KB = "KB".intern();
			public static final String KE = "KE".intern();
		}
		public static class EchoOrderStatus
		{
			public static final String CREATED = "CREATED".intern();
			public static final String CONFIRMED = "CONFIRMED".intern();
			public static final String COMPLETED = "COMPLETED".intern();
			public static final String SHIPPED = "SHIPPED".intern();
			public static final String INVOICED = "INVOICED".intern();
			public static final String CANCELLED = "CANCELLED".intern();
		}
		public static class OrderStatus
		{
			public static final String SHIPPED = "SHIPPED".intern();
			public static final String INVOICED = "INVOICED".intern();
		}
	}
	public static class Relations
	{
		public static final String ECHOCONTRACT2ECHOCONTRACTLINE = "EchoContract2EchoContractLine".intern();
	}
	
	protected GeneratedTrainingConstants()
	{
		// private constructor
	}
	
	
}
