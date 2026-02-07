-module(openapi_evolution_chain_detail).

-export([encode/1]).

-export_type([openapi_evolution_chain_detail/0]).

-type openapi_evolution_chain_detail() ::
    #{ 'id' := integer(),
       'baby_trigger_item' := openapi_item_summary:openapi_item_summary(),
       'chain' := openapi_evolution_chain_detail_chain:openapi_evolution_chain_detail_chain()
     }.

encode(#{ 'id' := Id,
          'baby_trigger_item' := BabyTriggerItem,
          'chain' := Chain
        }) ->
    #{ 'id' => Id,
       'baby_trigger_item' => BabyTriggerItem,
       'chain' => Chain
     }.
