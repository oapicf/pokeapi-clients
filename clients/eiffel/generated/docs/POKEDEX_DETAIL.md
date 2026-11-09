# POKEDEX_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**is_main_series** | **BOOLEAN** | Whether or not this Pokédex originated in the main series of the video games. | [optional] [default to null]
**descriptions** | [**LIST [POKEDEX_DESCRIPTION]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] [default to null]
**names** | [**LIST [POKEDEX_NAME]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokemon_entries** | [**LIST [POKEMON_DEX_NUMBER]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] [default to null]
**region** | [**REGION_SUMMARY**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | [default to null]
**version_groups** | [**LIST [VERSION_GROUP_SUMMARY]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


