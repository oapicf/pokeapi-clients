# PokemonHeldItemSummary


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | [**ItemSummary**](ItemSummary.md) | The item the referenced Pokémon holds. | 
**version_details** | [**List[PokemonHeldItemVersion]**](PokemonHeldItemVersion.md) | The details of the different versions in which the item is held. | 

## Example

```python
from openapi_client.models.pokemon_held_item_summary import PokemonHeldItemSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonHeldItemSummary from a JSON string
pokemon_held_item_summary_instance = PokemonHeldItemSummary.from_json(json)
# print the JSON string representation of the object
print PokemonHeldItemSummary.to_json()

# convert the object into a dict
pokemon_held_item_summary_dict = pokemon_held_item_summary_instance.to_dict()
# create an instance of PokemonHeldItemSummary from a dict
pokemon_held_item_summary_from_dict = PokemonHeldItemSummary.from_dict(pokemon_held_item_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


