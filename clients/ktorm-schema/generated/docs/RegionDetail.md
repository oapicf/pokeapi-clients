
# Table `RegionDetail`
(mapped from: RegionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**locations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationSummary&gt;**](LocationSummary.md) | A list of locations that can be found in this region. |  [readonly]
**mainGeneration** | main_generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RegionName&gt;**](RegionName.md) | The name of this resource listed in different languages. |  [readonly]
**pokedexes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. |  [readonly]
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups where this region can be visited. |  [readonly]




# **Table `RegionDetailLocationSummary`**
(mapped from: RegionDetailLocationSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
locationSummary | locationSummary | long | | kotlin.Long | Foreign Key | *many*




# **Table `RegionDetailRegionName`**
(mapped from: RegionDetailRegionName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
regionName | regionName | long | | kotlin.Long | Foreign Key | *many*



# **Table `RegionDetailPokedexSummary`**
(mapped from: RegionDetailPokedexSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
pokedexSummary | pokedexSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `RegionDetailVersionGroupSummary`**
(mapped from: RegionDetailVersionGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDetail | regionDetail | long | | kotlin.Long | Primary Key | *one*
versionGroupSummary | versionGroupSummary | long | | kotlin.Long | Foreign Key | *many*



