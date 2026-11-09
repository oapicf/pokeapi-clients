-module(openapi_location_area_encounter_detail).

-include("openapi.hrl").

-export([openapi_location_area_encounter_detail/0]).

-export([openapi_location_area_encounter_detail/1]).

-export_type([openapi_location_area_encounter_detail/0]).

-type openapi_location_area_encounter_detail() ::
  [ {'min_level', integer() }
  | {'max_level', integer() }
  | {'chance', integer() }
  | {'method', openapi_encounter_method_summary:openapi_encounter_method_summary() }
  | {'condition_values', list(openapi_encounter_condition_value_summary:openapi_encounter_condition_value_summary()) }
  | {'pokemon_details', openapi_encounter_pokemon_detail:openapi_encounter_pokemon_detail() }
  ].


openapi_location_area_encounter_detail() ->
    openapi_location_area_encounter_detail([]).

openapi_location_area_encounter_detail(Fields) ->
  Default = [ {'min_level', integer() }
            , {'max_level', integer() }
            , {'chance', integer() }
            , {'method', openapi_encounter_method_summary:openapi_encounter_method_summary() }
            , {'condition_values', list(openapi_encounter_condition_value_summary:openapi_encounter_condition_value_summary()) }
            , {'pokemon_details', openapi_encounter_pokemon_detail:openapi_encounter_pokemon_detail() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

