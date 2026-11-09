-module(openapi_gender_pokemon_species).

-export([encode/1]).

-export_type([openapi_gender_pokemon_species/0]).

-type openapi_gender_pokemon_species() ::
    #{ 'rate' := integer(),
       'pokemon_species' := openapi_pokemon_species_summary:openapi_pokemon_species_summary()
     }.

encode(#{ 'rate' := Rate,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'rate' => Rate,
       'pokemon_species' => PokemonSpecies
     }.
