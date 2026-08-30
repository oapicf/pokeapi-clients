require "json"

module OpenAPIClient
  module Api
  class MoveBattleStyle
    def initialize(@conn : Connection); end

    # List move battle styles Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveBattleStyleSummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveBattleStyleSummaryList,
        method: :GET,
        path: "/api/v2/move-battle-style/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move battle style Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::MoveBattleStyleDetail)
      @conn.request(OpenAPIClient::MoveBattleStyleDetail,
        method: :GET,
        path: "/api/v2/move-battle-style/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
