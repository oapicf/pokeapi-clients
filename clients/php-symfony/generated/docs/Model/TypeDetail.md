# TypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**damageRelations** | [**OpenAPI\Server\Model\TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**pastDamageRelations** | [**OpenAPI\Server\Model\TypePastRelationships**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**gameIndices** | [**OpenAPI\Server\Model\TypeGameIndex**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**OpenAPI\Server\Model\GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**moveDamageClass** | [**OpenAPI\Server\Model\MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [**OpenAPI\Server\Model\TypeName**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**OpenAPI\Server\Model\TypePokemon**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**OpenAPI\Server\Model\MoveSummary**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**sprites** | **OpenAPI\Server\Model\TypeGameSprite** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


