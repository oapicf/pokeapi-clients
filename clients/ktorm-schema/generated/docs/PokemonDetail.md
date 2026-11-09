
# Table `PokemonDetail`
(mapped from: PokemonDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**abilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonAbility&gt;**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. |  [readonly]
**pastAbilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonPastAbility&gt;**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations |  [readonly]
**forms** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. |  [readonly]
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. |  [readonly]
**heldItems** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHeldItemSummary&gt;**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. |  [readonly]
**locationAreaEncounters** | location_area_encounters | text NOT NULL |  | **kotlin.String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonMove&gt;**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. |  [readonly]
**species** | species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. |  [foreignkey]
**sprites** | sprites | long NOT NULL |  | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; |  [readonly] [foreignkey]
**cries** | cries | long NOT NULL |  | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; |  [readonly] [foreignkey]
**stats** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonStat&gt;**](PokemonStat.md) | A list of base stat values for this Pokémon. |  [readonly]
**pastStats** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonPastStat&gt;**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations |  [readonly]
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonType&gt;**](PokemonType.md) | A list of details showing types this Pokémon has. |  [readonly]
**pastTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonPastType&gt;**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations |  [readonly]
**baseExperience** | base_experience | int |  | **kotlin.Int** | The base experience gained for defeating this Pokémon. |  [optional]
**height** | height | int |  | **kotlin.Int** | The height of this Pokémon in decimetres. |  [optional]
**isDefault** | is_default | boolean |  | **kotlin.Boolean** | Set for exactly one Pokémon used as the default for each species. |  [optional]
**order** | order | int |  | **kotlin.Int** | Order for sorting. Almost national order, except families are grouped together. |  [optional]
**weight** | weight | int |  | **kotlin.Int** | The weight of this Pokémon in hectograms. |  [optional]




# **Table `PokemonDetailPokemonAbility`**
(mapped from: PokemonDetailPokemonAbility)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonAbility | pokemonAbility | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonPastAbility`**
(mapped from: PokemonDetailPokemonPastAbility)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonPastAbility | pokemonPastAbility | long | | kotlin.Long | Foreign Key | *many*



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



# **Table `PokemonDetailPokemonHeldItemSummary`**
(mapped from: PokemonDetailPokemonHeldItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonHeldItemSummary | pokemonHeldItemSummary | long | | kotlin.Long | Foreign Key | *many*




# **Table `PokemonDetailPokemonMove`**
(mapped from: PokemonDetailPokemonMove)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonMove | pokemonMove | long | | kotlin.Long | Foreign Key | *many*






# **Table `PokemonDetailPokemonStat`**
(mapped from: PokemonDetailPokemonStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonStat | pokemonStat | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonPastStat`**
(mapped from: PokemonDetailPokemonPastStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonPastStat | pokemonPastStat | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonType`**
(mapped from: PokemonDetailPokemonType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonType | pokemonType | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonDetailPokemonPastType`**
(mapped from: PokemonDetailPokemonPastType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetail | pokemonDetail | long | | kotlin.Long | Primary Key | *one*
pokemonPastType | pokemonPastType | long | | kotlin.Long | Foreign Key | *many*








