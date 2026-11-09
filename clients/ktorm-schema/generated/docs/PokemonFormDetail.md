
# Table `PokemonFormDetail`
(mapped from: PokemonFormDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**formName** | form_name | text NOT NULL |  | **kotlin.String** | The name of this form. | 
**pokemon** | pokemon | long NOT NULL |  | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. |  [foreignkey]
**sprites** | sprites | long NOT NULL |  | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. |  [readonly] [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. |  [foreignkey]
**formNames** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly]
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormType&gt;**](PokemonFormType.md) | A list of details showing types this Pokémon form has. |  [readonly]
**triggerConditions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormTriggerCondition&gt;**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. |  [readonly]
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormFlavorText&gt;**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. |  [readonly]
**order** | order | int |  | **kotlin.Int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. |  [optional]
**formOrder** | form_order | int |  | **kotlin.Int** | The order in which forms should be sorted within a species&#39; forms. |  [optional]
**isDefault** | is_default | boolean |  | **kotlin.Boolean** | True for exactly one form used as the default for each Pokémon. |  [optional]
**isBattleOnly** | is_battle_only | boolean |  | **kotlin.Boolean** | Whether or not this form can only happen during battle. |  [optional]
**isMega** | is_mega | boolean |  | **kotlin.Boolean** | Whether or not this form requires mega evolution. |  [optional]








# **Table `PokemonFormDetailPokemonFormName`**
(mapped from: PokemonFormDetailPokemonFormName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormName | pokemonFormName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonFormDetailPokemonFormName`**
(mapped from: PokemonFormDetailPokemonFormName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormName | pokemonFormName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonFormDetailPokemonFormType`**
(mapped from: PokemonFormDetailPokemonFormType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormType | pokemonFormType | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonFormDetailPokemonFormTriggerCondition`**
(mapped from: PokemonFormDetailPokemonFormTriggerCondition)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormTriggerCondition | pokemonFormTriggerCondition | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonFormDetailPokemonFormFlavorText`**
(mapped from: PokemonFormDetailPokemonFormFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonFormDetail | pokemonFormDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormFlavorText | pokemonFormFlavorText | long | | kotlin.Long | Foreign Key | *many*








