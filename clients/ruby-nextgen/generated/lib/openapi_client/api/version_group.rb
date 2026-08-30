# frozen_string_literal: true

module OpenapiClient
  module Api
    class VersionGroup
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/version-group/',
          type: OpenapiClient::Models::PaginatedVersionGroupSummaryList,
          auth: ['basicAuth', 'cookieAuth'],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/version-group/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::VersionGroupDetail,
          auth: ['basicAuth', 'cookieAuth']
        )
      end
    end
  end
end
