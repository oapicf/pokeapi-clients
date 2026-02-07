-module(openapi_encounter_condition_value_detail).

-include("openapi.hrl").

-export([openapi_encounter_condition_value_detail/0]).

-export([openapi_encounter_condition_value_detail/1]).

-export_type([openapi_encounter_condition_value_detail/0]).

-type openapi_encounter_condition_value_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'condition', openapi_encounter_condition_summary:openapi_encounter_condition_summary() }
  | {'names', list(openapi_encounter_condition_value_name:openapi_encounter_condition_value_name()) }
  ].


openapi_encounter_condition_value_detail() ->
    openapi_encounter_condition_value_detail([]).

openapi_encounter_condition_value_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'condition', openapi_encounter_condition_summary:openapi_encounter_condition_summary() }
            , {'names', list(openapi_encounter_condition_value_name:openapi_encounter_condition_value_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

