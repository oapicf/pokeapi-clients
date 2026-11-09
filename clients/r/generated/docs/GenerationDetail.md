# openapi::GenerationDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**abilities** | [**array[AbilitySummary]**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] 
**main_region** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | 
**moves** | [**array[MoveSummary]**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] 
**names** | [**array[GenerationName]**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**array[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] 
**types** | [**array[TypeSummary]**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] 
**version_groups** | [**array[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] 


