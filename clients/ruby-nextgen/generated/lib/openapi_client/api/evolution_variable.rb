# frozen_string_literal: true

module OpenapiClient
  module Api
    class EvolutionVariable
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/evolution-variable/',
          type: OpenapiClient::Models::PaginatedEvolutionVariableSummaryList,
          auth: [],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/evolution-variable/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::EvolutionVariableDetail,
          auth: []
        )
      end
    end
  end
end
