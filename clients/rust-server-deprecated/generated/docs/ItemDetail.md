# ItemDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly] 
**name** | **String** |  | 
**cost** | **i32** |  | [optional] [default to None]
**fling_power** | **i32** |  | [optional] [default to None]
**fling_effect** | [***models::ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**attributes** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 
**category** | [***models::ItemCategorySummary**](ItemCategorySummary.md) |  | 
**effect_entries** | [**Vec<models::ItemEffectText>**](ItemEffectText.md) |  | [readonly] 
**flavor_text_entries** | [**Vec<models::ItemFlavorText>**](ItemFlavorText.md) |  | [readonly] 
**game_indices** | [**Vec<models::ItemGameIndex>**](ItemGameIndex.md) |  | [readonly] 
**names** | [**Vec<models::ItemName>**](ItemName.md) |  | [readonly] 
**held_by_pokemon** | [**Vec<models::ItemDetailHeldByPokemonInner>**](ItemDetail_held_by_pokemon_inner.md) |  | [readonly] 
**sprites** | [***models::ItemDetailSprites**](ItemDetail_sprites.md) |  | 
**baby_trigger_for** | [***models::ItemDetailBabyTriggerFor**](ItemDetail_baby_trigger_for.md) |  | 
**machines** | [**Vec<models::ItemDetailMachinesInner>**](ItemDetail_machines_inner.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


