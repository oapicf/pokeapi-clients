
# Table `PokemonFormDetail`
(mapped from: PokemonFormDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**formName** | form_name | text NOT NULL |  | **kotlin.String** |  | 
**pokemon** | pokemon | long NOT NULL |  | [**PokemonSummary**](PokemonSummary.md) |  |  [foreignkey]
**sprites** | sprites | long NOT NULL |  | [**PokemonFormDetailSprites**](PokemonFormDetailSprites.md) |  |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  [foreignkey]
**formNames** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  | 
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  | 
**order** | order | int |  | **kotlin.Int** |  |  [optional]
**formOrder** | form_order | int |  | **kotlin.Int** |  |  [optional]
**isDefault** | is_default | boolean |  | **kotlin.Boolean** |  |  [optional]
**isBattleOnly** | is_battle_only | boolean |  | **kotlin.Boolean** |  |  [optional]
**isMega** | is_mega | boolean |  | **kotlin.Boolean** |  |  [optional]








# **Table `PokemonFormDetailPokemonFormDetailFormNamesInner`**
(mapped from: PokemonFormDetailPokemonFormDetailFormNamesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormDetailFormNamesInner | pokemonFormDetailFormNamesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonFormDetailPokemonFormDetailFormNamesInner`**
(mapped from: PokemonFormDetailPokemonFormDetailFormNamesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormDetailFormNamesInner | pokemonFormDetailFormNamesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonFormDetailPokemonDetailTypesInner`**
(mapped from: PokemonFormDetailPokemonDetailTypesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDetailTypesInner | pokemonDetailTypesInner | long | | kotlin.Long | Foreign Key | *many*








