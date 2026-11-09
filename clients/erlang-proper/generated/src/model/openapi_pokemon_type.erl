-module(openapi_pokemon_type).

-include("openapi.hrl").

-export([openapi_pokemon_type/0]).

-export([openapi_pokemon_type/1]).

-export_type([openapi_pokemon_type/0]).

-type openapi_pokemon_type() ::
  [ {'slot', integer() }
  | {'type', openapi_type_summary:openapi_type_summary() }
  ].


openapi_pokemon_type() ->
    openapi_pokemon_type([]).

openapi_pokemon_type(Fields) ->
  Default = [ {'slot', integer(-2147483648, 2147483647) }
            , {'type', openapi_type_summary:openapi_type_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

