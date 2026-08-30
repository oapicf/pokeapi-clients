require "json"

module OpenAPIClient
  module Api
  class Move
    def initialize(@conn : Connection); end

    # List moves Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveSummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveSummaryList,
        method: :GET,
        path: "/api/v2/move/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
    def retrieve(id : String) : Response(OpenAPIClient::MoveDetail)
      @conn.request(OpenAPIClient::MoveDetail,
        method: :GET,
        path: "/api/v2/move/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
