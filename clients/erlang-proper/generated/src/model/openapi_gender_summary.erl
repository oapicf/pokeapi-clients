-module(openapi_gender_summary).

-include("openapi.hrl").

-export([openapi_gender_summary/0]).

-export([openapi_gender_summary/1]).

-export_type([openapi_gender_summary/0]).

-type openapi_gender_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_gender_summary() ->
    openapi_gender_summary([]).

openapi_gender_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

