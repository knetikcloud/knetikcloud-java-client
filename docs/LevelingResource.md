
# LevelingResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) | A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type |  [optional]
**createdDate** | **Long** | The date the leveling schema was created |  [optional]
**description** | **String** | The description of the leveling schema |  [optional]
**name** | **String** | The name of the leveling schema.  IMMUTABLE | 
**template** | **String** | The template being used |  [optional]
**tiers** | [**List&lt;TierResource&gt;**](TierResource.md) | A set of tiers that contain experience boundaries |  [optional]
**triggerEventName** | **String** | The name of an event that will add one progress to this level when fired |  [optional]
**updatedDate** | **Long** | The date the leveling schema was updated |  [optional]



