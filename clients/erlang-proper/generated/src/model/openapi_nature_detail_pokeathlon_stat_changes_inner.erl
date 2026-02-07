-module(openapi_nature_detail_pokeathlon_stat_changes_inner).

-include("openapi.hrl").

-export([openapi_nature_detail_pokeathlon_stat_changes_inner/0]).

-export([openapi_nature_detail_pokeathlon_stat_changes_inner/1]).

-export_type([openapi_nature_detail_pokeathlon_stat_changes_inner/0]).

-type openapi_nature_detail_pokeathlon_stat_changes_inner() ::
  [ {'max_change', integer() }
  | {'pokeathlon_stat', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_nature_detail_pokeathlon_stat_changes_inner() ->
    openapi_nature_detail_pokeathlon_stat_changes_inner([]).

openapi_nature_detail_pokeathlon_stat_changes_inner(Fields) ->
  Default = [ {'max_change', integer() }
            , {'pokeathlon_stat', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

