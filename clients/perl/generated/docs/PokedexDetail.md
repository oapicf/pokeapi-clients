# WWW::OpenAPIClient::Object::PokedexDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PokedexDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**is_main_series** | **boolean** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**ARRAY[PokedexDescription]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**ARRAY[PokedexName]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_entries** | [**ARRAY[PokemonDexNumber]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**version_groups** | [**ARRAY[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


