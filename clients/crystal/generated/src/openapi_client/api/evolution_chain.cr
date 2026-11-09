require "json"

module OpenAPIClient
  module Api
  class EvolutionChain
    def initialize(@conn : Connection); end

    # List evolution chains Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    def list(*, limit : Int32? = nil, offset : Int32? = nil) : Response(OpenAPIClient::PaginatedEvolutionChainSummaryList)
      @conn.request(OpenAPIClient::PaginatedEvolutionChainSummaryList,
        method: :GET,
        path: "/api/v2/evolution-chain/",
        query: { "limit" => limit, "offset" => offset },
        accept: %w[application/json],
        auth: %w[])
    end

    # Get evolution chain Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    def retrieve(id : String) : Response(OpenAPIClient::EvolutionChainDetail)
      @conn.request(OpenAPIClient::EvolutionChainDetail,
        method: :GET,
        path: "/api/v2/evolution-chain/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
