
# Table `PokemonDetail`
(mapped from: PokemonDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**abilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailAbilitiesInner&gt;**](PokemonDetailAbilitiesInner.md) |  | 
**pastAbilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailPastAbilitiesInner&gt;**](PokemonDetailPastAbilitiesInner.md) |  | 
**forms** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) |  | 
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) |  | 
**heldItems** | held_items | long NOT NULL |  | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  |  [foreignkey]
**locationAreaEncounters** | location_area_encounters | text NOT NULL |  | **kotlin.String** |  |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailMovesInner&gt;**](PokemonDetailMovesInner.md) |  | 
**species** | species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  |  [foreignkey]
**sprites** | sprites | long NOT NULL |  | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  |  [foreignkey]
**cries** | cries | long NOT NULL |  | [**PokemonDetailCries**](PokemonDetailCries.md) |  |  [foreignkey]
**stats** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonStat&gt;**](PokemonStat.md) |  | 
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  | 
**pastTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailPastTypesInner&gt;**](PokemonDetailPastTypesInner.md) |  | 
**baseExperience** | base_experience | int |  | **kotlin.Int** |  |  [optional]
**height** | height | int |  | **kotlin.Int** |  |  [optional]
**isDefault** | is_default | boolean |  | **kotlin.Boolean** |  |  [optional]
**order** | order | int |  | **kotlin.Int** |  |  [optional]
**weight** | weight | int |  | **kotlin.Int** |  |  [optional]




# **Table `PokemonDetailPokemonDetailAbilitiesInner`**
(mapped from: PokemonDetailPokemonDetailAbilitiesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDetailAbilitiesInner | pokemonDetailAbilitiesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonDetailPastAbilitiesInner`**
(mapped from: PokemonDetailPokemonDetailPastAbilitiesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDetailPastAbilitiesInner | pokemonDetailPastAbilitiesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonFormSummary`**
(mapped from: PokemonDetailPokemonFormSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormSummary | pokemonFormSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonGameIndex`**
(mapped from: PokemonDetailPokemonGameIndex)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonGameIndex | pokemonGameIndex | long | | kotlin.Long | Foreign Key | *many*





# **Table `PokemonDetailPokemonDetailMovesInner`**
(mapped from: PokemonDetailPokemonDetailMovesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDetailMovesInner | pokemonDetailMovesInner | long | | kotlin.Long | Foreign Key | *many*






# **Table `PokemonDetailPokemonStat`**
(mapped from: PokemonDetailPokemonStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonStat | pokemonStat | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonDetailTypesInner`**
(mapped from: PokemonDetailPokemonDetailTypesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDetailTypesInner | pokemonDetailTypesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonDetailPastTypesInner`**
(mapped from: PokemonDetailPokemonDetailPastTypesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDetailPastTypesInner | pokemonDetailPastTypesInner | long | | kotlin.Long | Foreign Key | *many*








