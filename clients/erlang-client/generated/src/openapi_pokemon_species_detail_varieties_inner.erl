-module(openapi_pokemon_species_detail_varieties_inner).

-export([encode/1]).

-export_type([openapi_pokemon_species_detail_varieties_inner/0]).

-type openapi_pokemon_species_detail_varieties_inner() ::
    #{ 'is_default' := boolean(),
       'pokemon' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'is_default' := IsDefault,
          'pokemon' := Pokemon
        }) ->
    #{ 'is_default' => IsDefault,
       'pokemon' => Pokemon
     }.
