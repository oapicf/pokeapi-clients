-module(openapi_gender_detail_pokemon_species_details_inner).

-export([encode/1]).

-export_type([openapi_gender_detail_pokemon_species_details_inner/0]).

-type openapi_gender_detail_pokemon_species_details_inner() ::
    #{ 'rate' := integer(),
       'pokemon_species' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'rate' := Rate,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'rate' => Rate,
       'pokemon_species' => PokemonSpecies
     }.
