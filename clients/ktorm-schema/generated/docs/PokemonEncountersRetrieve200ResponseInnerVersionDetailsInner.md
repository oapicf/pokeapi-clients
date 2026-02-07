
# Table `pokemon_encounters_retrieve_200_response_inner_version_details_inner`
(mapped from: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**encounterDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner&gt;**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.md) |  | 
**maxChance** | max_chance | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**version** | version | long NOT NULL |  | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.md) |  |  [foreignkey]


# **Table `PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner`**
(mapped from: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner | pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner | long | | kotlin.Long | Primary Key | *one*
pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner | pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner | long | | kotlin.Long | Foreign Key | *many*





