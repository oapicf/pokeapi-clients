-module(openapi_encounter_condition_name).

-include("openapi.hrl").

-export([openapi_encounter_condition_name/0]).

-export([openapi_encounter_condition_name/1]).

-export_type([openapi_encounter_condition_name/0]).

-type openapi_encounter_condition_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_encounter_condition_name() ->
    openapi_encounter_condition_name([]).

openapi_encounter_condition_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

