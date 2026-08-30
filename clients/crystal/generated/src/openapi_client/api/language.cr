require "json"

module OpenAPIClient
  module Api
  class Language
    def initialize(@conn : Connection); end

    # List languages Languages for translations of API resource information.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedLanguageSummaryList)
      @conn.request(OpenAPIClient::PaginatedLanguageSummaryList,
        method: :GET,
        path: "/api/v2/language/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get language Languages for translations of API resource information.
    def retrieve(id : String) : Response(OpenAPIClient::LanguageDetail)
      @conn.request(OpenAPIClient::LanguageDetail,
        method: :GET,
        path: "/api/v2/language/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
