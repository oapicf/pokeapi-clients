-module(openapi_ability_detail_pokemon_inner).

-include("openapi.hrl").

-export([openapi_ability_detail_pokemon_inner/0]).

-export([openapi_ability_detail_pokemon_inner/1]).

-export_type([openapi_ability_detail_pokemon_inner/0]).

-type openapi_ability_detail_pokemon_inner() ::
  [ {'is_hidden', boolean() }
  | {'slot', integer() }
  | {'pokemon', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_ability_detail_pokemon_inner() ->
    openapi_ability_detail_pokemon_inner([]).

openapi_ability_detail_pokemon_inner(Fields) ->
  Default = [ {'is_hidden', boolean() }
            , {'slot', integer() }
            , {'pokemon', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

