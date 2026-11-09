# PokemonDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**base_experience** | **int** | The base experience gained for defeating this Pokémon. | [optional] 
**height** | **int** | The height of this Pokémon in decimetres. | [optional] 
**is_default** | **bool** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**order** | **int** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**weight** | **int** | The weight of this Pokémon in hectograms. | [optional] 
**abilities** | [**List[PokemonAbility]**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**past_abilities** | [**List[PokemonPastAbility]**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**forms** | [**List[PokemonFormSummary]**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**game_indices** | [**List[PokemonGameIndex]**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**held_items** | [**List[PokemonHeldItemSummary]**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**location_area_encounters** | **str** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**moves** | [**List[PokemonMove]**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**stats** | [**List[PokemonStat]**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**past_stats** | [**List[PokemonPastStat]**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**types** | [**List[PokemonType]**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**past_types** | [**List[PokemonPastType]**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 

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


