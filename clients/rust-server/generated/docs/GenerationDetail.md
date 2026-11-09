# GenerationDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**abilities** | [**Vec<models::AbilitySummary>**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] 
**main_region** | [***models::RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | 
**moves** | [**Vec<models::MoveSummary>**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] 
**names** | [**Vec<models::GenerationName>**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**Vec<models::PokemonSpeciesSummary>**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] 
**types** | [**Vec<models::TypeSummary>**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] 
**version_groups** | [**Vec<models::VersionGroupSummary>**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


