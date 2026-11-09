-module(openapi_location_area_pokemon_encounter).

-export([encode/1]).

-export_type([openapi_location_area_pokemon_encounter/0]).

-type openapi_location_area_pokemon_encounter() ::
    #{ 'pokemon' := openapi_pokemon_summary:openapi_pokemon_summary(),
       'version_details' := list()
     }.

encode(#{ 'pokemon' := Pokemon,
          'version_details' := VersionDetails
        }) ->
    #{ 'pokemon' => Pokemon,
       'version_details' => VersionDetails
     }.
