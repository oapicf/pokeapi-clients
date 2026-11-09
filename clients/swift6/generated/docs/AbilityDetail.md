# AbilityDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**isMainSeries** | **Bool** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [AbilityName] | The name of this resource listed in different languages. | [readonly] 
**effectEntries** | [AbilityEffectText] | The effect of this ability listed in different languages. | [readonly] 
**effectChanges** | [AbilityChange] | The list of previous effects this ability has had across version groups. | [readonly] 
**flavorTextEntries** | [AbilityFlavorText] | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [AbilityPokemonDetail] | A list of Pokémon that could potentially have this ability. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


