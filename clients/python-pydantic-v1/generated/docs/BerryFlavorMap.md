# BerryFlavorMap


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**potency** | **int** | How powerful the referenced flavor is for this berry. | 
**flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The referenced berry flavor. | 

## Example

```python
from openapi_client.models.berry_flavor_map import BerryFlavorMap

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFlavorMap from a JSON string
berry_flavor_map_instance = BerryFlavorMap.from_json(json)
# print the JSON string representation of the object
print BerryFlavorMap.to_json()

# convert the object into a dict
berry_flavor_map_dict = berry_flavor_map_instance.to_dict()
# create an instance of BerryFlavorMap from a dict
berry_flavor_map_from_dict = BerryFlavorMap.from_dict(berry_flavor_map_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


