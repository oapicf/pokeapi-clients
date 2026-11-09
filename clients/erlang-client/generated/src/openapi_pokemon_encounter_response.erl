-module(openapi_pokemon_encounter_response).

-export([encode/1]).

-export_type([openapi_pokemon_encounter_response/0]).

-type openapi_pokemon_encounter_response() ::
    #{ 'location_area' := openapi_location_area_summary:openapi_location_area_summary(),
       'version_details' := list()
     }.

encode(#{ 'location_area' := LocationArea,
          'version_details' := VersionDetails
        }) ->
    #{ 'location_area' => LocationArea,
       'version_details' => VersionDetails
     }.
