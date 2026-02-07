
# Table `PokedexDetail`
(mapped from: PokedexDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexDescription&gt;**](PokedexDescription.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexName&gt;**](PokedexName.md) |  | 
**pokemonEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexDetailPokemonEntriesInner&gt;**](PokedexDetailPokemonEntriesInner.md) |  | 
**region** | region | long NOT NULL |  | [**RegionSummary**](RegionSummary.md) |  |  [foreignkey]
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**isMainSeries** | is_main_series | boolean |  | **kotlin.Boolean** |  |  [optional]




# **Table `PokedexDetailPokedexDescription`**
(mapped from: PokedexDetailPokedexDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
pokedexDescription | pokedexDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokedexDetailPokedexName`**
(mapped from: PokedexDetailPokedexName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
pokedexName | pokedexName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokedexDetailPokedexDetailPokemonEntriesInner`**
(mapped from: PokedexDetailPokedexDetailPokemonEntriesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
pokedexDetailPokemonEntriesInner | pokedexDetailPokemonEntriesInner | long | | kotlin.Long | Foreign Key | *many*




# **Table `PokedexDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: PokedexDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*




