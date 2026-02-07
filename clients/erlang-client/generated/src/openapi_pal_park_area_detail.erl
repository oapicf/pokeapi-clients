-module(openapi_pal_park_area_detail).

-export([encode/1]).

-export_type([openapi_pal_park_area_detail/0]).

-type openapi_pal_park_area_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'names' := list(),
       'pokemon_encounters' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'names' := Names,
          'pokemon_encounters' := PokemonEncounters
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'names' => Names,
       'pokemon_encounters' => PokemonEncounters
     }.
