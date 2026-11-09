# openapi::SuperContestEffectDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**appeal** | **integer** | The level of appeal this super contest effect has. | [Max: 2147483647] [Min: -2147483648] 
**flavor_text_entries** | [**array[SuperContestEffectFlavorText]**](SuperContestEffectFlavorText.md) | The flavor text of this super contest effect listed in different languages. | [readonly] 
**moves** | [**array[MoveSummary]**](MoveSummary.md) | A list of moves that have the effect when used in super contests. | [readonly] 


