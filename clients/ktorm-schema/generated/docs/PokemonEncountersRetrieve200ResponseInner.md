
# Table `pokemon_encounters_retrieve_200_response_inner`
(mapped from: PokemonEncountersRetrieve200ResponseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**locationArea** | location_area | long NOT NULL |  | [**PokemonEncountersRetrieve200ResponseInnerLocationArea**](PokemonEncountersRetrieve200ResponseInnerLocationArea.md) |  |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner&gt;**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.md) |  | 



# **Table `PokemonEncountersRetrieve200ResponseInnerPokemonEncountersRetrieve200ResponseInnerVersionDetailsInner`**
(mapped from: PokemonEncountersRetrieve200ResponseInnerPokemonEncountersRetrieve200ResponseInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEncountersRetrieve200ResponseInner | pokemonEncountersRetrieve200ResponseInner | long | | kotlin.Long | Primary Key | *one*
pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner | pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner | long | | kotlin.Long | Foreign Key | *many*



