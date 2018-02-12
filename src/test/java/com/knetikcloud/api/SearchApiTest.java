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
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Count matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCountGETTest() throws ApiException {
        String type = null;
        Object response = api.searchCountGET(type);

        // TODO: test validations
    }
    
    /**
     * Count matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCountPOSTTest() throws ApiException {
        String type = null;
        Object query = null;
        Object response = api.searchCountPOST(type, query);

        // TODO: test validations
    }
    
    /**
     * Count matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCountWithTemplateGETTest() throws ApiException {
        String type = null;
        String template = null;
        Object response = api.searchCountWithTemplateGET(type, template);

        // TODO: test validations
    }
    
    /**
     * Count matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCountWithTemplatePOSTTest() throws ApiException {
        String type = null;
        String template = null;
        Object query = null;
        Object response = api.searchCountWithTemplatePOST(type, template, query);

        // TODO: test validations
    }
    
    /**
     * Get document with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDocumentGETTest() throws ApiException {
        String type = null;
        String id = null;
        Object response = api.searchDocumentGET(type, id);

        // TODO: test validations
    }
    
    /**
     * Get document with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDocumentWithTemplateGETTest() throws ApiException {
        String type = null;
        String id = null;
        String template = null;
        Object response = api.searchDocumentWithTemplateGET(type, id, template);

        // TODO: test validations
    }
    
    /**
     * Explain matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchExplainGETTest() throws ApiException {
        String type = null;
        String id = null;
        Object response = api.searchExplainGET(type, id);

        // TODO: test validations
    }
    
    /**
     * Explain matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchExplainPOSTTest() throws ApiException {
        String type = null;
        String id = null;
        Object query = null;
        Object response = api.searchExplainPOST(type, id, query);

        // TODO: test validations
    }
    
    /**
     * Explain matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchExplainWithTemplateGETTest() throws ApiException {
        String type = null;
        String id = null;
        String template = null;
        Object response = api.searchExplainWithTemplateGET(type, id, template);

        // TODO: test validations
    }
    
    /**
     * Explain matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchExplainWithTemplatePOSTTest() throws ApiException {
        String type = null;
        String id = null;
        String template = null;
        Object query = null;
        Object response = api.searchExplainWithTemplatePOST(type, id, template, query);

        // TODO: test validations
    }
    
    /**
     * Search an index with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchIndexTest() throws ApiException {
        String type = null;
        Object query = null;
        Object response = api.searchIndex(type, query);

        // TODO: test validations
    }
    
    /**
     * Search an index with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchIndexGETTest() throws ApiException {
        String type = null;
        Object response = api.searchIndexGET(type);

        // TODO: test validations
    }
    
    /**
     * Search an index with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchIndexWithTemplateGETTest() throws ApiException {
        String type = null;
        String template = null;
        Object response = api.searchIndexWithTemplateGET(type, template);

        // TODO: test validations
    }
    
    /**
     * Search an index with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchIndexWithTemplatePOSTTest() throws ApiException {
        String type = null;
        String template = null;
        Object query = null;
        Object response = api.searchIndexWithTemplatePOST(type, template, query);

        // TODO: test validations
    }
    
    /**
     * Get indices
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchIndicesGETTest() throws ApiException {
        Object response = api.searchIndicesGET();

        // TODO: test validations
    }
    
    /**
     * Get mapping with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMappingsGETTest() throws ApiException {
        String type = null;
        Object response = api.searchMappingsGET(type);

        // TODO: test validations
    }
    
    /**
     * Get mapping with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMappingsWithTemplateGETTest() throws ApiException {
        String type = null;
        String template = null;
        Object response = api.searchMappingsWithTemplateGET(type, template);

        // TODO: test validations
    }
    
    /**
     * Validate matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchValidateGETTest() throws ApiException {
        String type = null;
        Object response = api.searchValidateGET(type);

        // TODO: test validations
    }
    
    /**
     * Validate matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchValidatePOSTTest() throws ApiException {
        String type = null;
        Object query = null;
        Object response = api.searchValidatePOST(type, query);

        // TODO: test validations
    }
    
    /**
     * Validate matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchValidateWithTemplateGETTest() throws ApiException {
        String type = null;
        String template = null;
        Object response = api.searchValidateWithTemplateGET(type, template);

        // TODO: test validations
    }
    
    /**
     * Validate matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchValidateWithTemplatePOSTTest() throws ApiException {
        String type = null;
        String template = null;
        Object query = null;
        Object response = api.searchValidateWithTemplatePOST(type, template, query);

        // TODO: test validations
    }
    
}