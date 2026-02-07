# BerryFlavorDetailBerriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**potency** | **int** |  | 
**berry** | [**BerryFlavorDetailBerriesInnerBerry**](BerryFlavorDetailBerriesInnerBerry.md) |  | 

## Example

```python
from pokeapiclient.models.berry_flavor_detail_berries_inner import BerryFlavorDetailBerriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFlavorDetailBerriesInner from a JSON string
berry_flavor_detail_berries_inner_instance = BerryFlavorDetailBerriesInner.from_json(json)
# print the JSON string representation of the object
print(BerryFlavorDetailBerriesInner.to_json())

# convert the object into a dict
berry_flavor_detail_berries_inner_dict = berry_flavor_detail_berries_inner_instance.to_dict()
# create an instance of BerryFlavorDetailBerriesInner from a dict
berry_flavor_detail_berries_inner_from_dict = BerryFlavorDetailBerriesInner.from_dict(berry_flavor_detail_berries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


