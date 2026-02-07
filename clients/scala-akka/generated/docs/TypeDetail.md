

# TypeDetail

Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** |  |  [readonly]
**name** | **String** |  | 
**damageRelations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**pastDamageRelations** | [**Seq&lt;TypeDetailPastDamageRelationsInner&gt;**](TypeDetailPastDamageRelationsInner.md) |  | 
**gameIndices** | [**Seq&lt;TypeGameIndex&gt;**](TypeGameIndex.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**Seq&lt;AbilityName&gt;**](AbilityName.md) |  | 
**pokemon** | [**Seq&lt;TypeDetailPokemonInner&gt;**](TypeDetailPokemonInner.md) |  | 
**moves** | [**Seq&lt;MoveSummary&gt;**](MoveSummary.md) |  | 
**sprites** | **Map&lt;String, Map[String, TypeDetailSpritesValueValue]&gt;** |  |  [readonly]



