-module(openapi_ability_detail_pokemon_inner).

-export([encode/1]).

-export_type([openapi_ability_detail_pokemon_inner/0]).

-type openapi_ability_detail_pokemon_inner() ::
    #{ 'is_hidden' := boolean(),
       'slot' := integer(),
       'pokemon' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'is_hidden' := IsHidden,
          'slot' := Slot,
          'pokemon' := Pokemon
        }) ->
    #{ 'is_hidden' => IsHidden,
       'slot' => Slot,
       'pokemon' => Pokemon
     }.
