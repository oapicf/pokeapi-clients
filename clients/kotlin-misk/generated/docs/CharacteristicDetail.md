
# CharacteristicDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The identifier for this resource. |  [readonly]
**geneModulo** | **kotlin.Int** | The remainder of the highest stat/IV divided by 5. | 
**possibleValues** | **kotlin.collections.List&lt;kotlin.Int&gt;** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. |  [readonly]
**highestStat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**kotlin.collections.List&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. |  [readonly]



