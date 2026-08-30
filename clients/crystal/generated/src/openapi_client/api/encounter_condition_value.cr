require "json"

module OpenAPIClient
  module Api
  class EncounterConditionValue
    def initialize(@conn : Connection); end

    # List encounter condition values Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedEncounterConditionValueSummaryList)
      @conn.request(OpenAPIClient::PaginatedEncounterConditionValueSummaryList,
        method: :GET,
        path: "/api/v2/encounter-condition-value/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get encounter condition value Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    def retrieve(id : String) : Response(OpenAPIClient::EncounterConditionValueDetail)
      @conn.request(OpenAPIClient::EncounterConditionValueDetail,
        method: :GET,
        path: "/api/v2/encounter-condition-value/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
