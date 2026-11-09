-module(openapi_pokemon_ability).

-export([encode/1]).

-export_type([openapi_pokemon_ability/0]).

-type openapi_pokemon_ability() ::
    #{ 'is_hidden' => boolean(),
       'slot' := integer(),
       'ability' := openapi_ability_summary:openapi_ability_summary()
     }.

encode(#{ 'is_hidden' := IsHidden,
          'slot' := Slot,
          'ability' := Ability
        }) ->
    #{ 'is_hidden' => IsHidden,
       'slot' => Slot,
       'ability' => Ability
     }.
