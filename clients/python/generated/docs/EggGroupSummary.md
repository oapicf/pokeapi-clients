# EggGroupSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.egg_group_summary import EggGroupSummary

# TODO update the JSON string below
json = "{}"
# create an instance of EggGroupSummary from a JSON string
egg_group_summary_instance = EggGroupSummary.from_json(json)
# print the JSON string representation of the object
print(EggGroupSummary.to_json())

# convert the object into a dict
egg_group_summary_dict = egg_group_summary_instance.to_dict()
# create an instance of EggGroupSummary from a dict
egg_group_summary_from_dict = EggGroupSummary.from_dict(egg_group_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


