

# LocationAreaEncounterDetail

The class is defined in **[LocationAreaEncounterDetail.java](../../src/main/java/org/openapitools/model/LocationAreaEncounterDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLevel** | `Integer` | The lowest level the Pokémon could be encountered at. | 
**maxLevel** | `Integer` | The highest level the Pokémon could be encountered at. | 
**chance** | `Integer` | Percent chance that this encounter will occur. |  [optional property]
**method** | [`EncounterMethodSummary`](EncounterMethodSummary.md) | The method by which this encounter happens. |  [optional property]
**conditionValues** | [`List&lt;EncounterConditionValueSummary&gt;`](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. |  [readonly property]
**pokemonDetails** | [`EncounterPokemonDetail`](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. |  [readonly property]








