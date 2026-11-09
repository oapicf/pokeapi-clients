-module(openapi_pokemon_shape_awesome_name).

-export([encode/1]).

-export_type([openapi_pokemon_shape_awesome_name/0]).

-type openapi_pokemon_shape_awesome_name() ::
    #{ 'awesome_name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'awesome_name' := AwesomeName,
          'language' := Language
        }) ->
    #{ 'awesome_name' => AwesomeName,
       'language' => Language
     }.
