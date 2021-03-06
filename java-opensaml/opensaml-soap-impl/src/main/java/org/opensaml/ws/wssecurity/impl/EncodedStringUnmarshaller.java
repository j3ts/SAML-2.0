/*
 * Copyright 2009 University Corporation for Advanced Internet Development, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.ws.wssecurity.impl;

import org.opensaml.ws.wssecurity.EncodedString;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.UnmarshallingException;
import org.w3c.dom.Attr;

/**
 * Unmarshaller for instances of {@link EncodedString}.
 */
public class EncodedStringUnmarshaller extends AttributedStringUnmarshaller {

    /** {@inheritDoc} */
    protected void processAttribute(XMLObject xmlObject, Attr attribute) throws UnmarshallingException {
        EncodedString encodedString= (EncodedString) xmlObject;
        if (EncodedString.ENCODING_TYPE_ATTRIB_NAME.equals(attribute.getLocalName())) {
            encodedString.setEncodingType(attribute.getValue());
        } else {
            super.processAttribute(xmlObject, attribute);
        }
    }

}
