/*
 * Copyright [2007] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.xml.signature.validator;

import org.opensaml.xml.BaseXMLObjectValidatorTestCase;
import org.opensaml.xml.signature.Exponent;
import org.opensaml.xml.signature.Modulus;
import org.opensaml.xml.signature.RSAKeyValue;

/**
 *
 */
public class RSAKeyValueSchemaValidatorTest extends BaseXMLObjectValidatorTestCase {
    
    public RSAKeyValueSchemaValidatorTest() {
        targetQName = RSAKeyValue.DEFAULT_ELEMENT_NAME;
        validator = new RSAKeyValueSchemaValidator();
    }

    protected void populateRequiredData() {
        super.populateRequiredData();
        RSAKeyValue keyValue = (RSAKeyValue) target;
        
        keyValue.setModulus((Modulus) buildXMLObject(Modulus.DEFAULT_ELEMENT_NAME));
        keyValue.setExponent((Exponent) buildXMLObject(Exponent.DEFAULT_ELEMENT_NAME));
    }
    
    public void testMissingModulus() {
        RSAKeyValue keyValue = (RSAKeyValue) target;
        
        keyValue.setModulus(null);
        
        assertValidationFail("RSAKeyValue did not contain a Modulus, should have failed validation");
    }
    
    public void testMissingExponent() {
        RSAKeyValue keyValue = (RSAKeyValue) target;
        
        keyValue.setExponent(null);
        
        assertValidationFail("RSAKeyValue did not contain an Exponent, should have failed validation");
    }
}
