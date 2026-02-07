-module(openapi_item_detail_machines_inner).

-include("openapi.hrl").

-export([openapi_item_detail_machines_inner/0]).

-export([openapi_item_detail_machines_inner/1]).

-export_type([openapi_item_detail_machines_inner/0]).

-type openapi_item_detail_machines_inner() ::
  [ {'machine', openapi_u_ri:openapi_u_ri() }
  | {'version_group', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_item_detail_machines_inner() ->
    openapi_item_detail_machines_inner([]).

openapi_item_detail_machines_inner(Fields) ->
  Default = [ {'machine', binary() }
            , {'version_group', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

