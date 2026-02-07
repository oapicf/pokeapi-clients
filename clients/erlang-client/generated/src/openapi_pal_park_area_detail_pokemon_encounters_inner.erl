-module(openapi_pal_park_area_detail_pokemon_encounters_inner).

-export([encode/1]).

-export_type([openapi_pal_park_area_detail_pokemon_encounters_inner/0]).

-type openapi_pal_park_area_detail_pokemon_encounters_inner() ::
    #{ 'base_score' := integer(),
       'pokemon_species' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'rate' := integer()
     }.

encode(#{ 'base_score' := BaseScore,
          'pokemon_species' := PokemonSpecies,
          'rate' := Rate
        }) ->
    #{ 'base_score' => BaseScore,
       'pokemon-species' => PokemonSpecies,
       'rate' => Rate
     }.
