-module(openapi_evolution_chain_detail_chain_evolves_to_inner).

-export([encode/1]).

-export_type([openapi_evolution_chain_detail_chain_evolves_to_inner/0]).

-type openapi_evolution_chain_detail_chain_evolves_to_inner() ::
    #{ 'evolution_details' := list(),
       'is_baby' := boolean(),
       'species' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'evolution_details' := EvolutionDetails,
          'is_baby' := IsBaby,
          'species' := Species
        }) ->
    #{ 'evolution_details' => EvolutionDetails,
       'is_baby' => IsBaby,
       'species' => Species
     }.
