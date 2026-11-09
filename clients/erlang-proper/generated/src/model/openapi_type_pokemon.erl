-module(openapi_type_pokemon).

-include("openapi.hrl").

-export([openapi_type_pokemon/0]).

-export([openapi_type_pokemon/1]).

-export_type([openapi_type_pokemon/0]).

-type openapi_type_pokemon() ::
  [ {'slot', integer() }
  | {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
  ].


openapi_type_pokemon() ->
    openapi_type_pokemon([]).

openapi_type_pokemon(Fields) ->
  Default = [ {'slot', integer(-2147483648, 2147483647) }
            , {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

