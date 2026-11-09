-module(openapi_pokemon_evolution_known_move).

-export([encode/1]).

-export_type([openapi_pokemon_evolution_known_move/0]).

-type openapi_pokemon_evolution_known_move() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
