-module(openapi_contest_effect_flavor_text).

-include("openapi.hrl").

-export([openapi_contest_effect_flavor_text/0]).

-export([openapi_contest_effect_flavor_text/1]).

-export_type([openapi_contest_effect_flavor_text/0]).

-type openapi_contest_effect_flavor_text() ::
  [ {'flavor_text', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_contest_effect_flavor_text() ->
    openapi_contest_effect_flavor_text([]).

openapi_contest_effect_flavor_text(Fields) ->
  Default = [ {'flavor_text', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

