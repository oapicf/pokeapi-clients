
# Table `LocationAreaEncounterDetail`
(mapped from: LocationAreaEncounterDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**minLevel** | min_level | int NOT NULL |  | **kotlin.Int** | The lowest level the Pokémon could be encountered at. | 
**maxLevel** | max_level | int NOT NULL |  | **kotlin.Int** | The highest level the Pokémon could be encountered at. | 
**conditionValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. |  [readonly]
**pokemonDetails** | pokemon_details | long NOT NULL |  | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. |  [readonly] [foreignkey]
**chance** | chance | int |  | **kotlin.Int** | Percent chance that this encounter will occur. |  [optional]
**method** | method | long |  | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. |  [optional] [foreignkey]




# **Table `LocationAreaEncounterDetailEncounterConditionValueSummary`**
(mapped from: LocationAreaEncounterDetailEncounterConditionValueSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaEncounterDetail | locationAreaEncounterDetail | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueSummary | encounterConditionValueSummary | long | | kotlin.Long | Foreign Key | *many*






