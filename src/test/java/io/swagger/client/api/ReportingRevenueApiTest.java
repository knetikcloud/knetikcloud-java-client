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
import io.swagger.client.model.PageResourceRevenueCountryReportResource;
import io.swagger.client.model.PageResourceRevenueProductReportResource;
import io.swagger.client.model.RevenueReportResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingRevenueApi
 */
@Ignore
public class ReportingRevenueApiTest {

    private final ReportingRevenueApi api = new ReportingRevenueApi();

    
    /**
     * Get revenue info by country
     *
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executiveRevenueCountrySalesUsingGETTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        PageResourceRevenueCountryReportResource response = api.executiveRevenueCountrySalesUsingGET(currencyCode, startDate, endDate, size, page);

        // TODO: test validations
    }
    
    /**
     * Get item revenue info
     *
     * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executiveRevenueItemSalesUsingGETTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        RevenueReportResource response = api.executiveRevenueItemSalesUsingGET(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Get revenue info by item
     *
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executiveRevenueProductSalesUsingGETTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        PageResourceRevenueProductReportResource response = api.executiveRevenueProductSalesUsingGET(currencyCode, startDate, endDate, size, page);

        // TODO: test validations
    }
    
    /**
     * Get refund revenue info
     *
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executiveRevenueRefundsUsingGETTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        RevenueReportResource response = api.executiveRevenueRefundsUsingGET(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Get subscription revenue info
     *
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executiveRevenueSubscriptionSalesUsingGETTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        RevenueReportResource response = api.executiveRevenueSubscriptionSalesUsingGET(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    
}
