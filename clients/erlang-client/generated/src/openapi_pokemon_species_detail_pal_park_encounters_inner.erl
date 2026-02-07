-module(openapi_pokemon_species_detail_pal_park_encounters_inner).

-export([encode/1]).

-export_type([openapi_pokemon_species_detail_pal_park_encounters_inner/0]).

-type openapi_pokemon_species_detail_pal_park_encounters_inner() ::
    #{ 'area' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'base_score' := integer(),
       'rate' := integer()
     }.

encode(#{ 'area' := Area,
          'base_score' := BaseScore,
          'rate' := Rate
        }) ->
    #{ 'area' => Area,
       'base_score' => BaseScore,
       'rate' => Rate
     }.
