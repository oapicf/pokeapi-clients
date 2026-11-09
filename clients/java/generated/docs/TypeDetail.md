

# TypeDetail

Serializer for the Type resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The identifier for this resource. |  [readonly] |
|**name** | **String** | The name for this resource. |  |
|**damageRelations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. |  [readonly] |
|**pastDamageRelations** | [**List&lt;TypePastRelationships&gt;**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations |  [readonly] |
|**gameIndices** | [**List&lt;TypeGameIndex&gt;**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. |  [readonly] |
|**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. |  |
|**moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. |  |
|**names** | [**List&lt;TypeName&gt;**](TypeName.md) | The name of this resource listed in different languages. |  [readonly] |
|**pokemon** | [**List&lt;TypePokemon&gt;**](TypePokemon.md) | A list of details of Pokémon that have this type. |  [readonly] |
|**moves** | [**List&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have this type. |  [readonly] |
|**sprites** | **Map&lt;String, Map&lt;String, TypeGameSprite&gt;&gt;** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. |  [readonly] |



