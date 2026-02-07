# BerryDetailFlavorsInnerFlavor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the flavor | [optional] 
**url** | **str** | The URL to get more information about the flavor | [optional] 

## Example

```python
from pokeapiclient.models.berry_detail_flavors_inner_flavor import BerryDetailFlavorsInnerFlavor

# TODO update the JSON string below
json = "{}"
# create an instance of BerryDetailFlavorsInnerFlavor from a JSON string
berry_detail_flavors_inner_flavor_instance = BerryDetailFlavorsInnerFlavor.from_json(json)
# print the JSON string representation of the object
print(BerryDetailFlavorsInnerFlavor.to_json())

# convert the object into a dict
berry_detail_flavors_inner_flavor_dict = berry_detail_flavors_inner_flavor_instance.to_dict()
# create an instance of BerryDetailFlavorsInnerFlavor from a dict
berry_detail_flavors_inner_flavor_from_dict = BerryDetailFlavorsInnerFlavor.from_dict(berry_detail_flavors_inner_flavor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


