require "json"

module OpenAPIClient
  module Api
  class Type
    def initialize(@conn : Connection); end

    # List types Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedTypeSummaryList)
      @conn.request(OpenAPIClient::PaginatedTypeSummaryList,
        method: :GET,
        path: "/api/v2/type/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get types Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
    def retrieve(id : String) : Response(OpenAPIClient::TypeDetail)
      @conn.request(OpenAPIClient::TypeDetail,
        method: :GET,
        path: "/api/v2/type/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
