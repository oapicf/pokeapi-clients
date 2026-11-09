# LanguageDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**official** | **bool** | Whether or not the games are published in this language. | [optional] 
**iso639** | **str** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | 
**iso3166** | **str** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | 
**names** | [**List[LanguageName]**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.language_detail import LanguageDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LanguageDetail from a JSON string
language_detail_instance = LanguageDetail.from_json(json)
# print the JSON string representation of the object
print LanguageDetail.to_json()

# convert the object into a dict
language_detail_dict = language_detail_instance.to_dict()
# create an instance of LanguageDetail from a dict
language_detail_from_dict = LanguageDetail.from_dict(language_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


