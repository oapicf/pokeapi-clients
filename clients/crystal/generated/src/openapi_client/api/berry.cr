require "json"

module OpenAPIClient
  module Api
  class Berry
    def initialize(@conn : Connection); end

    # List berries Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedBerrySummaryList)
      @conn.request(OpenAPIClient::PaginatedBerrySummaryList,
        method: :GET,
        path: "/api/v2/berry/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get a berry Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::BerryDetail)
      @conn.request(OpenAPIClient::BerryDetail,
        method: :GET,
        path: "/api/v2/berry/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
