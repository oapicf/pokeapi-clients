# Org.OpenAPITools.Model.TypeDetail
Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** |  | [readonly] 
**Name** | **string** |  | 
**DamageRelations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**PastDamageRelations** | [**List&lt;TypeDetailPastDamageRelationsInner&gt;**](TypeDetailPastDamageRelationsInner.md) |  | [readonly] 
**GameIndices** | [**List&lt;TypeGameIndex&gt;**](TypeGameIndex.md) |  | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**Names** | [**List&lt;AbilityName&gt;**](AbilityName.md) |  | [readonly] 
**Pokemon** | [**List&lt;TypeDetailPokemonInner&gt;**](TypeDetailPokemonInner.md) |  | [readonly] 
**Moves** | [**List&lt;MoveSummary&gt;**](MoveSummary.md) |  | [readonly] 
**Sprites** | **Dictionary&lt;string, Dictionary&lt;string, TypeDetailSpritesValueValue&gt;&gt;** |  | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

