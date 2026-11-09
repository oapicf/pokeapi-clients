
# Table `PokemonShapeDetail`
(mapped from: PokemonShapeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**awesomeNames** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonShapeAwesomeName&gt;**](PokemonShapeAwesomeName.md) | The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonShapeName&gt;**](PokemonShapeName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this shape. |  [readonly]




# **Table `PokemonShapeDetailPokemonShapeAwesomeName`**
(mapped from: PokemonShapeDetailPokemonShapeAwesomeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonShapeDetail | pokemonShapeDetail | long | | kotlin.Long | Primary Key | *one*
pokemonShapeAwesomeName | pokemonShapeAwesomeName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonShapeDetailPokemonShapeName`**
(mapped from: PokemonShapeDetailPokemonShapeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonShapeDetail | pokemonShapeDetail | long | | kotlin.Long | Primary Key | *one*
pokemonShapeName | pokemonShapeName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonShapeDetailPokemonSpeciesSummary`**
(mapped from: PokemonShapeDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonShapeDetail | pokemonShapeDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



