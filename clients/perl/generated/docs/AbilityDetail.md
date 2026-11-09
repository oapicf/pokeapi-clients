# WWW::OpenAPIClient::Object::AbilityDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AbilityDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**is_main_series** | **boolean** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [**ARRAY[AbilityName]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effect_entries** | [**ARRAY[AbilityEffectText]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effect_changes** | [**ARRAY[AbilityChange]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavor_text_entries** | [**ARRAY[AbilityFlavorText]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**ARRAY[AbilityPokemonDetail]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


