-module(openapi_item_effect_text).

-export([encode/1]).

-export_type([openapi_item_effect_text/0]).

-type openapi_item_effect_text() ::
    #{ 'effect' := binary(),
       'short_effect' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'effect' := Effect,
          'short_effect' := ShortEffect,
          'language' := Language
        }) ->
    #{ 'effect' => Effect,
       'short_effect' => ShortEffect,
       'language' => Language
     }.
