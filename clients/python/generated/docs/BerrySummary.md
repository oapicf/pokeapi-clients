# BerrySummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.berry_summary import BerrySummary

# TODO update the JSON string below
json = "{}"
# create an instance of BerrySummary from a JSON string
berry_summary_instance = BerrySummary.from_json(json)
# print the JSON string representation of the object
print(BerrySummary.to_json())

# convert the object into a dict
berry_summary_dict = berry_summary_instance.to_dict()
# create an instance of BerrySummary from a dict
berry_summary_from_dict = BerrySummary.from_dict(berry_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


