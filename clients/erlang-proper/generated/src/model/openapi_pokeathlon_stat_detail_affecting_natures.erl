-module(openapi_pokeathlon_stat_detail_affecting_natures).

-include("openapi.hrl").

-export([openapi_pokeathlon_stat_detail_affecting_natures/0]).

-export([openapi_pokeathlon_stat_detail_affecting_natures/1]).

-export_type([openapi_pokeathlon_stat_detail_affecting_natures/0]).

-type openapi_pokeathlon_stat_detail_affecting_natures() ::
  [ {'decrease', list(openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner:openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner()) }
  | {'increase', list(openapi_pokeathlon_stat_detail_affecting_natures_increase_inner:openapi_pokeathlon_stat_detail_affecting_natures_increase_inner()) }
  ].


openapi_pokeathlon_stat_detail_affecting_natures() ->
    openapi_pokeathlon_stat_detail_affecting_natures([]).

openapi_pokeathlon_stat_detail_affecting_natures(Fields) ->
  Default = [ {'decrease', list(openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner:openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner()) }
            , {'increase', list(openapi_pokeathlon_stat_detail_affecting_natures_increase_inner:openapi_pokeathlon_stat_detail_affecting_natures_increase_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

