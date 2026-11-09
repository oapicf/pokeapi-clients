-module(openapi_type_detail).

-include("openapi.hrl").

-export([openapi_type_detail/0]).

-export([openapi_type_detail/1]).

-export_type([openapi_type_detail/0]).

-type openapi_type_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'damage_relations', openapi_type_relationships:openapi_type_relationships() }
  | {'past_damage_relations', list(openapi_type_past_relationships:openapi_type_past_relationships()) }
  | {'game_indices', list(openapi_type_game_index:openapi_type_game_index()) }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'move_damage_class', openapi_move_damage_class_summary:openapi_move_damage_class_summary() }
  | {'names', list(openapi_type_name:openapi_type_name()) }
  | {'pokemon', list(openapi_type_pokemon:openapi_type_pokemon()) }
  | {'moves', list(openapi_move_summary:openapi_move_summary()) }
  | {'sprites', map() }
  ].


openapi_type_detail() ->
    openapi_type_detail([]).

openapi_type_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'damage_relations', openapi_type_relationships:openapi_type_relationships() }
            , {'past_damage_relations', list(openapi_type_past_relationships:openapi_type_past_relationships()) }
            , {'game_indices', list(openapi_type_game_index:openapi_type_game_index()) }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'move_damage_class', openapi_move_damage_class_summary:openapi_move_damage_class_summary() }
            , {'names', list(openapi_type_name:openapi_type_name()) }
            , {'pokemon', list(openapi_type_pokemon:openapi_type_pokemon()) }
            , {'moves', list(openapi_move_summary:openapi_move_summary()) }
            , {'sprites', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

