require "json"

module OpenAPIClient
  module Api
  class Nature
    def initialize(@conn : Connection); end

    # List natures Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedNatureSummaryList)
      @conn.request(OpenAPIClient::PaginatedNatureSummaryList,
        method: :GET,
        path: "/api/v2/nature/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get nature Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::NatureDetail)
      @conn.request(OpenAPIClient::NatureDetail,
        method: :GET,
        path: "/api/v2/nature/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
