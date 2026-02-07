-module(openapi_nature_summary).

-include("openapi.hrl").

-export([openapi_nature_summary/0]).

-export([openapi_nature_summary/1]).

-export_type([openapi_nature_summary/0]).

-type openapi_nature_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_nature_summary() ->
    openapi_nature_summary([]).

openapi_nature_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

