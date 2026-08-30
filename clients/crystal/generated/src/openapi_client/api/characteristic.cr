require "json"

module OpenAPIClient
  module Api
  class Characteristic
    def initialize(@conn : Connection); end

    # List charecterictics Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedCharacteristicSummaryList)
      @conn.request(OpenAPIClient::PaginatedCharacteristicSummaryList,
        method: :GET,
        path: "/api/v2/characteristic/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get characteristic Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::CharacteristicDetail)
      @conn.request(OpenAPIClient::CharacteristicDetail,
        method: :GET,
        path: "/api/v2/characteristic/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
