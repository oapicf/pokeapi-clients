# AbilityDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **is\_main\_series** | **Boolean** | Whether or not this ability originated in the main series of the video games. | [optional] [default to null] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | [default to null] |
| **names** | [**List**](AbilityName.md) | The name of this resource listed in different languages. | [default to null] |
| **effect\_entries** | [**List**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [default to null] |
| **effect\_changes** | [**List**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [default to null] |
| **flavor\_text\_entries** | [**List**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [default to null] |
| **pokemon** | [**List**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

