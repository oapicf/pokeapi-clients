-module(openapi_evolution_trigger_summary).

-include("openapi.hrl").

-export([openapi_evolution_trigger_summary/0]).

-export([openapi_evolution_trigger_summary/1]).

-export_type([openapi_evolution_trigger_summary/0]).

-type openapi_evolution_trigger_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_evolution_trigger_summary() ->
    openapi_evolution_trigger_summary([]).

openapi_evolution_trigger_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

