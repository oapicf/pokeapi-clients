require "json"

module OpenAPIClient
  module Api
  class GrowthRate
    def initialize(@conn : Connection); end

    # List growth rates Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedGrowthRateSummaryList)
      @conn.request(OpenAPIClient::PaginatedGrowthRateSummaryList,
        method: :GET,
        path: "/api/v2/growth-rate/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get growth rate Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::GrowthRateDetail)
      @conn.request(OpenAPIClient::GrowthRateDetail,
        method: :GET,
        path: "/api/v2/growth-rate/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
