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
import com.knetikcloud.model.ChatMessageRequest;
import com.knetikcloud.model.ChatMessageResource;
import com.knetikcloud.model.NewPasswordRequest;
import com.knetikcloud.model.PageResourceChatMessageResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserBaseResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.PasswordChangeRequest;
import com.knetikcloud.model.PasswordResetRequest;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Add a tag to a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserTagTest() throws ApiException {
        Integer userId = null;
        StringWrapper tag = null;
        api.addUserTag(userId, tag);

        // TODO: test validations
    }
    
    /**
     * Create a user template
     *
     * User Templates define a type of user and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTemplateTest() throws ApiException {
        TemplateResource userTemplateResource = null;
        TemplateResource response = api.createUserTemplate(userTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a user template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteUserTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a list of direct messages with this user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectMessages1Test() throws ApiException {
        Integer recipientId = null;
        Integer size = null;
        Integer page = null;
        PageResourceChatMessageResource response = api.getDirectMessages1(recipientId, size, page);

        // TODO: test validations
    }
    
    /**
     * Get a single user
     *
     * Additional private info is included if access controls allow GET.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String id = null;
        UserResource response = api.getUser(id);

        // TODO: test validations
    }
    
    /**
     * List tags for a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTagsTest() throws ApiException {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        PageResourcestring response = api.getUserTags(userId, size, page);

        // TODO: test validations
    }
    
    /**
     * Get a single user template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or USERS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getUserTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search user templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or USERS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getUserTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search users
     *
     * Additional private info is included with LIST_PRIVATE. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String filterDisplayname = null;
        String filterEmail = null;
        String filterFirstname = null;
        String filterFullname = null;
        String filterLastname = null;
        String filterUsername = null;
        String filterTag = null;
        String filterGroup = null;
        String filterRole = null;
        String filterLastActivity = null;
        String filterIdList = null;
        String filterSearch = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceUserBaseResource response = api.getUsers(filterDisplayname, filterEmail, filterFirstname, filterFullname, filterLastname, filterUsername, filterTag, filterGroup, filterRole, filterLastActivity, filterIdList, filterSearch, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Choose a new password after a reset
     *
     * Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void passwordResetTest() throws ApiException {
        Integer id = null;
        Boolean test = null;
        NewPasswordRequest newPasswordRequest = null;
        api.passwordReset(id, test, newPasswordRequest);

        // TODO: test validations
    }
    
    /**
     * Send a user message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUserMessageTest() throws ApiException {
        Integer recipientId = null;
        ChatMessageRequest chatMessageRequest = null;
        ChatMessageResource response = api.postUserMessage(recipientId, chatMessageRequest);

        // TODO: test validations
    }
    
    /**
     * Register a new user
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerUserTest() throws ApiException {
        UserResource userResource = null;
        UserResource response = api.registerUser(userResource);

        // TODO: test validations
    }
    
    /**
     * Register a new cuentas user
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerUserCuentasTest() throws ApiException {
        UserResource userResource = null;
        UserResource response = api.registerUserCuentas(userResource);

        // TODO: test validations
    }
    
    /**
     * Remove a tag from a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserTagTest() throws ApiException {
        Integer userId = null;
        String tag = null;
        api.removeUserTag(userId, tag);

        // TODO: test validations
    }
    
    /**
     * Set a user&#39;s password
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security. If not USERS_ADMIN, the correct current password must be supplied as wellPUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPasswordTest() throws ApiException {
        Integer id = null;
        PasswordChangeRequest passwordRequest = null;
        api.setPassword(id, passwordRequest);

        // TODO: test validations
    }
    
    /**
     * Reset a user&#39;s password
     *
     * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startPasswordResetTest() throws ApiException {
        Integer id = null;
        api.startPasswordReset(id);

        // TODO: test validations
    }
    
    /**
     * Reset a user&#39;s password without user id
     *
     * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit.  Must submit their email, username, or mobile phone number. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitPasswordResetTest() throws ApiException {
        PasswordResetRequest passwordReset = null;
        api.submitPasswordReset(passwordReset);

        // TODO: test validations
    }
    
    /**
     * Update a user
     *
     * Password will not be edited on this endpoint, use password specific endpoints. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String id = null;
        UserResource userResource = null;
        api.updateUser(id, userResource);

        // TODO: test validations
    }
    
    /**
     * Update a user template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTemplateTest() throws ApiException {
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        TemplateResource response = api.updateUserTemplate(id, templatePatchResource, testValidation);

        // TODO: test validations
    }
    
}
