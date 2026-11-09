-module(openapi_pokemon_past_ability).

-include("openapi.hrl").

-export([openapi_pokemon_past_ability/0]).

-export([openapi_pokemon_past_ability/1]).

-export_type([openapi_pokemon_past_ability/0]).

-type openapi_pokemon_past_ability() ::
  [ {'abilities', list(openapi_pokemon_ability_past:openapi_pokemon_ability_past()) }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  ].


openapi_pokemon_past_ability() ->
    openapi_pokemon_past_ability([]).

openapi_pokemon_past_ability(Fields) ->
  Default = [ {'abilities', list(openapi_pokemon_ability_past:openapi_pokemon_ability_past()) }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

