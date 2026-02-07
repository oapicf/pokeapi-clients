-module(openapi_pokemon_shape_detail_names_inner).

-export([encode/1]).

-export_type([openapi_pokemon_shape_detail_names_inner/0]).

-type openapi_pokemon_shape_detail_names_inner() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri(),
       'name' := binary()
     }.

encode(#{ 'url' := Url,
          'name' := Name
        }) ->
    #{ 'url' => Url,
       'name' => Name
     }.
