
# Table `VersionGroupDetail`
(mapped from: VersionGroupDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) |  |  [foreignkey]
**moveLearnMethods** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  [readonly]
**pokedexes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  [readonly]
**regions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  [readonly]
**versions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionSummary&gt;**](VersionSummary.md) |  |  [readonly]
**order** | order | int |  | **kotlin.Int** |  |  [optional]





# **Table `VersionGroupDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: VersionGroupDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `VersionGroupDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: VersionGroupDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `VersionGroupDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: VersionGroupDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `VersionGroupDetailVersionSummary`**
(mapped from: VersionGroupDetailVersionSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
versionSummary | versionSummary | long | | kotlin.Long | Foreign Key | *many*




