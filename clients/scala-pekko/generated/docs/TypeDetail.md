

# TypeDetail

Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** |  |  [readonly]
**name** | **String** |  | 
**damageRelations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**pastDamageRelations** | [**Seq&lt;TypeDetailPastDamageRelationsInner&gt;**](TypeDetailPastDamageRelationsInner.md) |  |  [readonly]
**gameIndices** | [**Seq&lt;TypeGameIndex&gt;**](TypeGameIndex.md) |  |  [readonly]
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**Seq&lt;AbilityName&gt;**](AbilityName.md) |  |  [readonly]
**pokemon** | [**Seq&lt;TypeDetailPokemonInner&gt;**](TypeDetailPokemonInner.md) |  |  [readonly]
**moves** | [**Seq&lt;MoveSummary&gt;**](MoveSummary.md) |  |  [readonly]
**sprites** | **Map&lt;String, Map[String, TypeDetailSpritesValueValue]&gt;** |  |  [readonly]



