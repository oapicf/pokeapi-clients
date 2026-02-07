# LanguageSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.language_summary import LanguageSummary

# TODO update the JSON string below
json = "{}"
# create an instance of LanguageSummary from a JSON string
language_summary_instance = LanguageSummary.from_json(json)
# print the JSON string representation of the object
print(LanguageSummary.to_json())

# convert the object into a dict
language_summary_dict = language_summary_instance.to_dict()
# create an instance of LanguageSummary from a dict
language_summary_from_dict = LanguageSummary.from_dict(language_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


