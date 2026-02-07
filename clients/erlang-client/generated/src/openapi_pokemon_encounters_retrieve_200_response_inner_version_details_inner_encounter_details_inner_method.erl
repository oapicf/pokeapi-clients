-module(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method).

-export([encode/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
