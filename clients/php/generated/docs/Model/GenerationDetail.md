# GenerationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**abilities** | [**\OpenAPI\Client\Model\AbilitySummary[]**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly]
**main_region** | [**\OpenAPI\Client\Model\RegionSummary**](RegionSummary.md) | The main region travelled in this generation. |
**moves** | [**\OpenAPI\Client\Model\MoveSummary[]**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly]
**names** | [**\OpenAPI\Client\Model\GenerationName[]**](GenerationName.md) | The name of this resource listed in different languages. | [readonly]
**pokemon_species** | [**\OpenAPI\Client\Model\PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly]
**types** | [**\OpenAPI\Client\Model\TypeSummary[]**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly]
**version_groups** | [**\OpenAPI\Client\Model\VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
