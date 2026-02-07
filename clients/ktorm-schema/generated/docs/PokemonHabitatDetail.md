
# Table `PokemonHabitatDetail`
(mapped from: PokemonHabitatDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHabitatName&gt;**](PokemonHabitatName.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | 




# **Table `PokemonHabitatDetailPokemonHabitatName`**
(mapped from: PokemonHabitatDetailPokemonHabitatName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonHabitatDetail | pokemonHabitatDetail | long | | kotlin.Long | Primary Key | *one*
pokemonHabitatName | pokemonHabitatName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonHabitatDetailPokemonSpeciesSummary`**
(mapped from: PokemonHabitatDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonHabitatDetail | pokemonHabitatDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



