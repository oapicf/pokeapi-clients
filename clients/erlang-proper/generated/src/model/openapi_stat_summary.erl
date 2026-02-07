-module(openapi_stat_summary).

-include("openapi.hrl").

-export([openapi_stat_summary/0]).

-export([openapi_stat_summary/1]).

-export_type([openapi_stat_summary/0]).

-type openapi_stat_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_stat_summary() ->
    openapi_stat_summary([]).

openapi_stat_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

