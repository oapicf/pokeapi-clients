-module(openapi_evolution_chain_detail).

-include("openapi.hrl").

-export([openapi_evolution_chain_detail/0]).

-export([openapi_evolution_chain_detail/1]).

-export_type([openapi_evolution_chain_detail/0]).

-type openapi_evolution_chain_detail() ::
  [ {'id', integer() }
  | {'baby_trigger_item', openapi_item_summary:openapi_item_summary() }
  | {'chain', openapi_evolution_chain_detail_chain:openapi_evolution_chain_detail_chain() }
  ].


openapi_evolution_chain_detail() ->
    openapi_evolution_chain_detail([]).

openapi_evolution_chain_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'baby_trigger_item', openapi_item_summary:openapi_item_summary() }
            , {'chain', openapi_evolution_chain_detail_chain:openapi_evolution_chain_detail_chain() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

