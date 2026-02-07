
# Table `LocationAreaDetail_pokemon_encounters_inner`
(mapped from: LocationAreaDetailPokemonEncountersInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**pokemon** | pokemon | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaDetailPokemonEncountersInnerVersionDetailsInner&gt;**](LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.md) |  | 



# **Table `LocationAreaDetailPokemonEncountersInnerLocationAreaDetailPokemonEncountersInnerVersionDetailsInner`**
(mapped from: LocationAreaDetailPokemonEncountersInnerLocationAreaDetailPokemonEncountersInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetailPokemonEncountersInner | locationAreaDetailPokemonEncountersInner | long | | kotlin.Long | Primary Key | *one*
locationAreaDetailPokemonEncountersInnerVersionDetailsInner | locationAreaDetailPokemonEncountersInnerVersionDetailsInner | long | | kotlin.Long | Foreign Key | *many*



