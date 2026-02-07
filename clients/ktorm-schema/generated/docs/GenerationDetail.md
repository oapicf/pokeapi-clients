
# Table `GenerationDetail`
(mapped from: GenerationDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**abilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilitySummary&gt;**](AbilitySummary.md) |  | 
**mainRegion** | main_region | long NOT NULL |  | [**RegionSummary**](RegionSummary.md) |  |  [foreignkey]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GenerationName&gt;**](GenerationName.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | 
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeSummary&gt;**](TypeSummary.md) |  | 
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) |  | 




# **Table `GenerationDetailAbilitySummary`**
(mapped from: GenerationDetailAbilitySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generationDetail | generationDetail | long | | kotlin.Long | Primary Key | *one*
abilitySummary | abilitySummary | long | | kotlin.Long | Foreign Key | *many*




# **Table `GenerationDetailMoveSummary`**
(mapped from: GenerationDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generationDetail | generationDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenerationDetailGenerationName`**
(mapped from: GenerationDetailGenerationName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generationDetail | generationDetail | long | | kotlin.Long | Primary Key | *one*
generationName | generationName | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenerationDetailPokemonSpeciesSummary`**
(mapped from: GenerationDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generationDetail | generationDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenerationDetailTypeSummary`**
(mapped from: GenerationDetailTypeSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generationDetail | generationDetail | long | | kotlin.Long | Primary Key | *one*
typeSummary | typeSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenerationDetailVersionGroupSummary`**
(mapped from: GenerationDetailVersionGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generationDetail | generationDetail | long | | kotlin.Long | Primary Key | *one*
versionGroupSummary | versionGroupSummary | long | | kotlin.Long | Foreign Key | *many*



