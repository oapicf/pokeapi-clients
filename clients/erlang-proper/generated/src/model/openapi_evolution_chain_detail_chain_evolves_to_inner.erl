-module(openapi_evolution_chain_detail_chain_evolves_to_inner).

-include("openapi.hrl").

-export([openapi_evolution_chain_detail_chain_evolves_to_inner/0]).

-export([openapi_evolution_chain_detail_chain_evolves_to_inner/1]).

-export_type([openapi_evolution_chain_detail_chain_evolves_to_inner/0]).

-type openapi_evolution_chain_detail_chain_evolves_to_inner() ::
  [ {'evolution_details', list(openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner()) }
  | {'is_baby', boolean() }
  | {'species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_evolution_chain_detail_chain_evolves_to_inner() ->
    openapi_evolution_chain_detail_chain_evolves_to_inner([]).

openapi_evolution_chain_detail_chain_evolves_to_inner(Fields) ->
  Default = [ {'evolution_details', list(openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner()) }
            , {'is_baby', boolean() }
            , {'species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

