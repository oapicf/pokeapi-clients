-module(openapi_pokemon_detail_types_inner).

-include("openapi.hrl").

-export([openapi_pokemon_detail_types_inner/0]).

-export([openapi_pokemon_detail_types_inner/1]).

-export_type([openapi_pokemon_detail_types_inner/0]).

-type openapi_pokemon_detail_types_inner() ::
  [ {'slot', integer() }
  | {'type', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_pokemon_detail_types_inner() ->
    openapi_pokemon_detail_types_inner([]).

openapi_pokemon_detail_types_inner(Fields) ->
  Default = [ {'slot', integer() }
            , {'type', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

