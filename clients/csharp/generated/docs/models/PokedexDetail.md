# Org.OpenAPITools.Model.PokedexDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Descriptions** | [**List&lt;PokedexDescription&gt;**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**Names** | [**List&lt;PokedexName&gt;**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonEntries** | [**List&lt;PokemonDexNumber&gt;**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**VersionGroups** | [**List&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 
**IsMainSeries** | **bool** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**Region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

