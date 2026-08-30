require "json"

module OpenAPIClient
  module Api
  class MoveAilment
    def initialize(@conn : Connection); end

    # List move meta ailments Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveMetaAilmentSummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveMetaAilmentSummaryList,
        method: :GET,
        path: "/api/v2/move-ailment/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move meta ailment Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::MoveMetaAilmentDetail)
      @conn.request(OpenAPIClient::MoveMetaAilmentDetail,
        method: :GET,
        path: "/api/v2/move-ailment/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
