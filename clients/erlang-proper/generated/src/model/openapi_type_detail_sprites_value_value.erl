-module(openapi_type_detail_sprites_value_value).

-include("openapi.hrl").

-export([openapi_type_detail_sprites_value_value/0]).

-export([openapi_type_detail_sprites_value_value/1]).

-export_type([openapi_type_detail_sprites_value_value/0]).

-type openapi_type_detail_sprites_value_value() ::
  [ {'name_icon', openapi_u_ri:openapi_u_ri() }
  ].


openapi_type_detail_sprites_value_value() ->
    openapi_type_detail_sprites_value_value([]).

openapi_type_detail_sprites_value_value(Fields) ->
  Default = [ {'name-icon', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

