require "json"

module OpenAPIClient
  module Api
  class EncounterMethod
    def initialize(@conn : Connection); end

    # List encounter methods Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedEncounterMethodSummaryList)
      @conn.request(OpenAPIClient::PaginatedEncounterMethodSummaryList,
        method: :GET,
        path: "/api/v2/encounter-method/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get encounter method Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::EncounterMethodDetail)
      @conn.request(OpenAPIClient::EncounterMethodDetail,
        method: :GET,
        path: "/api/v2/encounter-method/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
