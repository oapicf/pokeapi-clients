-module(openapi_contest_effect_summary).

-export([encode/1]).

-export_type([openapi_contest_effect_summary/0]).

-type openapi_contest_effect_summary() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
