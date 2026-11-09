# PokemonHabitatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**names** | [**List[PokemonHabitatName]**](PokemonHabitatName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of the Pokémon species that can be found in this habitat. | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_habitat_detail import PokemonHabitatDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonHabitatDetail from a JSON string
pokemon_habitat_detail_instance = PokemonHabitatDetail.from_json(json)
# print the JSON string representation of the object
print(PokemonHabitatDetail.to_json())

# convert the object into a dict
pokemon_habitat_detail_dict = pokemon_habitat_detail_instance.to_dict()
# create an instance of PokemonHabitatDetail from a dict
pokemon_habitat_detail_from_dict = PokemonHabitatDetail.from_dict(pokemon_habitat_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


