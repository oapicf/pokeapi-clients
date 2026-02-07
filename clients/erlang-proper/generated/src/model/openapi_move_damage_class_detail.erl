-module(openapi_move_damage_class_detail).

-include("openapi.hrl").

-export([openapi_move_damage_class_detail/0]).

-export([openapi_move_damage_class_detail/1]).

-export_type([openapi_move_damage_class_detail/0]).

-type openapi_move_damage_class_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'descriptions', list(openapi_move_damage_class_description:openapi_move_damage_class_description()) }
  | {'moves', list(openapi_move_summary:openapi_move_summary()) }
  | {'names', list(openapi_move_damage_class_name:openapi_move_damage_class_name()) }
  ].


openapi_move_damage_class_detail() ->
    openapi_move_damage_class_detail([]).

openapi_move_damage_class_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'descriptions', list(openapi_move_damage_class_description:openapi_move_damage_class_description()) }
            , {'moves', list(openapi_move_summary:openapi_move_summary()) }
            , {'names', list(openapi_move_damage_class_name:openapi_move_damage_class_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

