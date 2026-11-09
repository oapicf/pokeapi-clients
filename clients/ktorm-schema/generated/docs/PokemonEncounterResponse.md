
# Table `PokemonEncounterResponse`
(mapped from: PokemonEncounterResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**locationArea** | location_area | long NOT NULL |  | [**LocationAreaSummary**](LocationAreaSummary.md) | The location area the referenced Pokémon can be encountered in. |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonEncounterVersionDetailResponse&gt;**](PokemonEncounterVersionDetailResponse.md) | A list of versions and encounters with the referenced Pokémon that might happen. | 



# **Table `PokemonEncounterResponsePokemonEncounterVersionDetailResponse`**
(mapped from: PokemonEncounterResponsePokemonEncounterVersionDetailResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEncounterResponse | pokemonEncounterResponse | long | | kotlin.Long | Primary Key | *one*
pokemonEncounterVersionDetailResponse | pokemonEncounterVersionDetailResponse | long | | kotlin.Long | Foreign Key | *many*



