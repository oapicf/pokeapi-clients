
# Table `PokemonEncounterDetailResponse`
(mapped from: PokemonEncounterDetailResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**chance** | chance | int NOT NULL |  | **kotlin.Int** | Percent chance that this encounter will occur. | 
**conditionValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | 
**maxLevel** | max_level | int NOT NULL |  | **kotlin.Int** | The highest level the Pokémon could be encountered at. | 
**method** | method | long NOT NULL |  | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. |  [foreignkey]
**minLevel** | min_level | int NOT NULL |  | **kotlin.Int** | The lowest level the Pokémon could be encountered at. | 



# **Table `PokemonEncounterDetailResponseEncounterConditionValueSummary`**
(mapped from: PokemonEncounterDetailResponseEncounterConditionValueSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEncounterDetailResponse | pokemonEncounterDetailResponse | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueSummary | encounterConditionValueSummary | long | | kotlin.Long | Foreign Key | *many*






