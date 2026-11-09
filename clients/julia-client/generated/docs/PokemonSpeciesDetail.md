# PokemonSpeciesDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`order`** | **`Int64`** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] [default to nothing]
**`gender_rate`** | **`Int64`** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] [default to nothing]
**`capture_rate`** | **`Int64`** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] [default to nothing]
**`base_happiness`** | **`Int64`** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] [default to nothing]
**`is_baby`** | **`Bool`** | Whether or not this is a baby Pokémon. | [optional] [default to nothing]
**`is_legendary`** | **`Bool`** | Whether or not this is a legendary Pokémon. | [optional] [default to nothing]
**`is_mythical`** | **`Bool`** | Whether or not this is a mythical Pokémon. | [optional] [default to nothing]
**`hatch_counter`** | **`Int64`** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] [default to nothing]
**`has_gender_differences`** | **`Bool`** | Whether or not this Pokémon has visual gender differences. | [optional] [default to nothing]
**`forms_switchable`** | **`Bool`** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] [default to nothing]
**`growth_rate`** | [**`*GrowthRateSummary`**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | [default to nothing]
**`pokedex_numbers`** | [**`Vector{PokemonDexEntry}`**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] [default to nothing]
**`egg_groups`** | [**`Vector{EggGroupSummary}`**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly] [default to nothing]
**`color`** | [**`*PokemonColorSummary`**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | [default to nothing]
**`shape`** | [**`*PokemonShapeSummary`**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | [default to nothing]
**`evolves_from_species`** | [**`*PokemonSpeciesSummary`**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | [default to nothing]
**`evolution_chain`** | [**`*EvolutionChainSummary`**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | [default to nothing]
**`habitat`** | [**`*PokemonHabitatSummary`**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | [default to nothing]
**`generation`** | [**`*GenerationSummary`**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | [default to nothing]
**`names`** | [**`Vector{PokemonSpeciesName}`**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`pal_park_encounters`** | [**`Vector{PokemonSpeciesPalParkEncounter}`**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] [default to nothing]
**`form_descriptions`** | [**`Vector{PokemonSpeciesDescription}`**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] [default to nothing]
**`flavor_text_entries`** | [**`Vector{PokemonSpeciesFlavorText}`**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly] [default to nothing]
**`genera`** | [**`Vector{PokemonSpeciesGenus}`**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly] [default to nothing]
**`varieties`** | [**`Vector{PokemonSpeciesVariety}`**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


