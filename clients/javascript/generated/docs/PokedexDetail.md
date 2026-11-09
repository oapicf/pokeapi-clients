# PokeapiClient.PokedexDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**isMainSeries** | **Boolean** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**[PokedexDescription]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**[PokedexName]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemonEntries** | [**[PokemonDexNumber]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**versionGroups** | [**[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 


