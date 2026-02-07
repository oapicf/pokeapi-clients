-module(openapi_move_damage_class_summary).

-include("openapi.hrl").

-export([openapi_move_damage_class_summary/0]).

-export([openapi_move_damage_class_summary/1]).

-export_type([openapi_move_damage_class_summary/0]).

-type openapi_move_damage_class_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_move_damage_class_summary() ->
    openapi_move_damage_class_summary([]).

openapi_move_damage_class_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

