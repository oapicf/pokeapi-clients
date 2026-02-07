-module(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method).

-include("openapi.hrl").

-export([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method/0]).

-export([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method() ->
    openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method([]).

openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

