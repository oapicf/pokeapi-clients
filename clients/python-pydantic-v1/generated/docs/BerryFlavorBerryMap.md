# BerryFlavorBerryMap


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**potency** | **int** | How powerful the referenced flavor is for this berry. | 
**berry** | [**BerrySummary**](BerrySummary.md) | The berry with the referenced flavor. | 

## Example

```python
from openapi_client.models.berry_flavor_berry_map import BerryFlavorBerryMap

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFlavorBerryMap from a JSON string
berry_flavor_berry_map_instance = BerryFlavorBerryMap.from_json(json)
# print the JSON string representation of the object
print BerryFlavorBerryMap.to_json()

# convert the object into a dict
berry_flavor_berry_map_dict = berry_flavor_berry_map_instance.to_dict()
# create an instance of BerryFlavorBerryMap from a dict
berry_flavor_berry_map_from_dict = BerryFlavorBerryMap.from_dict(berry_flavor_berry_map_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


