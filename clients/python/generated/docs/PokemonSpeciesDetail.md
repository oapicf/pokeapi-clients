# PokemonSpeciesDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**order** | **int** |  | [optional] 
**gender_rate** | **int** |  | [optional] 
**capture_rate** | **int** |  | [optional] 
**base_happiness** | **int** |  | [optional] 
**is_baby** | **bool** |  | [optional] 
**is_legendary** | **bool** |  | [optional] 
**is_mythical** | **bool** |  | [optional] 
**hatch_counter** | **int** |  | [optional] 
**has_gender_differences** | **bool** |  | [optional] 
**forms_switchable** | **bool** |  | [optional] 
**growth_rate** | [**GrowthRateSummary**](GrowthRateSummary.md) |  | 
**pokedex_numbers** | [**List[PokemonDexEntry]**](PokemonDexEntry.md) |  | 
**egg_groups** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**color** | [**PokemonColorSummary**](PokemonColorSummary.md) |  | 
**shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**evolves_from_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**evolution_chain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**List[PokemonFormDetailFormNamesInner]**](PokemonFormDetailFormNamesInner.md) |  | 
**pal_park_encounters** | [**List[PokemonSpeciesDetailPalParkEncountersInner]**](PokemonSpeciesDetailPalParkEncountersInner.md) |  | 
**form_descriptions** | [**List[PokemonSpeciesDescription]**](PokemonSpeciesDescription.md) |  | 
**flavor_text_entries** | [**List[PokemonSpeciesFlavorText]**](PokemonSpeciesFlavorText.md) |  | 
**genera** | [**List[PokemonSpeciesDetailGeneraInner]**](PokemonSpeciesDetailGeneraInner.md) |  | 
**varieties** | [**List[PokemonSpeciesDetailVarietiesInner]**](PokemonSpeciesDetailVarietiesInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_species_detail import PokemonSpeciesDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesDetail from a JSON string
pokemon_species_detail_instance = PokemonSpeciesDetail.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesDetail.to_json())

# convert the object into a dict
pokemon_species_detail_dict = pokemon_species_detail_instance.to_dict()
# create an instance of PokemonSpeciesDetail from a dict
pokemon_species_detail_from_dict = PokemonSpeciesDetail.from_dict(pokemon_species_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


