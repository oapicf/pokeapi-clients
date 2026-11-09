

# CharacteristicDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. |  [readonly]
**geneModulo** | **Int** | The remainder of the highest stat/IV divided by 5. | 
**possibleValues** | **Seq&lt;Int&gt;** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. |  [readonly]
**highestStat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**Seq&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. |  [readonly]



