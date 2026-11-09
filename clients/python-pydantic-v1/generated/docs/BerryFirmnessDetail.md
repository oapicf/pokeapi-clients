# BerryFirmnessDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**berries** | [**List[BerrySummary]**](BerrySummary.md) | A list of the berries with this firmness. | [readonly] 
**names** | [**List[BerryFirmnessName]**](BerryFirmnessName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.berry_firmness_detail import BerryFirmnessDetail

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFirmnessDetail from a JSON string
berry_firmness_detail_instance = BerryFirmnessDetail.from_json(json)
# print the JSON string representation of the object
print BerryFirmnessDetail.to_json()

# convert the object into a dict
berry_firmness_detail_dict = berry_firmness_detail_instance.to_dict()
# create an instance of BerryFirmnessDetail from a dict
berry_firmness_detail_from_dict = BerryFirmnessDetail.from_dict(berry_firmness_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


