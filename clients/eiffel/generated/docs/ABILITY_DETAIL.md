# ABILITY_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**is_main_series** | **BOOLEAN** | Whether or not this ability originated in the main series of the video games. | [optional] [default to null]
**generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) | The generation this ability originated in. | [default to null]
**names** | [**LIST [ABILITY_NAME]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**effect_entries** | [**LIST [ABILITY_EFFECT_TEXT]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to null]
**effect_changes** | [**LIST [ABILITY_CHANGE]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] [default to null]
**flavor_text_entries** | [**LIST [ABILITY_FLAVOR_TEXT]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to null]
**pokemon** | [**LIST [ABILITY_POKEMON_DETAIL]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


