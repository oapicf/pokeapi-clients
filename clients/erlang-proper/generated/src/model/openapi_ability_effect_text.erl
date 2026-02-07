-module(openapi_ability_effect_text).

-include("openapi.hrl").

-export([openapi_ability_effect_text/0]).

-export([openapi_ability_effect_text/1]).

-export_type([openapi_ability_effect_text/0]).

-type openapi_ability_effect_text() ::
  [ {'effect', binary() }
  | {'short_effect', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_ability_effect_text() ->
    openapi_ability_effect_text([]).

openapi_ability_effect_text(Fields) ->
  Default = [ {'effect', binary() }
            , {'short_effect', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

