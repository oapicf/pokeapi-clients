# LanguageDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**official** | **bool** |  | [optional] 
**iso639** | **str** |  | 
**iso3166** | **str** |  | 
**names** | [**List[LanguageName]**](LanguageName.md) |  | 

## Example

```python
from pokeapiclient.models.language_detail import LanguageDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LanguageDetail from a JSON string
language_detail_instance = LanguageDetail.from_json(json)
# print the JSON string representation of the object
print(LanguageDetail.to_json())

# convert the object into a dict
language_detail_dict = language_detail_instance.to_dict()
# create an instance of LanguageDetail from a dict
language_detail_from_dict = LanguageDetail.from_dict(language_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


