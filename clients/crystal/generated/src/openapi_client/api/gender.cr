require "json"

module OpenAPIClient
  module Api
  class Gender
    def initialize(@conn : Connection); end

    # List genders Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedGenderSummaryList)
      @conn.request(OpenAPIClient::PaginatedGenderSummaryList,
        method: :GET,
        path: "/api/v2/gender/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get gender Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::GenderDetail)
      @conn.request(OpenAPIClient::GenderDetail,
        method: :GET,
        path: "/api/v2/gender/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
