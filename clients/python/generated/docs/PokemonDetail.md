# PokemonDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**base_experience** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**is_default** | **bool** |  | [optional] 
**order** | **int** |  | [optional] 
**weight** | **int** |  | [optional] 
**abilities** | [**List[PokemonDetailAbilitiesInner]**](PokemonDetailAbilitiesInner.md) |  | 
**past_abilities** | [**List[PokemonDetailPastAbilitiesInner]**](PokemonDetailPastAbilitiesInner.md) |  | 
**forms** | [**List[PokemonFormSummary]**](PokemonFormSummary.md) |  | 
**game_indices** | [**List[PokemonGameIndex]**](PokemonGameIndex.md) |  | 
**held_items** | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  | 
**location_area_encounters** | **str** |  | [readonly] 
**moves** | [**List[PokemonDetailMovesInner]**](PokemonDetailMovesInner.md) |  | 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**sprites** | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  | 
**cries** | [**PokemonDetailCries**](PokemonDetailCries.md) |  | 
**stats** | [**List[PokemonStat]**](PokemonStat.md) |  | 
**types** | [**List[PokemonDetailTypesInner]**](PokemonDetailTypesInner.md) |  | 
**past_types** | [**List[PokemonDetailPastTypesInner]**](PokemonDetailPastTypesInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail import PokemonDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetail from a JSON string
pokemon_detail_instance = PokemonDetail.from_json(json)
# print the JSON string representation of the object
print(PokemonDetail.to_json())

# convert the object into a dict
pokemon_detail_dict = pokemon_detail_instance.to_dict()
# create an instance of PokemonDetail from a dict
pokemon_detail_from_dict = PokemonDetail.from_dict(pokemon_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


