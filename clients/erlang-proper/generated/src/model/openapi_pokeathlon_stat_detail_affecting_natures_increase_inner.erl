-module(openapi_pokeathlon_stat_detail_affecting_natures_increase_inner).

-include("openapi.hrl").

-export([openapi_pokeathlon_stat_detail_affecting_natures_increase_inner/0]).

-export([openapi_pokeathlon_stat_detail_affecting_natures_increase_inner/1]).

-export_type([openapi_pokeathlon_stat_detail_affecting_natures_increase_inner/0]).

-type openapi_pokeathlon_stat_detail_affecting_natures_increase_inner() ::
  [ {'max_change', integer() }
  | {'nature', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_pokeathlon_stat_detail_affecting_natures_increase_inner() ->
    openapi_pokeathlon_stat_detail_affecting_natures_increase_inner([]).

openapi_pokeathlon_stat_detail_affecting_natures_increase_inner(Fields) ->
  Default = [ {'max_change', integer(1) }
            , {'nature', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

