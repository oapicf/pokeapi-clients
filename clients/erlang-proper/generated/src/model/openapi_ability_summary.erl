-module(openapi_ability_summary).

-include("openapi.hrl").

-export([openapi_ability_summary/0]).

-export([openapi_ability_summary/1]).

-export_type([openapi_ability_summary/0]).

-type openapi_ability_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_ability_summary() ->
    openapi_ability_summary([]).

openapi_ability_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

