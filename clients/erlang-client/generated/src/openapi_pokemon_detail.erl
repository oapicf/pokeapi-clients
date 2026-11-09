-module(openapi_pokemon_detail).

-export([encode/1]).

-export_type([openapi_pokemon_detail/0]).

-type openapi_pokemon_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'base_experience' => integer(),
       'height' => integer(),
       'is_default' => boolean(),
       'order' => integer(),
       'weight' => integer(),
       'abilities' := list(),
       'past_abilities' := list(),
       'forms' := list(),
       'game_indices' := list(),
       'held_items' := list(),
       'location_area_encounters' := binary(),
       'moves' := list(),
       'species' := openapi_pokemon_species_summary:openapi_pokemon_species_summary(),
       'sprites' := openapi_pokemon_sprites:openapi_pokemon_sprites(),
       'cries' := openapi_pokemon_cries:openapi_pokemon_cries(),
       'stats' := list(),
       'past_stats' := list(),
       'types' := list(),
       'past_types' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'base_experience' := BaseExperience,
          'height' := Height,
          'is_default' := IsDefault,
          'order' := Order,
          'weight' := Weight,
          'abilities' := Abilities,
          'past_abilities' := PastAbilities,
          'forms' := Forms,
          'game_indices' := GameIndices,
          'held_items' := HeldItems,
          'location_area_encounters' := LocationAreaEncounters,
          'moves' := Moves,
          'species' := Species,
          'sprites' := Sprites,
          'cries' := Cries,
          'stats' := Stats,
          'past_stats' := PastStats,
          'types' := Types,
          'past_types' := PastTypes
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'base_experience' => BaseExperience,
       'height' => Height,
       'is_default' => IsDefault,
       'order' => Order,
       'weight' => Weight,
       'abilities' => Abilities,
       'past_abilities' => PastAbilities,
       'forms' => Forms,
       'game_indices' => GameIndices,
       'held_items' => HeldItems,
       'location_area_encounters' => LocationAreaEncounters,
       'moves' => Moves,
       'species' => Species,
       'sprites' => Sprites,
       'cries' => Cries,
       'stats' => Stats,
       'past_stats' => PastStats,
       'types' => Types,
       'past_types' => PastTypes
     }.
