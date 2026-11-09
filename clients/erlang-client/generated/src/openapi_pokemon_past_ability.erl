-module(openapi_pokemon_past_ability).

-export([encode/1]).

-export_type([openapi_pokemon_past_ability/0]).

-type openapi_pokemon_past_ability() ::
    #{ 'abilities' := list(),
       'generation' := openapi_generation_summary:openapi_generation_summary()
     }.

encode(#{ 'abilities' := Abilities,
          'generation' := Generation
        }) ->
    #{ 'abilities' => Abilities,
       'generation' => Generation
     }.
