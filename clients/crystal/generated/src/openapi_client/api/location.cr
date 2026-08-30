require "json"

module OpenAPIClient
  module Api
  class Location
    def initialize(@conn : Connection); end

    # List locations Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedLocationSummaryList)
      @conn.request(OpenAPIClient::PaginatedLocationSummaryList,
        method: :GET,
        path: "/api/v2/location/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get location Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    def retrieve(id : String) : Response(OpenAPIClient::LocationDetail)
      @conn.request(OpenAPIClient::LocationDetail,
        method: :GET,
        path: "/api/v2/location/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
