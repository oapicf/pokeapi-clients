# openapi::RegionDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**locations** | [**array[LocationSummary]**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] 
**main_generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] 
**names** | [**array[RegionName]**](RegionName.md) | The name of this resource listed in different languages. | [readonly] 
**pokedexes** | [**array[PokedexSummary]**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] 
**version_groups** | [**array[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] 


