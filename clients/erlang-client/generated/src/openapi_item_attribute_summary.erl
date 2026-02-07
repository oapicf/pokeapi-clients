-module(openapi_item_attribute_summary).

-export([encode/1]).

-export_type([openapi_item_attribute_summary/0]).

-type openapi_item_attribute_summary() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
