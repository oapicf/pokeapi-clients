-module(openapi_evolution_condition_expression).

-export([encode/1]).

-export_type([openapi_evolution_condition_expression/0]).

-type openapi_evolution_condition_expression() ::
    #{ 'expression' := binary(),
       'percentage_chance' := float(),
       'variables' := list()
     }.

encode(#{ 'expression' := Expression,
          'percentage_chance' := PercentageChance,
          'variables' := Variables
        }) ->
    #{ 'expression' => Expression,
       'percentage_chance' => PercentageChance,
       'variables' => Variables
     }.
