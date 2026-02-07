
# Table `GenderDetail`
(mapped from: GenderDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**pokemonSpeciesDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GenderDetailPokemonSpeciesDetailsInner&gt;**](GenderDetailPokemonSpeciesDetailsInner.md) |  | 
**requiredForEvolution** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 




# **Table `GenderDetailGenderDetailPokemonSpeciesDetailsInner`**
(mapped from: GenderDetailGenderDetailPokemonSpeciesDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
genderDetail | genderDetail | long | | kotlin.Long | Primary Key | *one*
genderDetailPokemonSpeciesDetailsInner | genderDetailPokemonSpeciesDetailsInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenderDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: GenderDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
genderDetail | genderDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



