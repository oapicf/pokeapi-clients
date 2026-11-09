# PokemonSpritesOther


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dream_world** | [**PokemonSpritesOtherDreamWorld**](PokemonSpritesOtherDreamWorld.md) | Pokémon Dream World artwork URLs. | [optional] 
**home** | [**PokemonSpritesOtherHome**](PokemonSpritesOtherHome.md) | Pokémon HOME sprite URLs. | [optional] 
**showdown** | [**PokemonSpritesOtherShowdown**](PokemonSpritesOtherShowdown.md) | Pokémon Showdown sprite URLs. | [optional] 
**official_artwork** | [**PokemonSpritesOtherOfficialArtwork**](PokemonSpritesOtherOfficialArtwork.md) | Official Pokémon artwork URLs, including shiny artwork and version-specific variants. | [optional] 

## Example

```python
from pokeapiclient.models.pokemon_sprites_other import PokemonSpritesOther

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpritesOther from a JSON string
pokemon_sprites_other_instance = PokemonSpritesOther.from_json(json)
# print the JSON string representation of the object
print(PokemonSpritesOther.to_json())

# convert the object into a dict
pokemon_sprites_other_dict = pokemon_sprites_other_instance.to_dict()
# create an instance of PokemonSpritesOther from a dict
pokemon_sprites_other_from_dict = PokemonSpritesOther.from_dict(pokemon_sprites_other_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


