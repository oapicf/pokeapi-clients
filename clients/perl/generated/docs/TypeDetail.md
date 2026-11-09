# WWW::OpenAPIClient::Object::TypeDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TypeDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**damage_relations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**past_damage_relations** | [**ARRAY[TypePastRelationships]**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**game_indices** | [**ARRAY[TypeGameIndex]**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [**ARRAY[TypeName]**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**ARRAY[TypePokemon]**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**ARRAY[MoveSummary]**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**sprites** | **HASH[string,HASH[string,TypeGameSprite]]** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


