
# Table `GrowthRateDetail`
(mapped from: GrowthRateDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**formula** | formula | text NOT NULL |  | **kotlin.String** |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GrowthRateDescription&gt;**](GrowthRateDescription.md) |  | 
**levels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Experience&gt;**](Experience.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | 





# **Table `GrowthRateDetailGrowthRateDescription`**
(mapped from: GrowthRateDetailGrowthRateDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
growthRateDetail | growthRateDetail | long | | kotlin.Long | Primary Key | *one*
growthRateDescription | growthRateDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `GrowthRateDetailExperience`**
(mapped from: GrowthRateDetailExperience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
growthRateDetail | growthRateDetail | long | | kotlin.Long | Primary Key | *one*
experience | experience | long | | kotlin.Long | Foreign Key | *many*



# **Table `GrowthRateDetailPokemonSpeciesSummary`**
(mapped from: GrowthRateDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
growthRateDetail | growthRateDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



