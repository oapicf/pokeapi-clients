
# Table `pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner`
(mapped from: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**chance** | chance | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**conditionValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner&gt;**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner.md) |  | 
**maxLevel** | max_level | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**method** | method | long NOT NULL |  | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod.md) |  |  [foreignkey]
**minLevel** | min_level | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 



# **Table `PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner`**
(mapped from: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner | pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner | long | | kotlin.Long | Primary Key | *one*
pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner | pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner | long | | kotlin.Long | Foreign Key | *many*






