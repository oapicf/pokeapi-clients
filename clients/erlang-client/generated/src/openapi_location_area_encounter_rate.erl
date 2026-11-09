-module(openapi_location_area_encounter_rate).

-export([encode/1]).

-export_type([openapi_location_area_encounter_rate/0]).

-type openapi_location_area_encounter_rate() ::
    #{ 'encounter_method' := openapi_encounter_method_summary:openapi_encounter_method_summary(),
       'version_details' := list()
     }.

encode(#{ 'encounter_method' := EncounterMethod,
          'version_details' := VersionDetails
        }) ->
    #{ 'encounter_method' => EncounterMethod,
       'version_details' => VersionDetails
     }.
