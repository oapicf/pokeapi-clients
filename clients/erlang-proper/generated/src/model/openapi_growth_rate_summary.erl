-module(openapi_growth_rate_summary).

-include("openapi.hrl").

-export([openapi_growth_rate_summary/0]).

-export([openapi_growth_rate_summary/1]).

-export_type([openapi_growth_rate_summary/0]).

-type openapi_growth_rate_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_growth_rate_summary() ->
    openapi_growth_rate_summary([]).

openapi_growth_rate_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

