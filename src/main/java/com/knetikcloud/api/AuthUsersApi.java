package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceUserSidResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserSidResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T10:18:04.496-04:00")
public class AuthUsersApi {
  private ApiClient apiClient;

  public AuthUsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthUsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a sid to a user
   * No error returned if the user already has the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param userId The user id (required)
   * @param sid The new sid for the user (optional)
   * @return UserSidResource
   * @throws ApiException if fails to make API call
   */
  public UserSidResource addSid(Integer userId, UserSidResource sid) throws ApiException {
    Object localVarPostBody = sid;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addSid");
    }
    
    // create path and map variables
    String localVarPath = "/access/users/{user_id}/sids"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserSidResource> localVarReturnType = new GenericType<UserSidResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search user sids
   * &lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS
   * @param userId The resource type (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to resource:ASC)
   * @return PageResourceUserSidResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserSidResource getResources1(Integer userId, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getResources1");
    }
    
    // create path and map variables
    String localVarPath = "/access/users/{user_id}/sids"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<PageResourceUserSidResource> localVarReturnType = new GenericType<PageResourceUserSidResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a user sid
   * Http error 404 means the user does not have the sid&lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS
   * @param userId The user id (required)
   * @param sid The security id (required)
   * @return UserSidResource
   * @throws ApiException if fails to make API call
   */
  public UserSidResource getSid(Integer userId, String sid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSid");
    }
    
    // verify the required parameter 'sid' is set
    if (sid == null) {
      throw new ApiException(400, "Missing the required parameter 'sid' when calling getSid");
    }
    
    // create path and map variables
    String localVarPath = "/access/users/{user_id}/sids/{sid}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "sid" + "\\}", apiClient.escapeString(sid.toString()));

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

    GenericType<UserSidResource> localVarReturnType = new GenericType<UserSidResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove a sid from a user
   * No error returned if the suer does not have the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param userId The user id (required)
   * @param sid The security id (required)
   * @throws ApiException if fails to make API call
   */
  public void removeSid(Integer userId, String sid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeSid");
    }
    
    // verify the required parameter 'sid' is set
    if (sid == null) {
      throw new ApiException(400, "Missing the required parameter 'sid' when calling removeSid");
    }
    
    // create path and map variables
    String localVarPath = "/access/users/{user_id}/sids/{sid}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "sid" + "\\}", apiClient.escapeString(sid.toString()));

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
}
