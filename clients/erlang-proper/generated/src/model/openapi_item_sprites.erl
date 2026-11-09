-module(openapi_item_sprites).

-include("openapi.hrl").

-export([openapi_item_sprites/0]).

-export([openapi_item_sprites/1]).

-export_type([openapi_item_sprites/0]).

-type openapi_item_sprites() ::
  [ {'default', binary() }
  ].


openapi_item_sprites() ->
    openapi_item_sprites([]).

openapi_item_sprites(Fields) ->
  Default = [ {'default', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

