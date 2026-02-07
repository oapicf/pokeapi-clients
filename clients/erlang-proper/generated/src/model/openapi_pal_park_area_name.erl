-module(openapi_pal_park_area_name).

-include("openapi.hrl").

-export([openapi_pal_park_area_name/0]).

-export([openapi_pal_park_area_name/1]).

-export_type([openapi_pal_park_area_name/0]).

-type openapi_pal_park_area_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pal_park_area_name() ->
    openapi_pal_park_area_name([]).

openapi_pal_park_area_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

