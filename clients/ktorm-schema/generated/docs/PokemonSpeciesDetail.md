
# Table `PokemonSpeciesDetail`
(mapped from: PokemonSpeciesDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**growthRate** | growth_rate | long NOT NULL |  | [**GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. |  [foreignkey]
**pokedexNumbers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDexEntry&gt;**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. |  [readonly]
**eggGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EggGroupSummary&gt;**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. |  [readonly]
**color** | color | long NOT NULL |  | [**PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. |  [foreignkey]
**shape** | shape | long NOT NULL |  | [**PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. |  [foreignkey]
**evolvesFromSpecies** | evolves_from_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. |  [foreignkey]
**evolutionChain** | evolution_chain | long NOT NULL |  | [**EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. |  [foreignkey]
**habitat** | habitat | long NOT NULL |  | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. |  [foreignkey]
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesName&gt;**](PokemonSpeciesName.md) | The name of this resource listed in different languages. |  [readonly]
**palParkEncounters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesPalParkEncounter&gt;**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. |  [readonly]
**formDescriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesDescription&gt;**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. |  [readonly]
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesFlavorText&gt;**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. |  [readonly]
**genera** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesGenus&gt;**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. |  [readonly]
**varieties** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSpeciesVariety&gt;**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. |  [readonly]
**order** | order | int |  | **kotlin.Int** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. |  [optional]
**genderRate** | gender_rate | int |  | **kotlin.Int** | The chance of this Pokémon being female, in eighths; or -1 for genderless. |  [optional]
**captureRate** | capture_rate | int |  | **kotlin.Int** | The base capture rate; up to 255. The higher the number, the easier the catch. |  [optional]
**baseHappiness** | base_happiness | int |  | **kotlin.Int** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. |  [optional]
**isBaby** | is_baby | boolean |  | **kotlin.Boolean** | Whether or not this is a baby Pokémon. |  [optional]
**isLegendary** | is_legendary | boolean |  | **kotlin.Boolean** | Whether or not this is a legendary Pokémon. |  [optional]
**isMythical** | is_mythical | boolean |  | **kotlin.Boolean** | Whether or not this is a mythical Pokémon. |  [optional]
**hatchCounter** | hatch_counter | int |  | **kotlin.Int** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. |  [optional]
**hasGenderDifferences** | has_gender_differences | boolean |  | **kotlin.Boolean** | Whether or not this Pokémon has visual gender differences. |  [optional]
**formsSwitchable** | forms_switchable | boolean |  | **kotlin.Boolean** | Whether or not this Pokémon has multiple forms and can switch between them. |  [optional]





# **Table `PokemonSpeciesDetailPokemonDexEntry`**
(mapped from: PokemonSpeciesDetailPokemonDexEntry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonDexEntry | pokemonDexEntry | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailEggGroupSummary`**
(mapped from: PokemonSpeciesDetailEggGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
eggGroupSummary | eggGroupSummary | long | | kotlin.Long | Foreign Key | *many*









# **Table `PokemonSpeciesDetailPokemonSpeciesName`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesName | pokemonSpeciesName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesPalParkEncounter`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesPalParkEncounter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesPalParkEncounter | pokemonSpeciesPalParkEncounter | long | | kotlin.Long | Foreign Key | *many*



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



# **Table `PokemonSpeciesDetailPokemonSpeciesGenus`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesGenus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesGenus | pokemonSpeciesGenus | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokemonSpeciesDetailPokemonSpeciesVariety`**
(mapped from: PokemonSpeciesDetailPokemonSpeciesVariety)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonSpeciesDetail | pokemonSpeciesDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSpeciesVariety | pokemonSpeciesVariety | long | | kotlin.Long | Foreign Key | *many*













