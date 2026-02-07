-module(openapi_pokemon_encounters_retrieve_200_response_inner).

-include("openapi.hrl").

-export([openapi_pokemon_encounters_retrieve_200_response_inner/0]).

-export([openapi_pokemon_encounters_retrieve_200_response_inner/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner() ::
  [ {'location_area', openapi_pokemon_encounters_retrieve_200_response_inner_location_area:openapi_pokemon_encounters_retrieve_200_response_inner_location_area() }
  | {'version_details', list(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner()) }
  ].


openapi_pokemon_encounters_retrieve_200_response_inner() ->
    openapi_pokemon_encounters_retrieve_200_response_inner([]).

openapi_pokemon_encounters_retrieve_200_response_inner(Fields) ->
  Default = [ {'location_area', openapi_pokemon_encounters_retrieve_200_response_inner_location_area:openapi_pokemon_encounters_retrieve_200_response_inner_location_area() }
            , {'version_details', list(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

