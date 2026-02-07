-module(openapi_item_detail_sprites).

-include("openapi.hrl").

-export([openapi_item_detail_sprites/0]).

-export([openapi_item_detail_sprites/1]).

-export_type([openapi_item_detail_sprites/0]).

-type openapi_item_detail_sprites() ::
  [ {'default', openapi_u_ri:openapi_u_ri() }
  ].


openapi_item_detail_sprites() ->
    openapi_item_detail_sprites([]).

openapi_item_detail_sprites(Fields) ->
  Default = [ {'default', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

