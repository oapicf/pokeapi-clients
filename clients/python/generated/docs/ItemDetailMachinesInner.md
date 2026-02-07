# ItemDetailMachinesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**machine** | **str** |  | 
**version_group** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.item_detail_machines_inner import ItemDetailMachinesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDetailMachinesInner from a JSON string
item_detail_machines_inner_instance = ItemDetailMachinesInner.from_json(json)
# print the JSON string representation of the object
print(ItemDetailMachinesInner.to_json())

# convert the object into a dict
item_detail_machines_inner_dict = item_detail_machines_inner_instance.to_dict()
# create an instance of ItemDetailMachinesInner from a dict
item_detail_machines_inner_from_dict = ItemDetailMachinesInner.from_dict(item_detail_machines_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


