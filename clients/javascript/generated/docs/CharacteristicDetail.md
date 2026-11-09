# PokeapiClient.CharacteristicDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**geneModulo** | **Number** | The remainder of the highest stat/IV divided by 5. | 
**possibleValues** | **[Number]** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**highestStat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**[CharacteristicDescription]**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 


