# PokedexDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**isMainSeries** | **Bool** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [PokedexDescription] | The description of this resource listed in different languages. | [readonly] 
**names** | [PokedexName] | The name of this resource listed in different languages. | [readonly] 
**pokemonEntries** | [PokemonDexNumber] | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**versionGroups** | [VersionGroupSummary] | A list of version groups this Pokédex is relevant to. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


