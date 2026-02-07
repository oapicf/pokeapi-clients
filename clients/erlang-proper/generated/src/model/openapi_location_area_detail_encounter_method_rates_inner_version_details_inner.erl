-module(openapi_location_area_detail_encounter_method_rates_inner_version_details_inner).

-include("openapi.hrl").

-export([openapi_location_area_detail_encounter_method_rates_inner_version_details_inner/0]).

-export([openapi_location_area_detail_encounter_method_rates_inner_version_details_inner/1]).

-export_type([openapi_location_area_detail_encounter_method_rates_inner_version_details_inner/0]).

-type openapi_location_area_detail_encounter_method_rates_inner_version_details_inner() ::
  [ {'rate', integer() }
  | {'version', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_location_area_detail_encounter_method_rates_inner_version_details_inner() ->
    openapi_location_area_detail_encounter_method_rates_inner_version_details_inner([]).

openapi_location_area_detail_encounter_method_rates_inner_version_details_inner(Fields) ->
  Default = [ {'rate', integer() }
            , {'version', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

