-module(openapi_api).

-export([ language_list/0
        , language_retrieve/1
        ]).

-define(BASE_URL, "").

%% @doc List languages
%% Languages for translations of API resource information.
-spec language_list() ->
  openapi_utils:response().
language_list() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v2/language/"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"q=">>, Q, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Get language
%% Languages for translations of API resource information.
-spec language_retrieve(binary()) ->
  openapi_utils:response().
language_retrieve(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v2/language/", Id, "/"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

