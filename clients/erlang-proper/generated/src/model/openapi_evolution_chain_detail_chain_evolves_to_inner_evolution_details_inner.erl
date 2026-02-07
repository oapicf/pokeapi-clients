-module(openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner).

-include("openapi.hrl").

-export([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner/0]).

-export([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner/1]).

-export_type([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner/0]).

-type openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner() ::
  [ {'gender', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
  | {'held_item', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
  | {'item', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
  | {'known_move', map() }
  | {'known_move_type', map() }
  | {'location', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
  | {'min_affection', integer() }
  | {'min_beauty', integer() }
  | {'min_happiness', integer() }
  | {'min_level', integer() }
  | {'needs_overworld_rain', boolean() }
  | {'party_species', binary() }
  | {'party_type', binary() }
  | {'relative_physical_stats', binary() }
  | {'time_of_day', binary() }
  | {'trade_species', binary() }
  | {'trigger', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'turn_upside_down', boolean() }
  ].


openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner() ->
    openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner([]).

openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(Fields) ->
  Default = [ {'gender', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
            , {'held_item', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
            , {'item', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
            , {'known_move', map() }
            , {'known_move_type', map() }
            , {'location', openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() }
            , {'min_affection', integer() }
            , {'min_beauty', integer() }
            , {'min_happiness', integer() }
            , {'min_level', integer() }
            , {'needs_overworld_rain', boolean() }
            , {'party_species', binary() }
            , {'party_type', binary() }
            , {'relative_physical_stats', binary() }
            , {'time_of_day', binary() }
            , {'trade_species', binary() }
            , {'trigger', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'turn_upside_down', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

