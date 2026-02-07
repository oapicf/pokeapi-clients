# MoveDamageClassSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.move_damage_class_summary import MoveDamageClassSummary

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDamageClassSummary from a JSON string
move_damage_class_summary_instance = MoveDamageClassSummary.from_json(json)
# print the JSON string representation of the object
print(MoveDamageClassSummary.to_json())

# convert the object into a dict
move_damage_class_summary_dict = move_damage_class_summary_instance.to_dict()
# create an instance of MoveDamageClassSummary from a dict
move_damage_class_summary_from_dict = MoveDamageClassSummary.from_dict(move_damage_class_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


