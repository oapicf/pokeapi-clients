
# Table `PokemonColorDetail`
(mapped from: PokemonColorDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonColorName&gt;**](PokemonColorName.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | 




# **Table `PokemonColorDetailPokemonColorName`**
(mapped from: PokemonColorDetailPokemonColorName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonColorDetail | pokemonColorDetail | long | | kotlin.Long | Primary Key | *one*
pokemonColorName | pokemonColorName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonColorDetailPokemonSpeciesSummary`**
(mapped from: PokemonColorDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonColorDetail | pokemonColorDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



