# PokemonSpritesOtherHome


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **str** | The URL of the default Pokémon HOME front image, or null if unavailable. | 
**front_female** | **str** | The URL of the female Pokémon HOME front image, or null if unavailable. | 
**front_shiny** | **str** | The URL of the shiny Pokémon HOME front image, or null if unavailable. | 
**front_shiny_female** | **str** | The URL of the shiny female Pokémon HOME front image, or null if unavailable. | 

## Example

```python
from openapi_client.models.pokemon_sprites_other_home import PokemonSpritesOtherHome

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpritesOtherHome from a JSON string
pokemon_sprites_other_home_instance = PokemonSpritesOtherHome.from_json(json)
# print the JSON string representation of the object
print PokemonSpritesOtherHome.to_json()

# convert the object into a dict
pokemon_sprites_other_home_dict = pokemon_sprites_other_home_instance.to_dict()
# create an instance of PokemonSpritesOtherHome from a dict
pokemon_sprites_other_home_from_dict = PokemonSpritesOtherHome.from_dict(pokemon_sprites_other_home_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


