package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.ChatMessageRequest;
import com.knetikcloud.model.ChatMessageResource;
import com.knetikcloud.model.GroupMemberResource;
import com.knetikcloud.model.GroupResource;
import com.knetikcloud.model.PageResourceChatMessageResource;
import com.knetikcloud.model.PageResourceGroupMemberResource;
import com.knetikcloud.model.PageResourceGroupResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.ValueWrapperboolean;
import com.knetikcloud.model.VerificationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class UsersGroupsApi {
  private ApiClient apiClient;

  public UsersGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adds a new member to the group
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POST or JOIN if self&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
   * @param uniqueName The group unique name (required)
   * @param user The id and status for a user to add to the group (required)
   * @return GroupMemberResource
   * @throws ApiException if fails to make API call
   */
  public GroupMemberResource addMemberToGroup(String uniqueName, GroupMemberResource user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling addMemberToGroup");
    }
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling addMemberToGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<GroupMemberResource> localVarReturnType = new GenericType<GroupMemberResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adds multiple members to the group
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param uniqueName The group unique name (required)
   * @param users The id and status for a list of users to add to the group (required)
   * @return List&lt;GroupMemberResource&gt;
   * @throws ApiException if fails to make API call
   */
  public List<GroupMemberResource> addMembersToGroup(String uniqueName, List<GroupMemberResource> users) throws ApiException {
    Object localVarPostBody = users;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling addMembersToGroup");
    }
    
    // verify the required parameter 'users' is set
    if (users == null) {
      throw new ApiException(400, "Missing the required parameter 'users' when calling addMembersToGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/batch-add"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<List<GroupMemberResource>> localVarReturnType = new GenericType<List<GroupMemberResource>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a group
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param groupResource The new group (optional)
   * @return GroupResource
   * @throws ApiException if fails to make API call
   */
  public GroupResource createGroup(GroupResource groupResource) throws ApiException {
    Object localVarPostBody = groupResource;
    
    // create path and map variables
    String localVarPath = "/users/groups";

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

    GenericType<GroupResource> localVarReturnType = new GenericType<GroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a group member template
   * GroupMember Templates define a type of group member and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param groupMemberTemplateResource The group member template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createGroupMemberTemplate(TemplateResource groupMemberTemplateResource) throws ApiException {
    Object localVarPostBody = groupMemberTemplateResource;
    
    // create path and map variables
    String localVarPath = "/users/groups/members/templates";

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
   * Create a group template
   * Group Templates define a type of group and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param groupTemplateResource The group template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createGroupTemplate(TemplateResource groupTemplateResource) throws ApiException {
    Object localVarPostBody = groupTemplateResource;
    
    // create path and map variables
    String localVarPath = "/users/groups/templates";

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
   * Removes a group from the system
   * All groups listing this as the parent are also removed and users are in turn removed from this and those groups. This may result in users no longer being in this group&#39;s parent if they were not added to it directly as well. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param uniqueName The group unique name (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(String uniqueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling deleteGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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
   * Delete a group member template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroupMemberTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGroupMemberTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/members/templates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cascade", cascade));

    
    
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
   * Delete a group template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroupTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGroupTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/templates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cascade", cascade));

    
    
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
   * Enable or disable notification of group messages
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member or &#39;me&#39; (required)
   * @param disabled disabled (required)
   * @throws ApiException if fails to make API call
   */
  public void disableGroupNotification(String uniqueName, String userId, ValueWrapperboolean disabled) throws ApiException {
    Object localVarPostBody = disabled;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling disableGroupNotification");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling disableGroupNotification");
    }
    
    // verify the required parameter 'disabled' is set
    if (disabled == null) {
      throw new ApiException(400, "Missing the required parameter 'disabled' when calling disableGroupNotification");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}/messages/disabled"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Loads a specific group&#39;s details
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param uniqueName The group unique name (required)
   * @return GroupResource
   * @throws ApiException if fails to make API call
   */
  public GroupResource getGroup(String uniqueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<GroupResource> localVarReturnType = new GenericType<GroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get group ancestors
   * Returns a list of ancestor groups in reverse order (parent, then grandparent, etc). &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param uniqueName The group unique name (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceGroupResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceGroupResource getGroupAncestors(String uniqueName, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroupAncestors");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/ancestors"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceGroupResource> localVarReturnType = new GenericType<PageResourceGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a user from a group
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param uniqueName The group unique name (required)
   * @param userId The id of the user (required)
   * @return GroupMemberResource
   * @throws ApiException if fails to make API call
   */
  public GroupMemberResource getGroupMember(String uniqueName, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroupMember");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<GroupMemberResource> localVarReturnType = new GenericType<GroupMemberResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single group member template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getGroupMemberTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupMemberTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/members/templates/{id}"
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
   * List and search group member templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getGroupMemberTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/groups/members/templates";

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
   * Lists members of the group
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param uniqueName The group unique name (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to order:ASC)
   * @return PageResourceGroupMemberResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceGroupMemberResource getGroupMembers(String uniqueName, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<PageResourceGroupMemberResource> localVarReturnType = new GenericType<PageResourceGroupMemberResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of group messages
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param uniqueName The group unique name (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceChatMessageResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceChatMessageResource getGroupMessages(String uniqueName, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroupMessages");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/messages"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<PageResourceChatMessageResource> localVarReturnType = new GenericType<PageResourceChatMessageResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single group template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getGroupTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/templates/{id}"
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
   * List and search group templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getGroupTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/groups/templates";

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
   * List groups a user is in
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST_GROUPS&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST_GROUPS
   * @param userId The id of the user (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param filterChildren Whether to limit group list to children of groups only. If true, shows only groups with parents. If false, shows only groups with no parent. (optional)
   * @return PageResourcestring
   * @throws ApiException if fails to make API call
   */
  public PageResourcestring getGroupsForUser(Integer userId, Integer size, Integer page, Boolean filterChildren) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getGroupsForUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/groups"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_children", filterChildren));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourcestring> localVarReturnType = new GenericType<PageResourcestring>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Invite to group
   * This will create a verification for joining the group which uses the &#39;group_invite&#39; template and sets the additional_property &#39;group&#39; with the unique name&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVITE
   * @param uniqueName The group unique name (required)
   * @param request The id of the user to invite (optional)
   * @param originator Optional originator id, admin only (optional)
   * @return VerificationRequest
   * @throws ApiException if fails to make API call
   */
  public VerificationRequest inviteToGroup(String uniqueName, VerificationRequest request, Integer originator) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling inviteToGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/invite"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originator", originator));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<VerificationRequest> localVarReturnType = new GenericType<VerificationRequest>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search groups
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param filterTemplate Filter for groups using a specific template, by id (optional)
   * @param filterMemberCount Filters groups by member count. Multiple values possible for range search. Format: filter_member_count&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ). Ex: filter_member_count&#x3D;GT,14,LT,17 (optional)
   * @param filterName Filter for groups with names starting with the given string (optional)
   * @param filterUniqueName Filter for groups whose unique_name starts with provided string (optional)
   * @param filterParent Filter for groups with a specific parent, by unique name (optional)
   * @param filterStatus Filter for groups with a certain status (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceGroupResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceGroupResource listGroups(String filterTemplate, String filterMemberCount, String filterName, String filterUniqueName, String filterParent, String filterStatus, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_template", filterTemplate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_member_count", filterMemberCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_unique_name", filterUniqueName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_parent", filterParent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_status", filterStatus));
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

    GenericType<PageResourceGroupResource> localVarReturnType = new GenericType<PageResourceGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Send a group message
   * 
   * @param uniqueName The group unique name (required)
   * @param chatMessageRequest The chat message request (optional)
   * @return ChatMessageResource
   * @throws ApiException if fails to make API call
   */
  public ChatMessageResource postGroupMessage(String uniqueName, ChatMessageRequest chatMessageRequest) throws ApiException {
    Object localVarPostBody = chatMessageRequest;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling postGroupMessage");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/messages"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<ChatMessageResource> localVarReturnType = new GenericType<ChatMessageResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Removes a user from a group
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param uniqueName The group unique name (required)
   * @param userId The id of the user to remove (required)
   * @throws ApiException if fails to make API call
   */
  public void removeGroupMember(String uniqueName, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling removeGroupMember");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a group
   * If adding/removing/changing parent, user membership in group/new parent groups may be modified. The parent being removed will remove members from this sub group unless they were added explicitly to the parent and the new parent will gain members unless they were already a part of it. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param uniqueName The group unique name (required)
   * @param groupResource The updated group (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateGroup(String uniqueName, GroupResource groupResource) throws ApiException {
    Object localVarPostBody = groupResource;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling updateGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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
  /**
   * Change a user&#39;s order
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param order The new order for the membership (required)
   * @throws ApiException if fails to make API call
   */
  public void updateGroupMemberOrder(String uniqueName, Integer userId, StringWrapper order) throws ApiException {
    Object localVarPostBody = order;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling updateGroupMemberOrder");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateGroupMemberOrder");
    }
    
    // verify the required parameter 'order' is set
    if (order == null) {
      throw new ApiException(400, "Missing the required parameter 'order' when calling updateGroupMemberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}/order"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Change a user&#39;s membership properties
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param properties The new properties for the membership (required)
   * @throws ApiException if fails to make API call
   */
  public void updateGroupMemberProperties(String uniqueName, Integer userId, Object properties) throws ApiException {
    Object localVarPostBody = properties;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling updateGroupMemberProperties");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateGroupMemberProperties");
    }
    
    // verify the required parameter 'properties' is set
    if (properties == null) {
      throw new ApiException(400, "Missing the required parameter 'properties' when calling updateGroupMemberProperties");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}/properties"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Change a user&#39;s status
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param status The new status for the user (required)
   * @throws ApiException if fails to make API call
   */
  public void updateGroupMemberStatus(String uniqueName, Integer userId, StringWrapper status) throws ApiException {
    Object localVarPostBody = status;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling updateGroupMemberStatus");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateGroupMemberStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updateGroupMemberStatus");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}/status"
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a group member template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource updateGroupMemberTemplate(String id, PatchResource templatePatchResource, Boolean testValidation) throws ApiException {
    Object localVarPostBody = templatePatchResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateGroupMemberTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/members/templates/{id}"
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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a group template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource updateGroupTemplate(String id, PatchResource templatePatchResource, Boolean testValidation) throws ApiException {
    Object localVarPostBody = templatePatchResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateGroupTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/templates/{id}"
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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
