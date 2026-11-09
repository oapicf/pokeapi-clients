
# TypeDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The identifier for this resource. |  [readonly] |
| **name** | **kotlin.String** | The name for this resource. |  |
| **damageRelations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. |  [readonly] |
| **pastDamageRelations** | [**kotlin.collections.List&lt;TypePastRelationships&gt;**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations |  [readonly] |
| **gameIndices** | [**kotlin.collections.List&lt;TypeGameIndex&gt;**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. |  [readonly] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. |  |
| **moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. |  |
| **names** | [**kotlin.collections.List&lt;TypeName&gt;**](TypeName.md) | The name of this resource listed in different languages. |  [readonly] |
| **pokemon** | [**kotlin.collections.List&lt;TypePokemon&gt;**](TypePokemon.md) | A list of details of Pokémon that have this type. |  [readonly] |
| **moves** | [**kotlin.collections.List&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have this type. |  [readonly] |
| **sprites** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, TypeGameSprite&gt;&gt;** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. |  [readonly] |



