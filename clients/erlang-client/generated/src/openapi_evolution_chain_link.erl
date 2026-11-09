-module(openapi_evolution_chain_link).

-export([encode/1]).

-export_type([openapi_evolution_chain_link/0]).

-type openapi_evolution_chain_link() ::
    #{ 'is_baby' := boolean(),
       'species' := openapi_pokemon_species_summary:openapi_pokemon_species_summary(),
       'evolution_details' := list(),
       'evolves_to' := list()
     }.

encode(#{ 'is_baby' := IsBaby,
          'species' := Species,
          'evolution_details' := EvolutionDetails,
          'evolves_to' := EvolvesTo
        }) ->
    #{ 'is_baby' => IsBaby,
       'species' => Species,
       'evolution_details' => EvolutionDetails,
       'evolves_to' => EvolvesTo
     }.
