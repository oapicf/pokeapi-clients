# AbilityDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`is_main_series`** | **`Bool`** | Whether or not this ability originated in the main series of the video games. | [optional] [default to nothing]
**`generation`** | [**`*GenerationSummary`**](GenerationSummary.md) | The generation this ability originated in. | [default to nothing]
**`names`** | [**`Vector{AbilityName}`**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`effect_entries`** | [**`Vector{AbilityEffectText}`**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to nothing]
**`effect_changes`** | [**`Vector{AbilityChange}`**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] [default to nothing]
**`flavor_text_entries`** | [**`Vector{AbilityFlavorText}`**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to nothing]
**`pokemon`** | [**`Vector{AbilityPokemonDetail}`**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


