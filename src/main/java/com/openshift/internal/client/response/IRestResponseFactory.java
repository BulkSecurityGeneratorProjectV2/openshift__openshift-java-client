/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.internal.client.response;

import com.openshift.client.OpenShiftException;

public interface IRestResponseFactory {

	/**
	 * Returns a {@link RestResponse} instance for a given rest response string.
	 * @param rest response string
	 * @return RestResponse instance
	 * @throws OpenShiftException
	 * 
	 * @see RestResponse
	 */
	public RestResponse get(final String restResponse) throws OpenShiftException;
	
}