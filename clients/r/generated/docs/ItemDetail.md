# openapi::ItemDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**cost** | **integer** |  | [optional] 
**fling_power** | **integer** |  | [optional] 
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**attributes** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | 
**effect_entries** | [**array[ItemEffectText]**](ItemEffectText.md) |  | [readonly] 
**flavor_text_entries** | [**array[ItemFlavorText]**](ItemFlavorText.md) |  | [readonly] 
**game_indices** | [**array[ItemGameIndex]**](ItemGameIndex.md) |  | [readonly] 
**names** | [**array[ItemName]**](ItemName.md) |  | [readonly] 
**held_by_pokemon** | [**array[ItemDetailHeldByPokemonInner]**](ItemDetail_held_by_pokemon_inner.md) |  | [readonly] 
**sprites** | [**ItemDetailSprites**](ItemDetail_sprites.md) |  | 
**baby_trigger_for** | [**ItemDetailBabyTriggerFor**](ItemDetail_baby_trigger_for.md) |  | 
**machines** | [**array[ItemDetailMachinesInner]**](ItemDetail_machines_inner.md) |  | [readonly] 


