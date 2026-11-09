
# Table `PokemonEncounterVersionDetailResponse`
(mapped from: PokemonEncounterVersionDetailResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**version** | version | long NOT NULL |  | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. |  [foreignkey]
**maxChance** | max_chance | int NOT NULL |  | **kotlin.Int** | The total percentage of all encounter potential. | 
**encounterDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonEncounterDetailResponse&gt;**](PokemonEncounterDetailResponse.md) | A list of encounters and their specifics. | 




# **Table `PokemonEncounterVersionDetailResponsePokemonEncounterDetailResponse`**
(mapped from: PokemonEncounterVersionDetailResponsePokemonEncounterDetailResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEncounterVersionDetailResponse | pokemonEncounterVersionDetailResponse | long | | kotlin.Long | Primary Key | *one*
pokemonEncounterDetailResponse | pokemonEncounterDetailResponse | long | | kotlin.Long | Foreign Key | *many*



