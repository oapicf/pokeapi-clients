# NatureDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**decreased_stat** | [**StatSummary**](StatSummary.md) |  | 
**increased_stat** | [**StatSummary**](StatSummary.md) |  | 
**likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**berries** | [**List[BerrySummary]**](BerrySummary.md) |  | 
**pokeathlon_stat_changes** | [**List[NatureDetailPokeathlonStatChangesInner]**](NatureDetailPokeathlonStatChangesInner.md) |  | 
**move_battle_style_preferences** | [**List[NatureBattleStylePreference]**](NatureBattleStylePreference.md) |  | 
**names** | [**List[NatureName]**](NatureName.md) |  | 

## Example

```python
from pokeapiclient.models.nature_detail import NatureDetail

# TODO update the JSON string below
json = "{}"
# create an instance of NatureDetail from a JSON string
nature_detail_instance = NatureDetail.from_json(json)
# print the JSON string representation of the object
print(NatureDetail.to_json())

# convert the object into a dict
nature_detail_dict = nature_detail_instance.to_dict()
# create an instance of NatureDetail from a dict
nature_detail_from_dict = NatureDetail.from_dict(nature_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


