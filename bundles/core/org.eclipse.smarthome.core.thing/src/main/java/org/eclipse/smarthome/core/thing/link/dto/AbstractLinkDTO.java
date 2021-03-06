/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.thing.link.dto;

/**
 * This is an abstract class for link data transfer object that is used to serialize links.
 *
 * @author Dennis Nobel - Initial contribution
 */
public abstract class AbstractLinkDTO {

    public String itemName;

    /**
     * Default constructor for deserialization e.g. by Gson.
     */
    protected AbstractLinkDTO() {
    }

    public AbstractLinkDTO(String itemName) {
        this.itemName = itemName;
    }

}
