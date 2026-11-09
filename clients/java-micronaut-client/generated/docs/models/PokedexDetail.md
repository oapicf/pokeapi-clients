

# PokedexDetail

The class is defined in **[PokedexDetail.java](../../src/main/java/org/openapitools/model/PokedexDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**isMainSeries** | `Boolean` | Whether or not this Pokédex originated in the main series of the video games. |  [optional property]
**descriptions** | [`List&lt;PokedexDescription&gt;`](PokedexDescription.md) | The description of this resource listed in different languages. |  [readonly property]
**names** | [`List&lt;PokedexName&gt;`](PokedexName.md) | The name of this resource listed in different languages. |  [readonly property]
**pokemonEntries** | [`List&lt;PokemonDexNumber&gt;`](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. |  [readonly property]
**region** | [`RegionSummary`](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**versionGroups** | [`List&lt;VersionGroupSummary&gt;`](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. |  [readonly property]










