-module(openapi_pokemon_detail_abilities_inner).

-export([encode/1]).

-export_type([openapi_pokemon_detail_abilities_inner/0]).

-type openapi_pokemon_detail_abilities_inner() ::
    #{ 'ability' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'is_hidden' := boolean(),
       'slot' := integer()
     }.

encode(#{ 'ability' := Ability,
          'is_hidden' := IsHidden,
          'slot' := Slot
        }) ->
    #{ 'ability' => Ability,
       'is_hidden' => IsHidden,
       'slot' => Slot
     }.
