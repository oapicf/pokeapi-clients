-module(openapi_pokemon_move_version_group).

-include("openapi.hrl").

-export([openapi_pokemon_move_version_group/0]).

-export([openapi_pokemon_move_version_group/1]).

-export_type([openapi_pokemon_move_version_group/0]).

-type openapi_pokemon_move_version_group() ::
  [ {'level_learned_at', integer() }
  | {'move_learn_method', openapi_move_learn_method_summary:openapi_move_learn_method_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'order', integer() }
  ].


openapi_pokemon_move_version_group() ->
    openapi_pokemon_move_version_group([]).

openapi_pokemon_move_version_group(Fields) ->
  Default = [ {'level_learned_at', integer() }
            , {'move_learn_method', openapi_move_learn_method_summary:openapi_move_learn_method_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'order', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

