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
       'held_items' := openapi_pokemon_detail_held_items:openapi_pokemon_detail_held_items(),
       'location_area_encounters' := binary(),
       'moves' := list(),
       'species' := openapi_pokemon_species_summary:openapi_pokemon_species_summary(),
       'sprites' := openapi_pokemon_detail_sprites:openapi_pokemon_detail_sprites(),
       'cries' := openapi_pokemon_detail_cries:openapi_pokemon_detail_cries(),
       'stats' := list(),
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
       'types' => Types,
       'past_types' => PastTypes
     }.
