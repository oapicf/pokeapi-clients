
# PokedexDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The identifier for this resource. |  [readonly] |
| **name** | **kotlin.String** | The name for this resource. |  |
| **descriptions** | [**kotlin.collections.List&lt;PokedexDescription&gt;**](PokedexDescription.md) | The description of this resource listed in different languages. |  [readonly] |
| **names** | [**kotlin.collections.List&lt;PokedexName&gt;**](PokedexName.md) | The name of this resource listed in different languages. |  [readonly] |
| **pokemonEntries** | [**kotlin.collections.List&lt;PokemonDexNumber&gt;**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. |  [readonly] |
| **region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. |  |
| **versionGroups** | [**kotlin.collections.List&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. |  [readonly] |
| **isMainSeries** | **kotlin.Boolean** | Whether or not this Pokédex originated in the main series of the video games. |  [optional] |



