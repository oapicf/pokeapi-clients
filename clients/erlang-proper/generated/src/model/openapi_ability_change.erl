-module(openapi_ability_change).

-include("openapi.hrl").

-export([openapi_ability_change/0]).

-export([openapi_ability_change/1]).

-export_type([openapi_ability_change/0]).

-type openapi_ability_change() ::
  [ {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'effect_entries', list(openapi_ability_change_effect_text:openapi_ability_change_effect_text()) }
  ].


openapi_ability_change() ->
    openapi_ability_change([]).

openapi_ability_change(Fields) ->
  Default = [ {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'effect_entries', list(openapi_ability_change_effect_text:openapi_ability_change_effect_text()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

