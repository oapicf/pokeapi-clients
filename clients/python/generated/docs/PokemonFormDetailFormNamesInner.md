# PokemonFormDetailFormNamesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**name** | **str** |  | 

## Example

```python
from pokeapiclient.models.pokemon_form_detail_form_names_inner import PokemonFormDetailFormNamesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormDetailFormNamesInner from a JSON string
pokemon_form_detail_form_names_inner_instance = PokemonFormDetailFormNamesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonFormDetailFormNamesInner.to_json())

# convert the object into a dict
pokemon_form_detail_form_names_inner_dict = pokemon_form_detail_form_names_inner_instance.to_dict()
# create an instance of PokemonFormDetailFormNamesInner from a dict
pokemon_form_detail_form_names_inner_from_dict = PokemonFormDetailFormNamesInner.from_dict(pokemon_form_detail_form_names_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


