/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import io.swagger.client.model.CountryTaxResource;
import io.swagger.client.model.PageCountryTaxResource;
import io.swagger.client.model.PageStateTaxResource;
import io.swagger.client.model.StateTaxResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxesApi
 */
@Ignore
public class TaxesApiTest {

    private final TaxesApi api = new TaxesApi();

    
    /**
     * Create a tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaxUsingPOSTTest() throws ApiException {
        String countryCodeIso3 = null;
        StateTaxResource taxResource = null;
        api.createTaxUsingPOST(countryCodeIso3, taxResource);

        // TODO: test validations
    }
    
    /**
     * Delete an existing tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaxUsingDELETETest() throws ApiException {
        String countryCodeIso3 = null;
        api.deleteTaxUsingDELETE(countryCodeIso3);

        // TODO: test validations
    }
    
    /**
     * Delete an existing tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaxUsingDELETE1Test() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        api.deleteTaxUsingDELETE1(countryCodeIso3, stateCode);

        // TODO: test validations
    }
    
    /**
     * List and search taxes across all countries
     *
     * Get a list of taxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTaxesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageStateTaxResource response = api.getAllTaxesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaxUsingGETTest() throws ApiException {
        String countryCodeIso3 = null;
        CountryTaxResource response = api.getTaxUsingGET(countryCodeIso3);

        // TODO: test validations
    }
    
    /**
     * Get a single tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaxUsingGET1Test() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        StateTaxResource response = api.getTaxUsingGET1(countryCodeIso3, stateCode);

        // TODO: test validations
    }
    
    /**
     * List and search taxes
     *
     * Get a list of taxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaxesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageCountryTaxResource response = api.getTaxesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search taxes within a country
     *
     * Get a list of taxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaxesUsingGET1Test() throws ApiException {
        String countryCodeIso3 = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageStateTaxResource response = api.getTaxesUsingGET1(countryCodeIso3, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Create a tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaxUsingPOSTTest() throws ApiException {
        CountryTaxResource taxResource = null;
        api.updateTaxUsingPOST(taxResource);

        // TODO: test validations
    }
    
    /**
     * Create or update a tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaxUsingPUTTest() throws ApiException {
        String countryCodeIso3 = null;
        CountryTaxResource taxResource = null;
        api.updateTaxUsingPUT(countryCodeIso3, taxResource);

        // TODO: test validations
    }
    
    /**
     * Create or update a tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaxUsingPUT1Test() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        StateTaxResource taxResource = null;
        api.updateTaxUsingPUT1(countryCodeIso3, stateCode, taxResource);

        // TODO: test validations
    }
    
}
