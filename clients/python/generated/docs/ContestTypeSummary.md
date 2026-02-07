# ContestTypeSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.contest_type_summary import ContestTypeSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ContestTypeSummary from a JSON string
contest_type_summary_instance = ContestTypeSummary.from_json(json)
# print the JSON string representation of the object
print(ContestTypeSummary.to_json())

# convert the object into a dict
contest_type_summary_dict = contest_type_summary_instance.to_dict()
# create an instance of ContestTypeSummary from a dict
contest_type_summary_from_dict = ContestTypeSummary.from_dict(contest_type_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


