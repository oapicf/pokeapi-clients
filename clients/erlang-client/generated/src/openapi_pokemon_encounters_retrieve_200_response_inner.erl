-module(openapi_pokemon_encounters_retrieve_200_response_inner).

-export([encode/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner() ::
    #{ 'location_area' := openapi_pokemon_encounters_retrieve_200_response_inner_location_area:openapi_pokemon_encounters_retrieve_200_response_inner_location_area(),
       'version_details' := list()
     }.

encode(#{ 'location_area' := LocationArea,
          'version_details' := VersionDetails
        }) ->
    #{ 'location_area' => LocationArea,
       'version_details' => VersionDetails
     }.
