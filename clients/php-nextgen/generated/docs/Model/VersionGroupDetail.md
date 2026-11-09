# VersionGroupDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**order** | **int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional]
**generation** | [**\OpenAPI\Client\Model\GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. |
**move_learn_methods** | [**\OpenAPI\Client\Model\MoveLearnMethodSummary[]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly]
**pokedexes** | [**\OpenAPI\Client\Model\PokedexSummary[]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly]
**regions** | [**\OpenAPI\Client\Model\RegionSummary[]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly]
**versions** | [**\OpenAPI\Client\Model\VersionSummary[]**](VersionSummary.md) | The versions this version group owns. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
