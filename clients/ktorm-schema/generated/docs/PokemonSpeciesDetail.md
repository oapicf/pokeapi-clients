
# Table `PokemonSpeciesDetail`
(mapped from: PokemonSpeciesDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**growthRate** | growth_rate | long NOT NULL |  | [**GrowthRateSummary**](GrowthRateSummary.md) |  |  [foreignkey]
**pokedexNumbers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDexEntry&gt;**](PokemonDexEntry.md) |  | 
**eggGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**color** | color | long NOT NULL |  | [**PokemonColorSummary**](PokemonColorSummary.md) |  |  [foreignkey]
**shape** | shape | long NOT NULL |  | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  |  [foreignkey]
**evolvesFromSpecies** | evolves_from_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  |  [foreignkey]
**evolutionChain** | evolution_chain | long NOT NULL |  | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  |  [foreignkey]
**habitat** | habitat | long NOT NULL |  | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  |  [foreignkey]
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  | 
**palParkEncounters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesDetailPalParkEncountersInner&gt;**](PokemonSpeciesDetailPalParkEncountersInner.md) |  | 
**formDescriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesDescription&gt;**](PokemonSpeciesDescription.md) |  | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesFlavorText&gt;**](PokemonSpeciesFlavorText.md) |  | 
**genera** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesDetailGeneraInner&gt;**](PokemonSpeciesDetailGeneraInner.md) |  | 
**varieties** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesDetailVarietiesInner&gt;**](PokemonSpeciesDetailVarietiesInner.md) |  | 
**order** | order | int |  | **kotlin.Int** |  |  [optional]
**genderRate** | gender_rate | int |  | **kotlin.Int** |  |  [optional]
**captureRate** | capture_rate | int |  | **kotlin.Int** |  |  [optional]
**baseHappiness** | base_happiness | int |  | **kotlin.Int** |  |  [optional]
**isBaby** | is_baby | boolean |  | **kotlin.Boolean** |  |  [optional]
**isLegendary** | is_legendary | boolean |  | **kotlin.Boolean** |  |  [optional]
**isMythical** | is_mythical | boolean |  | **kotlin.Boolean** |  |  [optional]
**hatchCounter** | hatch_counter | int |  | **kotlin.Int** |  |  [optional]
**hasGenderDifferences** | has_gender_differences | boolean |  | **kotlin.Boolean** |  |  [optional]
**formsSwitchable** | forms_switchable | boolean |  | **kotlin.Boolean** |  |  [optional]





# **Table `PokemonSpeciesDetailPokemonDexEntry`**
(mapped from: PokemonSpeciesDetailPokemonDexEntry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDexEntry | pokemonDexEntry | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: PokemonSpeciesDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*









# **Table `PokemonSpeciesDetailPokemonFormDetailFormNamesInner`**
(mapped from: PokemonSpeciesDetailPokemonFormDetailFormNamesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonFormDetailFormNamesInner | pokemonFormDetailFormNamesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesDetailPalParkEncountersInner`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesDetailPalParkEncountersInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesDetailPalParkEncountersInner | pokemonSpeciesDetailPalParkEncountersInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesDescription`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesDescription | pokemonSpeciesDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesFlavorText`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesFlavorText | pokemonSpeciesFlavorText | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesDetailGeneraInner`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesDetailGeneraInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesDetailGeneraInner | pokemonSpeciesDetailGeneraInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesDetailVarietiesInner`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesDetailVarietiesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesDetailVarietiesInner | pokemonSpeciesDetailVarietiesInner | long | | kotlin.Long | Foreign Key | *many*













