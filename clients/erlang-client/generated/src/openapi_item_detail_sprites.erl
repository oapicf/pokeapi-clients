-module(openapi_item_detail_sprites).

-export([encode/1]).

-export_type([openapi_item_detail_sprites/0]).

-type openapi_item_detail_sprites() ::
    #{ 'default' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'default' := Default
        }) ->
    #{ 'default' => Default
     }.
