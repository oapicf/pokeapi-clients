
# Table `VersionGroupDetail`
(mapped from: VersionGroupDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. |  [foreignkey]
**moveLearnMethods** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. |  [readonly]
**pokedexes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. |  [readonly]
**regions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. |  [readonly]
**versions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. |  [readonly]
**order** | order | int |  | **kotlin.Int** | Order for sorting. Almost by date of release, except similar versions are grouped together. |  [optional]





# **Table `VersionGroupDetailMoveLearnMethodSummary`**
(mapped from: VersionGroupDetailMoveLearnMethodSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
moveLearnMethodSummary | moveLearnMethodSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `VersionGroupDetailPokedexSummary`**
(mapped from: VersionGroupDetailPokedexSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
pokedexSummary | pokedexSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `VersionGroupDetailRegionSummary`**
(mapped from: VersionGroupDetailRegionSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
regionSummary | regionSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `VersionGroupDetailVersionSummary`**
(mapped from: VersionGroupDetailVersionSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionGroupDetail | versionGroupDetail | long | | kotlin.Long | Primary Key | *one*
versionSummary | versionSummary | long | | kotlin.Long | Foreign Key | *many*




