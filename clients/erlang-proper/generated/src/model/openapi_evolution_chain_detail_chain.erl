-module(openapi_evolution_chain_detail_chain).

-include("openapi.hrl").

-export([openapi_evolution_chain_detail_chain/0]).

-export([openapi_evolution_chain_detail_chain/1]).

-export_type([openapi_evolution_chain_detail_chain/0]).

-type openapi_evolution_chain_detail_chain() ::
  [ {'evolution_details', list(openapi_any_type:openapi_any_type()) }
  | {'evolves_to', list(openapi_evolution_chain_detail_chain_evolves_to_inner:openapi_evolution_chain_detail_chain_evolves_to_inner()) }
  | {'is_baby', boolean() }
  | {'species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_evolution_chain_detail_chain() ->
    openapi_evolution_chain_detail_chain([]).

openapi_evolution_chain_detail_chain(Fields) ->
  Default = [ {'evolution_details', list(openapi_any_type:openapi_any_type()) }
            , {'evolves_to', list(openapi_evolution_chain_detail_chain_evolves_to_inner:openapi_evolution_chain_detail_chain_evolves_to_inner()) }
            , {'is_baby', boolean() }
            , {'species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

