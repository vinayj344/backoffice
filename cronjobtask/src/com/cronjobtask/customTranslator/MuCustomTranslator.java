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
package com.cronjobtask.customTranslator;

import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;

import org.apache.commons.lang.StringUtils;


/**
 *
 */
public class MuCustomTranslator extends AbstractValueTranslator
{

	@Override
	public String exportValue(final Object value) throws JaloInvalidParameterException
	{

		return value == null ? "" : value.toString().substring(1, value.toString().length() - 1);
	}

	@Override
	public Object importValue(final String str, final Item item) throws JaloInvalidParameterException
	{
		// YTODO Auto-generated method stub
		clearStatus();
		String text = null;
		if (!StringUtils.isBlank(str))
		{
			text = "A" + str + "B";
		}
		return text;
	}

}
