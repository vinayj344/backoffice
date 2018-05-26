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
package com.cronjobtask.cronjob;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.cronjobtask.dao.CustomerRegisteredDAO;
import com.cronjobtask.model.CountCustomerRegisteredCronjobModel;


/**
 *
 */
public class CountCustomerRegisteredJob extends AbstractJobPerformable<CountCustomerRegisteredCronjobModel>
{

	private final static Logger LOG = Logger.getLogger(CountCustomerRegisteredJob.class.getName());

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
	public PerformResult perform(final CountCustomerRegisteredCronjobModel model)
	{
		try
		{
			filterCustomers(model.getDate());
		}
		catch (final ParseException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
		}

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}


	public void filterCustomers(final Date enteredDate) throws ParseException
	{
		final List<CustomerModel> list = getCustomerRegisteredDAO().getRegisteredCustomer();
		final List<CustomerModel> newCustomers = new ArrayList<>();

		final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for (final CustomerModel customerModel : list)
		{
			// fetching
			final Date currentDate = customerModel.getCreationtime();
			final String string1 = formatter.format(currentDate);
			final Date date1 = formatter.parse(string1);

			final String string2 = df.format(enteredDate);
			final Date date2 = df.parse(string2);

			if (date1.equals(date2))
			{
				newCustomers.add(customerModel);
			}
		}

		LOG.info(Integer.valueOf(newCustomers.size()));
		for (final CustomerModel customerModel : newCustomers)
		{
			LOG.info("Name:" + customerModel.getName() + ", email:" + customerModel.getContactEmail());
		}

	}

}














