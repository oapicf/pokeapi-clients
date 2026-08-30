require "json"

module OpenAPIClient
  module Api
  class EggGroup
    def initialize(@conn : Connection); end

    # List egg groups Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedEggGroupSummaryList)
      @conn.request(OpenAPIClient::PaginatedEggGroupSummaryList,
        method: :GET,
        path: "/api/v2/egg-group/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get egg group Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::EggGroupDetail)
      @conn.request(OpenAPIClient::EggGroupDetail,
        method: :GET,
        path: "/api/v2/egg-group/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
