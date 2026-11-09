# AbilityDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**is_main_series** | **bool** | Whether or not this ability originated in the main series of the video games. | [optional]
**generation** | [**\OpenAPI\Client\Model\GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. |
**names** | [**\OpenAPI\Client\Model\AbilityName[]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly]
**effect_entries** | [**\OpenAPI\Client\Model\AbilityEffectText[]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly]
**effect_changes** | [**\OpenAPI\Client\Model\AbilityChange[]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly]
**flavor_text_entries** | [**\OpenAPI\Client\Model\AbilityFlavorText[]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly]
**pokemon** | [**\OpenAPI\Client\Model\AbilityPokemonDetail[]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
