-module(openapi_move_detail_machines_inner_machine).

-include("openapi.hrl").

-export([openapi_move_detail_machines_inner_machine/0]).

-export([openapi_move_detail_machines_inner_machine/1]).

-export_type([openapi_move_detail_machines_inner_machine/0]).

-type openapi_move_detail_machines_inner_machine() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_move_detail_machines_inner_machine() ->
    openapi_move_detail_machines_inner_machine([]).

openapi_move_detail_machines_inner_machine(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

