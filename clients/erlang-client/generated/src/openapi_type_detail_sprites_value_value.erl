-module(openapi_type_detail_sprites_value_value).

-export([encode/1]).

-export_type([openapi_type_detail_sprites_value_value/0]).

-type openapi_type_detail_sprites_value_value() ::
    #{ 'name_icon' => openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name_icon' := NameIcon
        }) ->
    #{ 'name-icon' => NameIcon
     }.
