require "json"

module OpenAPIClient
  module Api
  class MoveLearnMethod
    def initialize(@conn : Connection); end

    # List move learn methods Methods by which Pokémon can learn moves.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveLearnMethodSummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveLearnMethodSummaryList,
        method: :GET,
        path: "/api/v2/move-learn-method/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move learn method Methods by which Pokémon can learn moves.
    def retrieve(id : String) : Response(OpenAPIClient::MoveLearnMethodDetail)
      @conn.request(OpenAPIClient::MoveLearnMethodDetail,
        method: :GET,
        path: "/api/v2/move-learn-method/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
