# PokemonFormSprites


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **str** | The default depiction of this Pokémon from the front in battle. | 
**front_shiny** | **str** | The shiny depiction of this Pokémon from the front in battle. | 
**front_female** | **str** | The female depiction of this Pokémon from the front in battle. | 
**front_shiny_female** | **str** | The shiny female depiction of this Pokémon from the front in battle. | 
**back_default** | **str** | The default depiction of this Pokémon from the back in battle. | 
**back_shiny** | **str** | The shiny depiction of this Pokémon from the back in battle. | 
**back_female** | **str** | The female depiction of this Pokémon from the back in battle. | 
**back_shiny_female** | **str** | The shiny female depiction of this Pokémon from the back in battle. | 
**other** | [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] 
**versions** | **Dict[str, Dict[str, object]]** | Sprites grouped by generation and game. Available keys vary by resource. | [optional] 

## Example

```python
from openapi_client.models.pokemon_form_sprites import PokemonFormSprites

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormSprites from a JSON string
pokemon_form_sprites_instance = PokemonFormSprites.from_json(json)
# print the JSON string representation of the object
print PokemonFormSprites.to_json()

# convert the object into a dict
pokemon_form_sprites_dict = pokemon_form_sprites_instance.to_dict()
# create an instance of PokemonFormSprites from a dict
pokemon_form_sprites_from_dict = PokemonFormSprites.from_dict(pokemon_form_sprites_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


