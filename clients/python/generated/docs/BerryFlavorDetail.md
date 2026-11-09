# BerryFlavorDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**berries** | [**List[BerryFlavorBerryMap]**](BerryFlavorBerryMap.md) | A list of the berries with this flavor. | [readonly] 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The contest type that correlates with this berry flavor. | 
**names** | [**List[BerryFlavorName]**](BerryFlavorName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from pokeapiclient.models.berry_flavor_detail import BerryFlavorDetail

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFlavorDetail from a JSON string
berry_flavor_detail_instance = BerryFlavorDetail.from_json(json)
# print the JSON string representation of the object
print(BerryFlavorDetail.to_json())

# convert the object into a dict
berry_flavor_detail_dict = berry_flavor_detail_instance.to_dict()
# create an instance of BerryFlavorDetail from a dict
berry_flavor_detail_from_dict = BerryFlavorDetail.from_dict(berry_flavor_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


