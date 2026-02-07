# VersionName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.version_name import VersionName

# TODO update the JSON string below
json = "{}"
# create an instance of VersionName from a JSON string
version_name_instance = VersionName.from_json(json)
# print the JSON string representation of the object
print(VersionName.to_json())

# convert the object into a dict
version_name_dict = version_name_instance.to_dict()
# create an instance of VersionName from a dict
version_name_from_dict = VersionName.from_dict(version_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


