-module(openapi_move_learn_method_detail).

-include("openapi.hrl").

-export([openapi_move_learn_method_detail/0]).

-export([openapi_move_learn_method_detail/1]).

-export_type([openapi_move_learn_method_detail/0]).

-type openapi_move_learn_method_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_move_learn_method_name:openapi_move_learn_method_name()) }
  | {'descriptions', list(openapi_move_learn_method_description:openapi_move_learn_method_description()) }
  | {'version_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_move_learn_method_detail() ->
    openapi_move_learn_method_detail([]).

openapi_move_learn_method_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_move_learn_method_name:openapi_move_learn_method_name()) }
            , {'descriptions', list(openapi_move_learn_method_description:openapi_move_learn_method_description()) }
            , {'version_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

