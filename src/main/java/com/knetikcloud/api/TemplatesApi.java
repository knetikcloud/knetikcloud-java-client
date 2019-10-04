package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.BasicTemplatedResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T11:36:20.337-04:00")
public class TemplatesApi {
  private ApiClient apiClient;

  public TemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param typeHint The type for the resource this template applies to (required)
   * @param template The template (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createTemplate(String typeHint, TemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // verify the required parameter 'typeHint' is set
    if (typeHint == null) {
      throw new ApiException(400, "Missing the required parameter 'typeHint' when calling createTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/templates/{type_hint}"
      .replaceAll("\\{" + "type_hint" + "\\}", apiClient.escapeString(typeHint.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param typeHint The type for the resource this template applies to (required)
   * @param id The id of the template (required)
   * @param cascade How to cascade the delete (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplate(String typeHint, String id, String cascade) throws ApiException {
    Object localVarPostBody = cascade;
    
    // verify the required parameter 'typeHint' is set
    if (typeHint == null) {
      throw new ApiException(400, "Missing the required parameter 'typeHint' when calling deleteTemplate");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/templates/{type_hint}/{id}"
      .replaceAll("\\{" + "type_hint" + "\\}", apiClient.escapeString(typeHint.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param typeHint The type for the resource this template applies to (required)
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getTemplate(String typeHint, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'typeHint' is set
    if (typeHint == null) {
      throw new ApiException(400, "Missing the required parameter 'typeHint' when calling getTemplate");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/templates/{type_hint}/{id}"
      .replaceAll("\\{" + "type_hint" + "\\}", apiClient.escapeString(typeHint.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param typeHint The type for the resource this template applies to (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getTemplates(String typeHint, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'typeHint' is set
    if (typeHint == null) {
      throw new ApiException(400, "Missing the required parameter 'typeHint' when calling getTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/templates/{type_hint}"
      .replaceAll("\\{" + "type_hint" + "\\}", apiClient.escapeString(typeHint.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceTemplateResource> localVarReturnType = new GenericType<PageResourceTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Patch a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param typeHint The type for the resource this template applies to (required)
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @throws ApiException if fails to make API call
   */
  public void patchTemplate(String typeHint, String id, PatchResource templatePatchResource, Boolean testValidation) throws ApiException {
    Object localVarPostBody = templatePatchResource;
    
    // verify the required parameter 'typeHint' is set
    if (typeHint == null) {
      throw new ApiException(400, "Missing the required parameter 'typeHint' when calling patchTemplate");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/templates/{type_hint}/{id}"
      .replaceAll("\\{" + "type_hint" + "\\}", apiClient.escapeString(typeHint.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "test_validation", testValidation));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Validate a templated resource
   * Error code thrown if invalid.&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param typeHint The type for the resource this template applies to (required)
   * @param resource The resource to validate (optional)
   * @throws ApiException if fails to make API call
   */
  public void validate(String typeHint, BasicTemplatedResource resource) throws ApiException {
    Object localVarPostBody = resource;
    
    // verify the required parameter 'typeHint' is set
    if (typeHint == null) {
      throw new ApiException(400, "Missing the required parameter 'typeHint' when calling validate");
    }
    
    // create path and map variables
    String localVarPath = "/templates/{type_hint}/validate"
      .replaceAll("\\{" + "type_hint" + "\\}", apiClient.escapeString(typeHint.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
