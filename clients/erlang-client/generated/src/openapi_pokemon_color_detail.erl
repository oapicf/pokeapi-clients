-module(openapi_pokemon_color_detail).

-export([encode/1]).

-export_type([openapi_pokemon_color_detail/0]).

-type openapi_pokemon_color_detail() ::
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
