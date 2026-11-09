# RegionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**locations** | [**Vec<models::LocationSummary>**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly]
**main_generation** | Option<[**models::GenerationSummary**](GenerationSummary.md)> | The generation this region was introduced in. | [readonly]
**names** | [**Vec<models::RegionName>**](RegionName.md) | The name of this resource listed in different languages. | [readonly]
**pokedexes** | [**Vec<models::PokedexSummary>**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly]
**version_groups** | [**Vec<models::VersionGroupSummary>**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


