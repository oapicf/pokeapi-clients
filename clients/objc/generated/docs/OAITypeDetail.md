# OAITypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**damageRelations** | [**OAITypeRelationships***](OAITypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**pastDamageRelations** | [**NSArray&lt;OAITypePastRelationships&gt;***](OAITypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**gameIndices** | [**NSArray&lt;OAITypeGameIndex&gt;***](OAITypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**OAIGenerationSummary***](OAIGenerationSummary.md) | The generation this type was introduced in. | 
**moveDamageClass** | [**OAIMoveDamageClassSummary***](OAIMoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [**NSArray&lt;OAITypeName&gt;***](OAITypeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**NSArray&lt;OAITypePokemon&gt;***](OAITypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**NSArray&lt;OAIMoveSummary&gt;***](OAIMoveSummary.md) | A list of moves that have this type. | [readonly] 
**sprites** | [**NSDictionary&lt;NSString*, NSDictionary&lt;OAITypeGameSprite&gt;*&gt;***](NSDictionary.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


