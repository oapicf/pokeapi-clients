# frozen_string_literal: true

module OpenapiClient
  module Api
    class Language
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/language/',
          type: OpenapiClient::Models::PaginatedLanguageSummaryList,
          auth: ['basicAuth', 'cookieAuth'],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/language/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::LanguageDetail,
          auth: ['basicAuth', 'cookieAuth']
        )
      end
    end
  end
end
