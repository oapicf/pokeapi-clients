# WWW::OpenAPIClient::Object::TypeDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TypeDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **string** |  | 
**damage_relations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**past_damage_relations** | [**ARRAY[TypeDetailPastDamageRelationsInner]**](TypeDetailPastDamageRelationsInner.md) |  | 
**game_indices** | [**ARRAY[TypeGameIndex]**](TypeGameIndex.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**ARRAY[AbilityName]**](AbilityName.md) |  | 
**pokemon** | [**ARRAY[TypeDetailPokemonInner]**](TypeDetailPokemonInner.md) |  | 
**moves** | [**ARRAY[MoveSummary]**](MoveSummary.md) |  | 
**sprites** | **HASH[string,HASH[string,TypeDetailSpritesValueValue]]** |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


