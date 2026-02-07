-module(openapi_language_detail).

-include("openapi.hrl").

-export([openapi_language_detail/0]).

-export([openapi_language_detail/1]).

-export_type([openapi_language_detail/0]).

-type openapi_language_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'official', boolean() }
  | {'iso639', binary() }
  | {'iso3166', binary() }
  | {'names', list(openapi_language_name:openapi_language_name()) }
  ].


openapi_language_detail() ->
    openapi_language_detail([]).

openapi_language_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'official', boolean() }
            , {'iso639', binary() }
            , {'iso3166', binary() }
            , {'names', list(openapi_language_name:openapi_language_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

