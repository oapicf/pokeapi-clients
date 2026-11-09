
# Table `PokedexDetail`
(mapped from: PokedexDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexDescription&gt;**](PokedexDescription.md) | The description of this resource listed in different languages. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexName&gt;**](PokedexName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDexNumber&gt;**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. |  [readonly]
**region** | region | long NOT NULL |  | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. |  [foreignkey]
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. |  [readonly]
**isMainSeries** | is_main_series | boolean |  | **kotlin.Boolean** | Whether or not this Pokédex originated in the main series of the video games. |  [optional]




# **Table `PokedexDetailPokedexDescription`**
(mapped from: PokedexDetailPokedexDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
pokedexDescription | pokedexDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokedexDetailPokedexName`**
(mapped from: PokedexDetailPokedexName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
pokedexName | pokedexName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokedexDetailPokemonDexNumber`**
(mapped from: PokedexDetailPokemonDexNumber)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDexNumber | pokemonDexNumber | long | | kotlin.Long | Foreign Key | *many*




# **Table `PokedexDetailVersionGroupSummary`**
(mapped from: PokedexDetailVersionGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokedexDetail | pokedexDetail | long | | kotlin.Long | Primary Key | *one*
versionGroupSummary | versionGroupSummary | long | | kotlin.Long | Foreign Key | *many*




