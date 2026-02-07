-module(openapi_growth_rate_detail).

-export([encode/1]).

-export_type([openapi_growth_rate_detail/0]).

-type openapi_growth_rate_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'formula' := binary(),
       'descriptions' := list(),
       'levels' := list(),
       'pokemon_species' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'formula' := Formula,
          'descriptions' := Descriptions,
          'levels' := Levels,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'formula' => Formula,
       'descriptions' => Descriptions,
       'levels' => Levels,
       'pokemon_species' => PokemonSpecies
     }.
