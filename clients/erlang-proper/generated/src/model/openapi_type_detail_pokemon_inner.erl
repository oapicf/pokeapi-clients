-module(openapi_type_detail_pokemon_inner).

-include("openapi.hrl").

-export([openapi_type_detail_pokemon_inner/0]).

-export([openapi_type_detail_pokemon_inner/1]).

-export_type([openapi_type_detail_pokemon_inner/0]).

-type openapi_type_detail_pokemon_inner() ::
  [ {'slot', integer() }
  | {'pokemon', openapi_type_detail_pokemon_inner_pokemon:openapi_type_detail_pokemon_inner_pokemon() }
  ].


openapi_type_detail_pokemon_inner() ->
    openapi_type_detail_pokemon_inner([]).

openapi_type_detail_pokemon_inner(Fields) ->
  Default = [ {'slot', integer() }
            , {'pokemon', openapi_type_detail_pokemon_inner_pokemon:openapi_type_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

