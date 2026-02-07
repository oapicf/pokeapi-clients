-module(openapi_pokemon_detail_types_inner).

-export([encode/1]).

-export_type([openapi_pokemon_detail_types_inner/0]).

-type openapi_pokemon_detail_types_inner() ::
    #{ 'slot' := integer(),
       'type' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'slot' := Slot,
          'type' := Type
        }) ->
    #{ 'slot' => Slot,
       'type' => Type
     }.
