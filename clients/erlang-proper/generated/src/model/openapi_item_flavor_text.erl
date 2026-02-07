-module(openapi_item_flavor_text).

-include("openapi.hrl").

-export([openapi_item_flavor_text/0]).

-export([openapi_item_flavor_text/1]).

-export_type([openapi_item_flavor_text/0]).

-type openapi_item_flavor_text() ::
  [ {'text', binary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_item_flavor_text() ->
    openapi_item_flavor_text([]).

openapi_item_flavor_text(Fields) ->
  Default = [ {'text', binary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

