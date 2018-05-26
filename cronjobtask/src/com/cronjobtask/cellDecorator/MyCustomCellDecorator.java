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
package com.cronjobtask.cellDecorator;

import de.hybris.platform.util.CSVCellDecorator;

import java.util.Map;


/**
 *
 */
public class MyCustomCellDecorator implements CSVCellDecorator
{

	@Override
	public String decorate(final int position, final Map<Integer, String> srcLine)
	{
		final String src = srcLine.get(Integer.valueOf(position));
		return src + " decorator value";
	}
}

