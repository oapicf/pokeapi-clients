# PokeapiClient.GenerationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**abilities** | [**[AbilitySummary]**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] 
**mainRegion** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | 
**moves** | [**[MoveSummary]**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] 
**names** | [**[GenerationName]**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemonSpecies** | [**[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] 
**types** | [**[TypeSummary]**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] 
**versionGroups** | [**[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] 


