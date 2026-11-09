-module(openapi_pokemon_past_type).

-include("openapi.hrl").

-export([openapi_pokemon_past_type/0]).

-export([openapi_pokemon_past_type/1]).

-export_type([openapi_pokemon_past_type/0]).

-type openapi_pokemon_past_type() ::
  [ {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'types', list(openapi_pokemon_type:openapi_pokemon_type()) }
  ].


openapi_pokemon_past_type() ->
    openapi_pokemon_past_type([]).

openapi_pokemon_past_type(Fields) ->
  Default = [ {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'types', list(openapi_pokemon_type:openapi_pokemon_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

