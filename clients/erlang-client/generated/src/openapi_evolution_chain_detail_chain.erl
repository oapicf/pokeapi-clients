-module(openapi_evolution_chain_detail_chain).

-export([encode/1]).

-export_type([openapi_evolution_chain_detail_chain/0]).

-type openapi_evolution_chain_detail_chain() ::
    #{ 'evolution_details' := list(),
       'evolves_to' := list(),
       'is_baby' := boolean(),
       'species' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'evolution_details' := EvolutionDetails,
          'evolves_to' := EvolvesTo,
          'is_baby' := IsBaby,
          'species' := Species
        }) ->
    #{ 'evolution_details' => EvolutionDetails,
       'evolves_to' => EvolvesTo,
       'is_baby' => IsBaby,
       'species' => Species
     }.
