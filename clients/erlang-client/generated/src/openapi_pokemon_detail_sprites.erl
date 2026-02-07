-module(openapi_pokemon_detail_sprites).

-export([encode/1]).

-export_type([openapi_pokemon_detail_sprites/0]).

-type openapi_pokemon_detail_sprites() ::
    #{ 'front_default' => openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'front_default' := FrontDefault
        }) ->
    #{ 'front_default' => FrontDefault
     }.
