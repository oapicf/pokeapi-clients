require "json"

module OpenAPIClient
  module Api
  class Meta
    def initialize(@conn : Connection); end

    # Get API metadata Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).
    def retrieve() : Response(OpenAPIClient::PokeapiMetaResponse)
      @conn.request(OpenAPIClient::PokeapiMetaResponse,
        method: :GET,
        path: "/api/v2/meta/",
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
