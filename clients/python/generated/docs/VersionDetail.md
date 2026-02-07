# VersionDetail

Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**names** | [**List[VersionName]**](VersionName.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

## Example

```python
from pokeapiclient.models.version_detail import VersionDetail

# TODO update the JSON string below
json = "{}"
# create an instance of VersionDetail from a JSON string
version_detail_instance = VersionDetail.from_json(json)
# print the JSON string representation of the object
print(VersionDetail.to_json())

# convert the object into a dict
version_detail_dict = version_detail_instance.to_dict()
# create an instance of VersionDetail from a dict
version_detail_from_dict = VersionDetail.from_dict(version_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


