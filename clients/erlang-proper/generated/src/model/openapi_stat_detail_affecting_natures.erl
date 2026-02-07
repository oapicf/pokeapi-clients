-module(openapi_stat_detail_affecting_natures).

-include("openapi.hrl").

-export([openapi_stat_detail_affecting_natures/0]).

-export([openapi_stat_detail_affecting_natures/1]).

-export_type([openapi_stat_detail_affecting_natures/0]).

-type openapi_stat_detail_affecting_natures() ::
  [ {'increase', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'decrease', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_stat_detail_affecting_natures() ->
    openapi_stat_detail_affecting_natures([]).

openapi_stat_detail_affecting_natures(Fields) ->
  Default = [ {'increase', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'decrease', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

