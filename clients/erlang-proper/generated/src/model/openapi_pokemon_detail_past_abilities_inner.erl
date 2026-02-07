-module(openapi_pokemon_detail_past_abilities_inner).

-include("openapi.hrl").

-export([openapi_pokemon_detail_past_abilities_inner/0]).

-export([openapi_pokemon_detail_past_abilities_inner/1]).

-export_type([openapi_pokemon_detail_past_abilities_inner/0]).

-type openapi_pokemon_detail_past_abilities_inner() ::
  [ {'abilities', list(openapi_pokemon_detail_abilities_inner:openapi_pokemon_detail_abilities_inner()) }
  | {'generation', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_pokemon_detail_past_abilities_inner() ->
    openapi_pokemon_detail_past_abilities_inner([]).

openapi_pokemon_detail_past_abilities_inner(Fields) ->
  Default = [ {'abilities', list(openapi_pokemon_detail_abilities_inner:openapi_pokemon_detail_abilities_inner()) }
            , {'generation', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

