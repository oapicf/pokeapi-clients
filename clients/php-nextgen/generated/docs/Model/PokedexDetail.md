# PokedexDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**is_main_series** | **bool** | Whether or not this Pokédex originated in the main series of the video games. | [optional]
**descriptions** | [**\OpenAPI\Client\Model\PokedexDescription[]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly]
**names** | [**\OpenAPI\Client\Model\PokedexName[]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly]
**pokemon_entries** | [**\OpenAPI\Client\Model\PokemonDexNumber[]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly]
**region** | [**\OpenAPI\Client\Model\RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. |
**version_groups** | [**\OpenAPI\Client\Model\VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
