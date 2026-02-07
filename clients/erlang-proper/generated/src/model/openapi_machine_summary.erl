-module(openapi_machine_summary).

-include("openapi.hrl").

-export([openapi_machine_summary/0]).

-export([openapi_machine_summary/1]).

-export_type([openapi_machine_summary/0]).

-type openapi_machine_summary() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_machine_summary() ->
    openapi_machine_summary([]).

openapi_machine_summary(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

