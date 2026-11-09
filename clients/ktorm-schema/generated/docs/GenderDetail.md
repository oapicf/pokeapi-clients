
# Table `GenderDetail`
(mapped from: GenderDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**pokemonSpeciesDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GenderPokemonSpecies&gt;**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. |  [readonly]
**requiredForEvolution** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. |  [readonly]




# **Table `GenderDetailGenderPokemonSpecies`**
(mapped from: GenderDetailGenderPokemonSpecies)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
genderDetail | genderDetail | long | | kotlin.Long | Primary Key | *one*
genderPokemonSpecies | genderPokemonSpecies | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenderDetailPokemonSpeciesSummary`**
(mapped from: GenderDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
genderDetail | genderDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



