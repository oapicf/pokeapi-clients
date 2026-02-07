# ItemAttributeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**descriptions** | [**List[ItemAttributeDescription]**](ItemAttributeDescription.md) |  | 
**items** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**names** | [**List[ItemAttributeName]**](ItemAttributeName.md) |  | 

## Example

```python
from pokeapiclient.models.item_attribute_detail import ItemAttributeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ItemAttributeDetail from a JSON string
item_attribute_detail_instance = ItemAttributeDetail.from_json(json)
# print the JSON string representation of the object
print(ItemAttributeDetail.to_json())

# convert the object into a dict
item_attribute_detail_dict = item_attribute_detail_instance.to_dict()
# create an instance of ItemAttributeDetail from a dict
item_attribute_detail_from_dict = ItemAttributeDetail.from_dict(item_attribute_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


