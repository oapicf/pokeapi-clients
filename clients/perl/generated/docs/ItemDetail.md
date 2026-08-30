# WWW::OpenAPIClient::Object::ItemDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ItemDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **string** |  | 
**cost** | **int** |  | [optional] 
**fling_power** | **int** |  | [optional] 
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**attributes** | [**ARRAY[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] 
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | 
**effect_entries** | [**ARRAY[ItemEffectText]**](ItemEffectText.md) |  | [readonly] 
**flavor_text_entries** | [**ARRAY[ItemFlavorText]**](ItemFlavorText.md) |  | [readonly] 
**game_indices** | [**ARRAY[ItemGameIndex]**](ItemGameIndex.md) |  | [readonly] 
**names** | [**ARRAY[ItemName]**](ItemName.md) |  | [readonly] 
**held_by_pokemon** | [**ARRAY[ItemDetailHeldByPokemonInner]**](ItemDetailHeldByPokemonInner.md) |  | [readonly] 
**sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  | 
**baby_trigger_for** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | 
**machines** | [**ARRAY[ItemDetailMachinesInner]**](ItemDetailMachinesInner.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


