-module(openapi_pokemon_detail_past_types_inner).

-export([encode/1]).

-export_type([openapi_pokemon_detail_past_types_inner/0]).

-type openapi_pokemon_detail_past_types_inner() ::
    #{ 'generation' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'types' := list()
     }.

encode(#{ 'generation' := Generation,
          'types' := Types
        }) ->
    #{ 'generation' => Generation,
       'types' => Types
     }.
