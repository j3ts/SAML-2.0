/*
 * Copyright [2006] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.ws.soap.soap11.impl;

import org.opensaml.ws.soap.common.SOAPObjectBuilder;
import org.opensaml.ws.soap.soap11.Detail;
import org.opensaml.xml.AbstractXMLObjectBuilder;

/**
 * Builder of {@link DetailImpl} objects.
 */
public class DetailBuilder extends AbstractXMLObjectBuilder<Detail> implements SOAPObjectBuilder<Detail>{

    /**
     * Creates an envelope object with the default SOAP 1.1 namespace, prefix and "Detail" as the element local name.
     * 
     * @return the build Envelope object
     */
    public Detail buildObject(){
        return buildObject(null, Detail.DEFAULT_ELEMENT_LOCAL_NAME, null);
    }
    
    /** {@inheritDoc} */
    public Detail buildObject(String namespaceURI, String localName, String namespacePrefix) {
        return new DetailImpl(namespaceURI, localName, namespacePrefix);
    }
}