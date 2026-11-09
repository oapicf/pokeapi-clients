-module(openapi_location_area_encounter_rate).

-include("openapi.hrl").

-export([openapi_location_area_encounter_rate/0]).

-export([openapi_location_area_encounter_rate/1]).

-export_type([openapi_location_area_encounter_rate/0]).

-type openapi_location_area_encounter_rate() ::
  [ {'encounter_method', openapi_encounter_method_summary:openapi_encounter_method_summary() }
  | {'version_details', list(openapi_location_area_encounter_version_detail:openapi_location_area_encounter_version_detail()) }
  ].


openapi_location_area_encounter_rate() ->
    openapi_location_area_encounter_rate([]).

openapi_location_area_encounter_rate(Fields) ->
  Default = [ {'encounter_method', openapi_encounter_method_summary:openapi_encounter_method_summary() }
            , {'version_details', list(openapi_location_area_encounter_version_detail:openapi_location_area_encounter_version_detail()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

