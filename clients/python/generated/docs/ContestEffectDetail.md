# ContestEffectDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**appeal** | **int** |  | 
**jam** | **int** |  | 
**effect_entries** | [**List[ContestEffectEffectText]**](ContestEffectEffectText.md) |  | 
**flavor_text_entries** | [**List[ContestEffectFlavorText]**](ContestEffectFlavorText.md) |  | 

## Example

```python
from pokeapiclient.models.contest_effect_detail import ContestEffectDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ContestEffectDetail from a JSON string
contest_effect_detail_instance = ContestEffectDetail.from_json(json)
# print the JSON string representation of the object
print(ContestEffectDetail.to_json())

# convert the object into a dict
contest_effect_detail_dict = contest_effect_detail_instance.to_dict()
# create an instance of ContestEffectDetail from a dict
contest_effect_detail_from_dict = ContestEffectDetail.from_dict(contest_effect_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


