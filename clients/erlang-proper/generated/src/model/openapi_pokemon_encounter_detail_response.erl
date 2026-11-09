-module(openapi_pokemon_encounter_detail_response).

-include("openapi.hrl").

-export([openapi_pokemon_encounter_detail_response/0]).

-export([openapi_pokemon_encounter_detail_response/1]).

-export_type([openapi_pokemon_encounter_detail_response/0]).

-type openapi_pokemon_encounter_detail_response() ::
  [ {'chance', integer() }
  | {'condition_values', list(openapi_encounter_condition_value_summary:openapi_encounter_condition_value_summary()) }
  | {'max_level', integer() }
  | {'method', openapi_encounter_method_summary:openapi_encounter_method_summary() }
  | {'min_level', integer() }
  ].


openapi_pokemon_encounter_detail_response() ->
    openapi_pokemon_encounter_detail_response([]).

openapi_pokemon_encounter_detail_response(Fields) ->
  Default = [ {'chance', integer() }
            , {'condition_values', list(openapi_encounter_condition_value_summary:openapi_encounter_condition_value_summary()) }
            , {'max_level', integer() }
            , {'method', openapi_encounter_method_summary:openapi_encounter_method_summary() }
            , {'min_level', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

