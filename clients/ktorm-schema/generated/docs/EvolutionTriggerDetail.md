
# Table `EvolutionTriggerDetail`
(mapped from: EvolutionTriggerDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionTriggerName&gt;**](EvolutionTriggerName.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 




# **Table `EvolutionTriggerDetailEvolutionTriggerName`**
(mapped from: EvolutionTriggerDetailEvolutionTriggerName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionTriggerDetail | evolutionTriggerDetail | long | | kotlin.Long | Primary Key | *one*
evolutionTriggerName | evolutionTriggerName | long | | kotlin.Long | Foreign Key | *many*



# **Table `EvolutionTriggerDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: EvolutionTriggerDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionTriggerDetail | evolutionTriggerDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



