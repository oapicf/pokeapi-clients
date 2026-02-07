-module(openapi_stat_name).

-include("openapi.hrl").

-export([openapi_stat_name/0]).

-export([openapi_stat_name/1]).

-export_type([openapi_stat_name/0]).

-type openapi_stat_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_stat_name() ->
    openapi_stat_name([]).

openapi_stat_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

