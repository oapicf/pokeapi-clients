# PokemonFormFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** | The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more.  | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 
**version** | [**VersionSummary**](VersionSummary.md) | The game version this flavor text is extracted from. | 

## Example

```python
from pokeapiclient.models.pokemon_form_flavor_text import PokemonFormFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormFlavorText from a JSON string
pokemon_form_flavor_text_instance = PokemonFormFlavorText.from_json(json)
# print the JSON string representation of the object
print(PokemonFormFlavorText.to_json())

# convert the object into a dict
pokemon_form_flavor_text_dict = pokemon_form_flavor_text_instance.to_dict()
# create an instance of PokemonFormFlavorText from a dict
pokemon_form_flavor_text_from_dict = PokemonFormFlavorText.from_dict(pokemon_form_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


