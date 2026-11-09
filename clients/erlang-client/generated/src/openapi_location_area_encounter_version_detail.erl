-module(openapi_location_area_encounter_version_detail).

-export([encode/1]).

-export_type([openapi_location_area_encounter_version_detail/0]).

-type openapi_location_area_encounter_version_detail() ::
    #{ 'rate' := integer(),
       'version' := openapi_version_summary:openapi_version_summary()
     }.

encode(#{ 'rate' := Rate,
          'version' := Version
        }) ->
    #{ 'rate' => Rate,
       'version' => Version
     }.
