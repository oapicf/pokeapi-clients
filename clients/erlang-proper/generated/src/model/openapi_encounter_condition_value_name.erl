-module(openapi_encounter_condition_value_name).

-include("openapi.hrl").

-export([openapi_encounter_condition_value_name/0]).

-export([openapi_encounter_condition_value_name/1]).

-export_type([openapi_encounter_condition_value_name/0]).

-type openapi_encounter_condition_value_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_encounter_condition_value_name() ->
    openapi_encounter_condition_value_name([]).

openapi_encounter_condition_value_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

