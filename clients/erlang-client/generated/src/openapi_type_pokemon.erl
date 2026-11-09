-module(openapi_type_pokemon).

-export([encode/1]).

-export_type([openapi_type_pokemon/0]).

-type openapi_type_pokemon() ::
    #{ 'slot' := integer(),
       'pokemon' := openapi_pokemon_summary:openapi_pokemon_summary()
     }.

encode(#{ 'slot' := Slot,
          'pokemon' := Pokemon
        }) ->
    #{ 'slot' => Slot,
       'pokemon' => Pokemon
     }.
