/**
 * Copyright (C) 2014 4th Line GmbH, Switzerland and others
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License Version 1 or later
 * ("CDDL") (collectively, the "License"). You may not use this file
 * except in compliance with the License. See LICENSE.txt for more
 * information.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

package org.jupnp.model;

/**
 * Executable procedure, invoked and potentially decorated by the {@link org.jupnp.model.ServiceManager}.
 *
 * @author Christian Bauer
 */
public interface Command<T> {

    public void execute(ServiceManager<T> manager) throws Exception;
}
