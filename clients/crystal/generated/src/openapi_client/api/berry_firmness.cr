require "json"

module OpenAPIClient
  module Api
  class BerryFirmness
    def initialize(@conn : Connection); end

    # List berry firmness Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedBerryFirmnessSummaryList)
      @conn.request(OpenAPIClient::PaginatedBerryFirmnessSummaryList,
        method: :GET,
        path: "/api/v2/berry-firmness/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get berry by firmness Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::BerryFirmnessDetail)
      @conn.request(OpenAPIClient::BerryFirmnessDetail,
        method: :GET,
        path: "/api/v2/berry-firmness/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
