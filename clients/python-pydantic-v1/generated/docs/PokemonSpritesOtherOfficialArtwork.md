# PokemonSpritesOtherOfficialArtwork


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **str** | The URL of the default front official artwork, or null if unavailable. | 
**front_shiny** | **str** | The URL of the shiny front official artwork, or null if unavailable. | 
**versions** | **Dict[str, Dict[str, object]]** | Additional official artwork grouped by version. Available keys vary by resource. | [optional] 

## Example

```python
from openapi_client.models.pokemon_sprites_other_official_artwork import PokemonSpritesOtherOfficialArtwork

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpritesOtherOfficialArtwork from a JSON string
pokemon_sprites_other_official_artwork_instance = PokemonSpritesOtherOfficialArtwork.from_json(json)
# print the JSON string representation of the object
print PokemonSpritesOtherOfficialArtwork.to_json()

# convert the object into a dict
pokemon_sprites_other_official_artwork_dict = pokemon_sprites_other_official_artwork_instance.to_dict()
# create an instance of PokemonSpritesOtherOfficialArtwork from a dict
pokemon_sprites_other_official_artwork_from_dict = PokemonSpritesOtherOfficialArtwork.from_dict(pokemon_sprites_other_official_artwork_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


