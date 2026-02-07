-module(openapi_move_meta).

-include("openapi.hrl").

-export([openapi_move_meta/0]).

-export([openapi_move_meta/1]).

-export_type([openapi_move_meta/0]).

-type openapi_move_meta() ::
  [ {'ailment', openapi_move_meta_ailment_summary:openapi_move_meta_ailment_summary() }
  | {'category', openapi_move_meta_category_summary:openapi_move_meta_category_summary() }
  | {'min_hits', integer() }
  | {'max_hits', integer() }
  | {'min_turns', integer() }
  | {'max_turns', integer() }
  | {'drain', integer() }
  | {'healing', integer() }
  | {'crit_rate', integer() }
  | {'ailment_chance', integer() }
  | {'flinch_chance', integer() }
  | {'stat_chance', integer() }
  ].


openapi_move_meta() ->
    openapi_move_meta([]).

openapi_move_meta(Fields) ->
  Default = [ {'ailment', openapi_move_meta_ailment_summary:openapi_move_meta_ailment_summary() }
            , {'category', openapi_move_meta_category_summary:openapi_move_meta_category_summary() }
            , {'min_hits', integer() }
            , {'max_hits', integer() }
            , {'min_turns', integer() }
            , {'max_turns', integer() }
            , {'drain', integer() }
            , {'healing', integer() }
            , {'crit_rate', integer() }
            , {'ailment_chance', integer() }
            , {'flinch_chance', integer() }
            , {'stat_chance', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

