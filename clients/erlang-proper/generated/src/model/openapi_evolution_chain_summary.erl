-module(openapi_evolution_chain_summary).

-include("openapi.hrl").

-export([openapi_evolution_chain_summary/0]).

-export([openapi_evolution_chain_summary/1]).

-export_type([openapi_evolution_chain_summary/0]).

-type openapi_evolution_chain_summary() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_evolution_chain_summary() ->
    openapi_evolution_chain_summary([]).

openapi_evolution_chain_summary(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

