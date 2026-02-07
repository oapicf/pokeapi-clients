# MoveSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.move_summary import MoveSummary

# TODO update the JSON string below
json = "{}"
# create an instance of MoveSummary from a JSON string
move_summary_instance = MoveSummary.from_json(json)
# print the JSON string representation of the object
print(MoveSummary.to_json())

# convert the object into a dict
move_summary_dict = move_summary_instance.to_dict()
# create an instance of MoveSummary from a dict
move_summary_from_dict = MoveSummary.from_dict(move_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


