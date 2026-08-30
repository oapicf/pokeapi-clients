require "json"

module OpenAPIClient
  module Api
  class ContestEffect
    def initialize(@conn : Connection); end

    # List contest effects Contest effects refer to the effects of moves when used in contests.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedContestEffectSummaryList)
      @conn.request(OpenAPIClient::PaginatedContestEffectSummaryList,
        method: :GET,
        path: "/api/v2/contest-effect/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get contest effect Contest effects refer to the effects of moves when used in contests.
    def retrieve(id : String) : Response(OpenAPIClient::ContestEffectDetail)
      @conn.request(OpenAPIClient::ContestEffectDetail,
        method: :GET,
        path: "/api/v2/contest-effect/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
