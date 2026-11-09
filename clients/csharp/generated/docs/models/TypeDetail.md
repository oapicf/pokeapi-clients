# Org.OpenAPITools.Model.TypeDetail
Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**DamageRelations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**PastDamageRelations** | [**List&lt;TypePastRelationships&gt;**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**GameIndices** | [**List&lt;TypeGameIndex&gt;**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**Names** | [**List&lt;TypeName&gt;**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**Pokemon** | [**List&lt;TypePokemon&gt;**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**Moves** | [**List&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**Sprites** | **Dictionary&lt;string, Dictionary&lt;string, TypeGameSprite&gt;&gt;** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

