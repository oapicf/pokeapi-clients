# TypeDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **damage\_relations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [default to null] |
| **past\_damage\_relations** | [**List**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [default to null] |
| **game\_indices** | [**List**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [default to null] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | [default to null] |
| **move\_damage\_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | [default to null] |
| **names** | [**List**](TypeName.md) | The name of this resource listed in different languages. | [default to null] |
| **pokemon** | [**List**](TypePokemon.md) | A list of details of Pokémon that have this type. | [default to null] |
| **moves** | [**List**](MoveSummary.md) | A list of moves that have this type. | [default to null] |
| **sprites** | [**Map**](map.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

