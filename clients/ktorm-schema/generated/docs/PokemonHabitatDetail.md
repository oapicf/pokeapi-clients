
# Table `PokemonHabitatDetail`
(mapped from: PokemonHabitatDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHabitatName&gt;**](PokemonHabitatName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of the Pokémon species that can be found in this habitat. |  [readonly]




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



