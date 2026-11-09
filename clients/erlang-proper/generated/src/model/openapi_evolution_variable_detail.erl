-module(openapi_evolution_variable_detail).

-include("openapi.hrl").

-export([openapi_evolution_variable_detail/0]).

-export([openapi_evolution_variable_detail/1]).

-export_type([openapi_evolution_variable_detail/0]).

-type openapi_evolution_variable_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'symbol', binary() }
  | {'data_type', binary() }
  | {'source', binary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'names', list(openapi_evolution_variable_name:openapi_evolution_variable_name()) }
  | {'descriptions', list(openapi_evolution_variable_description:openapi_evolution_variable_description()) }
  ].


openapi_evolution_variable_detail() ->
    openapi_evolution_variable_detail([]).

openapi_evolution_variable_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'symbol', binary() }
            , {'data_type', binary() }
            , {'source', binary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'names', list(openapi_evolution_variable_name:openapi_evolution_variable_name()) }
            , {'descriptions', list(openapi_evolution_variable_description:openapi_evolution_variable_description()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

