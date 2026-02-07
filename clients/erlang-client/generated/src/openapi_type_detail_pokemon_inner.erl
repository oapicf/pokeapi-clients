-module(openapi_type_detail_pokemon_inner).

-export([encode/1]).

-export_type([openapi_type_detail_pokemon_inner/0]).

-type openapi_type_detail_pokemon_inner() ::
    #{ 'slot' => integer(),
       'pokemon' => openapi_type_detail_pokemon_inner_pokemon:openapi_type_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'slot' := Slot,
          'pokemon' := Pokemon
        }) ->
    #{ 'slot' => Slot,
       'pokemon' => Pokemon
     }.
