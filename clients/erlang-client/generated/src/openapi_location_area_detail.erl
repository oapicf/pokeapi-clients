-module(openapi_location_area_detail).

-export([encode/1]).

-export_type([openapi_location_area_detail/0]).

-type openapi_location_area_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'game_index' := integer(),
       'encounter_method_rates' := list(),
       'location' := openapi_location_summary:openapi_location_summary(),
       'names' := list(),
       'pokemon_encounters' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'game_index' := GameIndex,
          'encounter_method_rates' := EncounterMethodRates,
          'location' := Location,
          'names' := Names,
          'pokemon_encounters' := PokemonEncounters
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'game_index' => GameIndex,
       'encounter_method_rates' => EncounterMethodRates,
       'location' => Location,
       'names' => Names,
       'pokemon_encounters' => PokemonEncounters
     }.
