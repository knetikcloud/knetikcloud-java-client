# knetikcloud-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.knetikcloud</groupId>
    <artifactId>knetikcloud-java-client</artifactId>
    <version>3.0.3</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.knetikcloud:knetikcloud-java-client:3.0.3"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/knetikcloud-java-client-3.0.3.jar
* target/lib/*.jar

## Getting Started 


hiyhiya 




Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AWSS3Api;

import java.io.File;
import java.util.*;

public class AWSS3ApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: knetik_oauth
        OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
        knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

        AWSS3Api apiInstance = new AWSS3Api();
        String filename = "filename_example"; // String | The file name
        String contentType = "contentType_example"; // String | The content type
        try {
            AmazonS3Activity result = apiInstance.preSignUrlUsingGET(filename, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AWSS3Api#preSignUrlUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AWSS3Api* | [**preSignUrlUsingGET**](docs/AWSS3Api.md#preSignUrlUsingGET) | **GET** /amazon/s3/signedposturl | Get a signed S3 URL
*ActivitiesApi* | [**completeActivityOccurrenceUsingPUT**](docs/ActivitiesApi.md#completeActivityOccurrenceUsingPUT) | **PUT** /activity-occurrences/{activity_occurrence_id}/status | Updated the status of an activity occurrence
*ActivitiesApi* | [**createActivityOccurrenceUsingPOST**](docs/ActivitiesApi.md#createActivityOccurrenceUsingPOST) | **POST** /activity-occurrences | Create a new activity occurrence
*ActivitiesApi* | [**createActivityUsingPOST**](docs/ActivitiesApi.md#createActivityUsingPOST) | **POST** /activities | Create an activity
*ActivitiesApi* | [**deleteActivityUsingDELETE**](docs/ActivitiesApi.md#deleteActivityUsingDELETE) | **DELETE** /activities/{id} | Delete an activity
*ActivitiesApi* | [**getActivitiesUsingGET**](docs/ActivitiesApi.md#getActivitiesUsingGET) | **GET** /activities | List activity definitions
*ActivitiesApi* | [**getActivityUsingGET**](docs/ActivitiesApi.md#getActivityUsingGET) | **GET** /activities/{id} | Get a single activity
*ActivitiesApi* | [**postResultsUsingPOST**](docs/ActivitiesApi.md#postResultsUsingPOST) | **POST** /activity-occurrences/{activity_occurrence_id}/results | Sets the status of an activity occurrence to FINISHED and logs metrics
*ActivitiesApi* | [**updateActivityUsingPUT**](docs/ActivitiesApi.md#updateActivityUsingPUT) | **PUT** /activities/{id} | Update an activity
*AuthClientsApi* | [**assignClientGrantTypesUsingPUT**](docs/AuthClientsApi.md#assignClientGrantTypesUsingPUT) | **PUT** /auth/clients/{client_key}/grant-types | Set grant types for a client
*AuthClientsApi* | [**assignClientRedirectUrisUsingPUT**](docs/AuthClientsApi.md#assignClientRedirectUrisUsingPUT) | **PUT** /auth/clients/{client_key}/redirect-uris | Set redirect uris for a client
*AuthClientsApi* | [**createClientUsingPOST**](docs/AuthClientsApi.md#createClientUsingPOST) | **POST** /auth/clients | Create a new client
*AuthClientsApi* | [**deleteClientUsingDELETE**](docs/AuthClientsApi.md#deleteClientUsingDELETE) | **DELETE** /auth/clients/{client_key} | Delete a client
*AuthClientsApi* | [**getClientUsingGET**](docs/AuthClientsApi.md#getClientUsingGET) | **GET** /auth/clients/{client_key} | Get a single client
*AuthClientsApi* | [**getClientsUsingGET**](docs/AuthClientsApi.md#getClientsUsingGET) | **GET** /auth/clients | List and search clients
*AuthClientsApi* | [**listAvailableGrantTypesUsingGET**](docs/AuthClientsApi.md#listAvailableGrantTypesUsingGET) | **GET** /auth/clients/grant-types | List available client grant types
*AuthClientsApi* | [**updateClientUsingPUT**](docs/AuthClientsApi.md#updateClientUsingPUT) | **PUT** /auth/clients/{client_key} | Update a client
*AuthPermissionsApi* | [**createPermissionUsingPOST**](docs/AuthPermissionsApi.md#createPermissionUsingPOST) | **POST** /auth/permissions | Create a new permission
*AuthPermissionsApi* | [**deletePermissionUsingDELETE**](docs/AuthPermissionsApi.md#deletePermissionUsingDELETE) | **DELETE** /auth/permissions/{permission} | Delete a permission
*AuthPermissionsApi* | [**getPermissionUsingGET**](docs/AuthPermissionsApi.md#getPermissionUsingGET) | **GET** /auth/permissions/{permission} | Get a single permission
*AuthPermissionsApi* | [**getPermissionUsingGET1**](docs/AuthPermissionsApi.md#getPermissionUsingGET1) | **GET** /auth/permissions | List and search permissions
*AuthPermissionsApi* | [**updatePermissionUsingPUT**](docs/AuthPermissionsApi.md#updatePermissionUsingPUT) | **PUT** /auth/permissions/{permission} | Update a permission
*AuthRolesApi* | [**assignClientRolesUsingPUT**](docs/AuthRolesApi.md#assignClientRolesUsingPUT) | **PUT** /auth/clients/{client_key}/roles | Set roles for a client
*AuthRolesApi* | [**assignPermissionsUsingPUT**](docs/AuthRolesApi.md#assignPermissionsUsingPUT) | **PUT** /auth/roles/{role}/permissions | Set permissions for a role
*AuthRolesApi* | [**assignUserRolesExternalUsingPUT**](docs/AuthRolesApi.md#assignUserRolesExternalUsingPUT) | **PUT** /auth/users/{user_id}/roles | Set roles for a user
*AuthRolesApi* | [**createRoleUsingPOST**](docs/AuthRolesApi.md#createRoleUsingPOST) | **POST** /auth/roles | Create a new role
*AuthRolesApi* | [**deleteRoleUsingDELETE**](docs/AuthRolesApi.md#deleteRoleUsingDELETE) | **DELETE** /auth/roles/{role} | Delete a role
*AuthRolesApi* | [**getClientRolesUsingGET**](docs/AuthRolesApi.md#getClientRolesUsingGET) | **GET** /auth/clients/{client_key}/roles | Get roles for a client
*AuthRolesApi* | [**getRoleUsingGET**](docs/AuthRolesApi.md#getRoleUsingGET) | **GET** /auth/roles/{role} | Get a single role
*AuthRolesApi* | [**getRolesUsingGET**](docs/AuthRolesApi.md#getRolesUsingGET) | **GET** /auth/roles | List and search roles
*AuthRolesApi* | [**getUserRolesUsingGET**](docs/AuthRolesApi.md#getUserRolesUsingGET) | **GET** /auth/users/{user_id}/roles | Get roles for a user
*AuthRolesApi* | [**updateRoleUsingPUT**](docs/AuthRolesApi.md#updateRoleUsingPUT) | **PUT** /auth/roles/{role} | Update a role
*AuthTokensApi* | [**deleteTokenUsingDELETE**](docs/AuthTokensApi.md#deleteTokenUsingDELETE) | **DELETE** /auth/tokens/{username} | Delete all tokens by username
*AuthTokensApi* | [**deleteTokenWithClientIdUsingDELETE**](docs/AuthTokensApi.md#deleteTokenWithClientIdUsingDELETE) | **DELETE** /auth/tokens/{username}/{client_id} | Delete a token by username and client id
*AuthTokensApi* | [**getTokenByUserUsingGET**](docs/AuthTokensApi.md#getTokenByUserUsingGET) | **GET** /auth/tokens/{username}/{client_id} | Get a single token by username and client id
*AuthTokensApi* | [**getTokensUsingGET**](docs/AuthTokensApi.md#getTokensUsingGET) | **GET** /auth/tokens | List usernames and client ids
*BRERuleEngineActionsApi* | [**getActionsUsingGET**](docs/BRERuleEngineActionsApi.md#getActionsUsingGET) | **GET** /bre/actions | Get a list of available actions
*BRERuleEngineCategoriesApi* | [**createTemplateUsingPOST1**](docs/BRERuleEngineCategoriesApi.md#createTemplateUsingPOST1) | **POST** /bre/categories/templates | Create a BRE category template
*BRERuleEngineCategoriesApi* | [**deleteTemplateUsingDELETE**](docs/BRERuleEngineCategoriesApi.md#deleteTemplateUsingDELETE) | **DELETE** /bre/categories/templates/{id} | Delete a BRE category template
*BRERuleEngineCategoriesApi* | [**getCategoriesUsingGET**](docs/BRERuleEngineCategoriesApi.md#getCategoriesUsingGET) | **GET** /bre/categories | List categories
*BRERuleEngineCategoriesApi* | [**getCategoryUsingGET**](docs/BRERuleEngineCategoriesApi.md#getCategoryUsingGET) | **GET** /bre/categories/{name} | Get a single category
*BRERuleEngineCategoriesApi* | [**getTemplateUsingGET**](docs/BRERuleEngineCategoriesApi.md#getTemplateUsingGET) | **GET** /bre/categories/templates/{id} | Get a single BRE category template
*BRERuleEngineCategoriesApi* | [**getTemplatesUsingGET**](docs/BRERuleEngineCategoriesApi.md#getTemplatesUsingGET) | **GET** /bre/categories/templates | List and search BRE category templates
*BRERuleEngineCategoriesApi* | [**updateCategoryUsingPUT**](docs/BRERuleEngineCategoriesApi.md#updateCategoryUsingPUT) | **PUT** /bre/categories/{name} | Update a category
*BRERuleEngineCategoriesApi* | [**updateTemplateUsingPUT1**](docs/BRERuleEngineCategoriesApi.md#updateTemplateUsingPUT1) | **PUT** /bre/categories/templates/{id} | Update a BRE category template
*BRERuleEngineEventsApi* | [**fireEventUsingPOST**](docs/BRERuleEngineEventsApi.md#fireEventUsingPOST) | **POST** /bre/events | Fire a new event, based on an existing trigger
*BRERuleEngineExpressionsApi* | [**getLookupTypesUsingGET**](docs/BRERuleEngineExpressionsApi.md#getLookupTypesUsingGET) | **GET** /bre/expressions/lookup | Get a list of &#39;lookup&#39; type expressions
*BRERuleEngineGlobalsApi* | [**createGlobalUsingPOST**](docs/BRERuleEngineGlobalsApi.md#createGlobalUsingPOST) | **POST** /bre/globals/definitions | Create a global definition
*BRERuleEngineGlobalsApi* | [**deleteGlobalUsingDELETE**](docs/BRERuleEngineGlobalsApi.md#deleteGlobalUsingDELETE) | **DELETE** /bre/globals/definitions/{id} | Delete a global
*BRERuleEngineGlobalsApi* | [**getGlobalUsingGET**](docs/BRERuleEngineGlobalsApi.md#getGlobalUsingGET) | **GET** /bre/globals/definitions/{id} | Get a single global definition
*BRERuleEngineGlobalsApi* | [**getGlobalsUsingGET**](docs/BRERuleEngineGlobalsApi.md#getGlobalsUsingGET) | **GET** /bre/globals/definitions | List global definitions
*BRERuleEngineGlobalsApi* | [**updateGlobalUsingPUT**](docs/BRERuleEngineGlobalsApi.md#updateGlobalUsingPUT) | **PUT** /bre/globals/definitions/{id} | Update a global definition
*BRERuleEngineRulesApi* | [**convertExpressionToStringUsingPOST**](docs/BRERuleEngineRulesApi.md#convertExpressionToStringUsingPOST) | **POST** /bre/rules/expression-as-string | Returns a string representation of the provided expression
*BRERuleEngineRulesApi* | [**createRuleUsingPOST**](docs/BRERuleEngineRulesApi.md#createRuleUsingPOST) | **POST** /bre/rules | Create a rule
*BRERuleEngineRulesApi* | [**deleteRuleUsingDELETE**](docs/BRERuleEngineRulesApi.md#deleteRuleUsingDELETE) | **DELETE** /bre/rules/{id} | Delete a rule
*BRERuleEngineRulesApi* | [**enableRuleUsingPUT**](docs/BRERuleEngineRulesApi.md#enableRuleUsingPUT) | **PUT** /bre/rules/{id}/enabled | Enable or disable a rule
*BRERuleEngineRulesApi* | [**getRuleUsingGET**](docs/BRERuleEngineRulesApi.md#getRuleUsingGET) | **GET** /bre/rules/{id} | Get a single rule
*BRERuleEngineRulesApi* | [**getRulesUsingGET**](docs/BRERuleEngineRulesApi.md#getRulesUsingGET) | **GET** /bre/rules | List rules
*BRERuleEngineRulesApi* | [**updateRuleUsingPUT**](docs/BRERuleEngineRulesApi.md#updateRuleUsingPUT) | **PUT** /bre/rules/{id} | Update a rule
*BRERuleEngineTriggersApi* | [**createTriggerUsingPOST**](docs/BRERuleEngineTriggersApi.md#createTriggerUsingPOST) | **POST** /bre/triggers | Create a trigger
*BRERuleEngineTriggersApi* | [**deleteTriggerUsingDELETE**](docs/BRERuleEngineTriggersApi.md#deleteTriggerUsingDELETE) | **DELETE** /bre/triggers/{event_name} | Delete a trigger
*BRERuleEngineTriggersApi* | [**getTriggerUsingGET**](docs/BRERuleEngineTriggersApi.md#getTriggerUsingGET) | **GET** /bre/triggers/{event_name} | Get a single trigger
*BRERuleEngineTriggersApi* | [**getTriggersUsingGET**](docs/BRERuleEngineTriggersApi.md#getTriggersUsingGET) | **GET** /bre/triggers | List triggers
*BRERuleEngineTriggersApi* | [**updateTriggerUsingPUT**](docs/BRERuleEngineTriggersApi.md#updateTriggerUsingPUT) | **PUT** /bre/triggers/{event_name} | Update a trigger
*BRERuleEngineVariablesApi* | [**getListUsingGET**](docs/BRERuleEngineVariablesApi.md#getListUsingGET) | **GET** /bre/variable-types | Get a list of variable types available
*CampaignsApi* | [**addChallengesUsingPOST**](docs/CampaignsApi.md#addChallengesUsingPOST) | **POST** /campaigns/{id}/challenges | Add a challenge to a campaign
*CampaignsApi* | [**createCampaignTemplateUsingPOST**](docs/CampaignsApi.md#createCampaignTemplateUsingPOST) | **POST** /campaigns/templates | Create a campaign template
*CampaignsApi* | [**createCampaignUsingPOST**](docs/CampaignsApi.md#createCampaignUsingPOST) | **POST** /campaigns | Create a campaign
*CampaignsApi* | [**deleteCampaignTemplateUsingDELETE**](docs/CampaignsApi.md#deleteCampaignTemplateUsingDELETE) | **DELETE** /campaigns/templates/{id} | Delete a campaign template
*CampaignsApi* | [**deleteCampaignUsingDELETE**](docs/CampaignsApi.md#deleteCampaignUsingDELETE) | **DELETE** /campaigns/{id} | Delete a campaign
*CampaignsApi* | [**getCampaignTemplateUsingGET**](docs/CampaignsApi.md#getCampaignTemplateUsingGET) | **GET** /campaigns/templates/{id} | Get a single campaign template
*CampaignsApi* | [**getCampaignTemplatesUsingGET**](docs/CampaignsApi.md#getCampaignTemplatesUsingGET) | **GET** /campaigns/templates | List and search campaign templates
*CampaignsApi* | [**getCampaignUsingGET**](docs/CampaignsApi.md#getCampaignUsingGET) | **GET** /campaigns/{id} | Returns a single campaign
*CampaignsApi* | [**getCampaignsUsingGET**](docs/CampaignsApi.md#getCampaignsUsingGET) | **GET** /campaigns | List and search campaigns
*CampaignsApi* | [**getChallengesUsingGET**](docs/CampaignsApi.md#getChallengesUsingGET) | **GET** /campaigns/{id}/challenges | List the challenges associated with a campaign
*CampaignsApi* | [**removeChallengeUsingDELETE**](docs/CampaignsApi.md#removeChallengeUsingDELETE) | **DELETE** /campaigns/{campaign_id}/challenges/{id} | Remove a challenge from a campaign
*CampaignsApi* | [**updateCampaignTemplateUsingPUT**](docs/CampaignsApi.md#updateCampaignTemplateUsingPUT) | **PUT** /campaigns/templates/{id} | Update an campaign template
*CampaignsApi* | [**updateCampaignUsingPUT**](docs/CampaignsApi.md#updateCampaignUsingPUT) | **PUT** /campaigns/{id} | Update a campaign
*CampaignsChallengesApi* | [**createChallengeActivityUsingPOST**](docs/CampaignsChallengesApi.md#createChallengeActivityUsingPOST) | **POST** /challenges/{challenge_id}/activities | Create a challenge activity
*CampaignsChallengesApi* | [**createChallengeTemplateUsingPOST**](docs/CampaignsChallengesApi.md#createChallengeTemplateUsingPOST) | **POST** /challenges/templates | Create a challenge template
*CampaignsChallengesApi* | [**createChallengeUsingPOST**](docs/CampaignsChallengesApi.md#createChallengeUsingPOST) | **POST** /challenges | Create a challenge
*CampaignsChallengesApi* | [**deleteChallengeActivityUsingDELETE**](docs/CampaignsChallengesApi.md#deleteChallengeActivityUsingDELETE) | **DELETE** /challenges/{challenge_id}/activities/{activity_id} | Delete a challenge activity
*CampaignsChallengesApi* | [**deleteChallengeEventUsingDELETE**](docs/CampaignsChallengesApi.md#deleteChallengeEventUsingDELETE) | **DELETE** /challenges/events/{id} | Delete a challenge event
*CampaignsChallengesApi* | [**deleteChallengeTemplateUsingDELETE**](docs/CampaignsChallengesApi.md#deleteChallengeTemplateUsingDELETE) | **DELETE** /challenges/templates/{id} | Delete a challenge template
*CampaignsChallengesApi* | [**deleteChallengeUsingDELETE**](docs/CampaignsChallengesApi.md#deleteChallengeUsingDELETE) | **DELETE** /challenges/{id} | Delete a challenge
*CampaignsChallengesApi* | [**getActivitiesUsingGET1**](docs/CampaignsChallengesApi.md#getActivitiesUsingGET1) | **GET** /challenges/{challenge_id}/activities | List and search challenge activities
*CampaignsChallengesApi* | [**getChallengeActivityUsingGET**](docs/CampaignsChallengesApi.md#getChallengeActivityUsingGET) | **GET** /challenges/{challenge_id}/activities/{activity_id} | Get a single challenge activity
*CampaignsChallengesApi* | [**getChallengeEventUsingGET**](docs/CampaignsChallengesApi.md#getChallengeEventUsingGET) | **GET** /challenges/events/{id} | Retrieve a single challenge event details
*CampaignsChallengesApi* | [**getChallengeEventssUsingGET**](docs/CampaignsChallengesApi.md#getChallengeEventssUsingGET) | **GET** /challenges/events | Retrieve a list of challenge events
*CampaignsChallengesApi* | [**getChallengeTemplateUsingGET**](docs/CampaignsChallengesApi.md#getChallengeTemplateUsingGET) | **GET** /challenges/templates/{id} | Get a single challenge template
*CampaignsChallengesApi* | [**getChallengeTemplatesUsingGET**](docs/CampaignsChallengesApi.md#getChallengeTemplatesUsingGET) | **GET** /challenges/templates | List and search challenge templates
*CampaignsChallengesApi* | [**getChallengeUsingGET**](docs/CampaignsChallengesApi.md#getChallengeUsingGET) | **GET** /challenges/{id} | Retrieve a single challenge details
*CampaignsChallengesApi* | [**getChallengesUsingGET1**](docs/CampaignsChallengesApi.md#getChallengesUsingGET1) | **GET** /challenges | Retrieve a list of challenges
*CampaignsChallengesApi* | [**updateChallengeActivityUsingPUT**](docs/CampaignsChallengesApi.md#updateChallengeActivityUsingPUT) | **PUT** /challenges/{challenge_id}/activities/{activity_id} | Update a challenge activity
*CampaignsChallengesApi* | [**updateChallengeTemplateUsingPUT**](docs/CampaignsChallengesApi.md#updateChallengeTemplateUsingPUT) | **PUT** /challenges/templates/{id} | Update a challenge template
*CampaignsChallengesApi* | [**updateChallengeUsingPUT**](docs/CampaignsChallengesApi.md#updateChallengeUsingPUT) | **PUT** /challenges/{id} | Update a challenge&#39;s information
*CampaignsRewardsApi* | [**createRewardSetUsingPOST**](docs/CampaignsRewardsApi.md#createRewardSetUsingPOST) | **POST** /rewards | Create a reward set
*CampaignsRewardsApi* | [**deleteRewardSetUsingDELETE**](docs/CampaignsRewardsApi.md#deleteRewardSetUsingDELETE) | **DELETE** /rewards/{id} | Delete a reward set
*CampaignsRewardsApi* | [**getRewardSetUsingGET**](docs/CampaignsRewardsApi.md#getRewardSetUsingGET) | **GET** /rewards/{id} | Get a single reward set
*CampaignsRewardsApi* | [**getRewardSetsUsingGET**](docs/CampaignsRewardsApi.md#getRewardSetsUsingGET) | **GET** /rewards | List and search reward sets
*CampaignsRewardsApi* | [**updateRewardSetUsingPUT**](docs/CampaignsRewardsApi.md#updateRewardSetUsingPUT) | **PUT** /rewards/{id} | Update a reward set
*CategoriesApi* | [**createCategoryUsingPOST**](docs/CategoriesApi.md#createCategoryUsingPOST) | **POST** /categories | Create a new category
*CategoriesApi* | [**createTemplateUsingPOST2**](docs/CategoriesApi.md#createTemplateUsingPOST2) | **POST** /categories/templates | Create a category template
*CategoriesApi* | [**deleteCategoryUsingDELETE**](docs/CategoriesApi.md#deleteCategoryUsingDELETE) | **DELETE** /categories/{id} | Delete an existing category
*CategoriesApi* | [**deleteTemplateUsingDELETE1**](docs/CategoriesApi.md#deleteTemplateUsingDELETE1) | **DELETE** /categories/templates/{id} | Delete a category template
*CategoriesApi* | [**getArticleTemplatesUsingGET1**](docs/CategoriesApi.md#getArticleTemplatesUsingGET1) | **GET** /categories/templates | List and search category templates
*CategoriesApi* | [**getCategoriesUsingGET1**](docs/CategoriesApi.md#getCategoriesUsingGET1) | **GET** /categories | List and search categories with optional filters
*CategoriesApi* | [**getCategoryUsingGET1**](docs/CategoriesApi.md#getCategoryUsingGET1) | **GET** /categories/{id} | Get a single category
*CategoriesApi* | [**getTagsUsingGET**](docs/CategoriesApi.md#getTagsUsingGET) | **GET** /tags | List all trivia tags in the system
*CategoriesApi* | [**getTemplateUsingGET1**](docs/CategoriesApi.md#getTemplateUsingGET1) | **GET** /categories/templates/{id} | Get a single category template
*CategoriesApi* | [**updateCategoryUsingPUT1**](docs/CategoriesApi.md#updateCategoryUsingPUT1) | **PUT** /categories/{id} | Update an existing category
*CategoriesApi* | [**updateTemplateUsingPUT2**](docs/CategoriesApi.md#updateTemplateUsingPUT2) | **PUT** /categories/templates/{id} | Update a category template
*ConfigsApi* | [**createConfigUsingPOST**](docs/ConfigsApi.md#createConfigUsingPOST) | **POST** /configs | Create a new config
*ConfigsApi* | [**deleteConfigUsingDELETE**](docs/ConfigsApi.md#deleteConfigUsingDELETE) | **DELETE** /configs/{name} | Delete an existing config
*ConfigsApi* | [**getConfigUsingGET**](docs/ConfigsApi.md#getConfigUsingGET) | **GET** /configs/{name} | Get a single config
*ConfigsApi* | [**getConfigsUsingGET**](docs/ConfigsApi.md#getConfigsUsingGET) | **GET** /configs | List and search configs
*ConfigsApi* | [**updateConfigUsingPUT**](docs/ConfigsApi.md#updateConfigUsingPUT) | **PUT** /configs/{name} | Update an existing config
*ContentArticlesApi* | [**createArticleTemplateUsingPOST**](docs/ContentArticlesApi.md#createArticleTemplateUsingPOST) | **POST** /content/articles/templates | Create an article template
*ContentArticlesApi* | [**createArticleUsingPOST**](docs/ContentArticlesApi.md#createArticleUsingPOST) | **POST** /content/articles | Create a new article
*ContentArticlesApi* | [**deleteArticleTemplateUsingDELETE**](docs/ContentArticlesApi.md#deleteArticleTemplateUsingDELETE) | **DELETE** /content/articles/templates/{id} | Delete an article template
*ContentArticlesApi* | [**deleteArticleUsingDELETE**](docs/ContentArticlesApi.md#deleteArticleUsingDELETE) | **DELETE** /content/articles/{id} | Delete an existing article
*ContentArticlesApi* | [**getArticleTemplateUsingGET**](docs/ContentArticlesApi.md#getArticleTemplateUsingGET) | **GET** /content/articles/templates/{id} | Get a single article template
*ContentArticlesApi* | [**getArticleTemplatesUsingGET**](docs/ContentArticlesApi.md#getArticleTemplatesUsingGET) | **GET** /content/articles/templates | List and search article templates
*ContentArticlesApi* | [**getArticleUsingGET**](docs/ContentArticlesApi.md#getArticleUsingGET) | **GET** /content/articles/{id} | Get a single article
*ContentArticlesApi* | [**getArticlesUsingGET**](docs/ContentArticlesApi.md#getArticlesUsingGET) | **GET** /content/articles | List and search articles
*ContentArticlesApi* | [**updateArticleTemplateUsingPUT**](docs/ContentArticlesApi.md#updateArticleTemplateUsingPUT) | **PUT** /content/articles/templates/{id} | Update an article template
*ContentArticlesApi* | [**updateArticleUsingPUT**](docs/ContentArticlesApi.md#updateArticleUsingPUT) | **PUT** /content/articles/{id} | Update an existing article
*ContentCommentsApi* | [**addCommentUsingPOST**](docs/ContentCommentsApi.md#addCommentUsingPOST) | **POST** /comments | Add a new comment
*ContentCommentsApi* | [**deleteCommentUsingDELETE**](docs/ContentCommentsApi.md#deleteCommentUsingDELETE) | **DELETE** /comments/{id} | Delete a comment
*ContentCommentsApi* | [**getCommentUsingGET**](docs/ContentCommentsApi.md#getCommentUsingGET) | **GET** /comments/{id} | Returns a comment by comment id
*ContentCommentsApi* | [**getCommentsUsingGET**](docs/ContentCommentsApi.md#getCommentsUsingGET) | **GET** /comments | Returns a page of comments
*ContentCommentsApi* | [**searchCommentsUsingPOST**](docs/ContentCommentsApi.md#searchCommentsUsingPOST) | **POST** /comments/search | Search the comment index
*ContentCommentsApi* | [**updateCommentUsingPUT**](docs/ContentCommentsApi.md#updateCommentUsingPUT) | **PUT** /comments/{id}/content | Update comment content
*ContentPollsApi* | [**answerPollUsingPOST**](docs/ContentPollsApi.md#answerPollUsingPOST) | **POST** /media/polls/{id}/response | Add your vote to a poll
*ContentPollsApi* | [**createPollTemplateUsingPOST**](docs/ContentPollsApi.md#createPollTemplateUsingPOST) | **POST** /media/polls/templates | Create a poll template
*ContentPollsApi* | [**createPollUsingPOST**](docs/ContentPollsApi.md#createPollUsingPOST) | **POST** /media/polls | Create a new poll
*ContentPollsApi* | [**deletePollTemplateUsingDELETE**](docs/ContentPollsApi.md#deletePollTemplateUsingDELETE) | **DELETE** /media/polls/templates/{id} | Delete a poll template
*ContentPollsApi* | [**deletePollUsingDELETE**](docs/ContentPollsApi.md#deletePollUsingDELETE) | **DELETE** /media/polls/{id} | Delete an existing poll
*ContentPollsApi* | [**getPollAnswerUsingGET**](docs/ContentPollsApi.md#getPollAnswerUsingGET) | **GET** /media/polls/{id}/response | Get poll answer
*ContentPollsApi* | [**getPollTemplateUsingGET**](docs/ContentPollsApi.md#getPollTemplateUsingGET) | **GET** /media/polls/templates/{id} | Get a single poll template
*ContentPollsApi* | [**getPollTemplatesUsingGET**](docs/ContentPollsApi.md#getPollTemplatesUsingGET) | **GET** /media/polls/templates | List and search poll templates
*ContentPollsApi* | [**getPollUsingGET**](docs/ContentPollsApi.md#getPollUsingGET) | **GET** /media/polls/{id} | Get a single poll
*ContentPollsApi* | [**getPollsUsingGET**](docs/ContentPollsApi.md#getPollsUsingGET) | **GET** /media/polls | List and search polls
*ContentPollsApi* | [**updatePollTemplateUsingPUT**](docs/ContentPollsApi.md#updatePollTemplateUsingPUT) | **PUT** /media/polls/templates/{id} | Update a poll template
*ContentPollsApi* | [**updatePollUsingPUT**](docs/ContentPollsApi.md#updatePollUsingPUT) | **PUT** /media/polls/{id} | Update an existing poll
*CurrenciesApi* | [**createCurrencyUsingPOST**](docs/CurrenciesApi.md#createCurrencyUsingPOST) | **POST** /currencies | Create a currency
*CurrenciesApi* | [**deleteCurrencyUsingDELETE**](docs/CurrenciesApi.md#deleteCurrencyUsingDELETE) | **DELETE** /currencies/{code} | Delete a currency
*CurrenciesApi* | [**getCurrenciesUsingGET**](docs/CurrenciesApi.md#getCurrenciesUsingGET) | **GET** /currencies | List and search currencies
*CurrenciesApi* | [**getCurrencyUsingGET**](docs/CurrenciesApi.md#getCurrencyUsingGET) | **GET** /currencies/{code} | Get a single currency
*CurrenciesApi* | [**updateCurrencyUsingPUT**](docs/CurrenciesApi.md#updateCurrencyUsingPUT) | **PUT** /currencies/{code} | Update a currency
*CustomerserviceApi* | [**createCustomerUsingPOST**](docs/CustomerserviceApi.md#createCustomerUsingPOST) | **POST** /customers | Create a customer
*CustomerserviceApi* | [**getCustomersUsingGET**](docs/CustomerserviceApi.md#getCustomersUsingGET) | **GET** /customers | List and search customers
*DevicesApi* | [**createDeviceUsingPOST**](docs/DevicesApi.md#createDeviceUsingPOST) | **POST** /devices | Create a device
*DevicesApi* | [**deleteDeviceUsingDELETE**](docs/DevicesApi.md#deleteDeviceUsingDELETE) | **DELETE** /devices/{id} | Delete a device
*DevicesApi* | [**getDeviceUsingGET**](docs/DevicesApi.md#getDeviceUsingGET) | **GET** /devices/{id} | Get a single device
*DevicesApi* | [**getDevicesUsingGET**](docs/DevicesApi.md#getDevicesUsingGET) | **GET** /devices | List and search devices
*DevicesApi* | [**updateDeviceUsingPUT**](docs/DevicesApi.md#updateDeviceUsingPUT) | **PUT** /devices/{id} | Update a device
*DispositionsApi* | [**addDispositionUsingPOST**](docs/DispositionsApi.md#addDispositionUsingPOST) | **POST** /dispositions | Add a new disposition. 
*DispositionsApi* | [**deleteDispositionUsingDELETE**](docs/DispositionsApi.md#deleteDispositionUsingDELETE) | **DELETE** /dispositions/{id} | Delete a disposition
*DispositionsApi* | [**getDispositionCountUsingGET**](docs/DispositionsApi.md#getDispositionCountUsingGET) | **GET** /dispositions/count | Returns a list of disposition counts
*DispositionsApi* | [**getDispositionUsingGET**](docs/DispositionsApi.md#getDispositionUsingGET) | **GET** /dispositions/{id} | Returns a disposition
*DispositionsApi* | [**getDispositionsUsingGET**](docs/DispositionsApi.md#getDispositionsUsingGET) | **GET** /dispositions | Returns a page of dispositions
*FulfillmentApi* | [**createFulfillmentTypeUsingPOST**](docs/FulfillmentApi.md#createFulfillmentTypeUsingPOST) | **POST** /store/fulfillment/types | Create a fulfillment type
*FulfillmentApi* | [**deleteFulfillmentTypeUsingDELETE**](docs/FulfillmentApi.md#deleteFulfillmentTypeUsingDELETE) | **DELETE** /store/fulfillment/types/{id} | Delete a fulfillment type
*FulfillmentApi* | [**getFulfillmentTypeUsingGET**](docs/FulfillmentApi.md#getFulfillmentTypeUsingGET) | **GET** /store/fulfillment/types/{id} | Get a single fulfillment type
*FulfillmentApi* | [**getFulfillmentsUsingGET**](docs/FulfillmentApi.md#getFulfillmentsUsingGET) | **GET** /store/fulfillment/types | List and search fulfillment types
*FulfillmentApi* | [**updateFulfillmentTypeUsingPUT**](docs/FulfillmentApi.md#updateFulfillmentTypeUsingPUT) | **PUT** /store/fulfillment/types/{id} | Update a fulfillment type
*GamificationAchievementsApi* | [**createAchievementUsingPOST**](docs/GamificationAchievementsApi.md#createAchievementUsingPOST) | **POST** /achievements | Create a new achievement definition
*GamificationAchievementsApi* | [**createTemplateUsingPOST**](docs/GamificationAchievementsApi.md#createTemplateUsingPOST) | **POST** /achievements/templates | Create an achievement template
*GamificationAchievementsApi* | [**deleteAchievementTemplateUsingDELETE**](docs/GamificationAchievementsApi.md#deleteAchievementTemplateUsingDELETE) | **DELETE** /achievements/templates/{id} | Delete an achievement template
*GamificationAchievementsApi* | [**deleteAchievementUsingDELETE**](docs/GamificationAchievementsApi.md#deleteAchievementUsingDELETE) | **DELETE** /achievements/{name} | Delete an achievement definition
*GamificationAchievementsApi* | [**findAllByGroupNameUsingGET**](docs/GamificationAchievementsApi.md#findAllByGroupNameUsingGET) | **GET** /achievements/derived/{name} | Get a list of derived achievements
*GamificationAchievementsApi* | [**getAchievementTemplateUsingGET**](docs/GamificationAchievementsApi.md#getAchievementTemplateUsingGET) | **GET** /achievements/templates/{id} | Get a single achievement template
*GamificationAchievementsApi* | [**getAchievementTemplatesUsingGET**](docs/GamificationAchievementsApi.md#getAchievementTemplatesUsingGET) | **GET** /achievements/templates | List and search achievement templates
*GamificationAchievementsApi* | [**getAchievementUsingGET**](docs/GamificationAchievementsApi.md#getAchievementUsingGET) | **GET** /achievements/{name} | Get a single achievement definition
*GamificationAchievementsApi* | [**getAchievementsUsingGET**](docs/GamificationAchievementsApi.md#getAchievementsUsingGET) | **GET** /achievements | Get all achievement definitions in the system
*GamificationAchievementsApi* | [**getAllUserProgressForAchievementUsingGET**](docs/GamificationAchievementsApi.md#getAllUserProgressForAchievementUsingGET) | **GET** /users/achievements/{achievement_name} | Retrieve progress on a given achievement for all users
*GamificationAchievementsApi* | [**getAllUserProgressUsingGET**](docs/GamificationAchievementsApi.md#getAllUserProgressUsingGET) | **GET** /users/achievements | Retrieve progress on achievements for all users
*GamificationAchievementsApi* | [**getAvailableTriggersUsingGET**](docs/GamificationAchievementsApi.md#getAvailableTriggersUsingGET) | **GET** /achievements/triggers | Get the list of triggers that can be used to trigger an achievement progress update
*GamificationAchievementsApi* | [**getUserProgressForAchievementUsingGET**](docs/GamificationAchievementsApi.md#getUserProgressForAchievementUsingGET) | **GET** /users/{user_id}/achievements/{achievement_name} | Retrieve progress on a given achievement for a given user
*GamificationAchievementsApi* | [**getUserProgressUsingGET**](docs/GamificationAchievementsApi.md#getUserProgressUsingGET) | **GET** /users/{user_id}/achievements | Retrieve progress on achievements for a given user
*GamificationAchievementsApi* | [**updateAchievementUsingPUT**](docs/GamificationAchievementsApi.md#updateAchievementUsingPUT) | **PUT** /achievements/{name} | Update an achievement definition
*GamificationAchievementsApi* | [**updateProgressUsingPUT**](docs/GamificationAchievementsApi.md#updateProgressUsingPUT) | **PUT** /users/{user_id}/achievements/{achievement_name} | Update or create an achievement progress record for a user
*GamificationAchievementsApi* | [**updateTemplateUsingPUT**](docs/GamificationAchievementsApi.md#updateTemplateUsingPUT) | **PUT** /achievements/templates/{id} | Update an achievement template
*GamificationLeaderboardsApi* | [**getLeaderboardUsingGET**](docs/GamificationLeaderboardsApi.md#getLeaderboardUsingGET) | **GET** /leaderboards/{context_type}/{context_id} | Retrieves leaderboard details and paginated entries
*GamificationLeaderboardsApi* | [**getStrategiesUsingGET**](docs/GamificationLeaderboardsApi.md#getStrategiesUsingGET) | **GET** /leaderboards/strategies | Get a list of available leaderboard strategy names
*GamificationLeaderboardsApi* | [**getUserRankUsingGET**](docs/GamificationLeaderboardsApi.md#getUserRankUsingGET) | **GET** /leaderboards/{context_type}/{context_id}/users/{id}/rank | Retrieves a specific user entry with rank
*GamificationLevelingApi* | [**changeUserLevelExperienceUsingPUT**](docs/GamificationLevelingApi.md#changeUserLevelExperienceUsingPUT) | **PUT** /users/{user_id}/leveling/{name} | Update or create a leveling progress record for a user
*GamificationLevelingApi* | [**createLevelUsingPOST**](docs/GamificationLevelingApi.md#createLevelUsingPOST) | **POST** /leveling | Create a level schema
*GamificationLevelingApi* | [**deleteLevelUsingDELETE**](docs/GamificationLevelingApi.md#deleteLevelUsingDELETE) | **DELETE** /leveling/{name} | Delete a level
*GamificationLevelingApi* | [**getAvailableTriggersUsingGET1**](docs/GamificationLevelingApi.md#getAvailableTriggersUsingGET1) | **GET** /leveling/triggers | Get the list of triggers that can be used to trigger a leveling progress update
*GamificationLevelingApi* | [**getLevelUsingGET**](docs/GamificationLevelingApi.md#getLevelUsingGET) | **GET** /leveling/{name} | Retrieve a particular level
*GamificationLevelingApi* | [**getLevelsUsingGET**](docs/GamificationLevelingApi.md#getLevelsUsingGET) | **GET** /leveling | List and search levels
*GamificationLevelingApi* | [**getUserLevelUsingGET**](docs/GamificationLevelingApi.md#getUserLevelUsingGET) | **GET** /users/{user_id}/leveling/{name} | Get a user&#39;s progress for a given level schema
*GamificationLevelingApi* | [**getUserLevelsUsingGET**](docs/GamificationLevelingApi.md#getUserLevelsUsingGET) | **GET** /users/{user_id}/leveling | Get a user&#39;s progress for all level schemas
*GamificationLevelingApi* | [**updateLevelUsingPUT**](docs/GamificationLevelingApi.md#updateLevelUsingPUT) | **PUT** /leveling/{name} | Update a level
*GamificationMetricsApi* | [**addMetricUsingPOST**](docs/GamificationMetricsApi.md#addMetricUsingPOST) | **POST** /metrics | Add a metric
*GamificationTriviaApi* | [**addAnswersUsingPOST**](docs/GamificationTriviaApi.md#addAnswersUsingPOST) | **POST** /trivia/questions/{question_id}/answers | Add an answer to a question
*GamificationTriviaApi* | [**addTagUsingPOST**](docs/GamificationTriviaApi.md#addTagUsingPOST) | **POST** /trivia/questions/{id}/tags | Add a tag to a question
*GamificationTriviaApi* | [**batchAddTagUsingPOST**](docs/GamificationTriviaApi.md#batchAddTagUsingPOST) | **POST** /trivia/questions/tags | Add a tag to a batch of questions
*GamificationTriviaApi* | [**batchRemoveTagUsingDELETE**](docs/GamificationTriviaApi.md#batchRemoveTagUsingDELETE) | **DELETE** /trivia/questions/tags/{tag} | Remove a tag from a batch of questions
*GamificationTriviaApi* | [**bulkUpdateUsingPUT**](docs/GamificationTriviaApi.md#bulkUpdateUsingPUT) | **PUT** /trivia/questions | Bulk update questions
*GamificationTriviaApi* | [**countQuestionsUsingGET**](docs/GamificationTriviaApi.md#countQuestionsUsingGET) | **GET** /trivia/questions/count | Count questions based on filters.
*GamificationTriviaApi* | [**createQuestionTemplateUsingPOST**](docs/GamificationTriviaApi.md#createQuestionTemplateUsingPOST) | **POST** /trivia/questions/templates | Create a question template
*GamificationTriviaApi* | [**createQuestionUsingPOST**](docs/GamificationTriviaApi.md#createQuestionUsingPOST) | **POST** /trivia/questions | Create a question
*GamificationTriviaApi* | [**createUsingPOST**](docs/GamificationTriviaApi.md#createUsingPOST) | **POST** /trivia/import | Create an import job
*GamificationTriviaApi* | [**deleteQuestionTemplateUsingDELETE**](docs/GamificationTriviaApi.md#deleteQuestionTemplateUsingDELETE) | **DELETE** /trivia/questions/templates/{id} | Delete a question template
*GamificationTriviaApi* | [**deleteQuestionUsingDELETE**](docs/GamificationTriviaApi.md#deleteQuestionUsingDELETE) | **DELETE** /trivia/questions/{id} | Delete a question
*GamificationTriviaApi* | [**deleteUsingDELETE**](docs/GamificationTriviaApi.md#deleteUsingDELETE) | **DELETE** /trivia/import/{id} | Delete an import job
*GamificationTriviaApi* | [**getAnswerUsingGET**](docs/GamificationTriviaApi.md#getAnswerUsingGET) | **GET** /trivia/questions/{question_id}/answers/{id} | Get an answer for a question
*GamificationTriviaApi* | [**getAnswersUsingGET**](docs/GamificationTriviaApi.md#getAnswersUsingGET) | **GET** /trivia/questions/{question_id}/answers | List the answers available for a question
*GamificationTriviaApi* | [**getListUsingGET1**](docs/GamificationTriviaApi.md#getListUsingGET1) | **GET** /trivia/import | Get a list of import job
*GamificationTriviaApi* | [**getQuestionTemplateUsingGET**](docs/GamificationTriviaApi.md#getQuestionTemplateUsingGET) | **GET** /trivia/questions/templates/{id} | Get a single question template
*GamificationTriviaApi* | [**getQuestionTemplatesUsingGET**](docs/GamificationTriviaApi.md#getQuestionTemplatesUsingGET) | **GET** /trivia/questions/templates | List and search question templates
*GamificationTriviaApi* | [**getQuestionUsingGET**](docs/GamificationTriviaApi.md#getQuestionUsingGET) | **GET** /trivia/questions/{id} | Get a single question
*GamificationTriviaApi* | [**getQuestionsDeltaUsingGET**](docs/GamificationTriviaApi.md#getQuestionsDeltaUsingGET) | **GET** /trivia/questions/delta | List question deltas in ascending order of updated date
*GamificationTriviaApi* | [**getQuestionsUsingGET**](docs/GamificationTriviaApi.md#getQuestionsUsingGET) | **GET** /trivia/questions | List and search questions
*GamificationTriviaApi* | [**getTagsUsingGET1**](docs/GamificationTriviaApi.md#getTagsUsingGET1) | **GET** /trivia/questions/{id}/tags | List the tags for a question
*GamificationTriviaApi* | [**getTagsUsingGET2**](docs/GamificationTriviaApi.md#getTagsUsingGET2) | **GET** /trivia/tags | List and search tags by the beginning of the string
*GamificationTriviaApi* | [**getUsingGET**](docs/GamificationTriviaApi.md#getUsingGET) | **GET** /trivia/import/{id} | Get an import job
*GamificationTriviaApi* | [**removeAnswersUsingDELETE**](docs/GamificationTriviaApi.md#removeAnswersUsingDELETE) | **DELETE** /trivia/questions/{question_id}/answers/{id} | Remove an answer from a question
*GamificationTriviaApi* | [**removeTagUsingDELETE**](docs/GamificationTriviaApi.md#removeTagUsingDELETE) | **DELETE** /trivia/questions/{id}/tags/{tag} | Remove a tag from a question
*GamificationTriviaApi* | [**startProcessUsingPOST**](docs/GamificationTriviaApi.md#startProcessUsingPOST) | **POST** /trivia/import/{id}/process | Start processing an import job
*GamificationTriviaApi* | [**updateAnswerUsingPUT**](docs/GamificationTriviaApi.md#updateAnswerUsingPUT) | **PUT** /trivia/questions/{question_id}/answers/{id} | Update an answer for a question
*GamificationTriviaApi* | [**updateQuestionTemplateUsingPUT**](docs/GamificationTriviaApi.md#updateQuestionTemplateUsingPUT) | **PUT** /trivia/questions/templates/{id} | Update a question template
*GamificationTriviaApi* | [**updateQuestionUsingPUT**](docs/GamificationTriviaApi.md#updateQuestionUsingPUT) | **PUT** /trivia/questions/{id} | Update a question
*GamificationTriviaApi* | [**updateUsingPUT**](docs/GamificationTriviaApi.md#updateUsingPUT) | **PUT** /trivia/import/{id} | Update an import job
*InvoicesApi* | [**createInvoiceUsingPOST**](docs/InvoicesApi.md#createInvoiceUsingPOST) | **POST** /invoices | Create an invoice
*InvoicesApi* | [**getInvoiceHistoryUsingGET**](docs/InvoicesApi.md#getInvoiceHistoryUsingGET) | **GET** /invoices | Retrieve invoices
*InvoicesApi* | [**getInvoiceUsingGET**](docs/InvoicesApi.md#getInvoiceUsingGET) | **GET** /invoices/{id} | Retrieve an invoice
*InvoicesApi* | [**getLogsUsingGET**](docs/InvoicesApi.md#getLogsUsingGET) | **GET** /invoices/{id}/logs | List invoice logs
*InvoicesApi* | [**listFulFillmentStatusesUsingGET**](docs/InvoicesApi.md#listFulFillmentStatusesUsingGET) | **GET** /invoices/fulfillment-statuses | Lists available fulfillment statuses
*InvoicesApi* | [**listPaymentStatusesUsingGET**](docs/InvoicesApi.md#listPaymentStatusesUsingGET) | **GET** /invoices/payment-statuses | Lists available payment statuses
*InvoicesApi* | [**payInvoiceUsingPOST**](docs/InvoicesApi.md#payInvoiceUsingPOST) | **POST** /invoices/{id}/payments | Trigger payment of an invoice
*InvoicesApi* | [**setItemFulfillmentStatusUsingPUT**](docs/InvoicesApi.md#setItemFulfillmentStatusUsingPUT) | **PUT** /invoices/{id}/items/{sku}/fulfillment-status | Set the fulfillment status of an invoice item
*InvoicesApi* | [**setOrderNotesUsingPUT**](docs/InvoicesApi.md#setOrderNotesUsingPUT) | **PUT** /invoices/{id}/order-notes | Set the order notes of an invoice
*InvoicesApi* | [**setPaymentStatusUsingPUT**](docs/InvoicesApi.md#setPaymentStatusUsingPUT) | **PUT** /invoices/{id}/payment-status | Set the payment status of an invoice
*InvoicesApi* | [**updateBillingInfoUsingPUT**](docs/InvoicesApi.md#updateBillingInfoUsingPUT) | **PUT** /invoices/{id}/billing-address | Set or update billing info
*LocationsApi* | [**citiesUsingGET**](docs/LocationsApi.md#citiesUsingGET) | **GET** /location/countries/{country_code_iso3}/states/{state_code}/cities | Get a list of a state&#39;s cities
*LocationsApi* | [**countriesUsingGET**](docs/LocationsApi.md#countriesUsingGET) | **GET** /location/countries | Get a list of countries
*LocationsApi* | [**getCurrencyByGeoLocationUsingGET**](docs/LocationsApi.md#getCurrencyByGeoLocationUsingGET) | **GET** /location/geolocation/currency | Get the currency information of your country
*LocationsApi* | [**getGeoLocationCountryUsingGET**](docs/LocationsApi.md#getGeoLocationCountryUsingGET) | **GET** /location/geolocation/country | Get the iso3 code of your country
*LocationsApi* | [**statesUsingGET**](docs/LocationsApi.md#statesUsingGET) | **GET** /location/countries/{country_code_iso3}/states | Get a list of a country&#39;s states
*LogsApi* | [**addUserLogUsingPOST**](docs/LogsApi.md#addUserLogUsingPOST) | **POST** /audit/logs | Add a new user log entry
*LogsApi* | [**getEventLogUsingGET**](docs/LogsApi.md#getEventLogUsingGET) | **GET** /bre/logs/event-log/{id} | Get an existing BRE event log entry by id
*LogsApi* | [**getEventsLogsUsingGET**](docs/LogsApi.md#getEventsLogsUsingGET) | **GET** /bre/logs/event-log | Returns a list of BRE event log entries
*LogsApi* | [**getForwardLogUsingGET**](docs/LogsApi.md#getForwardLogUsingGET) | **GET** /bre/logs/forward-log/{id} | Get an existing forward log entry by id
*LogsApi* | [**getForwardLogsUsingGET**](docs/LogsApi.md#getForwardLogsUsingGET) | **GET** /bre/logs/forward-log | Returns a list of forward log entries
*LogsApi* | [**getUserLogsUsingGET**](docs/LogsApi.md#getUserLogsUsingGET) | **GET** /audit/logs/{id} | Returns a user log entry by id
*LogsApi* | [**getUserLogsUsingGET1**](docs/LogsApi.md#getUserLogsUsingGET1) | **GET** /audit/logs | Returns a page of user logs entries
*MediaArtistsApi* | [**addArtistUsingPOST**](docs/MediaArtistsApi.md#addArtistUsingPOST) | **POST** /media/artists | Adds a new artist in the system
*MediaArtistsApi* | [**createArtistTemplateUsingPOST**](docs/MediaArtistsApi.md#createArtistTemplateUsingPOST) | **POST** /media/artists/templates | Create an artist template
*MediaArtistsApi* | [**deleteArtistTemplateUsingDELETE**](docs/MediaArtistsApi.md#deleteArtistTemplateUsingDELETE) | **DELETE** /media/artists/templates/{id} | Delete an artist template
*MediaArtistsApi* | [**deleteArtistUsingDELETE**](docs/MediaArtistsApi.md#deleteArtistUsingDELETE) | **DELETE** /media/artists/{id} | Removes an artist from the system IF no resources are attached to it
*MediaArtistsApi* | [**getArtistTemplateUsingGET**](docs/MediaArtistsApi.md#getArtistTemplateUsingGET) | **GET** /media/artists/templates/{id} | Get a single artist template
*MediaArtistsApi* | [**getArtistTemplatesUsingGET**](docs/MediaArtistsApi.md#getArtistTemplatesUsingGET) | **GET** /media/artists/templates | List and search artist templates
*MediaArtistsApi* | [**getArtistUsingGET**](docs/MediaArtistsApi.md#getArtistUsingGET) | **GET** /media/artists/{id} | Loads a specific artist details
*MediaArtistsApi* | [**searchArtistsUsingGET**](docs/MediaArtistsApi.md#searchArtistsUsingGET) | **GET** /media/artists | Search for artists
*MediaArtistsApi* | [**updateArtistTemplateUsingPUT**](docs/MediaArtistsApi.md#updateArtistTemplateUsingPUT) | **PUT** /media/artists/templates/{id} | Update an artist template
*MediaArtistsApi* | [**updateArtistUsingPUT**](docs/MediaArtistsApi.md#updateArtistUsingPUT) | **PUT** /media/artists/{id} | Modifies an artist details
*MediaModerationApi* | [**getFlagReportUsingGET**](docs/MediaModerationApi.md#getFlagReportUsingGET) | **GET** /moderation/reports/{id} | Get a flag report
*MediaModerationApi* | [**getFlagsReportUsingGET**](docs/MediaModerationApi.md#getFlagsReportUsingGET) | **GET** /moderation/reports | Returns a page of flag reports
*MediaModerationApi* | [**setFlagResolutionUsingPUT**](docs/MediaModerationApi.md#setFlagResolutionUsingPUT) | **PUT** /moderation/reports/{id} | Update a flag report
*MediaVideosApi* | [**addCommentUsingPOST1**](docs/MediaVideosApi.md#addCommentUsingPOST1) | **POST** /media/videos/{video_id}/comments | Add a new video comment
*MediaVideosApi* | [**addContributorUsingPOST**](docs/MediaVideosApi.md#addContributorUsingPOST) | **POST** /media/videos/{video_id}/contributors | Adds a contributor to a video
*MediaVideosApi* | [**addDispositionUsingPOST1**](docs/MediaVideosApi.md#addDispositionUsingPOST1) | **POST** /media/videos/{video_id}/dispositions | Add a new Video disposition
*MediaVideosApi* | [**addFlagUsingPOST**](docs/MediaVideosApi.md#addFlagUsingPOST) | **POST** /media/videos/{video_id}/moderation | Add a new flag
*MediaVideosApi* | [**addRelatedUsingPOST**](docs/MediaVideosApi.md#addRelatedUsingPOST) | **POST** /media/videos/{video_id}/related | Adds one or more existing videos as related to this one
*MediaVideosApi* | [**addVideoUsingPOST**](docs/MediaVideosApi.md#addVideoUsingPOST) | **POST** /media/videos | Adds a new video in the system
*MediaVideosApi* | [**addWhitelistUsingPOST**](docs/MediaVideosApi.md#addWhitelistUsingPOST) | **POST** /media/videos/{id}/whitelist | Adds a user to a video&#39;s whitelist
*MediaVideosApi* | [**deleteCommentUsingDELETE1**](docs/MediaVideosApi.md#deleteCommentUsingDELETE1) | **DELETE** /media/videos/{video_id}/comments/{id} | Delete a video comment
*MediaVideosApi* | [**deleteDispositionUsingDELETE1**](docs/MediaVideosApi.md#deleteDispositionUsingDELETE1) | **DELETE** /media/videos/{video_id}/dispositions/{disposition_id} | Delete a video comment
*MediaVideosApi* | [**deleteFlagUsingDELETE**](docs/MediaVideosApi.md#deleteFlagUsingDELETE) | **DELETE** /media/videos/{video_id}/moderation | Delete a flag
*MediaVideosApi* | [**deleteRelationshipUsingDELETE1**](docs/MediaVideosApi.md#deleteRelationshipUsingDELETE1) | **DELETE** /media/videos/{video_id}/related/{id} | Delete a video&#39;s relationship
*MediaVideosApi* | [**deleteVideoUsingDELETE**](docs/MediaVideosApi.md#deleteVideoUsingDELETE) | **DELETE** /media/videos/{id} | Removes a video from the system if no resources are attached to it
*MediaVideosApi* | [**getCommentsUsingGET1**](docs/MediaVideosApi.md#getCommentsUsingGET1) | **GET** /media/videos/{video_id}/comments | Returns a page of comments for a video
*MediaVideosApi* | [**getDispositionsUsingGET1**](docs/MediaVideosApi.md#getDispositionsUsingGET1) | **GET** /media/videos/{video_id}/dispositions | Returns a page of dispositions for a video
*MediaVideosApi* | [**getRelatedUsingGET**](docs/MediaVideosApi.md#getRelatedUsingGET) | **GET** /media/videos/{video_id}/related | Returns a page of video relationships
*MediaVideosApi* | [**getUserVideosUsingGET**](docs/MediaVideosApi.md#getUserVideosUsingGET) | **GET** /users/{user_id}/videos | Get user videos
*MediaVideosApi* | [**getVideoUsingGET**](docs/MediaVideosApi.md#getVideoUsingGET) | **GET** /media/videos/{id} | Loads a specific video details
*MediaVideosApi* | [**removeContributorUsingDELETE**](docs/MediaVideosApi.md#removeContributorUsingDELETE) | **DELETE** /media/videos/{video_id}/contributors/{id} | Removes a contributor from a video
*MediaVideosApi* | [**removeWhitelistUsingDELETE**](docs/MediaVideosApi.md#removeWhitelistUsingDELETE) | **DELETE** /media/videos/{video_id}/whitelist/{id} | Removes a user from a video&#39;s whitelist
*MediaVideosApi* | [**searchVideosUsingGET**](docs/MediaVideosApi.md#searchVideosUsingGET) | **GET** /media/videos | Search videos using the documented filters
*MediaVideosApi* | [**updateCommentUsingPUT1**](docs/MediaVideosApi.md#updateCommentUsingPUT1) | **PUT** /media/videos/{video_id}/comments/{id}/content | Update video comment content 
*MediaVideosApi* | [**updateRelationshipUsingPUT1**](docs/MediaVideosApi.md#updateRelationshipUsingPUT1) | **PUT** /media/videos/{video_id}/related/{id}/relationship_details | Update a video&#39;s relationship details
*MediaVideosApi* | [**updateVideoUsingPUT**](docs/MediaVideosApi.md#updateVideoUsingPUT) | **PUT** /media/videos/{id} | Modifies a video&#39;s details
*MediaVideosApi* | [**viewVideoUsingPOST**](docs/MediaVideosApi.md#viewVideoUsingPOST) | **POST** /media/videos/{id}/views | Increment a video&#39;s view count
*MessagingApi* | [**sendRawEmailUsingPOST**](docs/MessagingApi.md#sendRawEmailUsingPOST) | **POST** /messaging/raw-email | Send a raw email to one or more users
*MessagingApi* | [**sendRawSMSUsingPOST**](docs/MessagingApi.md#sendRawSMSUsingPOST) | **POST** /messaging/raw-sms | Send a raw SMS
*MessagingApi* | [**sendRawSMSUsingPOST1**](docs/MessagingApi.md#sendRawSMSUsingPOST1) | **POST** /messaging/templated-sms | Send a new templated SMS
*MessagingApi* | [**sendTemplateEmailUsingPOST**](docs/MessagingApi.md#sendTemplateEmailUsingPOST) | **POST** /messaging/templated-email | Send a templated email to one or more users
*PaymentsApi* | [**createPaymentMethodUsingPOST**](docs/PaymentsApi.md#createPaymentMethodUsingPOST) | **POST** /users/{user_id}/payment-methods | Create a new payment method for a user
*PaymentsApi* | [**deletePaymentMethodUsingDELETE**](docs/PaymentsApi.md#deletePaymentMethodUsingDELETE) | **DELETE** /users/{user_id}/payment-methods/{id} | Delete an existing payment method for a user
*PaymentsApi* | [**getPaymentMethodUsingGET**](docs/PaymentsApi.md#getPaymentMethodUsingGET) | **GET** /users/{user_id}/payment-methods/{id} | Get a single payment method for a user
*PaymentsApi* | [**getPaymentMethodsUsingGET**](docs/PaymentsApi.md#getPaymentMethodsUsingGET) | **GET** /users/{user_id}/payment-methods | Get all payment methods for a user
*PaymentsApi* | [**paymentAuthorizationUsingPOST**](docs/PaymentsApi.md#paymentAuthorizationUsingPOST) | **POST** /payment/authorizations | Authorize payment of an invoice for later capture
*PaymentsApi* | [**paymentCaptureUsingPOST**](docs/PaymentsApi.md#paymentCaptureUsingPOST) | **POST** /payment/authorizations/{id}/capture | Capture an existing invoice payment authorization
*PaymentsApi* | [**updatePaymentMethodUsingPUT**](docs/PaymentsApi.md#updatePaymentMethodUsingPUT) | **PUT** /users/{user_id}/payment-methods/{id} | Update an existing payment method for a user
*PaymentsAppleApi* | [**verifyReceiptUsingPOST**](docs/PaymentsAppleApi.md#verifyReceiptUsingPOST) | **POST** /payment/provider/apple/receipt | Pay invoice with Apple receipt
*PaymentsGoogleApi* | [**handlePaymentUsingPOST**](docs/PaymentsGoogleApi.md#handlePaymentUsingPOST) | **POST** /payment/provider/google/payments | Mark an invoice paid with Google
*PaymentsOptimalApi* | [**silentPostUsingPOST**](docs/PaymentsOptimalApi.md#silentPostUsingPOST) | **POST** /payment/provider/optimal/silent | Initiate silent post with Optimal
*PaymentsPayPalClassicApi* | [**createBillingAgreementUrlUsingPOST**](docs/PaymentsPayPalClassicApi.md#createBillingAgreementUrlUsingPOST) | **POST** /payment/provider/paypal/classic/agreements/start | Create a PayPal Classic billing agreement for the user
*PaymentsPayPalClassicApi* | [**expressCheckoutUsingPOST**](docs/PaymentsPayPalClassicApi.md#expressCheckoutUsingPOST) | **POST** /payment/provider/paypal/classic/checkout/start | Create a payment token for PayPal express checkout
*PaymentsPayPalClassicApi* | [**finalizeBillingAgreementUsingPOST**](docs/PaymentsPayPalClassicApi.md#finalizeBillingAgreementUsingPOST) | **POST** /payment/provider/paypal/classic/agreements/finish | Finalizes a billing agreement after the user has accepted through PayPal
*PaymentsPayPalClassicApi* | [**finalizeCheckoutUsingPOST**](docs/PaymentsPayPalClassicApi.md#finalizeCheckoutUsingPOST) | **POST** /payment/provider/paypal/classic/checkout/finish | Finalizes a payment after the user has completed checkout with PayPal
*PaymentsStripeApi* | [**createCustomerUsingPOST1**](docs/PaymentsStripeApi.md#createCustomerUsingPOST1) | **POST** /payment/provider/stripe/payment-methods | Create a Stripe payment method for a user
*PaymentsStripeApi* | [**payInvoiceUsingPOST1**](docs/PaymentsStripeApi.md#payInvoiceUsingPOST1) | **POST** /payment/provider/stripe/payments | Pay with a single use token
*PaymentsTransactionsApi* | [**getTransactionUsingGET**](docs/PaymentsTransactionsApi.md#getTransactionUsingGET) | **GET** /transactions/{id} | Get the details for a single transaction
*PaymentsTransactionsApi* | [**getTransactionsUsingGET**](docs/PaymentsTransactionsApi.md#getTransactionsUsingGET) | **GET** /transactions | List and search transactions
*PaymentsTransactionsApi* | [**refundTransactionUsingPOST**](docs/PaymentsTransactionsApi.md#refundTransactionUsingPOST) | **POST** /transactions/{id}/refunds | Refund a payment transaction, in full or in part
*PaymentsWalletsApi* | [**getWalletTotalsUsingGET**](docs/PaymentsWalletsApi.md#getWalletTotalsUsingGET) | **GET** /wallets/totals | Retrieves a summation of wallet balances by currency code
*PaymentsWalletsApi* | [**getWalletUsingGET**](docs/PaymentsWalletsApi.md#getWalletUsingGET) | **GET** /users/{user_id}/wallets/{currency_code} | Returns the user&#39;s wallet for the given currency code
*PaymentsWalletsApi* | [**getWalletsUsingGET**](docs/PaymentsWalletsApi.md#getWalletsUsingGET) | **GET** /users/{user_id}/wallets | List all of a user&#39;s wallets
*PaymentsWalletsApi* | [**getWalletsUsingGET1**](docs/PaymentsWalletsApi.md#getWalletsUsingGET1) | **GET** /wallets | Retrieve a list of wallets across the system
*PaymentsWalletsApi* | [**transactionHistoryUsingGET**](docs/PaymentsWalletsApi.md#transactionHistoryUsingGET) | **GET** /wallets/transactions | Retrieve wallet transactions across the system
*PaymentsWalletsApi* | [**updateBalanceUsingPUT**](docs/PaymentsWalletsApi.md#updateBalanceUsingPUT) | **PUT** /users/{user_id}/wallets/{currency_code}/balance | Updates the balance for a user&#39;s wallet
*PaymentsWalletsApi* | [**userTransactionHistoryUsingGET**](docs/PaymentsWalletsApi.md#userTransactionHistoryUsingGET) | **GET** /users/{user_id}/wallets/{currency_code}/transactions | Retrieve a user&#39;s wallet transactions
*PaymentsXsollaApi* | [**createTokenUrlUsingPOST**](docs/PaymentsXsollaApi.md#createTokenUrlUsingPOST) | **POST** /payment/provider/xsolla/payment | Create a payment token that should be used to forward the user to Xsolla so they can complete payment
*PaymentsXsollaApi* | [**receiveNotificationUsingPOST**](docs/PaymentsXsollaApi.md#receiveNotificationUsingPOST) | **POST** /payment/provider/xsolla/notifications | Receives payment response from Xsolla
*ReportingChallengesApi* | [**getChallengeEventLeaderboardUsingGET**](docs/ReportingChallengesApi.md#getChallengeEventLeaderboardUsingGET) | **GET** /reporting/events/leaderboard | Retrieve a challenge event leaderboard details
*ReportingChallengesApi* | [**getChallengeEventParticipantsUsingGET**](docs/ReportingChallengesApi.md#getChallengeEventParticipantsUsingGET) | **GET** /reporting/events/participants | Retrieve a challenge event participant details
*ReportingOrdersApi* | [**getDailyInvoicesUsingGET**](docs/ReportingOrdersApi.md#getDailyInvoicesUsingGET) | **GET** /reporting/orders/count/{currency_code} | Retrieve invoice counts aggregated by time ranges
*ReportingRevenueApi* | [**executiveRevenueCountrySalesUsingGET**](docs/ReportingRevenueApi.md#executiveRevenueCountrySalesUsingGET) | **GET** /reporting/revenue/countries/{currency_code} | Get revenue info by country
*ReportingRevenueApi* | [**executiveRevenueItemSalesUsingGET**](docs/ReportingRevenueApi.md#executiveRevenueItemSalesUsingGET) | **GET** /reporting/revenue/item-sales/{currency_code} | Get item revenue info
*ReportingRevenueApi* | [**executiveRevenueProductSalesUsingGET**](docs/ReportingRevenueApi.md#executiveRevenueProductSalesUsingGET) | **GET** /reporting/revenue/products/{currency_code} | Get revenue info by item
*ReportingRevenueApi* | [**executiveRevenueRefundsUsingGET**](docs/ReportingRevenueApi.md#executiveRevenueRefundsUsingGET) | **GET** /reporting/revenue/refunds/{currency_code} | Get refund revenue info
*ReportingRevenueApi* | [**executiveRevenueSubscriptionSalesUsingGET**](docs/ReportingRevenueApi.md#executiveRevenueSubscriptionSalesUsingGET) | **GET** /reporting/revenue/subscription-sales/{currency_code} | Get subscription revenue info
*ReportingSubscriptionsApi* | [**listBillingReportsUsingGET**](docs/ReportingSubscriptionsApi.md#listBillingReportsUsingGET) | **GET** /reporting/subscription | Get a list of available subscription reports in most recent first order
*ReportingUsageApi* | [**getUsageByDayUsingGET**](docs/ReportingUsageApi.md#getUsageByDayUsingGET) | **GET** /reporting/usage/day | Returns aggregated endpoint usage information by the day
*ReportingUsageApi* | [**getUsageByHourUsingGET**](docs/ReportingUsageApi.md#getUsageByHourUsingGET) | **GET** /reporting/usage/hour | Returns aggregated endpoint usage information by hour
*ReportingUsageApi* | [**getUsageByMinuteUsingGET**](docs/ReportingUsageApi.md#getUsageByMinuteUsingGET) | **GET** /reporting/usage/minute | Returns aggregated endpoint usage information by minute
*ReportingUsageApi* | [**getUsageByMonthUsingGET**](docs/ReportingUsageApi.md#getUsageByMonthUsingGET) | **GET** /reporting/usage/month | Returns aggregated endpoint usage information by month
*ReportingUsageApi* | [**getUsageByYearUsingGET**](docs/ReportingUsageApi.md#getUsageByYearUsingGET) | **GET** /reporting/usage/year | Returns aggregated endpoint usage information by year
*ReportingUsersApi* | [**executiveRevenueItemSalesUsingGET1**](docs/ReportingUsersApi.md#executiveRevenueItemSalesUsingGET1) | **GET** /reporting/users/registrations | Get user registration info
*SearchApi* | [**externalAddUsingPOST**](docs/SearchApi.md#externalAddUsingPOST) | **POST** /search/index/{type}/{id} | Add a new object to an index
*SearchApi* | [**externalDeleteAllUsingDELETE**](docs/SearchApi.md#externalDeleteAllUsingDELETE) | **DELETE** /search/index/{type} | Delete all objects in an index
*SearchApi* | [**externalDeleteUsingDELETE**](docs/SearchApi.md#externalDeleteUsingDELETE) | **DELETE** /search/index/{type}/{id} | Delete an object
*SearchApi* | [**externalRegisterUsingPOST**](docs/SearchApi.md#externalRegisterUsingPOST) | **POST** /search/mappings | Register reference mappings
*SearchApi* | [**searchUsingPOST**](docs/SearchApi.md#searchUsingPOST) | **POST** /search/index/{type} | Search an index
*StoreApi* | [**createItemTemplateUsingPOST**](docs/StoreApi.md#createItemTemplateUsingPOST) | **POST** /store/items/templates | Create an item template
*StoreApi* | [**createStoreItemExternalUsingPOST**](docs/StoreApi.md#createStoreItemExternalUsingPOST) | **POST** /store/items | Create a store item
*StoreApi* | [**deleteItemTemplateUsingDELETE**](docs/StoreApi.md#deleteItemTemplateUsingDELETE) | **DELETE** /store/items/templates/{id} | Delete an item template
*StoreApi* | [**deleteStoreItemUsingDELETE1**](docs/StoreApi.md#deleteStoreItemUsingDELETE1) | **DELETE** /store/items/{id} | Delete a store item
*StoreApi* | [**getItemTemplateUsingGET**](docs/StoreApi.md#getItemTemplateUsingGET) | **GET** /store/items/templates/{id} | Get a single item template
*StoreApi* | [**getItemTemplatesUsingGET**](docs/StoreApi.md#getItemTemplatesUsingGET) | **GET** /store/items/templates | List and search item templates
*StoreApi* | [**getStoreItemUsingGET1**](docs/StoreApi.md#getStoreItemUsingGET1) | **GET** /store/items/{id} | Get a single store item
*StoreApi* | [**getStoreItemsUsingGET**](docs/StoreApi.md#getStoreItemsUsingGET) | **GET** /store/items | List and search store items
*StoreApi* | [**getUsingGET2**](docs/StoreApi.md#getUsingGET2) | **GET** /store | Get a listing of store items
*StoreApi* | [**updateItemTemplateUsingPUT**](docs/StoreApi.md#updateItemTemplateUsingPUT) | **PUT** /store/items/templates/{id} | Update an item template
*StoreApi* | [**updateStoreItemExternalUsingPUT**](docs/StoreApi.md#updateStoreItemExternalUsingPUT) | **PUT** /store/items/{id} | Update a store item
*StoreBundlesApi* | [**createBundleItemUsingPOST**](docs/StoreBundlesApi.md#createBundleItemUsingPOST) | **POST** /store/bundles | Create a bundle item
*StoreBundlesApi* | [**createBundleTemplateUsingPOST**](docs/StoreBundlesApi.md#createBundleTemplateUsingPOST) | **POST** /store/bundles/templates | Create a bundle template
*StoreBundlesApi* | [**deleteBundleTemplateUsingDELETE**](docs/StoreBundlesApi.md#deleteBundleTemplateUsingDELETE) | **DELETE** /store/bundles/templates/{id} | Delete a bundle template
*StoreBundlesApi* | [**deleteStoreItemUsingDELETE**](docs/StoreBundlesApi.md#deleteStoreItemUsingDELETE) | **DELETE** /store/bundles/{id} | Delete a bundle item
*StoreBundlesApi* | [**getBundleTemplateUsingGET**](docs/StoreBundlesApi.md#getBundleTemplateUsingGET) | **GET** /store/bundles/templates/{id} | Get a single bundle template
*StoreBundlesApi* | [**getBundleTemplatesUsingGET**](docs/StoreBundlesApi.md#getBundleTemplatesUsingGET) | **GET** /store/bundles/templates | List and search bundle templates
*StoreBundlesApi* | [**getStoreItemUsingGET**](docs/StoreBundlesApi.md#getStoreItemUsingGET) | **GET** /store/bundles/{id} | Get a single bundle item
*StoreBundlesApi* | [**updateBundleItemUsingPUT**](docs/StoreBundlesApi.md#updateBundleItemUsingPUT) | **PUT** /store/bundles/{id} | Update a bundle item
*StoreBundlesApi* | [**updateBundleTemplateUsingPUT**](docs/StoreBundlesApi.md#updateBundleTemplateUsingPUT) | **PUT** /store/bundles/templates/{id} | Update a bundle template
*StoreCouponsApi* | [**createCouponItemUsingPOST**](docs/StoreCouponsApi.md#createCouponItemUsingPOST) | **POST** /store/coupons | Create a coupon item
*StoreCouponsApi* | [**createCouponTemplateUsingPOST**](docs/StoreCouponsApi.md#createCouponTemplateUsingPOST) | **POST** /store/coupons/templates | Create a coupon template
*StoreCouponsApi* | [**deleteCouponItemUsingDELETE**](docs/StoreCouponsApi.md#deleteCouponItemUsingDELETE) | **DELETE** /store/coupons/{id} | Delete a coupon item
*StoreCouponsApi* | [**deleteCouponTemplateUsingDELETE**](docs/StoreCouponsApi.md#deleteCouponTemplateUsingDELETE) | **DELETE** /store/coupons/templates/{id} | Delete a coupon template
*StoreCouponsApi* | [**getCouponItemUsingGET**](docs/StoreCouponsApi.md#getCouponItemUsingGET) | **GET** /store/coupons/{id} | Get a single coupon item
*StoreCouponsApi* | [**getCouponTemplateUsingGET**](docs/StoreCouponsApi.md#getCouponTemplateUsingGET) | **GET** /store/coupons/templates/{id} | Get a single coupon template
*StoreCouponsApi* | [**getCouponTemplatesUsingGET**](docs/StoreCouponsApi.md#getCouponTemplatesUsingGET) | **GET** /store/coupons/templates | List and search coupon templates
*StoreCouponsApi* | [**updateCouponItemUsingPUT**](docs/StoreCouponsApi.md#updateCouponItemUsingPUT) | **PUT** /store/coupons/{id} | Update a coupon item
*StoreCouponsApi* | [**updateCouponTemplateUsingPUT**](docs/StoreCouponsApi.md#updateCouponTemplateUsingPUT) | **PUT** /store/coupons/templates/{id} | Update a coupon template
*StoreSalesApi* | [**createCatalogSaleUsingPOST**](docs/StoreSalesApi.md#createCatalogSaleUsingPOST) | **POST** /store/sales | Create a sale
*StoreSalesApi* | [**deleteCatalogSaleUsingDELETE**](docs/StoreSalesApi.md#deleteCatalogSaleUsingDELETE) | **DELETE** /store/sales/{id} | Delete a sale
*StoreSalesApi* | [**getCatalogSaleUsingGET**](docs/StoreSalesApi.md#getCatalogSaleUsingGET) | **GET** /store/sales/{id} | Get a single sale
*StoreSalesApi* | [**getCatalogSalesUsingGET**](docs/StoreSalesApi.md#getCatalogSalesUsingGET) | **GET** /store/sales | List and search sales
*StoreSalesApi* | [**updateCatalogSaleUsingPUT**](docs/StoreSalesApi.md#updateCatalogSaleUsingPUT) | **PUT** /store/sales/{id} | Update a sale
*StoreShippingApi* | [**createShippingItemUsingPOST**](docs/StoreShippingApi.md#createShippingItemUsingPOST) | **POST** /store/shipping | Create a shipping item
*StoreShippingApi* | [**createShippingTemplateUsingPOST**](docs/StoreShippingApi.md#createShippingTemplateUsingPOST) | **POST** /store/shipping/templates | Create a shipping template
*StoreShippingApi* | [**deleteShippingItemUsingDELETE**](docs/StoreShippingApi.md#deleteShippingItemUsingDELETE) | **DELETE** /store/shipping/{id} | Delete a shipping item
*StoreShippingApi* | [**deleteShippingTemplateUsingDELETE**](docs/StoreShippingApi.md#deleteShippingTemplateUsingDELETE) | **DELETE** /store/shipping/templates/{id} | Delete a shipping template
*StoreShippingApi* | [**getShippingItemUsingGET**](docs/StoreShippingApi.md#getShippingItemUsingGET) | **GET** /store/shipping/{id} | Get a single shipping item
*StoreShippingApi* | [**getShippingTemplateUsingGET**](docs/StoreShippingApi.md#getShippingTemplateUsingGET) | **GET** /store/shipping/templates/{id} | Get a single shipping template
*StoreShippingApi* | [**getShippingTemplatesUsingGET**](docs/StoreShippingApi.md#getShippingTemplatesUsingGET) | **GET** /store/shipping/templates | List and search shipping templates
*StoreShippingApi* | [**updateShippingItemUsingPUT**](docs/StoreShippingApi.md#updateShippingItemUsingPUT) | **PUT** /store/shipping/{id} | Update a shipping item
*StoreShippingApi* | [**updateShippingTemplateUsingPUT**](docs/StoreShippingApi.md#updateShippingTemplateUsingPUT) | **PUT** /store/shipping/templates/{id} | Update a shipping template
*StoreShoppingCartsApi* | [**addDiscountUsingPOST**](docs/StoreShoppingCartsApi.md#addDiscountUsingPOST) | **POST** /carts/{id}/discounts | Adds a coupon to the cart
*StoreShoppingCartsApi* | [**addItemUsingPOST**](docs/StoreShoppingCartsApi.md#addItemUsingPOST) | **POST** /carts/{id}/items | Add an item to the cart
*StoreShoppingCartsApi* | [**assignCartUsingPUT**](docs/StoreShoppingCartsApi.md#assignCartUsingPUT) | **PUT** /carts/{id}/owner | Sets the owner of a cart if none is set already
*StoreShoppingCartsApi* | [**checkShippableUsingGET**](docs/StoreShoppingCartsApi.md#checkShippableUsingGET) | **GET** /carts/{id}/shippable | Returns whether a cart requires shipping
*StoreShoppingCartsApi* | [**createCartUsingPOST**](docs/StoreShoppingCartsApi.md#createCartUsingPOST) | **POST** /carts | Creates a new cart from scratch
*StoreShoppingCartsApi* | [**getCartUsingGET**](docs/StoreShoppingCartsApi.md#getCartUsingGET) | **GET** /carts/{id} | Returns the cart with the given GUID
*StoreShoppingCartsApi* | [**getCountriesUsingGET**](docs/StoreShoppingCartsApi.md#getCountriesUsingGET) | **GET** /carts/{id}/countries | Get the list of available shipping countries per vendor
*StoreShoppingCartsApi* | [**modifyShippingAddressUsingPUT**](docs/StoreShoppingCartsApi.md#modifyShippingAddressUsingPUT) | **PUT** /carts/{id}/shipping-address | Modifies or sets the order shipping address
*StoreShoppingCartsApi* | [**removeDiscountUsingDELETE**](docs/StoreShoppingCartsApi.md#removeDiscountUsingDELETE) | **DELETE** /carts/{id}/discounts/{code} | Removes a coupon from the cart
*StoreShoppingCartsApi* | [**searchCartsUsingGET**](docs/StoreShoppingCartsApi.md#searchCartsUsingGET) | **GET** /carts | Get a list of carts
*StoreShoppingCartsApi* | [**setCartCurrencyUsingPUT**](docs/StoreShoppingCartsApi.md#setCartCurrencyUsingPUT) | **PUT** /carts/{id}/currency | Sets the currency to use for the cart
*StoreShoppingCartsApi* | [**updateItemUsingPUT**](docs/StoreShoppingCartsApi.md#updateItemUsingPUT) | **PUT** /carts/{id}/items | Changes the quantity of an item already in the cart
*StoreSubscriptionsApi* | [**createSubscriptionTemplateUsingPOST**](docs/StoreSubscriptionsApi.md#createSubscriptionTemplateUsingPOST) | **POST** /subscriptions/templates | Create a subscription template
*StoreSubscriptionsApi* | [**createSubscriptionUsingPOST**](docs/StoreSubscriptionsApi.md#createSubscriptionUsingPOST) | **POST** /subscriptions | Creates a subscription item and associated plans
*StoreSubscriptionsApi* | [**deletePlanUsingDELETE**](docs/StoreSubscriptionsApi.md#deletePlanUsingDELETE) | **DELETE** /subscriptions/{id}/plans/{plan_id} | Delete a subscription plan
*StoreSubscriptionsApi* | [**deleteSubscriptionTemplateUsingDELETE**](docs/StoreSubscriptionsApi.md#deleteSubscriptionTemplateUsingDELETE) | **DELETE** /subscriptions/templates/{id} | Delete a subscription template
*StoreSubscriptionsApi* | [**getSubscriptionTemplateUsingGET**](docs/StoreSubscriptionsApi.md#getSubscriptionTemplateUsingGET) | **GET** /subscriptions/templates/{id} | Get a single subscription template
*StoreSubscriptionsApi* | [**getSubscriptionTemplatesUsingGET**](docs/StoreSubscriptionsApi.md#getSubscriptionTemplatesUsingGET) | **GET** /subscriptions/templates | List and search subscription templates
*StoreSubscriptionsApi* | [**getSubscriptionUsingGET**](docs/StoreSubscriptionsApi.md#getSubscriptionUsingGET) | **GET** /subscriptions/{id} | Retrieve a single subscription item and associated plans
*StoreSubscriptionsApi* | [**listSubscriptionsUsingGET**](docs/StoreSubscriptionsApi.md#listSubscriptionsUsingGET) | **GET** /subscriptions | List available subscription items and associated plans
*StoreSubscriptionsApi* | [**processUsingPOST**](docs/StoreSubscriptionsApi.md#processUsingPOST) | **POST** /subscriptions/process | Processes subscriptions and charge dues
*StoreSubscriptionsApi* | [**updateSubscriptionTemplateUsingPUT**](docs/StoreSubscriptionsApi.md#updateSubscriptionTemplateUsingPUT) | **PUT** /subscriptions/templates/{id} | Update a subscription template
*StoreSubscriptionsApi* | [**updateSubscriptionUsingPUT**](docs/StoreSubscriptionsApi.md#updateSubscriptionUsingPUT) | **PUT** /subscriptions/{id} | Updates a subscription item and associated plans
*StoreVendorsApi* | [**createVendorUsingPOST**](docs/StoreVendorsApi.md#createVendorUsingPOST) | **POST** /vendors | Create a vendor
*StoreVendorsApi* | [**deleteVendorUsingDELETE**](docs/StoreVendorsApi.md#deleteVendorUsingDELETE) | **DELETE** /vendors/{id} | Delete a vendor
*StoreVendorsApi* | [**getVendorUsingGET**](docs/StoreVendorsApi.md#getVendorUsingGET) | **GET** /vendors/{id} | Get a single vendor
*StoreVendorsApi* | [**getVendorsUsingGET**](docs/StoreVendorsApi.md#getVendorsUsingGET) | **GET** /vendors | List and search vendors
*StoreVendorsApi* | [**updateVendorUsingPUT**](docs/StoreVendorsApi.md#updateVendorUsingPUT) | **PUT** /vendors/{id} | Update a vendor
*TaxesApi* | [**createTaxUsingPOST**](docs/TaxesApi.md#createTaxUsingPOST) | **POST** /tax/countries/{country_code_iso3}/states | Create a tax
*TaxesApi* | [**deleteTaxUsingDELETE**](docs/TaxesApi.md#deleteTaxUsingDELETE) | **DELETE** /tax/countries/{country_code_iso3} | Delete an existing tax
*TaxesApi* | [**deleteTaxUsingDELETE1**](docs/TaxesApi.md#deleteTaxUsingDELETE1) | **DELETE** /tax/countries/{country_code_iso3}/states/{state_code} | Delete an existing tax
*TaxesApi* | [**getAllTaxesUsingGET**](docs/TaxesApi.md#getAllTaxesUsingGET) | **GET** /tax/states | List and search taxes across all countries
*TaxesApi* | [**getTaxUsingGET**](docs/TaxesApi.md#getTaxUsingGET) | **GET** /tax/countries/{country_code_iso3} | Get a single tax
*TaxesApi* | [**getTaxUsingGET1**](docs/TaxesApi.md#getTaxUsingGET1) | **GET** /tax/countries/{country_code_iso3}/states/{state_code} | Get a single tax
*TaxesApi* | [**getTaxesUsingGET**](docs/TaxesApi.md#getTaxesUsingGET) | **GET** /tax/countries | List and search taxes
*TaxesApi* | [**getTaxesUsingGET1**](docs/TaxesApi.md#getTaxesUsingGET1) | **GET** /tax/countries/{country_code_iso3}/states | List and search taxes within a country
*TaxesApi* | [**updateTaxUsingPOST**](docs/TaxesApi.md#updateTaxUsingPOST) | **POST** /tax/countries | Create a tax
*TaxesApi* | [**updateTaxUsingPUT**](docs/TaxesApi.md#updateTaxUsingPUT) | **PUT** /tax/countries/{country_code_iso3} | Create or update a tax
*TaxesApi* | [**updateTaxUsingPUT1**](docs/TaxesApi.md#updateTaxUsingPUT1) | **PUT** /tax/countries/{country_code_iso3}/states/{state_code} | Create or update a tax
*UsersApi* | [**addTagUsingPOST1**](docs/UsersApi.md#addTagUsingPOST1) | **POST** /users/{user_id}/tags | Add a tag to a user
*UsersApi* | [**createUserTemplateUsingPOST**](docs/UsersApi.md#createUserTemplateUsingPOST) | **POST** /users/templates | Create a user template
*UsersApi* | [**deleteUserTemplateUsingDELETE**](docs/UsersApi.md#deleteUserTemplateUsingDELETE) | **DELETE** /users/templates/{id} | Delete a user template
*UsersApi* | [**doPasswordResetUsingPUT**](docs/UsersApi.md#doPasswordResetUsingPUT) | **PUT** /users/{id}/password-reset | Choose a new password after a reset
*UsersApi* | [**getTagsUsingGET3**](docs/UsersApi.md#getTagsUsingGET3) | **GET** /users/{user_id}/tags | List tags for a user
*UsersApi* | [**getUserTemplateUsingGET**](docs/UsersApi.md#getUserTemplateUsingGET) | **GET** /users/templates/{id} | Get a single user template
*UsersApi* | [**getUserTemplatesUsingGET**](docs/UsersApi.md#getUserTemplatesUsingGET) | **GET** /users/templates | List and search user templates
*UsersApi* | [**getUserUsingGET**](docs/UsersApi.md#getUserUsingGET) | **GET** /users/{id} | Get a single user
*UsersApi* | [**getUsersUsingGET**](docs/UsersApi.md#getUsersUsingGET) | **GET** /users | List and search users
*UsersApi* | [**initiatePasswordResetUsingPOST**](docs/UsersApi.md#initiatePasswordResetUsingPOST) | **POST** /users/{id}/password-reset | Reset a user&#39;s password
*UsersApi* | [**registerUserUsingPOST**](docs/UsersApi.md#registerUserUsingPOST) | **POST** /users | Register a new user
*UsersApi* | [**removeTagUsingDELETE1**](docs/UsersApi.md#removeTagUsingDELETE1) | **DELETE** /users/{user_id}/tags/{tag} | Remove a tag from a user
*UsersApi* | [**setPasswordUsingPUT**](docs/UsersApi.md#setPasswordUsingPUT) | **PUT** /users/{id}/password | Set a user&#39;s password
*UsersApi* | [**updateUserTemplateUsingPUT**](docs/UsersApi.md#updateUserTemplateUsingPUT) | **PUT** /users/templates/{id} | Update a user template
*UsersApi* | [**updateUserUsingPUT**](docs/UsersApi.md#updateUserUsingPUT) | **PUT** /users/{id} | Update a user&#39;s info
*UsersAddressesApi* | [**createAddressUsingPOST**](docs/UsersAddressesApi.md#createAddressUsingPOST) | **POST** /users/{user_id}/addresses | Save a new address
*UsersAddressesApi* | [**deleteAddressUsingDELETE**](docs/UsersAddressesApi.md#deleteAddressUsingDELETE) | **DELETE** /users/{user_id}/addresses/{id} | Delete an address
*UsersAddressesApi* | [**getAddressUsingGET**](docs/UsersAddressesApi.md#getAddressUsingGET) | **GET** /users/{user_id}/addresses/{id} | Get a single address
*UsersAddressesApi* | [**getAddressesUsingGET**](docs/UsersAddressesApi.md#getAddressesUsingGET) | **GET** /users/{user_id}/addresses | List and search addresses
*UsersAddressesApi* | [**updateAddressUsingPUT**](docs/UsersAddressesApi.md#updateAddressUsingPUT) | **PUT** /users/{user_id}/addresses/{id} | Update an address
*UsersFriendshipsApi* | [**addFriendUsingPOST**](docs/UsersFriendshipsApi.md#addFriendUsingPOST) | **POST** /users/{user_id}/friends/{id} | Add a friend
*UsersFriendshipsApi* | [**connectUsingTokenUsingPOST**](docs/UsersFriendshipsApi.md#connectUsingTokenUsingPOST) | **POST** /users/{user_id}/friends/tokens | Redeem friendship token
*UsersFriendshipsApi* | [**getFriendsUsingGET**](docs/UsersFriendshipsApi.md#getFriendsUsingGET) | **GET** /users/{user_id}/friends | Get friends list
*UsersFriendshipsApi* | [**getInviteTokenUsingGET**](docs/UsersFriendshipsApi.md#getInviteTokenUsingGET) | **GET** /users/{user_id}/invite-token | Returns the invite token
*UsersFriendshipsApi* | [**getInvitesUsingGET**](docs/UsersFriendshipsApi.md#getInvitesUsingGET) | **GET** /users/{user_id}/invites | Get pending invites
*UsersFriendshipsApi* | [**removeFriendUsingDELETE**](docs/UsersFriendshipsApi.md#removeFriendUsingDELETE) | **DELETE** /users/{user_id}/friends/{id} | Remove or decline a friend
*UsersGroupsApi* | [**addGroupUsingPOST**](docs/UsersGroupsApi.md#addGroupUsingPOST) | **POST** /users/groups | Adds a new group in the system
*UsersGroupsApi* | [**addMemberUsingPOST**](docs/UsersGroupsApi.md#addMemberUsingPOST) | **POST** /users/groups/{unique_name}/members | Adds a new member to the group
*UsersGroupsApi* | [**createGroupTemplateUsingPOST**](docs/UsersGroupsApi.md#createGroupTemplateUsingPOST) | **POST** /users/groups/templates | Create a group template
*UsersGroupsApi* | [**deleteGroupTemplateUsingDELETE**](docs/UsersGroupsApi.md#deleteGroupTemplateUsingDELETE) | **DELETE** /users/groups/templates/{id} | Delete a group template
*UsersGroupsApi* | [**deleteGroupUsingDELETE**](docs/UsersGroupsApi.md#deleteGroupUsingDELETE) | **DELETE** /users/groups/{unique_name}/members/{user_id} | Removes a user from a group
*UsersGroupsApi* | [**deleteGroupUsingDELETE1**](docs/UsersGroupsApi.md#deleteGroupUsingDELETE1) | **DELETE** /users/groups/{unique_name} | Removes a group from the system IF no resources are attached to it
*UsersGroupsApi* | [**getGroupTemplateUsingGET**](docs/UsersGroupsApi.md#getGroupTemplateUsingGET) | **GET** /users/groups/templates/{id} | Get a single group template
*UsersGroupsApi* | [**getGroupTemplatesUsingGET**](docs/UsersGroupsApi.md#getGroupTemplatesUsingGET) | **GET** /users/groups/templates | List and search group templates
*UsersGroupsApi* | [**getGroupUsingGET**](docs/UsersGroupsApi.md#getGroupUsingGET) | **GET** /users/groups/{unique_name} | Loads a specific group&#39;s details
*UsersGroupsApi* | [**searchGroupsUsingGET**](docs/UsersGroupsApi.md#searchGroupsUsingGET) | **GET** /users/groups/{unique_name}/members | Lists members of the group
*UsersGroupsApi* | [**searchGroupsUsingGET1**](docs/UsersGroupsApi.md#searchGroupsUsingGET1) | **GET** /users/groups | List and search groups
*UsersGroupsApi* | [**updateGroupTemplateUsingPUT**](docs/UsersGroupsApi.md#updateGroupTemplateUsingPUT) | **PUT** /users/groups/templates/{id} | Update a group template
*UsersGroupsApi* | [**updateGroupUsingPUT**](docs/UsersGroupsApi.md#updateGroupUsingPUT) | **PUT** /users/groups/{unique_name} | Modifies a group&#39;s details
*UsersGroupsApi* | [**updateMemberStatusUsingPUT**](docs/UsersGroupsApi.md#updateMemberStatusUsingPUT) | **PUT** /users/groups/{unique_name}/members/{user_id}/status | Change a user&#39;s status
*UsersInventoryApi* | [**addItemUsingPOST1**](docs/UsersInventoryApi.md#addItemUsingPOST1) | **POST** /users/{id}/inventory | Adds an item to the user inventory
*UsersInventoryApi* | [**createItemUsingPOST**](docs/UsersInventoryApi.md#createItemUsingPOST) | **POST** /entitlements | Create an entitlement item
*UsersInventoryApi* | [**createTemplateUsingPOST3**](docs/UsersInventoryApi.md#createTemplateUsingPOST3) | **POST** /entitlements/templates | Create an entitlement template
*UsersInventoryApi* | [**deleteEntitlementTemplateUsingDELETE**](docs/UsersInventoryApi.md#deleteEntitlementTemplateUsingDELETE) | **DELETE** /entitlements/templates/{id} | Delete an entitlement template
*UsersInventoryApi* | [**deleteItemUsingDELETE**](docs/UsersInventoryApi.md#deleteItemUsingDELETE) | **DELETE** /entitlements/{entitlement_id} | Delete an entitlement item
*UsersInventoryApi* | [**entitlementCheckUsingGET**](docs/UsersInventoryApi.md#entitlementCheckUsingGET) | **GET** /users/{user_id}/entitlements/{item_id}/check | Check for access to an item without consuming
*UsersInventoryApi* | [**entitlementUseUsingPOST**](docs/UsersInventoryApi.md#entitlementUseUsingPOST) | **POST** /users/{user_id}/entitlements/{item_id}/use | Use an item
*UsersInventoryApi* | [**getCurrenciesUsingGET1**](docs/UsersInventoryApi.md#getCurrenciesUsingGET1) | **GET** /entitlements | List and search entitlement items
*UsersInventoryApi* | [**getEntitlementTemplateUsingGET**](docs/UsersInventoryApi.md#getEntitlementTemplateUsingGET) | **GET** /entitlements/templates/{id} | Get a single entitlement template
*UsersInventoryApi* | [**getEntitlementTemplatesUsingGET**](docs/UsersInventoryApi.md#getEntitlementTemplatesUsingGET) | **GET** /entitlements/templates | List and search entitlement templates
*UsersInventoryApi* | [**getInventoryListUsingGET**](docs/UsersInventoryApi.md#getInventoryListUsingGET) | **GET** /inventories | List the user inventory entries for all users
*UsersInventoryApi* | [**getInventoryUsingGET**](docs/UsersInventoryApi.md#getInventoryUsingGET) | **GET** /users/{user_id}/inventory/{id} | Get an inventory entry
*UsersInventoryApi* | [**getItemUsingGET**](docs/UsersInventoryApi.md#getItemUsingGET) | **GET** /entitlements/{entitlement_id} | Get a single entitlement item
*UsersInventoryApi* | [**getUserInventoryListUsingGET**](docs/UsersInventoryApi.md#getUserInventoryListUsingGET) | **GET** /users/{id}/inventory | List the user inventory entries for a given user
*UsersInventoryApi* | [**getUserInventoryLogUsingGET**](docs/UsersInventoryApi.md#getUserInventoryLogUsingGET) | **GET** /users/{user_id}/inventory/{id}/log | List the log entries for this inventory entry.
*UsersInventoryApi* | [**updateItemUsingPUT1**](docs/UsersInventoryApi.md#updateItemUsingPUT1) | **PUT** /entitlements/{entitlement_id} | Update an entitlement item
*UsersInventoryApi* | [**updateTemplateUsingPUT3**](docs/UsersInventoryApi.md#updateTemplateUsingPUT3) | **PUT** /entitlements/templates/{id} | Update an entitlement template
*UsersInventoryApi* | [**updateUserInventoryBehaviorDataUsingPUT**](docs/UsersInventoryApi.md#updateUserInventoryBehaviorDataUsingPUT) | **PUT** /users/{user_id}/inventory/{id}/behavior-data | Set the behavior data for an inventory entry
*UsersInventoryApi* | [**updateUserInventoryExpiresUsingPUT**](docs/UsersInventoryApi.md#updateUserInventoryExpiresUsingPUT) | **PUT** /users/{user_id}/inventory/{id}/expires | Set the expiration date
*UsersInventoryApi* | [**updateUserInventoryStatusUsingPUT**](docs/UsersInventoryApi.md#updateUserInventoryStatusUsingPUT) | **PUT** /users/{user_id}/inventory/{id}/status | Set the status for an inventory entry
*UsersRelationshipsApi* | [**addRelationshipUsingPOST**](docs/UsersRelationshipsApi.md#addRelationshipUsingPOST) | **POST** /users/relationships | Create a user relationship
*UsersRelationshipsApi* | [**deleteRelationshipUsingDELETE**](docs/UsersRelationshipsApi.md#deleteRelationshipUsingDELETE) | **DELETE** /users/relationships/{id} | Delete a user relationship
*UsersRelationshipsApi* | [**getRelationshipUsingGET**](docs/UsersRelationshipsApi.md#getRelationshipUsingGET) | **GET** /users/relationships/{id} | Get a user relationship
*UsersRelationshipsApi* | [**getRelationshipsUsingGET**](docs/UsersRelationshipsApi.md#getRelationshipsUsingGET) | **GET** /users/relationships | Get a list of user relationships
*UsersRelationshipsApi* | [**updateRelationshipUsingPUT**](docs/UsersRelationshipsApi.md#updateRelationshipUsingPUT) | **PUT** /users/relationships/{id} | Update a user relationship
*UsersSubscriptionsApi* | [**getSubscriptionDetailsUsingGET**](docs/UsersSubscriptionsApi.md#getSubscriptionDetailsUsingGET) | **GET** /users/{user_id}/subscriptions/{inventory_id} | Get details about a user&#39;s subscription
*UsersSubscriptionsApi* | [**getSubscriptionDetailsUsingGET1**](docs/UsersSubscriptionsApi.md#getSubscriptionDetailsUsingGET1) | **GET** /users/{user_id}/subscriptions | Get details about a user&#39;s subscriptions
*UsersSubscriptionsApi* | [**reactivateUsingPOST**](docs/UsersSubscriptionsApi.md#reactivateUsingPOST) | **POST** /users/{user_id}/subscriptions/{inventory_id}/reactivate | Reactivate a subscription and charge fee
*UsersSubscriptionsApi* | [**setBillDateUsingPUT**](docs/UsersSubscriptionsApi.md#setBillDateUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/bill-date | Set a new date to bill a subscription on
*UsersSubscriptionsApi* | [**setPaymentMethodUsingPUT**](docs/UsersSubscriptionsApi.md#setPaymentMethodUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/payment-method | Set the payment method to use for a subscription
*UsersSubscriptionsApi* | [**setStatusUsingPUT**](docs/UsersSubscriptionsApi.md#setStatusUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/status | Set the status of a subscription
*UsersSubscriptionsApi* | [**setUserPlanUsingPUT**](docs/UsersSubscriptionsApi.md#setUserPlanUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/plan | Set a new subscription plan for a user
*UtilBatchApi* | [**getBatchPOSTUsingPOST**](docs/UtilBatchApi.md#getBatchPOSTUsingPOST) | **POST** /batch | Request to run API call given the method, content type, path url, and body of request
*UtilHealthApi* | [**getHealthInfoUsingGET**](docs/UtilHealthApi.md#getHealthInfoUsingGET) | **GET** /health | Get health info
*UtilMaintenanceApi* | [**deleteUsingDELETE1**](docs/UtilMaintenanceApi.md#deleteUsingDELETE1) | **DELETE** /maintenance | Remove maintenance info
*UtilMaintenanceApi* | [**getUsingGET1**](docs/UtilMaintenanceApi.md#getUsingGET1) | **GET** /maintenance | Get current maintenance info
*UtilMaintenanceApi* | [**postUsingPOST**](docs/UtilMaintenanceApi.md#postUsingPOST) | **POST** /maintenance | Set current maintenance info
*UtilMaintenanceApi* | [**postUsingPUT**](docs/UtilMaintenanceApi.md#postUsingPUT) | **PUT** /maintenance | Set current maintenance info
*UtilSecurityApi* | [**getUserLocationLogUsingGET**](docs/UtilSecurityApi.md#getUserLocationLogUsingGET) | **GET** /security/country-log | Returns the authentication log for a user
*UtilSecurityApi* | [**userUsingGET**](docs/UtilSecurityApi.md#userUsingGET) | **GET** /me | Returns the authentication token details. Use /users endpoint for detailed user&#39;s info


## Documentation for Models

 - [AchievementDefinitionResource](docs/AchievementDefinitionResource.md)
 - [AchievementProgressUpdateRequest](docs/AchievementProgressUpdateRequest.md)
 - [ActionResource](docs/ActionResource.md)
 - [ActionVariableResource](docs/ActionVariableResource.md)
 - [ActivityEntitlementResource](docs/ActivityEntitlementResource.md)
 - [ActivityOccurrenceCreationFailure](docs/ActivityOccurrenceCreationFailure.md)
 - [ActivityOccurrenceJoinResult](docs/ActivityOccurrenceJoinResult.md)
 - [ActivityOccurrenceResource](docs/ActivityOccurrenceResource.md)
 - [ActivityOccurrenceResults](docs/ActivityOccurrenceResults.md)
 - [ActivityResource](docs/ActivityResource.md)
 - [ActivityUserResource](docs/ActivityUserResource.md)
 - [AddressResource](docs/AddressResource.md)
 - [Affiliate](docs/Affiliate.md)
 - [AggregateCountResource](docs/AggregateCountResource.md)
 - [AggregateInvoiceReportResource](docs/AggregateInvoiceReportResource.md)
 - [AmazonS3Activity](docs/AmazonS3Activity.md)
 - [AnswerResource](docs/AnswerResource.md)
 - [ApplyPaymentRequest](docs/ApplyPaymentRequest.md)
 - [ArticleResource](docs/ArticleResource.md)
 - [Artist](docs/Artist.md)
 - [ArtistResource](docs/ArtistResource.md)
 - [AvailableSettingResource](docs/AvailableSettingResource.md)
 - [BareActivityResource](docs/BareActivityResource.md)
 - [BareChallengeActivityResource](docs/BareChallengeActivityResource.md)
 - [Batch](docs/Batch.md)
 - [BatchRequest](docs/BatchRequest.md)
 - [BatchReturn](docs/BatchReturn.md)
 - [Behavior](docs/Behavior.md)
 - [BillingReport](docs/BillingReport.md)
 - [BooleanResource](docs/BooleanResource.md)
 - [BreCategoryResource](docs/BreCategoryResource.md)
 - [BreEvent](docs/BreEvent.md)
 - [BreEventLog](docs/BreEventLog.md)
 - [BreGlobalResource](docs/BreGlobalResource.md)
 - [BreGlobalScopeDefinition](docs/BreGlobalScopeDefinition.md)
 - [BreRule](docs/BreRule.md)
 - [BreRuleLog](docs/BreRuleLog.md)
 - [BreTriggerParameterDefinition](docs/BreTriggerParameterDefinition.md)
 - [BreTriggerResource](docs/BreTriggerResource.md)
 - [BundleItem](docs/BundleItem.md)
 - [BundledSku](docs/BundledSku.md)
 - [CampaignResource](docs/CampaignResource.md)
 - [Cart](docs/Cart.md)
 - [CartItemRequest](docs/CartItemRequest.md)
 - [CartLineItem](docs/CartLineItem.md)
 - [CartShippableResponse](docs/CartShippableResponse.md)
 - [CartShippingAddressRequest](docs/CartShippingAddressRequest.md)
 - [CartShippingOption](docs/CartShippingOption.md)
 - [CartSummary](docs/CartSummary.md)
 - [CatalogSale](docs/CatalogSale.md)
 - [CategoryResource](docs/CategoryResource.md)
 - [ChallengeActivityResource](docs/ChallengeActivityResource.md)
 - [ChallengeEventParticipantResource](docs/ChallengeEventParticipantResource.md)
 - [ChallengeEventResource](docs/ChallengeEventResource.md)
 - [ChallengeResource](docs/ChallengeResource.md)
 - [CityResource](docs/CityResource.md)
 - [ClientResource](docs/ClientResource.md)
 - [CollectionCountry](docs/CollectionCountry.md)
 - [CollectionVideoContribution](docs/CollectionVideoContribution.md)
 - [Collectionstring](docs/Collectionstring.md)
 - [CommentResource](docs/CommentResource.md)
 - [CommentSearch](docs/CommentSearch.md)
 - [Config](docs/Config.md)
 - [ContributionResource](docs/ContributionResource.md)
 - [Country](docs/Country.md)
 - [CountryResource](docs/CountryResource.md)
 - [CountryTaxResource](docs/CountryTaxResource.md)
 - [CouponDefinition](docs/CouponDefinition.md)
 - [CouponItem](docs/CouponItem.md)
 - [CreateBillingAgreementRequest](docs/CreateBillingAgreementRequest.md)
 - [CreatePayPalPaymentRequest](docs/CreatePayPalPaymentRequest.md)
 - [Currency](docs/Currency.md)
 - [CurrencyResource](docs/CurrencyResource.md)
 - [CustomerConfig](docs/CustomerConfig.md)
 - [CustomerResource](docs/CustomerResource.md)
 - [DatabaseConfig](docs/DatabaseConfig.md)
 - [DeltaResource](docs/DeltaResource.md)
 - [DeviceResource](docs/DeviceResource.md)
 - [Discount](docs/Discount.md)
 - [DispositionCount](docs/DispositionCount.md)
 - [DispositionResource](docs/DispositionResource.md)
 - [EntitlementItem](docs/EntitlementItem.md)
 - [Expressionobject](docs/Expressionobject.md)
 - [FinalizeBillingAgreementRequest](docs/FinalizeBillingAgreementRequest.md)
 - [FinalizePayPalPaymentRequest](docs/FinalizePayPalPaymentRequest.md)
 - [FlagReportResource](docs/FlagReportResource.md)
 - [FlagResource](docs/FlagResource.md)
 - [ForwardLog](docs/ForwardLog.md)
 - [FulfillmentType](docs/FulfillmentType.md)
 - [GooglePaymentRequest](docs/GooglePaymentRequest.md)
 - [GrantTypeResource](docs/GrantTypeResource.md)
 - [Group](docs/Group.md)
 - [GroupMember](docs/GroupMember.md)
 - [GroupMemberResource](docs/GroupMemberResource.md)
 - [GroupResource](docs/GroupResource.md)
 - [ImportJobOutputResource](docs/ImportJobOutputResource.md)
 - [ImportJobResource](docs/ImportJobResource.md)
 - [InventorySubscriptionResource](docs/InventorySubscriptionResource.md)
 - [InvoiceCreateRequest](docs/InvoiceCreateRequest.md)
 - [InvoiceItemResource](docs/InvoiceItemResource.md)
 - [InvoiceLogEntry](docs/InvoiceLogEntry.md)
 - [InvoicePaymentStatusRequest](docs/InvoicePaymentStatusRequest.md)
 - [InvoiceResource](docs/InvoiceResource.md)
 - [ItemBehaviorDefinitionResource](docs/ItemBehaviorDefinitionResource.md)
 - [ItemTemplateResource](docs/ItemTemplateResource.md)
 - [KeyValuePairstringstring](docs/KeyValuePairstringstring.md)
 - [Language](docs/Language.md)
 - [LeaderboardEntryResource](docs/LeaderboardEntryResource.md)
 - [LeaderboardResource](docs/LeaderboardResource.md)
 - [LevelingResource](docs/LevelingResource.md)
 - [Localizer](docs/Localizer.md)
 - [LocationLogResource](docs/LocationLogResource.md)
 - [LookupTypeResource](docs/LookupTypeResource.md)
 - [Maintenance](docs/Maintenance.md)
 - [Mapstringobject](docs/Mapstringobject.md)
 - [MetricResource](docs/MetricResource.md)
 - [MongoDatabaseConfig](docs/MongoDatabaseConfig.md)
 - [NestedCategory](docs/NestedCategory.md)
 - [NewPasswordRequest](docs/NewPasswordRequest.md)
 - [OauthAccessTokenResource](docs/OauthAccessTokenResource.md)
 - [Operator](docs/Operator.md)
 - [OptimalPaymentRequest](docs/OptimalPaymentRequest.md)
 - [Order](docs/Order.md)
 - [PageResourceAchievementDefinitionResource](docs/PageResourceAchievementDefinitionResource.md)
 - [PageResourceAggregateCountResource](docs/PageResourceAggregateCountResource.md)
 - [PageResourceAggregateInvoiceReportResource](docs/PageResourceAggregateInvoiceReportResource.md)
 - [PageResourceArticleResource](docs/PageResourceArticleResource.md)
 - [PageResourceArtistResource](docs/PageResourceArtistResource.md)
 - [PageResourceBareActivityResource](docs/PageResourceBareActivityResource.md)
 - [PageResourceBareChallengeActivityResource](docs/PageResourceBareChallengeActivityResource.md)
 - [PageResourceBillingReport](docs/PageResourceBillingReport.md)
 - [PageResourceBreCategoryResource](docs/PageResourceBreCategoryResource.md)
 - [PageResourceBreEventLog](docs/PageResourceBreEventLog.md)
 - [PageResourceBreGlobalResource](docs/PageResourceBreGlobalResource.md)
 - [PageResourceBreRule](docs/PageResourceBreRule.md)
 - [PageResourceBreTriggerResource](docs/PageResourceBreTriggerResource.md)
 - [PageResourceCampaignResource](docs/PageResourceCampaignResource.md)
 - [PageResourceCartSummary](docs/PageResourceCartSummary.md)
 - [PageResourceCatalogSale](docs/PageResourceCatalogSale.md)
 - [PageResourceCategoryResource](docs/PageResourceCategoryResource.md)
 - [PageResourceChallengeEventParticipantResource](docs/PageResourceChallengeEventParticipantResource.md)
 - [PageResourceChallengeEventResource](docs/PageResourceChallengeEventResource.md)
 - [PageResourceChallengeResource](docs/PageResourceChallengeResource.md)
 - [PageResourceClientResource](docs/PageResourceClientResource.md)
 - [PageResourceCommentResource](docs/PageResourceCommentResource.md)
 - [PageResourceConfig](docs/PageResourceConfig.md)
 - [PageResourceCountryTaxResource](docs/PageResourceCountryTaxResource.md)
 - [PageResourceCurrencyResource](docs/PageResourceCurrencyResource.md)
 - [PageResourceDeviceResource](docs/PageResourceDeviceResource.md)
 - [PageResourceDispositionResource](docs/PageResourceDispositionResource.md)
 - [PageResourceEntitlementItem](docs/PageResourceEntitlementItem.md)
 - [PageResourceFlagReportResource](docs/PageResourceFlagReportResource.md)
 - [PageResourceForwardLog](docs/PageResourceForwardLog.md)
 - [PageResourceFulfillmentType](docs/PageResourceFulfillmentType.md)
 - [PageResourceGroupMemberResource](docs/PageResourceGroupMemberResource.md)
 - [PageResourceGroupResource](docs/PageResourceGroupResource.md)
 - [PageResourceImportJobResource](docs/PageResourceImportJobResource.md)
 - [PageResourceInvoiceLogEntry](docs/PageResourceInvoiceLogEntry.md)
 - [PageResourceInvoiceResource](docs/PageResourceInvoiceResource.md)
 - [PageResourceItemTemplateResource](docs/PageResourceItemTemplateResource.md)
 - [PageResourceLevelingResource](docs/PageResourceLevelingResource.md)
 - [PageResourceLocationLogResource](docs/PageResourceLocationLogResource.md)
 - [PageResourceMapstringobject](docs/PageResourceMapstringobject.md)
 - [PageResourceOauthAccessTokenResource](docs/PageResourceOauthAccessTokenResource.md)
 - [PageResourcePermissionResource](docs/PageResourcePermissionResource.md)
 - [PageResourcePollResource](docs/PageResourcePollResource.md)
 - [PageResourceQuestionResource](docs/PageResourceQuestionResource.md)
 - [PageResourceQuestionTemplateResource](docs/PageResourceQuestionTemplateResource.md)
 - [PageResourceRevenueCountryReportResource](docs/PageResourceRevenueCountryReportResource.md)
 - [PageResourceRevenueProductReportResource](docs/PageResourceRevenueProductReportResource.md)
 - [PageResourceRewardSetResource](docs/PageResourceRewardSetResource.md)
 - [PageResourceRoleResource](docs/PageResourceRoleResource.md)
 - [PageResourceSavedAddressResource](docs/PageResourceSavedAddressResource.md)
 - [PageResourceSimpleUserResource](docs/PageResourceSimpleUserResource.md)
 - [PageResourceSimpleWallet](docs/PageResourceSimpleWallet.md)
 - [PageResourceStateTaxResource](docs/PageResourceStateTaxResource.md)
 - [PageResourceStoreItem](docs/PageResourceStoreItem.md)
 - [PageResourceStoreItemTemplateResource](docs/PageResourceStoreItemTemplateResource.md)
 - [PageResourceSubscriptionResource](docs/PageResourceSubscriptionResource.md)
 - [PageResourceSubscriptionTemplateResource](docs/PageResourceSubscriptionTemplateResource.md)
 - [PageResourceTemplateResource](docs/PageResourceTemplateResource.md)
 - [PageResourceTransactionResource](docs/PageResourceTransactionResource.md)
 - [PageResourceUsageInfo](docs/PageResourceUsageInfo.md)
 - [PageResourceUserAchievementGroupResource](docs/PageResourceUserAchievementGroupResource.md)
 - [PageResourceUserActionLog](docs/PageResourceUserActionLog.md)
 - [PageResourceUserBaseResource](docs/PageResourceUserBaseResource.md)
 - [PageResourceUserInventoryResource](docs/PageResourceUserInventoryResource.md)
 - [PageResourceUserItemLogResource](docs/PageResourceUserItemLogResource.md)
 - [PageResourceUserLevelingResource](docs/PageResourceUserLevelingResource.md)
 - [PageResourceUserRelationshipResource](docs/PageResourceUserRelationshipResource.md)
 - [PageResourceVendorResource](docs/PageResourceVendorResource.md)
 - [PageResourceVideoRelationshipResource](docs/PageResourceVideoRelationshipResource.md)
 - [PageResourceVideoResource](docs/PageResourceVideoResource.md)
 - [PageResourceWalletTotalResponse](docs/PageResourceWalletTotalResponse.md)
 - [PageResourceWalletTransactionResource](docs/PageResourceWalletTransactionResource.md)
 - [PageResourcestring](docs/PageResourcestring.md)
 - [PayBySavedMethodRequest](docs/PayBySavedMethodRequest.md)
 - [PaymentAuthorizationResource](docs/PaymentAuthorizationResource.md)
 - [PaymentMethodResource](docs/PaymentMethodResource.md)
 - [PaymentMethodTypeResource](docs/PaymentMethodTypeResource.md)
 - [Permission](docs/Permission.md)
 - [PermissionResource](docs/PermissionResource.md)
 - [PollAnswerResource](docs/PollAnswerResource.md)
 - [PollResource](docs/PollResource.md)
 - [PollResponseResource](docs/PollResponseResource.md)
 - [PredicateOperation](docs/PredicateOperation.md)
 - [Property](docs/Property.md)
 - [PropertyDefinitionResource](docs/PropertyDefinitionResource.md)
 - [QuestionResource](docs/QuestionResource.md)
 - [QuestionTemplateResource](docs/QuestionTemplateResource.md)
 - [RawEmailResource](docs/RawEmailResource.md)
 - [RawSMSResource](docs/RawSMSResource.md)
 - [ReactivateSubscriptionRequest](docs/ReactivateSubscriptionRequest.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RefundResource](docs/RefundResource.md)
 - [Result](docs/Result.md)
 - [RevenueCountryReportResource](docs/RevenueCountryReportResource.md)
 - [RevenueProductReportResource](docs/RevenueProductReportResource.md)
 - [RevenueReportResource](docs/RevenueReportResource.md)
 - [RewardCurrencyResource](docs/RewardCurrencyResource.md)
 - [RewardItemResource](docs/RewardItemResource.md)
 - [RewardSetResource](docs/RewardSetResource.md)
 - [Role](docs/Role.md)
 - [RoleResource](docs/RoleResource.md)
 - [SampleCountriesResponse](docs/SampleCountriesResponse.md)
 - [SavedAddressResource](docs/SavedAddressResource.md)
 - [Schedule](docs/Schedule.md)
 - [SearchReferenceMapping](docs/SearchReferenceMapping.md)
 - [SelectedSettingResource](docs/SelectedSettingResource.md)
 - [SettingOption](docs/SettingOption.md)
 - [ShippingItem](docs/ShippingItem.md)
 - [SimpleReferenceResourceint](docs/SimpleReferenceResourceint.md)
 - [SimpleReferenceResourcelong](docs/SimpleReferenceResourcelong.md)
 - [SimpleReferenceResourcestring](docs/SimpleReferenceResourcestring.md)
 - [SimpleUserResource](docs/SimpleUserResource.md)
 - [SimpleWallet](docs/SimpleWallet.md)
 - [Sku](docs/Sku.md)
 - [SkuRequest](docs/SkuRequest.md)
 - [SqlDatabaseConfig](docs/SqlDatabaseConfig.md)
 - [StateResource](docs/StateResource.md)
 - [StateTaxResource](docs/StateTaxResource.md)
 - [StoreItem](docs/StoreItem.md)
 - [StoreItemTemplateResource](docs/StoreItemTemplateResource.md)
 - [StripeCreatePaymentMethod](docs/StripeCreatePaymentMethod.md)
 - [StripePaymentRequest](docs/StripePaymentRequest.md)
 - [SubscriptionCreditResource](docs/SubscriptionCreditResource.md)
 - [SubscriptionPlanResource](docs/SubscriptionPlanResource.md)
 - [SubscriptionResource](docs/SubscriptionResource.md)
 - [SubscriptionTemplateResource](docs/SubscriptionTemplateResource.md)
 - [TemplateEmailResource](docs/TemplateEmailResource.md)
 - [TemplateResource](docs/TemplateResource.md)
 - [TemplateSMSResource](docs/TemplateSMSResource.md)
 - [TierResource](docs/TierResource.md)
 - [Timezone](docs/Timezone.md)
 - [TokenDetailsResource](docs/TokenDetailsResource.md)
 - [TransactionResource](docs/TransactionResource.md)
 - [UsageInfo](docs/UsageInfo.md)
 - [User](docs/User.md)
 - [UserAchievementGroupResource](docs/UserAchievementGroupResource.md)
 - [UserAchievementResource](docs/UserAchievementResource.md)
 - [UserActionLog](docs/UserActionLog.md)
 - [UserActivityResultsResource](docs/UserActivityResultsResource.md)
 - [UserBaseResource](docs/UserBaseResource.md)
 - [UserInventoryAddRequest](docs/UserInventoryAddRequest.md)
 - [UserInventoryResource](docs/UserInventoryResource.md)
 - [UserItemLogResource](docs/UserItemLogResource.md)
 - [UserLevelingResource](docs/UserLevelingResource.md)
 - [UserRelationship](docs/UserRelationship.md)
 - [UserRelationshipReferenceResource](docs/UserRelationshipReferenceResource.md)
 - [UserRelationshipResource](docs/UserRelationshipResource.md)
 - [UserResource](docs/UserResource.md)
 - [UserTag](docs/UserTag.md)
 - [VariableTypeResource](docs/VariableTypeResource.md)
 - [VendorResource](docs/VendorResource.md)
 - [Video](docs/Video.md)
 - [VideoContribution](docs/VideoContribution.md)
 - [VideoRelationshipResource](docs/VideoRelationshipResource.md)
 - [VideoResource](docs/VideoResource.md)
 - [VideoTag](docs/VideoTag.md)
 - [WalletAlterRequest](docs/WalletAlterRequest.md)
 - [WalletTotalResponse](docs/WalletTotalResponse.md)
 - [WalletTransactionResource](docs/WalletTransactionResource.md)
 - [XsollaPaymentRequest](docs/XsollaPaymentRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### knetik_oauth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: /oauth/token
- **Scopes**: 
  - read: read allowed
  - write: write allowed


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@knetik.com

