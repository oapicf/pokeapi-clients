-module(openapi_location_area_encounter_version_detail).

-include("openapi.hrl").

-export([openapi_location_area_encounter_version_detail/0]).

-export([openapi_location_area_encounter_version_detail/1]).

-export_type([openapi_location_area_encounter_version_detail/0]).

-type openapi_location_area_encounter_version_detail() ::
  [ {'rate', integer() }
  | {'version', openapi_version_summary:openapi_version_summary() }
  ].


openapi_location_area_encounter_version_detail() ->
    openapi_location_area_encounter_version_detail([]).

openapi_location_area_encounter_version_detail(Fields) ->
  Default = [ {'rate', integer() }
            , {'version', openapi_version_summary:openapi_version_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

