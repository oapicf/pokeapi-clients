# frozen_string_literal: true

module OpenapiClient
  module Api
    class SuperContestEffect
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil)
        @connection.call(
          :GET,
          '/api/v2/super-contest-effect/',
          type: OpenapiClient::Models::PaginatedSuperContestEffectSummaryList,
          auth: [],
          query: { 'limit' => limit, 'offset' => offset }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/super-contest-effect/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::SuperContestEffectDetail,
          auth: []
        )
      end
    end
  end
end
