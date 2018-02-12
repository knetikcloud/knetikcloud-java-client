/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
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
import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.PageResourceCurrencyResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrenciesApi
 */
@Ignore
public class CurrenciesApiTest {

    private final CurrenciesApi api = new CurrenciesApi();

    
    /**
     * Create a currency
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CURRENCIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCurrencyTest() throws ApiException {
        CurrencyResource currency = null;
        CurrencyResource response = api.createCurrency(currency);

        // TODO: test validations
    }
    
    /**
     * Delete a currency
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CURRENCIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCurrencyTest() throws ApiException {
        String code = null;
        api.deleteCurrency(code);

        // TODO: test validations
    }
    
    /**
     * List and search currencies
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        Boolean filterDefault = null;
        Boolean filterEnabledCurrencies = null;
        String filterType = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceCurrencyResource response = api.getCurrencies(filterDefault, filterEnabledCurrencies, filterType, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single currency
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyTest() throws ApiException {
        String code = null;
        CurrencyResource response = api.getCurrency(code);

        // TODO: test validations
    }
    
    /**
     * Update a currency
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CURRENCIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCurrencyTest() throws ApiException {
        String code = null;
        CurrencyResource currency = null;
        api.updateCurrency(code, currency);

        // TODO: test validations
    }
    
}
