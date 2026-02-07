-module(openapi_location_summary).

-include("openapi.hrl").

-export([openapi_location_summary/0]).

-export([openapi_location_summary/1]).

-export_type([openapi_location_summary/0]).

-type openapi_location_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_location_summary() ->
    openapi_location_summary([]).

openapi_location_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

