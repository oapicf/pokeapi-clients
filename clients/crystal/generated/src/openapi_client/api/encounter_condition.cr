require "json"

module OpenAPIClient
  module Api
  class EncounterCondition
    def initialize(@conn : Connection); end

    # List encounter conditions Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedEncounterConditionSummaryList)
      @conn.request(OpenAPIClient::PaginatedEncounterConditionSummaryList,
        method: :GET,
        path: "/api/v2/encounter-condition/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get encounter condition Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    def retrieve(id : String) : Response(OpenAPIClient::EncounterConditionDetail)
      @conn.request(OpenAPIClient::EncounterConditionDetail,
        method: :GET,
        path: "/api/v2/encounter-condition/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
