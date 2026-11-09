# PokemonSpeciesDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**order** | **int** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional]
**gender_rate** | **int** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional]
**capture_rate** | **int** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional]
**base_happiness** | **int** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional]
**is_baby** | **bool** | Whether or not this is a baby Pokémon. | [optional]
**is_legendary** | **bool** | Whether or not this is a legendary Pokémon. | [optional]
**is_mythical** | **bool** | Whether or not this is a mythical Pokémon. | [optional]
**hatch_counter** | **int** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional]
**has_gender_differences** | **bool** | Whether or not this Pokémon has visual gender differences. | [optional]
**forms_switchable** | **bool** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional]
**growth_rate** | [**\OpenAPI\Client\Model\GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. |
**pokedex_numbers** | [**\OpenAPI\Client\Model\PokemonDexEntry[]**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly]
**egg_groups** | [**\OpenAPI\Client\Model\EggGroupSummary[]**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly]
**color** | [**\OpenAPI\Client\Model\PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. |
**shape** | [**\OpenAPI\Client\Model\PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. |
**evolves_from_species** | [**\OpenAPI\Client\Model\PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. |
**evolution_chain** | [**\OpenAPI\Client\Model\EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. |
**habitat** | [**\OpenAPI\Client\Model\PokemonHabitatSummary**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. |
**generation** | [**\OpenAPI\Client\Model\GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. |
**names** | [**\OpenAPI\Client\Model\PokemonSpeciesName[]**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly]
**pal_park_encounters** | [**\OpenAPI\Client\Model\PokemonSpeciesPalParkEncounter[]**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly]
**form_descriptions** | [**\OpenAPI\Client\Model\PokemonSpeciesDescription[]**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly]
**flavor_text_entries** | [**\OpenAPI\Client\Model\PokemonSpeciesFlavorText[]**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly]
**genera** | [**\OpenAPI\Client\Model\PokemonSpeciesGenus[]**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly]
**varieties** | [**\OpenAPI\Client\Model\PokemonSpeciesVariety[]**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
