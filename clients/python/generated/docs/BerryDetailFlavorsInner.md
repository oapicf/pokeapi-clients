# BerryDetailFlavorsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**potency** | **int** |  | 
**flavor** | [**BerryDetailFlavorsInnerFlavor**](BerryDetailFlavorsInnerFlavor.md) |  | 

## Example

```python
from pokeapiclient.models.berry_detail_flavors_inner import BerryDetailFlavorsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BerryDetailFlavorsInner from a JSON string
berry_detail_flavors_inner_instance = BerryDetailFlavorsInner.from_json(json)
# print the JSON string representation of the object
print(BerryDetailFlavorsInner.to_json())

# convert the object into a dict
berry_detail_flavors_inner_dict = berry_detail_flavors_inner_instance.to_dict()
# create an instance of BerryDetailFlavorsInner from a dict
berry_detail_flavors_inner_from_dict = BerryDetailFlavorsInner.from_dict(berry_detail_flavors_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


