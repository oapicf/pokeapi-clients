require "json"

module OpenAPIClient
  module Api
  class MoveTarget
    def initialize(@conn : Connection); end

    # List move targets Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveTargetSummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveTargetSummaryList,
        method: :GET,
        path: "/api/v2/move-target/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move target Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
    def retrieve(id : String) : Response(OpenAPIClient::MoveTargetDetail)
      @conn.request(OpenAPIClient::MoveTargetDetail,
        method: :GET,
        path: "/api/v2/move-target/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
