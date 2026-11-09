
# Table `EggGroupDetail`
(mapped from: EggGroupDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EggGroupName&gt;**](EggGroupName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of all Pokémon species that are members of this egg group. |  [readonly]




# **Table `EggGroupDetailEggGroupName`**
(mapped from: EggGroupDetailEggGroupName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
eggGroupDetail | eggGroupDetail | long | | kotlin.Long | Primary Key | *one*
eggGroupName | eggGroupName | long | | kotlin.Long | Foreign Key | *many*



# **Table `EggGroupDetailPokemonSpeciesSummary`**
(mapped from: EggGroupDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
eggGroupDetail | eggGroupDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



