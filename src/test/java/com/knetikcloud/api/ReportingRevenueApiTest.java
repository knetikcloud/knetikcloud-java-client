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
import com.knetikcloud.model.PageResourceRevenueCountryReportResource;
import com.knetikcloud.model.PageResourceRevenueProductReportResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RevenueReportResource;
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
     * Get item revenue info
     *
     * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemRevenueTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        RevenueReportResource response = api.getItemRevenue(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Get refund revenue info
     *
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRefundRevenueTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        RevenueReportResource response = api.getRefundRevenue(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Get revenue info by country
     *
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRevenueByCountryTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        PageResourceRevenueCountryReportResource response = api.getRevenueByCountry(currencyCode, startDate, endDate, size, page);

        // TODO: test validations
    }
    
    /**
     * Get revenue info by item
     *
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRevenueByItemTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        PageResourceRevenueProductReportResource response = api.getRevenueByItem(currencyCode, startDate, endDate, size, page);

        // TODO: test validations
    }
    
    /**
     * Get subscription revenue info
     *
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionRevenueTest() throws ApiException {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        RevenueReportResource response = api.getSubscriptionRevenue(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    
}