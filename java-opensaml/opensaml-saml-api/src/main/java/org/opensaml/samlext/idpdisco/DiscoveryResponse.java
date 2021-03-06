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

package org.opensaml.samlext.idpdisco;

import javax.xml.namespace.QName;

import org.opensaml.saml2.metadata.IndexedEndpoint;

/** SAML Identity Provider Discovery Protocol DiscoveryResponse */
public interface DiscoveryResponse extends IndexedEndpoint {

    /** Namespace for Discovery Service metadata extensions. */
    public static final String IDP_DISCO_NS = "urn:oasis:names:tc:SAML:profiles:SSO:idp-discovery-protocol";

    /** Default namespace prefix used by this library. */
    public static final String IDP_DISCO_PREFIX = "idpdisco";

    /** Name of the element inside the Extensions. */
    public static final String DEFAULT_ELEMENT_LOCAL_NAME = "DiscoveryResponse";

    /** Default element name. */
    public static final QName DEFAULT_ELEMENT_NAME = new QName(IDP_DISCO_NS, DEFAULT_ELEMENT_LOCAL_NAME,
            IDP_DISCO_PREFIX);
}