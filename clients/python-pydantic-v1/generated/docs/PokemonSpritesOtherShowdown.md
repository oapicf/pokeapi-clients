# PokemonSpritesOtherShowdown


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **str** | The URL of the default Pokémon Showdown front image, or null if unavailable. | 
**front_female** | **str** | The URL of the female Pokémon Showdown front image, or null if unavailable. | 
**front_shiny** | **str** | The URL of the shiny Pokémon Showdown front image, or null if unavailable. | 
**front_shiny_female** | **str** | The URL of the shiny female Pokémon Showdown front image, or null if unavailable. | 
**back_default** | **str** | The URL of the default Pokémon Showdown back image, or null if unavailable. | 
**back_female** | **str** | The URL of the female Pokémon Showdown back image, or null if unavailable. | 
**back_shiny** | **str** | The URL of the shiny Pokémon Showdown back image, or null if unavailable. | 
**back_shiny_female** | **str** | The URL of the shiny female Pokémon Showdown back image, or null if unavailable. | 

## Example

```python
from openapi_client.models.pokemon_sprites_other_showdown import PokemonSpritesOtherShowdown

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpritesOtherShowdown from a JSON string
pokemon_sprites_other_showdown_instance = PokemonSpritesOtherShowdown.from_json(json)
# print the JSON string representation of the object
print PokemonSpritesOtherShowdown.to_json()

# convert the object into a dict
pokemon_sprites_other_showdown_dict = pokemon_sprites_other_showdown_instance.to_dict()
# create an instance of PokemonSpritesOtherShowdown from a dict
pokemon_sprites_other_showdown_from_dict = PokemonSpritesOtherShowdown.from_dict(pokemon_sprites_other_showdown_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


