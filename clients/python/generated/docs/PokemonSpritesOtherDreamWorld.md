# PokemonSpritesOtherDreamWorld


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **str** | The URL of the default Pokémon Dream World front image, or null if unavailable. | 
**front_female** | **str** | The URL of the female Pokémon Dream World front image, or null if unavailable. | 

## Example

```python
from pokeapiclient.models.pokemon_sprites_other_dream_world import PokemonSpritesOtherDreamWorld

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpritesOtherDreamWorld from a JSON string
pokemon_sprites_other_dream_world_instance = PokemonSpritesOtherDreamWorld.from_json(json)
# print the JSON string representation of the object
print(PokemonSpritesOtherDreamWorld.to_json())

# convert the object into a dict
pokemon_sprites_other_dream_world_dict = pokemon_sprites_other_dream_world_instance.to_dict()
# create an instance of PokemonSpritesOtherDreamWorld from a dict
pokemon_sprites_other_dream_world_from_dict = PokemonSpritesOtherDreamWorld.from_dict(pokemon_sprites_other_dream_world_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


