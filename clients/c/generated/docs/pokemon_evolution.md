# pokemon_evolution_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_group** | [**version_group_summary_t**](version_group_summary.md) \* | The version group in which these evolution requirements apply. | 
**is_default** | **int** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] 
**item** | [**item_summary_t**](item_summary.md) \* | The item required to cause evolution this into Pokémon species. | 
**trigger** | [**evolution_trigger_summary_t**](evolution_trigger_summary.md) \* | The type of event that triggers evolution into this Pokémon species. | 
**gender** | **int** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] 
**held_item** | [**item_summary_t**](item_summary.md) \* | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | 
**known_move** | [**pokemon_evolution_known_move_t**](pokemon_evolution_known_move.md) \* |  | 
**known_move_type** | [**pokemon_evolution_known_move_t**](pokemon_evolution_known_move.md) \* |  | 
**location** | [**location_summary_t**](location_summary.md) \* | The location the evolution must be triggered at. | 
**min_level** | **int** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**min_happiness** | **int** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**min_beauty** | **int** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**min_affection** | **int** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**near_special_rock** | **int** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] 
**needs_multiplayer** | **int** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] 
**needs_overworld_rain** | **int** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] 
**party_species** | [**pokemon_species_summary_t**](pokemon_species_summary.md) \* | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**party_type** | [**type_summary_t**](type_summary.md) \* | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**relative_physical_stats** | **int** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] 
**time_of_day** | **char \*** | The required time of day. Day or night. | [optional] 
**trade_species** | [**pokemon_species_summary_t**](pokemon_species_summary.md) \* | Pokémon species for which this one must be traded. | 
**turn_upside_down** | **int** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] 
**region** | [**region_summary_t**](region_summary.md) \* | The required region in which this evolution can occur. | 
**required_pokemon_form** | [**pokemon_form_summary_t**](pokemon_form_summary.md) \* | The Pokémon form required before evolving, or null if unrestricted. | 
**evolved_pokemon_form** | [**pokemon_form_summary_t**](pokemon_form_summary.md) \* | The Pokémon form produced by this evolution, or null if unspecified. | 
**used_move** | [**move_summary_t**](move_summary.md) \* | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | 
**min_move_count** | **int** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] 
**min_steps** | **int** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] 
**min_damage_taken** | **int** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] 
**allowed_natures** | [**list_t**](nature_summary.md) \* | The natures that allow this evolution, or null if unrestricted. | [readonly] 
**condition_expression** | [**evolution_condition_expression_t**](evolution_condition_expression.md) \* | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


