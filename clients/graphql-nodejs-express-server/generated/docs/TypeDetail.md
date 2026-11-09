# TypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**damageRelations** | [***TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] [default to null]
**pastDamageRelations** | [**TypePastRelationships**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] [default to null]
**gameIndices** | [**TypeGameIndex**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to null]
**generation** | [***GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | [default to null]
**moveDamageClass** | [***MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | [default to null]
**names** | [**TypeName**](TypeName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokemon** | [**TypePokemon**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] [default to null]
**moves** | [**MoveSummary**](MoveSummary.md) | A list of moves that have this type. | [readonly] [default to null]
**sprites** | [**TypeGameSprite**](map.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


