-module(openapi_location_area_detail_pokemon_encounters_inner).

-export([encode/1]).

-export_type([openapi_location_area_detail_pokemon_encounters_inner/0]).

-type openapi_location_area_detail_pokemon_encounters_inner() ::
    #{ 'pokemon' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'version_details' := list()
     }.

encode(#{ 'pokemon' := Pokemon,
          'version_details' := VersionDetails
        }) ->
    #{ 'pokemon' => Pokemon,
       'version_details' => VersionDetails
     }.
