-module(openapi_stat_affecting_natures).

-include("openapi.hrl").

-export([openapi_stat_affecting_natures/0]).

-export([openapi_stat_affecting_natures/1]).

-export_type([openapi_stat_affecting_natures/0]).

-type openapi_stat_affecting_natures() ::
  [ {'increase', list(openapi_nature_summary:openapi_nature_summary()) }
  | {'decrease', list(openapi_nature_summary:openapi_nature_summary()) }
  ].


openapi_stat_affecting_natures() ->
    openapi_stat_affecting_natures([]).

openapi_stat_affecting_natures(Fields) ->
  Default = [ {'increase', list(openapi_nature_summary:openapi_nature_summary()) }
            , {'decrease', list(openapi_nature_summary:openapi_nature_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

