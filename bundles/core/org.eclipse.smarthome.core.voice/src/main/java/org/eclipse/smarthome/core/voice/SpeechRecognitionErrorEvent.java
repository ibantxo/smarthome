/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.voice;

/**
 * A {@link STTEvent} fired when the {@link STTService} encounters an error.
 *
 * @author Kelly Davis - Initial contribution and API
 */
public class SpeechRecognitionErrorEvent implements STTEvent {
   /**
    * The message describing the error
    */
    private final String message;

   /**
    * Constructs an instance with the passed {@code message}.
    *
    * @param message The message describing the error
    */
    public SpeechRecognitionErrorEvent(String message) {
        this.message = message;
    }

   /**
    * Gets the message describing this error
    *
    * @return The message describing this error
    */
    public String getMessage() {
        return this.message;
    }
}
