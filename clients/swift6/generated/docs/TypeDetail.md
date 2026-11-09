# TypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**damageRelations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**pastDamageRelations** | [TypePastRelationships] | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**gameIndices** | [TypeGameIndex] | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [TypeName] | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [TypePokemon] | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [MoveSummary] | A list of moves that have this type. | [readonly] 
**sprites** | [String: [String: TypeGameSprite]] | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


