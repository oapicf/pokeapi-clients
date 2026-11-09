# openapi::AbilityDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**is_main_series** | **character** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [**array[AbilityName]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effect_entries** | [**array[AbilityEffectText]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effect_changes** | [**array[AbilityChange]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavor_text_entries** | [**array[AbilityFlavorText]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**array[AbilityPokemonDetail]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 


