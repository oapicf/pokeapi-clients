# TypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**damage_relations** | [***models::TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**past_damage_relations** | [**Vec<models::TypePastRelationships>**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**game_indices** | [**Vec<models::TypeGameIndex>**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [***models::GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**move_damage_class** | [***models::MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [**Vec<models::TypeName>**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**Vec<models::TypePokemon>**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**Vec<models::MoveSummary>**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**sprites** | [**std::collections::HashMap<String, std::collections::HashMap<String, models::TypeGameSprite>>**](map.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


