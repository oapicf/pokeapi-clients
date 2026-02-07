-module(openapi_pokemon_shape_detail).

-export([encode/1]).

-export_type([openapi_pokemon_shape_detail/0]).

-type openapi_pokemon_shape_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'awesome_names' := list(),
       'names' := list(),
       'pokemon_species' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'awesome_names' := AwesomeNames,
          'names' := Names,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'awesome_names' => AwesomeNames,
       'names' => Names,
       'pokemon_species' => PokemonSpecies
     }.
