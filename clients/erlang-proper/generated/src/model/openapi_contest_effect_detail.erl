-module(openapi_contest_effect_detail).

-include("openapi.hrl").

-export([openapi_contest_effect_detail/0]).

-export([openapi_contest_effect_detail/1]).

-export_type([openapi_contest_effect_detail/0]).

-type openapi_contest_effect_detail() ::
  [ {'id', integer() }
  | {'appeal', integer() }
  | {'jam', integer() }
  | {'effect_entries', list(openapi_contest_effect_effect_text:openapi_contest_effect_effect_text()) }
  | {'flavor_text_entries', list(openapi_contest_effect_flavor_text:openapi_contest_effect_flavor_text()) }
  ].


openapi_contest_effect_detail() ->
    openapi_contest_effect_detail([]).

openapi_contest_effect_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'appeal', integer() }
            , {'jam', integer() }
            , {'effect_entries', list(openapi_contest_effect_effect_text:openapi_contest_effect_effect_text()) }
            , {'flavor_text_entries', list(openapi_contest_effect_flavor_text:openapi_contest_effect_flavor_text()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

