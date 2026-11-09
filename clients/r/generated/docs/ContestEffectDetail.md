# openapi::ContestEffectDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**appeal** | **integer** | The base number of hearts the user of this move gets. | [Max: 2147483647] [Min: -2147483648] 
**jam** | **integer** | The base number of hearts the user&#39;s opponent loses. | [Max: 2147483647] [Min: -2147483648] 
**effect_entries** | [**array[ContestEffectEffectText]**](ContestEffectEffectText.md) | The result of this contest effect listed in different languages. | [readonly] 
**flavor_text_entries** | [**array[ContestEffectFlavorText]**](ContestEffectFlavorText.md) | The flavor text of this contest effect listed in different languages. | [readonly] 


