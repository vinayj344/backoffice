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
package com.cronjobtask.unitTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cronjobtask.dao.CustomerRegisteredDAO;
import com.cronjobtask.service.impl.DefaultRegisterCustomersPerDayService;


/**
 *
 */
@UnitTest
public class DefaultRegisteredCustomersPerDayUnitTest
{


	private DefaultRegisterCustomersPerDayService defaultRegisterCustomersPerDayservice;

	private CustomerRegisteredDAO customerRegisteredDAO;

	private CustomerModel customerModel;
	private CustomerModel customerModel2;

	@org.junit.Before
	public void setup()
	{
		defaultRegisterCustomersPerDayservice = new DefaultRegisterCustomersPerDayService();
		customerRegisteredDAO = mock(CustomerRegisteredDAO.class);
		defaultRegisterCustomersPerDayservice.setCustomerRegisteredDAO(customerRegisteredDAO);

		customerModel = new CustomerModel();
		customerModel2 = new CustomerModel();
		customerModel.setName("vinay");
		customerModel.setUid("vj");

		customerModel2.setName("shwetha");
		customerModel2.setUid("sbh");
	}

	@Test
	public void testAll()
	{
		final List<CustomerModel> list = Arrays.asList(customerModel, customerModel2);
		when(customerRegisteredDAO.getRegisteredCustomer()).thenReturn(list);
		final List<CustomerModel> result = defaultRegisterCustomersPerDayservice.getRegisteredCustomerPerDay();

		assertEquals("we should find one", 1, result.size());
		assertEquals("should equals what mock returns", customerModel, result.get(0));
	}

}
