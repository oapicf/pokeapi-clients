# pokemon_species_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**order** | **int** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] 
**gender_rate** | **int** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] 
**capture_rate** | **int** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] 
**base_happiness** | **int** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] 
**is_baby** | **int** | Whether or not this is a baby Pokémon. | [optional] 
**is_legendary** | **int** | Whether or not this is a legendary Pokémon. | [optional] 
**is_mythical** | **int** | Whether or not this is a mythical Pokémon. | [optional] 
**hatch_counter** | **int** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] 
**has_gender_differences** | **int** | Whether or not this Pokémon has visual gender differences. | [optional] 
**forms_switchable** | **int** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] 
**growth_rate** | [**growth_rate_summary_t**](growth_rate_summary.md) \* | The rate at which this Pokémon species gains levels. | 
**pokedex_numbers** | [**list_t**](pokemon_dex_entry.md) \* | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] 
**egg_groups** | [**list_t**](egg_group_summary.md) \* | A list of egg groups this Pokémon species is a member of. | [readonly] 
**color** | [**pokemon_color_summary_t**](pokemon_color_summary.md) \* | The color of this Pokémon for Pokédex search. | 
**shape** | [**pokemon_shape_summary_t**](pokemon_shape_summary.md) \* | The shape of this Pokémon for Pokédex search. | 
**evolves_from_species** | [**pokemon_species_summary_t**](pokemon_species_summary.md) \* | The Pokémon species that evolves into this Pokemon_species. | 
**evolution_chain** | [**evolution_chain_summary_t**](evolution_chain_summary.md) \* | The evolution chain this Pokémon species is a member of. | 
**habitat** | [**pokemon_habitat_summary_t**](pokemon_habitat_summary.md) \* | The habitat this Pokémon species can be encountered in. | 
**generation** | [**generation_summary_t**](generation_summary.md) \* | The generation this Pokémon species was introduced in. | 
**names** | [**list_t**](pokemon_species_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**pal_park_encounters** | [**list_t**](pokemon_species_pal_park_encounter.md) \* | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] 
**form_descriptions** | [**list_t**](pokemon_species_description.md) \* | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] 
**flavor_text_entries** | [**list_t**](pokemon_species_flavor_text.md) \* | A list of flavor text entries for this Pokémon species. | [readonly] 
**genera** | [**list_t**](pokemon_species_genus.md) \* | The genus of this Pokémon species listed in multiple languages. | [readonly] 
**varieties** | [**list_t**](pokemon_species_variety.md) \* | A list of the Pokémon that exist within this Pokémon species. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


