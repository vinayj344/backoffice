/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2018 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cronjobtask.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

import com.cronjobtask.dao.CustomerRegisteredDAO;
import com.cronjobtask.service.RegisteredCustomersPerDayService;


/**
 *
 */
public class DefaultRegisterCustomersPerDayService implements RegisteredCustomersPerDayService
{

	private CustomerRegisteredDAO customerRegisteredDAO;

	/**
	 * @return the customerRegisteredDAO
	 */
	public CustomerRegisteredDAO getCustomerRegisteredDAO()
	{
		return customerRegisteredDAO;
	}

	/**
	 * @param customerRegisteredDAO
	 *           the customerRegisteredDAO to set
	 */
	public void setCustomerRegisteredDAO(final CustomerRegisteredDAO customerRegisteredDAO)
	{
		this.customerRegisteredDAO = customerRegisteredDAO;
	}

	@Override
	public List<CustomerModel> getRegisteredCustomerPerDay()
	{


		return getCustomerRegisteredDAO().getRegisteredCustomer();
	}

}
