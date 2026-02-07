# BerryFirmnessDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**berries** | [**List[BerrySummary]**](BerrySummary.md) |  | 
**names** | [**List[BerryFirmnessName]**](BerryFirmnessName.md) |  | 

## Example

```python
from pokeapiclient.models.berry_firmness_detail import BerryFirmnessDetail

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFirmnessDetail from a JSON string
berry_firmness_detail_instance = BerryFirmnessDetail.from_json(json)
# print the JSON string representation of the object
print(BerryFirmnessDetail.to_json())

# convert the object into a dict
berry_firmness_detail_dict = berry_firmness_detail_instance.to_dict()
# create an instance of BerryFirmnessDetail from a dict
berry_firmness_detail_from_dict = BerryFirmnessDetail.from_dict(berry_firmness_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


