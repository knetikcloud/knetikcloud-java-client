package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.OAuth2ProviderResource;
import com.knetikcloud.model.PageResourceOAuth2ProviderResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T11:36:20.337-04:00")
public class AuthProvidersApi {
  private ApiClient apiClient;

  public AuthProvidersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthProvidersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param providerResource providerResource (required)
   * @return OAuth2ProviderResource
   * @throws ApiException if fails to make API call
   */
  public OAuth2ProviderResource createProvider(OAuth2ProviderResource providerResource) throws ApiException {
    Object localVarPostBody = providerResource;
    
    // verify the required parameter 'providerResource' is set
    if (providerResource == null) {
      throw new ApiException(400, "Missing the required parameter 'providerResource' when calling createProvider");
    }
    
    // create path and map variables
    String localVarPath = "/auth/providers";

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

    GenericType<OAuth2ProviderResource> localVarReturnType = new GenericType<OAuth2ProviderResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an existing OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param providerId provider_id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProvider(String providerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling deleteProvider");
    }
    
    // create path and map variables
    String localVarPath = "/auth/providers/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

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
   * Get an existing OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param providerId provider_id (required)
   * @return OAuth2ProviderResource
   * @throws ApiException if fails to make API call
   */
  public OAuth2ProviderResource getProvider(String providerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling getProvider");
    }
    
    // create path and map variables
    String localVarPath = "/auth/providers/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

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

    GenericType<OAuth2ProviderResource> localVarReturnType = new GenericType<OAuth2ProviderResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List OAuth 2 providers
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @return PageResourceOAuth2ProviderResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceOAuth2ProviderResource getProviders() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/auth/providers";

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

    GenericType<PageResourceOAuth2ProviderResource> localVarReturnType = new GenericType<PageResourceOAuth2ProviderResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an existing OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param providerId provider_id (required)
   * @param providerResource providerResource (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProvider(String providerId, OAuth2ProviderResource providerResource) throws ApiException {
    Object localVarPostBody = providerResource;
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling updateProvider");
    }
    
    // verify the required parameter 'providerResource' is set
    if (providerResource == null) {
      throw new ApiException(400, "Missing the required parameter 'providerResource' when calling updateProvider");
    }
    
    // create path and map variables
    String localVarPath = "/auth/providers/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
