-module(openapi_item_attribute_description).

-export([encode/1]).

-export_type([openapi_item_attribute_description/0]).

-type openapi_item_attribute_description() ::
    #{ 'description' => binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'description' := Description,
          'language' := Language
        }) ->
    #{ 'description' => Description,
       'language' => Language
     }.
