-module(openapi_pokemon_held_item_summary).

-export([encode/1]).

-export_type([openapi_pokemon_held_item_summary/0]).

-type openapi_pokemon_held_item_summary() ::
    #{ 'item' := openapi_item_summary:openapi_item_summary(),
       'version_details' := list()
     }.

encode(#{ 'item' := Item,
          'version_details' := VersionDetails
        }) ->
    #{ 'item' => Item,
       'version_details' => VersionDetails
     }.
