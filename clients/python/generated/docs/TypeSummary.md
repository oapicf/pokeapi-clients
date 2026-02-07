# TypeSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.type_summary import TypeSummary

# TODO update the JSON string below
json = "{}"
# create an instance of TypeSummary from a JSON string
type_summary_instance = TypeSummary.from_json(json)
# print the JSON string representation of the object
print(TypeSummary.to_json())

# convert the object into a dict
type_summary_dict = type_summary_instance.to_dict()
# create an instance of TypeSummary from a dict
type_summary_from_dict = TypeSummary.from_dict(type_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


