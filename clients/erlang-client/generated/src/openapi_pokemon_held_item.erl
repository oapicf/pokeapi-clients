-module(openapi_pokemon_held_item).

-export([encode/1]).

-export_type([openapi_pokemon_held_item/0]).

-type openapi_pokemon_held_item() ::
    #{ 'pokemon' := openapi_pokemon_summary:openapi_pokemon_summary(),
       'version_details' := list()
     }.

encode(#{ 'pokemon' := Pokemon,
          'version_details' := VersionDetails
        }) ->
    #{ 'pokemon' => Pokemon,
       'version_details' => VersionDetails
     }.
