# openapi::CharacteristicDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**gene_modulo** | **integer** | The remainder of the highest stat/IV divided by 5. | 
**possible_values** | **array[integer]** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**highest_stat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**array[CharacteristicDescription]**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 


