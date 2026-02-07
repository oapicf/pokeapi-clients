-module(openapi_generation_summary).

-include("openapi.hrl").

-export([openapi_generation_summary/0]).

-export([openapi_generation_summary/1]).

-export_type([openapi_generation_summary/0]).

-type openapi_generation_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_generation_summary() ->
    openapi_generation_summary([]).

openapi_generation_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

