# ItemDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**cost** | **int** |  | [optional] 
**fling_power** | **int** |  | [optional] 
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**attributes** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] 
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | 
**effect_entries** | [**List[ItemEffectText]**](ItemEffectText.md) |  | [readonly] 
**flavor_text_entries** | [**List[ItemFlavorText]**](ItemFlavorText.md) |  | [readonly] 
**game_indices** | [**List[ItemGameIndex]**](ItemGameIndex.md) |  | [readonly] 
**names** | [**List[ItemName]**](ItemName.md) |  | [readonly] 
**held_by_pokemon** | [**List[ItemDetailHeldByPokemonInner]**](ItemDetailHeldByPokemonInner.md) |  | [readonly] 
**sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  | 
**baby_trigger_for** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | 
**machines** | [**List[ItemDetailMachinesInner]**](ItemDetailMachinesInner.md) |  | [readonly] 

## Example

```python
from pokeapiclient.models.item_detail import ItemDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDetail from a JSON string
item_detail_instance = ItemDetail.from_json(json)
# print the JSON string representation of the object
print(ItemDetail.to_json())

# convert the object into a dict
item_detail_dict = item_detail_instance.to_dict()
# create an instance of ItemDetail from a dict
item_detail_from_dict = ItemDetail.from_dict(item_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


