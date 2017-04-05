/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.CountryTaxResource;
import com.knetikcloud.model.PageResourceCountryTaxResource;
import com.knetikcloud.model.PageResourceStateTaxResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateTaxResource;
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
     * Create a country tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCountryTaxTest() throws ApiException {
        CountryTaxResource taxResource = null;
        CountryTaxResource response = api.createCountryTax(taxResource);

        // TODO: test validations
    }
    
    /**
     * Create a state tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStateTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        StateTaxResource taxResource = null;
        StateTaxResource response = api.createStateTax(countryCodeIso3, taxResource);

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
    public void deleteCountryTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        api.deleteCountryTax(countryCodeIso3);

        // TODO: test validations
    }
    
    /**
     * Delete an existing state tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStateTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        api.deleteStateTax(countryCodeIso3, stateCode);

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
    public void getCountryTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        CountryTaxResource response = api.getCountryTax(countryCodeIso3);

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
    public void getCountryTaxesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceCountryTaxResource response = api.getCountryTaxes(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single state tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        StateTaxResource response = api.getStateTax(countryCodeIso3, stateCode);

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
    public void getStateTaxesForCountriesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceStateTaxResource response = api.getStateTaxesForCountries(size, page, order);

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
    public void getStateTaxesForCountryTest() throws ApiException {
        String countryCodeIso3 = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceStateTaxResource response = api.getStateTaxesForCountry(countryCodeIso3, size, page, order);

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
    public void updateCountryTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        CountryTaxResource taxResource = null;
        CountryTaxResource response = api.updateCountryTax(countryCodeIso3, taxResource);

        // TODO: test validations
    }
    
    /**
     * Create or update a state tax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStateTaxTest() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        StateTaxResource taxResource = null;
        StateTaxResource response = api.updateStateTax(countryCodeIso3, stateCode, taxResource);

        // TODO: test validations
    }
    
}
