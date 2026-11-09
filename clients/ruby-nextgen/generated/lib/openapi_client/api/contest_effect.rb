# frozen_string_literal: true

module OpenapiClient
  module Api
    class ContestEffect
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil)
        @connection.call(
          :GET,
          '/api/v2/contest-effect/',
          type: OpenapiClient::Models::PaginatedContestEffectSummaryList,
          auth: [],
          query: { 'limit' => limit, 'offset' => offset }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/contest-effect/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::ContestEffectDetail,
          auth: []
        )
      end
    end
  end
end
