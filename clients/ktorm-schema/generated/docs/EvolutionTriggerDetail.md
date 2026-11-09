
# Table `EvolutionTriggerDetail`
(mapped from: EvolutionTriggerDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionTriggerName&gt;**](EvolutionTriggerName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of pokemon species that result from this evolution trigger. |  [readonly]




# **Table `EvolutionTriggerDetailEvolutionTriggerName`**
(mapped from: EvolutionTriggerDetailEvolutionTriggerName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionTriggerDetail | evolutionTriggerDetail | long | | kotlin.Long | Primary Key | *one*
evolutionTriggerName | evolutionTriggerName | long | | kotlin.Long | Foreign Key | *many*



# **Table `EvolutionTriggerDetailPokemonSpeciesSummary`**
(mapped from: EvolutionTriggerDetailPokemonSpeciesSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionTriggerDetail | evolutionTriggerDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesSummary | pokemonSpeciesSummary | long | | kotlin.Long | Foreign Key | *many*



