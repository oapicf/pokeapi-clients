-module(openapi_pokemon_detail_past_abilities_inner).

-export([encode/1]).

-export_type([openapi_pokemon_detail_past_abilities_inner/0]).

-type openapi_pokemon_detail_past_abilities_inner() ::
    #{ 'abilities' := list(),
       'generation' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'abilities' := Abilities,
          'generation' := Generation
        }) ->
    #{ 'abilities' => Abilities,
       'generation' => Generation
     }.
