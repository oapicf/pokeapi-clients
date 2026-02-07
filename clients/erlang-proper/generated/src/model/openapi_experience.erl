-module(openapi_experience).

-include("openapi.hrl").

-export([openapi_experience/0]).

-export([openapi_experience/1]).

-export_type([openapi_experience/0]).

-type openapi_experience() ::
  [ {'level', integer() }
  | {'experience', integer() }
  ].


openapi_experience() ->
    openapi_experience([]).

openapi_experience(Fields) ->
  Default = [ {'level', integer() }
            , {'experience', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

