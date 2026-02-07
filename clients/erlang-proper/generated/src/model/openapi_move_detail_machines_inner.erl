-module(openapi_move_detail_machines_inner).

-include("openapi.hrl").

-export([openapi_move_detail_machines_inner/0]).

-export([openapi_move_detail_machines_inner/1]).

-export_type([openapi_move_detail_machines_inner/0]).

-type openapi_move_detail_machines_inner() ::
  [ {'machine', openapi_move_detail_machines_inner_machine:openapi_move_detail_machines_inner_machine() }
  | {'version_group', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_move_detail_machines_inner() ->
    openapi_move_detail_machines_inner([]).

openapi_move_detail_machines_inner(Fields) ->
  Default = [ {'machine', openapi_move_detail_machines_inner_machine:openapi_move_detail_machines_inner_machine() }
            , {'version_group', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

