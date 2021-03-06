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
import com.knetikcloud.model.PageResourceUsageInfo;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingUsageApi
 */
@Ignore
public class ReportingUsageApiTest {

    private final ReportingUsageApi api = new ReportingUsageApi();

    
    /**
     * Returns aggregated endpoint usage information by day
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageByDayTest() throws ApiException {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        PageResourceUsageInfo response = api.getUsageByDay(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns aggregated endpoint usage information by hour
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageByHourTest() throws ApiException {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        PageResourceUsageInfo response = api.getUsageByHour(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns aggregated endpoint usage information by minute
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageByMinuteTest() throws ApiException {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        PageResourceUsageInfo response = api.getUsageByMinute(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns aggregated endpoint usage information by month
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageByMonthTest() throws ApiException {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        PageResourceUsageInfo response = api.getUsageByMonth(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns aggregated endpoint usage information by year
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageByYearTest() throws ApiException {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        PageResourceUsageInfo response = api.getUsageByYear(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns list of endpoints called (method and url)
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageEndpointsTest() throws ApiException {
        Long startDate = null;
        Long endDate = null;
        PageResourcestring response = api.getUsageEndpoints(startDate, endDate);

        // TODO: test validations
    }
    
}
