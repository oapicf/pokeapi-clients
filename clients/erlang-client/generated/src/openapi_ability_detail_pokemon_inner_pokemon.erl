-module(openapi_ability_detail_pokemon_inner_pokemon).

-export([encode/1]).

-export_type([openapi_ability_detail_pokemon_inner_pokemon/0]).

-type openapi_ability_detail_pokemon_inner_pokemon() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
