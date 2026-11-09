-module(openapi_evolution_variable_description).

-include("openapi.hrl").

-export([openapi_evolution_variable_description/0]).

-export([openapi_evolution_variable_description/1]).

-export_type([openapi_evolution_variable_description/0]).

-type openapi_evolution_variable_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_evolution_variable_description() ->
    openapi_evolution_variable_description([]).

openapi_evolution_variable_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

