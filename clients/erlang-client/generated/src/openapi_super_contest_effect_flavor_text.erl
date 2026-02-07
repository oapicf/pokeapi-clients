-module(openapi_super_contest_effect_flavor_text).

-export([encode/1]).

-export_type([openapi_super_contest_effect_flavor_text/0]).

-type openapi_super_contest_effect_flavor_text() ::
    #{ 'flavor_text' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'flavor_text' := FlavorText,
          'language' := Language
        }) ->
    #{ 'flavor_text' => FlavorText,
       'language' => Language
     }.
