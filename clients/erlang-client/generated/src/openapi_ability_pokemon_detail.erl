-module(openapi_ability_pokemon_detail).

-export([encode/1]).

-export_type([openapi_ability_pokemon_detail/0]).

-type openapi_ability_pokemon_detail() ::
    #{ 'is_hidden' => boolean(),
       'slot' := integer(),
       'pokemon' := openapi_pokemon_summary:openapi_pokemon_summary()
     }.

encode(#{ 'is_hidden' := IsHidden,
          'slot' := Slot,
          'pokemon' := Pokemon
        }) ->
    #{ 'is_hidden' => IsHidden,
       'slot' => Slot,
       'pokemon' => Pokemon
     }.
