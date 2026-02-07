-module(openapi_berry_summary).

-include("openapi.hrl").

-export([openapi_berry_summary/0]).

-export([openapi_berry_summary/1]).

-export_type([openapi_berry_summary/0]).

-type openapi_berry_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_berry_summary() ->
    openapi_berry_summary([]).

openapi_berry_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

