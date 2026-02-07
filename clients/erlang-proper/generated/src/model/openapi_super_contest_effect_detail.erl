-module(openapi_super_contest_effect_detail).

-include("openapi.hrl").

-export([openapi_super_contest_effect_detail/0]).

-export([openapi_super_contest_effect_detail/1]).

-export_type([openapi_super_contest_effect_detail/0]).

-type openapi_super_contest_effect_detail() ::
  [ {'id', integer() }
  | {'appeal', integer() }
  | {'flavor_text_entries', list(openapi_super_contest_effect_flavor_text:openapi_super_contest_effect_flavor_text()) }
  | {'moves', list(openapi_move_summary:openapi_move_summary()) }
  ].


openapi_super_contest_effect_detail() ->
    openapi_super_contest_effect_detail([]).

openapi_super_contest_effect_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'appeal', integer() }
            , {'flavor_text_entries', list(openapi_super_contest_effect_flavor_text:openapi_super_contest_effect_flavor_text()) }
            , {'moves', list(openapi_move_summary:openapi_move_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

