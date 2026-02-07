# GenderSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.gender_summary import GenderSummary

# TODO update the JSON string below
json = "{}"
# create an instance of GenderSummary from a JSON string
gender_summary_instance = GenderSummary.from_json(json)
# print the JSON string representation of the object
print(GenderSummary.to_json())

# convert the object into a dict
gender_summary_dict = gender_summary_instance.to_dict()
# create an instance of GenderSummary from a dict
gender_summary_from_dict = GenderSummary.from_dict(gender_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


