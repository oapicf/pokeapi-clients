-module(openapi_contest_effect_effect_text).

-include("openapi.hrl").

-export([openapi_contest_effect_effect_text/0]).

-export([openapi_contest_effect_effect_text/1]).

-export_type([openapi_contest_effect_effect_text/0]).

-type openapi_contest_effect_effect_text() ::
  [ {'effect', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_contest_effect_effect_text() ->
    openapi_contest_effect_effect_text([]).

openapi_contest_effect_effect_text(Fields) ->
  Default = [ {'effect', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

