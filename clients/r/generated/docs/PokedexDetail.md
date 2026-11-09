# openapi::PokedexDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**is_main_series** | **character** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**array[PokedexDescription]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**array[PokedexName]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_entries** | [**array[PokemonDexNumber]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**version_groups** | [**array[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 


