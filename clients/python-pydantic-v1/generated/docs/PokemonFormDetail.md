# PokemonFormDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**order** | **int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**form_order** | **int** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**is_default** | **bool** | True for exactly one form used as the default for each Pokémon. | [optional] 
**is_battle_only** | **bool** | Whether or not this form can only happen during battle. | [optional] 
**is_mega** | **bool** | Whether or not this form requires mega evolution. | [optional] 
**form_name** | **str** | The name of this form. | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**form_names** | [**List[PokemonFormName]**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**names** | [**List[PokemonFormName]**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**types** | [**List[PokemonFormType]**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**trigger_conditions** | [**List[PokemonFormTriggerCondition]**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**flavor_text_entries** | [**List[PokemonFormFlavorText]**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 

## Example

```python
from openapi_client.models.pokemon_form_detail import PokemonFormDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormDetail from a JSON string
pokemon_form_detail_instance = PokemonFormDetail.from_json(json)
# print the JSON string representation of the object
print PokemonFormDetail.to_json()

# convert the object into a dict
pokemon_form_detail_dict = pokemon_form_detail_instance.to_dict()
# create an instance of PokemonFormDetail from a dict
pokemon_form_detail_from_dict = PokemonFormDetail.from_dict(pokemon_form_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


