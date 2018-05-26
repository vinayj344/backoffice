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
import de.hybris.platform.servicelayer.cronjob.JobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.event.EventService;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cronjobtask.dao.TimeCompletionDAO;
import com.cronjobtask.model.TimeCompletionCronjobModel;


/**
 *
 */
public class TimeCompletionJob implements JobPerformable<TimeCompletionCronjobModel>
{

	private TimeCompletionDAO timeCompletionDAO;
	@Autowired
	private EventService eventService;

	/**
	 * @return the timeCompletionDAO
	 */
	public TimeCompletionDAO getTimeCompletionDAO()
	{
		return timeCompletionDAO;
	}

	/**
	 * @param timeCompletionDAO
	 *           the timeCompletionDAO to set
	 */
	public void setTimeCompletionDAO(final TimeCompletionDAO timeCompletionDAO)
	{
		this.timeCompletionDAO = timeCompletionDAO;
	}

	@Override
	public boolean isAbortable()
	{
		return true;
	}

	@Override
	public boolean isPerformable()
	{
		return false;
	}

	@Override
	public PerformResult perform(final TimeCompletionCronjobModel cronjobModel)
	{
		final List<CustomerModel> customerModels = getTimeCompletionDAO().getAllCustomers();
		int age = 0;
		String email, name;

		for (final CustomerModel model : customerModels)
		{
			final Calendar calendar = Calendar.getInstance();
			calendar.setTime(model.getCreationtime());
			final int registeredMonth = calendar.get(Calendar.MONTH);

			final int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
			age = currentMonth - registeredMonth;
			if (age == 1)
			{
				email = model.getContactEmail();
				name = model.getName();

				return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
			}
		}

		return null;
	}

	//	public int customerMoreThanOneYearOld()
	//	{
	//
	//		return age;
	//	}

}














