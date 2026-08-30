require "json"

module OpenAPIClient
  module Api
  class Region
    def initialize(@conn : Connection); end

    # List regions A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedRegionSummaryList)
      @conn.request(OpenAPIClient::PaginatedRegionSummaryList,
        method: :GET,
        path: "/api/v2/region/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get region A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    def retrieve(id : String) : Response(OpenAPIClient::RegionDetail)
      @conn.request(OpenAPIClient::RegionDetail,
        method: :GET,
        path: "/api/v2/region/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
