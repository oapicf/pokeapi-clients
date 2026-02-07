
# Table `RegionDetail`
(mapped from: RegionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**locations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationSummary&gt;**](LocationSummary.md) |  | 
**mainGeneration** | main_generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) |  |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RegionName&gt;**](RegionName.md) |  | 
**pokedexes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexSummary&gt;**](PokedexSummary.md) |  | 
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 




# **Table `RegionDetailLocationSummary`**
(mapped from: RegionDetailLocationSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
locationSummary | locationSummary | long | | kotlin.Long | Foreign Key | *many*




# **Table `RegionDetailRegionName`**
(mapped from: RegionDetailRegionName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
regionName | regionName | long | | kotlin.Long | Foreign Key | *many*



# **Table `RegionDetailPokedexSummary`**
(mapped from: RegionDetailPokedexSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
pokedexSummary | pokedexSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `RegionDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: RegionDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



