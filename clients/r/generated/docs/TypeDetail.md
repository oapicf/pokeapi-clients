# openapi::TypeDetail

Serializer for the Type resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**damage_relations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**past_damage_relations** | [**array[TypePastRelationships]**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**game_indices** | [**array[TypeGameIndex]**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [**array[TypeName]**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**array[TypePokemon]**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**array[MoveSummary]**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**sprites** | [**map(map(TypeGameSprite))**](map.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 


