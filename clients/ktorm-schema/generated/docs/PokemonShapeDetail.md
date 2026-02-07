
# Table `PokemonShapeDetail`
(mapped from: PokemonShapeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**awesomeNames** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonShapeDetailAwesomeNamesInner&gt;**](PokemonShapeDetailAwesomeNamesInner.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonShapeDetailNamesInner&gt;**](PokemonShapeDetailNamesInner.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | 




# **Table `PokemonShapeDetailPokemonShapeDetailAwesomeNamesInner`**
(mapped from: PokemonShapeDetailPokemonShapeDetailAwesomeNamesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonShapeDetail | pokemonShapeDetail | long | | kotlin.Long | Primary Key | *one*
pokemonShapeDetailAwesomeNamesInner | pokemonShapeDetailAwesomeNamesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonShapeDetailPokemonShapeDetailNamesInner`**
(mapped from: PokemonShapeDetailPokemonShapeDetailNamesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonShapeDetail | pokemonShapeDetail | long | | kotlin.Long | Primary Key | *one*
pokemonShapeDetailNamesInner | pokemonShapeDetailNamesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonShapeDetailPokemonSpeciesSummary`**
(mapped from: PokemonShapeDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonShapeDetail | pokemonShapeDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



