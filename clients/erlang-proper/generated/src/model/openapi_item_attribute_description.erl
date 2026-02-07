-module(openapi_item_attribute_description).

-include("openapi.hrl").

-export([openapi_item_attribute_description/0]).

-export([openapi_item_attribute_description/1]).

-export_type([openapi_item_attribute_description/0]).

-type openapi_item_attribute_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_item_attribute_description() ->
    openapi_item_attribute_description([]).

openapi_item_attribute_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

