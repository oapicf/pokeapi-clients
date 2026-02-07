-module(openapi_pokeathlon_stat_detail).

-include("openapi.hrl").

-export([openapi_pokeathlon_stat_detail/0]).

-export([openapi_pokeathlon_stat_detail/1]).

-export_type([openapi_pokeathlon_stat_detail/0]).

-type openapi_pokeathlon_stat_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'affecting_natures', openapi_pokeathlon_stat_detail_affecting_natures:openapi_pokeathlon_stat_detail_affecting_natures() }
  | {'names', list(openapi_pokeathlon_stat_name:openapi_pokeathlon_stat_name()) }
  ].


openapi_pokeathlon_stat_detail() ->
    openapi_pokeathlon_stat_detail([]).

openapi_pokeathlon_stat_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'affecting_natures', openapi_pokeathlon_stat_detail_affecting_natures:openapi_pokeathlon_stat_detail_affecting_natures() }
            , {'names', list(openapi_pokeathlon_stat_name:openapi_pokeathlon_stat_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

