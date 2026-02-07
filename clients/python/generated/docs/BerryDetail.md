# BerryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**growth_time** | **int** |  | 
**max_harvest** | **int** |  | 
**natural_gift_power** | **int** |  | 
**size** | **int** |  | 
**smoothness** | **int** |  | 
**soil_dryness** | **int** |  | 
**firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) |  | 
**flavors** | [**List[BerryDetailFlavorsInner]**](BerryDetailFlavorsInner.md) |  | 
**item** | [**ItemSummary**](ItemSummary.md) |  | 
**natural_gift_type** | [**TypeSummary**](TypeSummary.md) |  | 

## Example

```python
from pokeapiclient.models.berry_detail import BerryDetail

# TODO update the JSON string below
json = "{}"
# create an instance of BerryDetail from a JSON string
berry_detail_instance = BerryDetail.from_json(json)
# print the JSON string representation of the object
print(BerryDetail.to_json())

# convert the object into a dict
berry_detail_dict = berry_detail_instance.to_dict()
# create an instance of BerryDetail from a dict
berry_detail_from_dict = BerryDetail.from_dict(berry_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


