-module(openapi_pal_park_encounter).

-export([encode/1]).

-export_type([openapi_pal_park_encounter/0]).

-type openapi_pal_park_encounter() ::
    #{ 'base_score' => integer(),
       'rate' := integer(),
       'pokemon_species' := openapi_pokemon_species_summary:openapi_pokemon_species_summary()
     }.

encode(#{ 'base_score' := BaseScore,
          'rate' := Rate,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'base_score' => BaseScore,
       'rate' => Rate,
       'pokemon_species' => PokemonSpecies
     }.
