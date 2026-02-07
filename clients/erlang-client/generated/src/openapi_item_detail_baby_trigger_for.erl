-module(openapi_item_detail_baby_trigger_for).

-export([encode/1]).

-export_type([openapi_item_detail_baby_trigger_for/0]).

-type openapi_item_detail_baby_trigger_for() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
