-module(openapi_evolution_condition_expression).

-include("openapi.hrl").

-export([openapi_evolution_condition_expression/0]).

-export([openapi_evolution_condition_expression/1]).

-export_type([openapi_evolution_condition_expression/0]).

-type openapi_evolution_condition_expression() ::
  [ {'expression', binary() }
  | {'percentage_chance', float() }
  | {'variables', list(openapi_evolution_variable_summary:openapi_evolution_variable_summary()) }
  ].


openapi_evolution_condition_expression() ->
    openapi_evolution_condition_expression([]).

openapi_evolution_condition_expression(Fields) ->
  Default = [ {'expression', binary() }
            , {'percentage_chance', float() }
            , {'variables', list(openapi_evolution_variable_summary:openapi_evolution_variable_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

