-module(openapi_item_sprites).

-export([encode/1]).

-export_type([openapi_item_sprites/0]).

-type openapi_item_sprites() ::
    #{ 'default' := binary()
     }.

encode(#{ 'default' := Default
        }) ->
    #{ 'default' => Default
     }.
