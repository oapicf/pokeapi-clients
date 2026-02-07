# ContestTypeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**berry_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | [readonly] 
**names** | [**List[ContestTypeName]**](ContestTypeName.md) |  | 

## Example

```python
from pokeapiclient.models.contest_type_detail import ContestTypeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ContestTypeDetail from a JSON string
contest_type_detail_instance = ContestTypeDetail.from_json(json)
# print the JSON string representation of the object
print(ContestTypeDetail.to_json())

# convert the object into a dict
contest_type_detail_dict = contest_type_detail_instance.to_dict()
# create an instance of ContestTypeDetail from a dict
contest_type_detail_from_dict = ContestTypeDetail.from_dict(contest_type_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


