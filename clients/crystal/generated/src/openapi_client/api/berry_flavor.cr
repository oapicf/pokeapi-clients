require "json"

module OpenAPIClient
  module Api
  class BerryFlavor
    def initialize(@conn : Connection); end

    # List berry flavors Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedBerryFlavorSummaryList)
      @conn.request(OpenAPIClient::PaginatedBerryFlavorSummaryList,
        method: :GET,
        path: "/api/v2/berry-flavor/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get berries by flavor Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::BerryFlavorDetail)
      @conn.request(OpenAPIClient::BerryFlavorDetail,
        method: :GET,
        path: "/api/v2/berry-flavor/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
