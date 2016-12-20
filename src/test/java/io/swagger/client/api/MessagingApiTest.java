/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.RawEmailResource;
import io.swagger.client.model.RawSMSResource;
import io.swagger.client.model.TemplateEmailResource;
import io.swagger.client.model.TemplateSMSResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingApi
 */
@Ignore
public class MessagingApiTest {

    private final MessagingApi api = new MessagingApi();

    
    /**
     * Send a raw email to one or more users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendRawEmailUsingPOSTTest() throws ApiException {
        RawEmailResource rawEmailResource = null;
        api.sendRawEmailUsingPOST(rawEmailResource);

        // TODO: test validations
    }
    
    /**
     * Send a raw SMS
     *
     * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendRawSMSUsingPOSTTest() throws ApiException {
        RawSMSResource rawSMSResource = null;
        api.sendRawSMSUsingPOST(rawSMSResource);

        // TODO: test validations
    }
    
    /**
     * Send a new templated SMS
     *
     * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendRawSMSUsingPOST1Test() throws ApiException {
        TemplateSMSResource templateSMSResource = null;
        api.sendRawSMSUsingPOST1(templateSMSResource);

        // TODO: test validations
    }
    
    /**
     * Send a templated email to one or more users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTemplateEmailUsingPOSTTest() throws ApiException {
        TemplateEmailResource messageResource = null;
        api.sendTemplateEmailUsingPOST(messageResource);

        // TODO: test validations
    }
    
}
