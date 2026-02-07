-module(openapi_gender_detail).

-export([encode/1]).

-export_type([openapi_gender_detail/0]).

-type openapi_gender_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'pokemon_species_details' := list(),
       'required_for_evolution' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'pokemon_species_details' := PokemonSpeciesDetails,
          'required_for_evolution' := RequiredForEvolution
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'pokemon_species_details' => PokemonSpeciesDetails,
       'required_for_evolution' => RequiredForEvolution
     }.
