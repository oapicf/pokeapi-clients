# PokemonFormDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**order** | **int** |  | [optional] 
**form_order** | **int** |  | [optional] 
**is_default** | **bool** |  | [optional] 
**is_battle_only** | **bool** |  | [optional] 
**is_mega** | **bool** |  | [optional] 
**form_name** | **str** |  | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) |  | 
**sprites** | [**PokemonFormDetailSprites**](PokemonFormDetailSprites.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**form_names** | [**List[PokemonFormDetailFormNamesInner]**](PokemonFormDetailFormNamesInner.md) |  | 
**names** | [**List[PokemonFormDetailFormNamesInner]**](PokemonFormDetailFormNamesInner.md) |  | 
**types** | [**List[PokemonDetailTypesInner]**](PokemonDetailTypesInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_form_detail import PokemonFormDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormDetail from a JSON string
pokemon_form_detail_instance = PokemonFormDetail.from_json(json)
# print the JSON string representation of the object
print(PokemonFormDetail.to_json())

# convert the object into a dict
pokemon_form_detail_dict = pokemon_form_detail_instance.to_dict()
# create an instance of PokemonFormDetail from a dict
pokemon_form_detail_from_dict = PokemonFormDetail.from_dict(pokemon_form_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


