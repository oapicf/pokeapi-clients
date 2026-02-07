# PokemonDetailSprites


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **str** |  | [optional] 

## Example

```python
from pokeapiclient.models.pokemon_detail_sprites import PokemonDetailSprites

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailSprites from a JSON string
pokemon_detail_sprites_instance = PokemonDetailSprites.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailSprites.to_json())

# convert the object into a dict
pokemon_detail_sprites_dict = pokemon_detail_sprites_instance.to_dict()
# create an instance of PokemonDetailSprites from a dict
pokemon_detail_sprites_from_dict = PokemonDetailSprites.from_dict(pokemon_detail_sprites_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


