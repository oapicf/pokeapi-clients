# NatureSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.nature_summary import NatureSummary

# TODO update the JSON string below
json = "{}"
# create an instance of NatureSummary from a JSON string
nature_summary_instance = NatureSummary.from_json(json)
# print the JSON string representation of the object
print(NatureSummary.to_json())

# convert the object into a dict
nature_summary_dict = nature_summary_instance.to_dict()
# create an instance of NatureSummary from a dict
nature_summary_from_dict = NatureSummary.from_dict(nature_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


