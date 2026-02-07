# openapi::AbilityDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**is_main_series** | **character** |  | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**array[AbilityName]**](AbilityName.md) |  | 
**effect_entries** | [**array[AbilityEffectText]**](AbilityEffectText.md) |  | 
**effect_changes** | [**array[AbilityChange]**](AbilityChange.md) |  | 
**flavor_text_entries** | [**array[AbilityFlavorText]**](AbilityFlavorText.md) |  | 
**pokemon** | [**array[AbilityDetailPokemonInner]**](AbilityDetail_pokemon_inner.md) |  | 


