# AbilityDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**isMainSeries** | **bool** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**OpenAPI\Server\Model\GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [**OpenAPI\Server\Model\AbilityName**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effectEntries** | [**OpenAPI\Server\Model\AbilityEffectText**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effectChanges** | [**OpenAPI\Server\Model\AbilityChange**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavorTextEntries** | [**OpenAPI\Server\Model\AbilityFlavorText**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**OpenAPI\Server\Model\AbilityPokemonDetail**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


