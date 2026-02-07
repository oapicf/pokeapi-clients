# SuperContestEffectDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**appeal** | **int** |  | 
**flavor_text_entries** | [**List[SuperContestEffectFlavorText]**](SuperContestEffectFlavorText.md) |  | 
**moves** | [**List[MoveSummary]**](MoveSummary.md) |  | 

## Example

```python
from pokeapiclient.models.super_contest_effect_detail import SuperContestEffectDetail

# TODO update the JSON string below
json = "{}"
# create an instance of SuperContestEffectDetail from a JSON string
super_contest_effect_detail_instance = SuperContestEffectDetail.from_json(json)
# print the JSON string representation of the object
print(SuperContestEffectDetail.to_json())

# convert the object into a dict
super_contest_effect_detail_dict = super_contest_effect_detail_instance.to_dict()
# create an instance of SuperContestEffectDetail from a dict
super_contest_effect_detail_from_dict = SuperContestEffectDetail.from_dict(super_contest_effect_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


