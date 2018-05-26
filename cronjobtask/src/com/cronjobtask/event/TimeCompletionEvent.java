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
package com.cronjobtask.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 *
 */
public class TimeCompletionEvent extends AbstractEvent
{

	private final String name;
	private final String email;


	/**
		 *
		 */
	public TimeCompletionEvent(final String name, final String email)
	{
		super();
		this.name = name;
		this.email = email;
	}


	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}


	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}


}
