# frozen_string_literal: true

module OpenapiClient
  module Api
    class ContestEffect
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/contest-effect/',
          type: OpenapiClient::Models::PaginatedContestEffectSummaryList,
          auth: ['basicAuth', 'cookieAuth'],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/contest-effect/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::ContestEffectDetail,
          auth: ['basicAuth', 'cookieAuth']
        )
      end
    end
  end
end
