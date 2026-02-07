-module(openapi_pal_park_area_summary).

-include("openapi.hrl").

-export([openapi_pal_park_area_summary/0]).

-export([openapi_pal_park_area_summary/1]).

-export_type([openapi_pal_park_area_summary/0]).

-type openapi_pal_park_area_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pal_park_area_summary() ->
    openapi_pal_park_area_summary([]).

openapi_pal_park_area_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

