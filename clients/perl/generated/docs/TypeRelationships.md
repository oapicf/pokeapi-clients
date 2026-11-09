# WWW::OpenAPIClient::Object::TypeRelationships

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TypeRelationships;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**no_damage_to** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types this type has no effect on. | 
**half_damage_to** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types this type is not very effect against. | 
**double_damage_to** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types this type is very effect against. | 
**no_damage_from** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types that have no effect on this type. | 
**half_damage_from** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types that are not very effective against this type. | 
**double_damage_from** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types that are very effective against this type. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


