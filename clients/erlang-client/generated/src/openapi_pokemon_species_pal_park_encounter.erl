-module(openapi_pokemon_species_pal_park_encounter).

-export([encode/1]).

-export_type([openapi_pokemon_species_pal_park_encounter/0]).

-type openapi_pokemon_species_pal_park_encounter() ::
    #{ 'base_score' => integer(),
       'rate' := integer(),
       'area' := openapi_pal_park_area_summary:openapi_pal_park_area_summary()
     }.

encode(#{ 'base_score' := BaseScore,
          'rate' := Rate,
          'area' := Area
        }) ->
    #{ 'base_score' => BaseScore,
       'rate' => Rate,
       'area' => Area
     }.
