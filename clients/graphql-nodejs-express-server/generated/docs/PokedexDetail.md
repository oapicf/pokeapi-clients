# PokedexDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**isMainSeries** | **Boolean!** | Whether or not this Pokédex originated in the main series of the video games. | [optional] [default to null]
**descriptions** | [**PokedexDescription**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] [default to null]
**names** | [**PokedexName**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokemonEntries** | [**PokemonDexNumber**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] [default to null]
**region** | [***RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | [default to null]
**versionGroups** | [**VersionGroupSummary**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


