-module(openapi_utility_api).

-export([language_list/1, language_list/2,
         language_retrieve/2, language_retrieve/3,
         meta_retrieve/1, meta_retrieve/2]).

-define(BASE_URL, <<"">>).

%% @doc List languages
%% Languages for translations of API resource information.
-spec language_list(ctx:ctx()) -> {ok, openapi_paginated_language_summary_list:openapi_paginated_language_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
language_list(Ctx) ->
    language_list(Ctx, #{}).

-spec language_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_language_summary_list:openapi_paginated_language_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
language_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/language/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get language
%% Languages for translations of API resource information.
-spec language_retrieve(ctx:ctx(), binary()) -> {ok, openapi_language_detail:openapi_language_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
language_retrieve(Ctx, Id) ->
    language_retrieve(Ctx, Id, #{}).

-spec language_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_language_detail:openapi_language_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
language_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/language/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get API metadata
%% Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).
-spec meta_retrieve(ctx:ctx()) -> {ok, openapi_pokeapi_meta_response:openapi_pokeapi_meta_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
meta_retrieve(Ctx) ->
    meta_retrieve(Ctx, #{}).

-spec meta_retrieve(ctx:ctx(), maps:map()) -> {ok, openapi_pokeapi_meta_response:openapi_pokeapi_meta_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
meta_retrieve(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/meta/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


