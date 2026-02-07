-module(openapi_pokemon_encounters_retrieve_200_response_inner_location_area).

-include("openapi.hrl").

-export([openapi_pokemon_encounters_retrieve_200_response_inner_location_area/0]).

-export([openapi_pokemon_encounters_retrieve_200_response_inner_location_area/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_location_area/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_location_area() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_encounters_retrieve_200_response_inner_location_area() ->
    openapi_pokemon_encounters_retrieve_200_response_inner_location_area([]).

openapi_pokemon_encounters_retrieve_200_response_inner_location_area(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

