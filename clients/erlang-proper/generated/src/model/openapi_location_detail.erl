-module(openapi_location_detail).

-include("openapi.hrl").

-export([openapi_location_detail/0]).

-export([openapi_location_detail/1]).

-export_type([openapi_location_detail/0]).

-type openapi_location_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'region', openapi_region_summary:openapi_region_summary() }
  | {'names', list(openapi_location_name:openapi_location_name()) }
  | {'game_indices', list(openapi_location_game_index:openapi_location_game_index()) }
  | {'areas', list(openapi_location_area_summary:openapi_location_area_summary()) }
  ].


openapi_location_detail() ->
    openapi_location_detail([]).

openapi_location_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'region', openapi_region_summary:openapi_region_summary() }
            , {'names', list(openapi_location_name:openapi_location_name()) }
            , {'game_indices', list(openapi_location_game_index:openapi_location_game_index()) }
            , {'areas', list(openapi_location_area_summary:openapi_location_area_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

