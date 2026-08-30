# WWW::OpenAPIClient::Object::AbilityDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AbilityDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **string** |  | 
**is_main_series** | **boolean** |  | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**ARRAY[AbilityName]**](AbilityName.md) |  | [readonly] 
**effect_entries** | [**ARRAY[AbilityEffectText]**](AbilityEffectText.md) |  | [readonly] 
**effect_changes** | [**ARRAY[AbilityChange]**](AbilityChange.md) |  | [readonly] 
**flavor_text_entries** | [**ARRAY[AbilityFlavorText]**](AbilityFlavorText.md) |  | [readonly] 
**pokemon** | [**ARRAY[AbilityDetailPokemonInner]**](AbilityDetailPokemonInner.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


