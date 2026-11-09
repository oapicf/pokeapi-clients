-module(openapi_pokemon_sprites_other_showdown).

-include("openapi.hrl").

-export([openapi_pokemon_sprites_other_showdown/0]).

-export([openapi_pokemon_sprites_other_showdown/1]).

-export_type([openapi_pokemon_sprites_other_showdown/0]).

-type openapi_pokemon_sprites_other_showdown() ::
  [ {'front_default', binary() }
  | {'front_female', binary() }
  | {'front_shiny', binary() }
  | {'front_shiny_female', binary() }
  | {'back_default', binary() }
  | {'back_female', binary() }
  | {'back_shiny', binary() }
  | {'back_shiny_female', binary() }
  ].


openapi_pokemon_sprites_other_showdown() ->
    openapi_pokemon_sprites_other_showdown([]).

openapi_pokemon_sprites_other_showdown(Fields) ->
  Default = [ {'front_default', binary() }
            , {'front_female', binary() }
            , {'front_shiny', binary() }
            , {'front_shiny_female', binary() }
            , {'back_default', binary() }
            , {'back_female', binary() }
            , {'back_shiny', binary() }
            , {'back_shiny_female', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

