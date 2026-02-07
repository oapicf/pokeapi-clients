-module(openapi_region_name).

-include("openapi.hrl").

-export([openapi_region_name/0]).

-export([openapi_region_name/1]).

-export_type([openapi_region_name/0]).

-type openapi_region_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_region_name() ->
    openapi_region_name([]).

openapi_region_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

