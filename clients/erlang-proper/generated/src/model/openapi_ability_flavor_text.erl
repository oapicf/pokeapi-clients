-module(openapi_ability_flavor_text).

-include("openapi.hrl").

-export([openapi_ability_flavor_text/0]).

-export([openapi_ability_flavor_text/1]).

-export_type([openapi_ability_flavor_text/0]).

-type openapi_ability_flavor_text() ::
  [ {'flavor_text', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  ].


openapi_ability_flavor_text() ->
    openapi_ability_flavor_text([]).

openapi_ability_flavor_text(Fields) ->
  Default = [ {'flavor_text', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

