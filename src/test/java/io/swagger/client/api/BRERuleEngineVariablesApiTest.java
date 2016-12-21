/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.VariableTypeResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineVariablesApi
 */
public class BRERuleEngineVariablesApiTest {

    private final BRERuleEngineVariablesApi api = new BRERuleEngineVariablesApi();

    
    /**
     * Get a list of variable types available
     *
     * Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListUsingGETTest() throws ApiException {
        // List<VariableTypeResource> response = api.getListUsingGET();

        // TODO: test validations
    }
    
}
