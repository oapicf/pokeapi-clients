# PokedexDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **is\_main\_series** | **Boolean** | Whether or not this Pokédex originated in the main series of the video games. | [optional] [default to null] |
| **descriptions** | [**List**](PokedexDescription.md) | The description of this resource listed in different languages. | [default to null] |
| **names** | [**List**](PokedexName.md) | The name of this resource listed in different languages. | [default to null] |
| **pokemon\_entries** | [**List**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [default to null] |
| **region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | [default to null] |
| **version\_groups** | [**List**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

