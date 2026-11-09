

# PokedexDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The identifier for this resource. |  [readonly]
**name** | **String** | The name for this resource. | 
**isMainSeries** | **Boolean** | Whether or not this Pokédex originated in the main series of the video games. |  [optional]
**descriptions** | [**List&lt;PokedexDescription&gt;**](PokedexDescription.md) | The description of this resource listed in different languages. |  [readonly]
**names** | [**List&lt;PokedexName&gt;**](PokedexName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonEntries** | [**List&lt;PokemonDexNumber&gt;**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. |  [readonly]
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**versionGroups** | [**List&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. |  [readonly]




