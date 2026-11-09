# PokedexDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**isMainSeries** | **bool** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**OpenAPI\Server\Model\PokedexDescription**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**OpenAPI\Server\Model\PokedexName**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemonEntries** | [**OpenAPI\Server\Model\PokemonDexNumber**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**OpenAPI\Server\Model\RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**versionGroups** | [**OpenAPI\Server\Model\VersionGroupSummary**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


