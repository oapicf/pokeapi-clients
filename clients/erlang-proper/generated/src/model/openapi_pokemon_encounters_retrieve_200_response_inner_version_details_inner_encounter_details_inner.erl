-module(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner).

-include("openapi.hrl").

-export([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner/0]).

-export([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner() ::
  [ {'chance', integer() }
  | {'condition_values', list(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner()) }
  | {'max_level', integer() }
  | {'method', openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method() }
  | {'min_level', integer() }
  ].


openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner() ->
    openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner([]).

openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner(Fields) ->
  Default = [ {'chance', integer() }
            , {'condition_values', list(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner()) }
            , {'max_level', integer() }
            , {'method', openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method() }
            , {'min_level', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

