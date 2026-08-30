require "json"

module OpenAPIClient
  module Api
  class LocationArea
    def initialize(@conn : Connection); end

    # List location areas Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    def list(*, limit : Int32? = nil, offset : Int32? = nil) : Response(OpenAPIClient::PaginatedLocationAreaSummaryList)
      @conn.request(OpenAPIClient::PaginatedLocationAreaSummaryList,
        method: :GET,
        path: "/api/v2/location-area/",
        query: { "limit" => limit, "offset" => offset },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get location area Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    def retrieve(id : Int32) : Response(OpenAPIClient::LocationAreaDetail)
      @conn.request(OpenAPIClient::LocationAreaDetail,
        method: :GET,
        path: "/api/v2/location-area/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
