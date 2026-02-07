-module(openapi_pokemon_species_detail_genera_inner).

-export([encode/1]).

-export_type([openapi_pokemon_species_detail_genera_inner/0]).

-type openapi_pokemon_species_detail_genera_inner() ::
    #{ 'genus' := binary(),
       'language' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'genus' := Genus,
          'language' := Language
        }) ->
    #{ 'genus' => Genus,
       'language' => Language
     }.
