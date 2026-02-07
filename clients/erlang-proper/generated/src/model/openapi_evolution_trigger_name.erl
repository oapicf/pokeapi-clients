-module(openapi_evolution_trigger_name).

-include("openapi.hrl").

-export([openapi_evolution_trigger_name/0]).

-export([openapi_evolution_trigger_name/1]).

-export_type([openapi_evolution_trigger_name/0]).

-type openapi_evolution_trigger_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_evolution_trigger_name() ->
    openapi_evolution_trigger_name([]).

openapi_evolution_trigger_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

