-module(openapi_contest_effect_effect_text).

-export([encode/1]).

-export_type([openapi_contest_effect_effect_text/0]).

-type openapi_contest_effect_effect_text() ::
    #{ 'effect' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'effect' := Effect,
          'language' := Language
        }) ->
    #{ 'effect' => Effect,
       'language' => Language
     }.
