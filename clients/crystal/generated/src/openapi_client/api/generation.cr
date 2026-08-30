require "json"

module OpenAPIClient
  module Api
  class Generation
    def initialize(@conn : Connection); end

    # List genrations A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedGenerationSummaryList)
      @conn.request(OpenAPIClient::PaginatedGenerationSummaryList,
        method: :GET,
        path: "/api/v2/generation/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get genration A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    def retrieve(id : String) : Response(OpenAPIClient::GenerationDetail)
      @conn.request(OpenAPIClient::GenerationDetail,
        method: :GET,
        path: "/api/v2/generation/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
