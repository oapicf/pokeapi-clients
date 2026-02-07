-module(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner).

-include("openapi.hrl").

-export([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner/0]).

-export([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner() ::
  [ {'encounter_details', list(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner()) }
  | {'max_chance', integer() }
  | {'version', openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_version:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_version() }
  ].


openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner() ->
    openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner([]).

openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner(Fields) ->
  Default = [ {'encounter_details', list(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner()) }
            , {'max_chance', integer() }
            , {'version', openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_version:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_version() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

