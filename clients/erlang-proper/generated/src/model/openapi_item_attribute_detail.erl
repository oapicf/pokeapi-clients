-module(openapi_item_attribute_detail).

-include("openapi.hrl").

-export([openapi_item_attribute_detail/0]).

-export([openapi_item_attribute_detail/1]).

-export_type([openapi_item_attribute_detail/0]).

-type openapi_item_attribute_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'descriptions', list(openapi_item_attribute_description:openapi_item_attribute_description()) }
  | {'items', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'names', list(openapi_item_attribute_name:openapi_item_attribute_name()) }
  ].


openapi_item_attribute_detail() ->
    openapi_item_attribute_detail([]).

openapi_item_attribute_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'descriptions', list(openapi_item_attribute_description:openapi_item_attribute_description()) }
            , {'items', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'names', list(openapi_item_attribute_name:openapi_item_attribute_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

