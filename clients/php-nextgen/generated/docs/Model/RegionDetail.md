# RegionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**locations** | [**\OpenAPI\Client\Model\LocationSummary[]**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly]
**main_generation** | [**\OpenAPI\Client\Model\GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. | [readonly]
**names** | [**\OpenAPI\Client\Model\RegionName[]**](RegionName.md) | The name of this resource listed in different languages. | [readonly]
**pokedexes** | [**\OpenAPI\Client\Model\PokedexSummary[]**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly]
**version_groups** | [**\OpenAPI\Client\Model\VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
