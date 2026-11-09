# PokemonSpeciesDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**order** | Option<**i32**> | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional]
**gender_rate** | Option<**i32**> | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional]
**capture_rate** | Option<**i32**> | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional]
**base_happiness** | Option<**i32**> | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional]
**is_baby** | Option<**bool**> | Whether or not this is a baby Pokémon. | [optional]
**is_legendary** | Option<**bool**> | Whether or not this is a legendary Pokémon. | [optional]
**is_mythical** | Option<**bool**> | Whether or not this is a mythical Pokémon. | [optional]
**hatch_counter** | Option<**i32**> | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional]
**has_gender_differences** | Option<**bool**> | Whether or not this Pokémon has visual gender differences. | [optional]
**forms_switchable** | Option<**bool**> | Whether or not this Pokémon has multiple forms and can switch between them. | [optional]
**growth_rate** | [**models::GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | 
**pokedex_numbers** | [**Vec<models::PokemonDexEntry>**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly]
**egg_groups** | [**Vec<models::EggGroupSummary>**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly]
**color** | [**models::PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | 
**shape** | [**models::PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | 
**evolves_from_species** | Option<[**models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md)> | The Pokémon species that evolves into this Pokemon_species. | 
**evolution_chain** | [**models::EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | 
**habitat** | Option<[**models::PokemonHabitatSummary**](PokemonHabitatSummary.md)> | The habitat this Pokémon species can be encountered in. | 
**generation** | [**models::GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | 
**names** | [**Vec<models::PokemonSpeciesName>**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly]
**pal_park_encounters** | [**Vec<models::PokemonSpeciesPalParkEncounter>**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly]
**form_descriptions** | [**Vec<models::PokemonSpeciesDescription>**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly]
**flavor_text_entries** | [**Vec<models::PokemonSpeciesFlavorText>**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly]
**genera** | [**Vec<models::PokemonSpeciesGenus>**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly]
**varieties** | [**Vec<models::PokemonSpeciesVariety>**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


