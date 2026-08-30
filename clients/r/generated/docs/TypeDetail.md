# openapi::TypeDetail

Serializer for the Type resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**damage_relations** | [**TypeDetailDamageRelations**](TypeDetail_damage_relations.md) |  | 
**past_damage_relations** | [**array[TypeDetailPastDamageRelationsInner]**](TypeDetail_past_damage_relations_inner.md) |  | [readonly] 
**game_indices** | [**array[TypeGameIndex]**](TypeGameIndex.md) |  | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**array[AbilityName]**](AbilityName.md) |  | [readonly] 
**pokemon** | [**array[TypeDetailPokemonInner]**](TypeDetail_pokemon_inner.md) |  | [readonly] 
**moves** | [**array[MoveSummary]**](MoveSummary.md) |  | [readonly] 
**sprites** | [**map(map(TypeDetailSpritesValueValue))**](map.md) |  | [readonly] 


