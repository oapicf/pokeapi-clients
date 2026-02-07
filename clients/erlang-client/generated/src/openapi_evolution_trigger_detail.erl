-module(openapi_evolution_trigger_detail).

-export([encode/1]).

-export_type([openapi_evolution_trigger_detail/0]).

-type openapi_evolution_trigger_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'names' := list(),
       'pokemon_species' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'names' := Names,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'names' => Names,
       'pokemon_species' => PokemonSpecies
     }.
