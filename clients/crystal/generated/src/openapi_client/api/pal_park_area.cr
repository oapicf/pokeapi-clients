require "json"

module OpenAPIClient
  module Api
  class PalParkArea
    def initialize(@conn : Connection); end

    # List pal park areas Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPalParkAreaSummaryList)
      @conn.request(OpenAPIClient::PaginatedPalParkAreaSummaryList,
        method: :GET,
        path: "/api/v2/pal-park-area/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pal park area Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
    def retrieve(id : String) : Response(OpenAPIClient::PalParkAreaDetail)
      @conn.request(OpenAPIClient::PalParkAreaDetail,
        method: :GET,
        path: "/api/v2/pal-park-area/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
