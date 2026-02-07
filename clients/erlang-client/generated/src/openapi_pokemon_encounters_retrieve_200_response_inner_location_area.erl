-module(openapi_pokemon_encounters_retrieve_200_response_inner_location_area).

-export([encode/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_location_area/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_location_area() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
