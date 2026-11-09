# REGION_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**locations** | [**LIST [LOCATION_SUMMARY]**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] [default to null]
**main_generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] [default to null]
**names** | [**LIST [REGION_NAME]**](RegionName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokedexes** | [**LIST [POKEDEX_SUMMARY]**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] [default to null]
**version_groups** | [**LIST [VERSION_GROUP_SUMMARY]**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


