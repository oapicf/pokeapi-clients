-module(openapi_move_meta_category_detail).

-include("openapi.hrl").

-export([openapi_move_meta_category_detail/0]).

-export([openapi_move_meta_category_detail/1]).

-export_type([openapi_move_meta_category_detail/0]).

-type openapi_move_meta_category_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'descriptions', list(openapi_move_meta_category_description:openapi_move_meta_category_description()) }
  | {'moves', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_move_meta_category_detail() ->
    openapi_move_meta_category_detail([]).

openapi_move_meta_category_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'descriptions', list(openapi_move_meta_category_description:openapi_move_meta_category_description()) }
            , {'moves', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

