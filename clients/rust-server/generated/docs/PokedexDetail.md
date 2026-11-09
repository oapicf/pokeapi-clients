# PokedexDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**is_main_series** | **bool** | Whether or not this Pokédex originated in the main series of the video games. | [optional] [default to None]
**descriptions** | [**Vec<models::PokedexDescription>**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**Vec<models::PokedexName>**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_entries** | [**Vec<models::PokemonDexNumber>**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [***models::RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**version_groups** | [**Vec<models::VersionGroupSummary>**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


