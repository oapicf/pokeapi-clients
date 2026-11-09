
# Table `GrowthRateDetail`
(mapped from: GrowthRateDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**formula** | formula | text NOT NULL |  | **kotlin.String** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GrowthRateDescription&gt;**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. |  [readonly]
**levels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Experience&gt;**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. |  [readonly]
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. |  [readonly]





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



