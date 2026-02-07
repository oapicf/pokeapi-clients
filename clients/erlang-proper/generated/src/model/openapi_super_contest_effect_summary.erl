-module(openapi_super_contest_effect_summary).

-include("openapi.hrl").

-export([openapi_super_contest_effect_summary/0]).

-export([openapi_super_contest_effect_summary/1]).

-export_type([openapi_super_contest_effect_summary/0]).

-type openapi_super_contest_effect_summary() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_super_contest_effect_summary() ->
    openapi_super_contest_effect_summary([]).

openapi_super_contest_effect_summary(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

