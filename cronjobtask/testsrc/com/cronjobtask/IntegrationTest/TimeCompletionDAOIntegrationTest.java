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
package com.cronjobtask.IntegrationTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.cronjobtask.dao.TimeCompletionDAO;


/**
 *
 */
@IntegrationTest
public class TimeCompletionDAOIntegrationTest extends ServicelayerTransactionalTest
{

	@Resource(name = "timeComplationDAO")
	private TimeCompletionDAO timeCompletionDAO;

	@Test
	public void testDAO()
	{
		final List<CustomerModel> customerModels = timeCompletionDAO.getAllCustomers();
		assertNotNull("should not be null", customerModels);
		assertTrue("It should not be empty", !customerModels.isEmpty());
	}

}
