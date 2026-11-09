
# Table `LocationAreaPokemonEncounter`
(mapped from: LocationAreaPokemonEncounter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**pokemon** | pokemon | long NOT NULL |  | [**PokemonSummary**](PokemonSummary.md) | The Pokémon being encountered. |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaPokemonEncounterVersion&gt;**](LocationAreaPokemonEncounterVersion.md) | A list of versions and encounters with Pokémon that might happen in the referenced location area. | 



# **Table `LocationAreaPokemonEncounterLocationAreaPokemonEncounterVersion`**
(mapped from: LocationAreaPokemonEncounterLocationAreaPokemonEncounterVersion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaPokemonEncounter | locationAreaPokemonEncounter | long | | kotlin.Long | Primary Key | *one*
locationAreaPokemonEncounterVersion | locationAreaPokemonEncounterVersion | long | | kotlin.Long | Foreign Key | *many*



