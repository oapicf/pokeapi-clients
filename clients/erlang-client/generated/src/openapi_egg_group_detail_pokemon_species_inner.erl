-module(openapi_egg_group_detail_pokemon_species_inner).

-export([encode/1]).

-export_type([openapi_egg_group_detail_pokemon_species_inner/0]).

-type openapi_egg_group_detail_pokemon_species_inner() ::
    #{ 'name' => binary(),
       'url' => openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
