require "json"

module OpenAPIClient
  module Api
  class SuperContestEffect
    def initialize(@conn : Connection); end

    # List super contest effects Super contest effects refer to the effects of moves when used in super contests.
    def list(*, limit : Int32? = nil, offset : Int32? = nil) : Response(OpenAPIClient::PaginatedSuperContestEffectSummaryList)
      @conn.request(OpenAPIClient::PaginatedSuperContestEffectSummaryList,
        method: :GET,
        path: "/api/v2/super-contest-effect/",
        query: { "limit" => limit, "offset" => offset },
        accept: %w[application/json],
        auth: %w[])
    end

    # Get super contest effect Super contest effects refer to the effects of moves when used in super contests.
    def retrieve(id : String) : Response(OpenAPIClient::SuperContestEffectDetail)
      @conn.request(OpenAPIClient::SuperContestEffectDetail,
        method: :GET,
        path: "/api/v2/super-contest-effect/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
