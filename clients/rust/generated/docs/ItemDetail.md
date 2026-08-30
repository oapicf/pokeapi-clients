# ItemDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly]
**name** | **String** |  | 
**cost** | Option<**i32**> |  | [optional]
**fling_power** | Option<**i32**> |  | [optional]
**fling_effect** | [**models::ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**attributes** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly]
**category** | [**models::ItemCategorySummary**](ItemCategorySummary.md) |  | 
**effect_entries** | [**Vec<models::ItemEffectText>**](ItemEffectText.md) |  | [readonly]
**flavor_text_entries** | [**Vec<models::ItemFlavorText>**](ItemFlavorText.md) |  | [readonly]
**game_indices** | [**Vec<models::ItemGameIndex>**](ItemGameIndex.md) |  | [readonly]
**names** | [**Vec<models::ItemName>**](ItemName.md) |  | [readonly]
**held_by_pokemon** | [**Vec<models::ItemDetailHeldByPokemonInner>**](ItemDetailHeldByPokemonInner.md) |  | [readonly]
**sprites** | [**models::ItemDetailSprites**](ItemDetailSprites.md) |  | 
**baby_trigger_for** | [**models::ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | 
**machines** | [**Vec<models::ItemDetailMachinesInner>**](ItemDetailMachinesInner.md) |  | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


