# AbilityDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**isMainSeries** | **Boolean!** | Whether or not this ability originated in the main series of the video games. | [optional] [default to null]
**generation** | [***GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | [default to null]
**names** | [**AbilityName**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**effectEntries** | [**AbilityEffectText**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to null]
**effectChanges** | [**AbilityChange**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] [default to null]
**flavorTextEntries** | [**AbilityFlavorText**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to null]
**pokemon** | [**AbilityPokemonDetail**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


