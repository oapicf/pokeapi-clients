-module(openapi_location_area_detail_encounter_method_rates_inner_version_details_inner).

-export([encode/1]).

-export_type([openapi_location_area_detail_encounter_method_rates_inner_version_details_inner/0]).

-type openapi_location_area_detail_encounter_method_rates_inner_version_details_inner() ::
    #{ 'rate' := integer(),
       'version' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'rate' := Rate,
          'version' := Version
        }) ->
    #{ 'rate' => Rate,
       'version' => Version
     }.
