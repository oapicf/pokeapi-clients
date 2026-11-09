-module(openapi_pokemon_sprites).

-include("openapi.hrl").

-export([openapi_pokemon_sprites/0]).

-export([openapi_pokemon_sprites/1]).

-export_type([openapi_pokemon_sprites/0]).

-type openapi_pokemon_sprites() ::
  [ {'front_default', binary() }
  | {'front_shiny', binary() }
  | {'front_female', binary() }
  | {'front_shiny_female', binary() }
  | {'back_default', binary() }
  | {'back_shiny', binary() }
  | {'back_female', binary() }
  | {'back_shiny_female', binary() }
  | {'other', openapi_pokemon_sprites_other:openapi_pokemon_sprites_other() }
  | {'versions', map() }
  ].


openapi_pokemon_sprites() ->
    openapi_pokemon_sprites([]).

openapi_pokemon_sprites(Fields) ->
  Default = [ {'front_default', binary() }
            , {'front_shiny', binary() }
            , {'front_female', binary() }
            , {'front_shiny_female', binary() }
            , {'back_default', binary() }
            , {'back_shiny', binary() }
            , {'back_female', binary() }
            , {'back_shiny_female', binary() }
            , {'other', openapi_pokemon_sprites_other:openapi_pokemon_sprites_other() }
            , {'versions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

