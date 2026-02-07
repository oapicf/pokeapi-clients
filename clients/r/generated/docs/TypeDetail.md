# openapi::TypeDetail

Serializer for the Type resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**damage_relations** | [**TypeDetailDamageRelations**](TypeDetail_damage_relations.md) |  | 
**past_damage_relations** | [**array[TypeDetailPastDamageRelationsInner]**](TypeDetail_past_damage_relations_inner.md) |  | 
**game_indices** | [**array[TypeGameIndex]**](TypeGameIndex.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**array[AbilityName]**](AbilityName.md) |  | 
**pokemon** | [**array[TypeDetailPokemonInner]**](TypeDetail_pokemon_inner.md) |  | 
**moves** | [**array[MoveSummary]**](MoveSummary.md) |  | 
**sprites** | [**map(map(TypeDetailSpritesValueValue))**](map.md) |  | [readonly] 


