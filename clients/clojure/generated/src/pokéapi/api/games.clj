(ns pokéapi.api.games
  (:require [pokéapi.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [pokéapi.specs.paginated-growth-rate-summary-list :refer :all]
            [pokéapi.specs.pal-park-area-summary :refer :all]
            [pokéapi.specs.version-summary :refer :all]
            [pokéapi.specs.item-attribute-summary :refer :all]
            [pokéapi.specs.type-relationships :refer :all]
            [pokéapi.specs.contest-effect-summary :refer :all]
            [pokéapi.specs.pokemon-color-name :refer :all]
            [pokéapi.specs.version-group-detail :refer :all]
            [pokéapi.specs.evolution-variable-summary :refer :all]
            [pokéapi.specs.paginated-move-damage-class-summary-list :refer :all]
            [pokéapi.specs.berry-summary :refer :all]
            [pokéapi.specs.item-attribute-name :refer :all]
            [pokéapi.specs.move-damage-class-description :refer :all]
            [pokéapi.specs.pokemon-form-trigger-condition :refer :all]
            [pokéapi.specs.pokeathlon-stat-affecting-nature :refer :all]
            [pokéapi.specs.region-summary :refer :all]
            [pokéapi.specs.evolution-chain-summary :refer :all]
            [pokéapi.specs.paginated-pokemon-color-summary-list :refer :all]
            [pokéapi.specs.paginated-version-group-summary-list :refer :all]
            [pokéapi.specs.item-price :refer :all]
            [pokéapi.specs.pokemon-sprites-other-dream-world :refer :all]
            [pokéapi.specs.currency-summary :refer :all]
            [pokéapi.specs.super-contest-effect-flavor-text :refer :all]
            [pokéapi.specs.pal-park-area-detail :refer :all]
            [pokéapi.specs.region-name :refer :all]
            [pokéapi.specs.paginated-evolution-chain-summary-list :refer :all]
            [pokéapi.specs.item-attribute-description :refer :all]
            [pokéapi.specs.stat-summary :refer :all]
            [pokéapi.specs.contest-type-name :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.gender-detail :refer :all]
            [pokéapi.specs.growth-rate-detail :refer :all]
            [pokéapi.specs.pokeathlon-stat-affecting-natures :refer :all]
            [pokéapi.specs.berry-firmness-detail :refer :all]
            [pokéapi.specs.paginated-generation-summary-list :refer :all]
            [pokéapi.specs.paginated-characteristic-summary-list :refer :all]
            [pokéapi.specs.paginated-item-attribute-summary-list :refer :all]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            [pokéapi.specs.paginated-item-pocket-summary-list :refer :all]
            [pokéapi.specs.move-meta-category-detail :refer :all]
            [pokéapi.specs.move-learn-method-description :refer :all]
            [pokéapi.specs.paginated-move-meta-ailment-summary-list :refer :all]
            [pokéapi.specs.evolution-trigger-summary :refer :all]
            [pokéapi.specs.pokedex-detail :refer :all]
            [pokéapi.specs.encounter-method-summary :refer :all]
            [pokéapi.specs.move-target-description :refer :all]
            [pokéapi.specs.move-meta-category-description :refer :all]
            [pokéapi.specs.pokemon-type :refer :all]
            [pokéapi.specs.paginated-contest-type-summary-list :refer :all]
            [pokéapi.specs.move-damage-class-name :refer :all]
            [pokéapi.specs.pokemon-held-item-version :refer :all]
            [pokéapi.specs.item-category-detail :refer :all]
            [pokéapi.specs.pokemon-form-sprites :refer :all]
            [pokéapi.specs.move-meta :refer :all]
            [pokéapi.specs.encounter-condition-name :refer :all]
            [pokéapi.specs.pokemon-sprites :refer :all]
            [pokéapi.specs.move-combos :refer :all]
            [pokéapi.specs.location-area-summary :refer :all]
            [pokéapi.specs.egg-group-name :refer :all]
            [pokéapi.specs.evolution-trigger-name :refer :all]
            [pokéapi.specs.paginated-move-target-summary-list :refer :all]
            [pokéapi.specs.type-game-index :refer :all]
            [pokéapi.specs.location-area-pokemon-encounter-version :refer :all]
            [pokéapi.specs.gender-summary :refer :all]
            [pokéapi.specs.paginated-type-summary-list :refer :all]
            [pokéapi.specs.type-past-relationships :refer :all]
            [pokéapi.specs.nature-battle-style-preference :refer :all]
            [pokéapi.specs.paginated-pokeathlon-stat-summary-list :refer :all]
            [pokéapi.specs.pokemon-form-flavor-text :refer :all]
            [pokéapi.specs.paginated-encounter-method-summary-list :refer :all]
            [pokéapi.specs.evolution-chain-detail :refer :all]
            [pokéapi.specs.berry-flavor-berry-map :refer :all]
            [pokéapi.specs.pokemon-past-type :refer :all]
            [pokéapi.specs.encounter-method-name :refer :all]
            [pokéapi.specs.pokemon-habitat-name :refer :all]
            [pokéapi.specs.pokeathlon-stat-summary :refer :all]
            [pokéapi.specs.growth-rate-summary :refer :all]
            [pokéapi.specs.paginated-item-category-summary-list :refer :all]
            [pokéapi.specs.item-name :refer :all]
            [pokéapi.specs.pokemon-ability :refer :all]
            [pokéapi.specs.move-target-detail :refer :all]
            [pokéapi.specs.language-detail :refer :all]
            [pokéapi.specs.paginated-super-contest-effect-summary-list :refer :all]
            [pokéapi.specs.move-effect-change :refer :all]
            [pokéapi.specs.paginated-berry-summary-list :refer :all]
            [pokéapi.specs.pokemon-move-version-group :refer :all]
            [pokéapi.specs.pokemon-stat :refer :all]
            [pokéapi.specs.characteristic-detail :refer :all]
            [pokéapi.specs.machine-summary :refer :all]
            [pokéapi.specs.pokemon-encounter-version-detail-response :refer :all]
            [pokéapi.specs.pokemon-species-variety :refer :all]
            [pokéapi.specs.pokemon-form-name :refer :all]
            [pokéapi.specs.item-sprites :refer :all]
            [pokéapi.specs.ability-detail :refer :all]
            [pokéapi.specs.paginated-machine-summary-list :refer :all]
            [pokéapi.specs.ability-change-effect-text :refer :all]
            [pokéapi.specs.pokemon-sprites-other-official-artwork :refer :all]
            [pokéapi.specs.paginated-evolution-variable-summary-list :refer :all]
            [pokéapi.specs.paginated-evolution-trigger-summary-list :refer :all]
            [pokéapi.specs.location-detail :refer :all]
            [pokéapi.specs.move-detail :refer :all]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            [pokéapi.specs.move-target-summary :refer :all]
            [pokéapi.specs.paginated-move-battle-style-summary-list :refer :all]
            [pokéapi.specs.language-summary :refer :all]
            [pokéapi.specs.egg-group-summary :refer :all]
            [pokéapi.specs.move-change :refer :all]
            [pokéapi.specs.stat-name :refer :all]
            [pokéapi.specs.evolution-trigger-detail :refer :all]
            [pokéapi.specs.berry-flavor-map :refer :all]
            [pokéapi.specs.growth-rate-description :refer :all]
            [pokéapi.specs.pokemon-sprites-other-home :refer :all]
            [pokéapi.specs.item-fling-effect-detail :refer :all]
            [pokéapi.specs.pokemon-shape-name :refer :all]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            [pokéapi.specs.ability-change :refer :all]
            [pokéapi.specs.pokemon-sprites-other-showdown :refer :all]
            [pokéapi.specs.pokeathlon-stat-detail :refer :all]
            [pokéapi.specs.location-area-name :refer :all]
            [pokéapi.specs.encounter-condition-value-name :refer :all]
            [pokéapi.specs.paginated-pokemon-species-summary-list :refer :all]
            [pokéapi.specs.move-battle-style-detail :refer :all]
            [pokéapi.specs.pokedex-description :refer :all]
            [pokéapi.specs.item-flavor-text :refer :all]
            [pokéapi.specs.pokemon-held-item :refer :all]
            [pokéapi.specs.item-machine :refer :all]
            [pokéapi.specs.move-combo-usage :refer :all]
            [pokéapi.specs.pal-park-encounter :refer :all]
            [pokéapi.specs.pokemon-habitat-summary :refer :all]
            [pokéapi.specs.location-summary :refer :all]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            [pokéapi.specs.pokemon-species-flavor-text :refer :all]
            [pokéapi.specs.stat-affecting-natures :refer :all]
            [pokéapi.specs.nature-pokeathlon-stat :refer :all]
            [pokéapi.specs.paginated-pokemon-shape-summary-list :refer :all]
            [pokéapi.specs.ability-name :refer :all]
            [pokéapi.specs.evolution-variable-description :refer :all]
            [pokéapi.specs.ability-summary :refer :all]
            [pokéapi.specs.item-fling-effect-effect-text :refer :all]
            [pokéapi.specs.evolution-variable-detail :refer :all]
            [pokéapi.specs.paginated-nature-summary-list :refer :all]
            [pokéapi.specs.pokeapi-meta-response :refer :all]
            [pokéapi.specs.item-pocket-detail :refer :all]
            [pokéapi.specs.move-battle-style-summary :refer :all]
            [pokéapi.specs.nature-summary :refer :all]
            [pokéapi.specs.paginated-move-meta-category-summary-list :refer :all]
            [pokéapi.specs.paginated-ability-summary-list :refer :all]
            [pokéapi.specs.contest-type-detail :refer :all]
            [pokéapi.specs.paginated-encounter-condition-summary-list :refer :all]
            [pokéapi.specs.pokemon-dex-entry :refer :all]
            [pokéapi.specs.type-name :refer :all]
            [pokéapi.specs.evolution-chain-link :refer :all]
            [pokéapi.specs.pokeathlon-stat-name :refer :all]
            [pokéapi.specs.pokemon-habitat-detail :refer :all]
            [pokéapi.specs.evolution-condition-expression :refer :all]
            [pokéapi.specs.move-meta-ailment-name :refer :all]
            [pokéapi.specs.contest-effect-flavor-text :refer :all]
            [pokéapi.specs.item-pocket-name :refer :all]
            [pokéapi.specs.paginated-item-summary-list :refer :all]
            [pokéapi.specs.pokemon-encounter-detail-response :refer :all]
            [pokéapi.specs.super-contest-effect-summary :refer :all]
            [pokéapi.specs.pokemon-dex-number :refer :all]
            [pokéapi.specs.pokemon-move :refer :all]
            [pokéapi.specs.item-fling-effect-summary :refer :all]
            [pokéapi.specs.paginated-pokemon-summary-list :refer :all]
            [pokéapi.specs.item-effect-text :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.pokemon-form-detail :refer :all]
            [pokéapi.specs.move-target-name :refer :all]
            [pokéapi.specs.paginated-gender-summary-list :refer :all]
            [pokéapi.specs.berry-flavor-name :refer :all]
            [pokéapi.specs.stat-detail :refer :all]
            [pokéapi.specs.nature-detail :refer :all]
            [pokéapi.specs.paginated-stat-summary-list :refer :all]
            [pokéapi.specs.paginated-location-area-summary-list :refer :all]
            [pokéapi.specs.ability-pokemon-detail :refer :all]
            [pokéapi.specs.location-area-detail :refer :all]
            [pokéapi.specs.pokemon-encounter-response :refer :all]
            [pokéapi.specs.version-name :refer :all]
            [pokéapi.specs.ability-effect-text :refer :all]
            [pokéapi.specs.move-meta-ailment-detail :refer :all]
            [pokéapi.specs.pokemon-species-genus :refer :all]
            [pokéapi.specs.location-area-pokemon-encounter :refer :all]
            [pokéapi.specs.paginated-egg-group-summary-list :refer :all]
            [pokéapi.specs.move-flavor-text :refer :all]
            [pokéapi.specs.paginated-item-fling-effect-summary-list :refer :all]
            [pokéapi.specs.type-detail :refer :all]
            [pokéapi.specs.type-game-sprite :refer :all]
            [pokéapi.specs.language-name :refer :all]
            [pokéapi.specs.generation-name :refer :all]
            [pokéapi.specs.move-damage-class-detail :refer :all]
            [pokéapi.specs.berry-detail :refer :all]
            [pokéapi.specs.paginated-language-summary-list :refer :all]
            [pokéapi.specs.pokemon-evolution :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.berry-firmness-summary :refer :all]
            [pokéapi.specs.encounter-method-detail :refer :all]
            [pokéapi.specs.pokemon-color-detail :refer :all]
            [pokéapi.specs.encounter-condition-detail :refer :all]
            [pokéapi.specs.encounter-condition-summary :refer :all]
            [pokéapi.specs.pokemon-shape-summary :refer :all]
            [pokéapi.specs.location-area-encounter-version-detail :refer :all]
            [pokéapi.specs.nature-name :refer :all]
            [pokéapi.specs.paginated-berry-flavor-summary-list :refer :all]
            [pokéapi.specs.pokemon-species-detail :refer :all]
            [pokéapi.specs.berry-flavor-detail :refer :all]
            [pokéapi.specs.machine-detail :refer :all]
            [pokéapi.specs.paginated-version-summary-list :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.move-meta-stat-change :refer :all]
            [pokéapi.specs.pokemon-detail :refer :all]
            [pokéapi.specs.paginated-currency-summary-list :refer :all]
            [pokéapi.specs.contest-effect-effect-text :refer :all]
            [pokéapi.specs.move-battle-style-name :refer :all]
            [pokéapi.specs.characteristic-summary :refer :all]
            [pokéapi.specs.contest-type-summary :refer :all]
            [pokéapi.specs.move-meta-category-summary :refer :all]
            [pokéapi.specs.paginated-encounter-condition-value-summary-list :refer :all]
            [pokéapi.specs.paginated-pokemon-habitat-summary-list :refer :all]
            [pokéapi.specs.pokemon-ability-past :refer :all]
            [pokéapi.specs.evolution-variable-name :refer :all]
            [pokéapi.specs.pokemon-cries :refer :all]
            [pokéapi.specs.move-learn-method-detail :refer :all]
            [pokéapi.specs.location-name :refer :all]
            [pokéapi.specs.location-game-index :refer :all]
            [pokéapi.specs.move-meta-ailment-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.experience :refer :all]
            [pokéapi.specs.paginated-pal-park-area-summary-list :refer :all]
            [pokéapi.specs.pokemon-past-ability :refer :all]
            [pokéapi.specs.pokemon-species-name :refer :all]
            [pokéapi.specs.pokemon-species-pal-park-encounter :refer :all]
            [pokéapi.specs.location-area-encounter-rate :refer :all]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.berry-firmness-name :refer :all]
            [pokéapi.specs.currency-name :refer :all]
            [pokéapi.specs.item-detail :refer :all]
            [pokéapi.specs.item-attribute-detail :refer :all]
            [pokéapi.specs.contest-effect-detail :refer :all]
            [pokéapi.specs.pokemon-past-stat :refer :all]
            [pokéapi.specs.gender-pokemon-species :refer :all]
            [pokéapi.specs.region-detail :refer :all]
            [pokéapi.specs.characteristic-description :refer :all]
            [pokéapi.specs.pokemon-species-description :refer :all]
            [pokéapi.specs.move-learn-method-name :refer :all]
            [pokéapi.specs.paginated-contest-effect-summary-list :refer :all]
            [pokéapi.specs.currency-detail :refer :all]
            [pokéapi.specs.move-effect-change-effect-text :refer :all]
            [pokéapi.specs.pokemon-evolution-known-move :refer :all]
            [pokéapi.specs.pokemon-held-item-summary :refer :all]
            [pokéapi.specs.move-learn-method-summary :refer :all]
            [pokéapi.specs.generation-detail :refer :all]
            [pokéapi.specs.paginated-berry-firmness-summary-list :refer :all]
            [pokéapi.specs.pokemon-shape-detail :refer :all]
            [pokéapi.specs.type-pokemon :refer :all]
            [pokéapi.specs.paginated-pokedex-summary-list :refer :all]
            [pokéapi.specs.pokemon-shape-awesome-name :refer :all]
            [pokéapi.specs.egg-group-detail :refer :all]
            [pokéapi.specs.item-game-index :refer :all]
            [pokéapi.specs.pal-park-area-name :refer :all]
            [pokéapi.specs.pokedex-name :refer :all]
            [pokéapi.specs.pokemon-form-type :refer :all]
            [pokéapi.specs.item-pocket-summary :refer :all]
            [pokéapi.specs.pokemon-game-index :refer :all]
            [pokéapi.specs.pokemon-color-summary :refer :all]
            [pokéapi.specs.location-area-encounter-detail :refer :all]
            [pokéapi.specs.paginated-move-summary-list :refer :all]
            [pokéapi.specs.pokemon-summary :refer :all]
            [pokéapi.specs.encounter-pokemon-detail :refer :all]
            [pokéapi.specs.version-detail :refer :all]
            [pokéapi.specs.item-category-summary :refer :all]
            [pokéapi.specs.super-contest-effect-detail :refer :all]
            [pokéapi.specs.move-effect-effect-text :refer :all]
            [pokéapi.specs.paginated-move-learn-method-summary-list :refer :all]
            [pokéapi.specs.paginated-region-summary-list :refer :all]
            [pokéapi.specs.move-stat-change :refer :all]
            [pokéapi.specs.move-name :refer :all]
            [pokéapi.specs.stat-affecting-moves :refer :all]
            [pokéapi.specs.paginated-pokemon-form-summary-list :refer :all]
            [pokéapi.specs.paginated-location-summary-list :refer :all]
            [pokéapi.specs.item-category-name :refer :all]
            [pokéapi.specs.encounter-condition-value-detail :refer :all]
            [pokéapi.specs.pokedex-summary :refer :all]
            [pokéapi.specs.pokemon-sprites-other :refer :all]
            [pokéapi.specs.ability-flavor-text :refer :all]
            )
  (:import (java.io File)))


(defn-spec generation-list-with-http-info any?
  "List genrations
  A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."
  ([] (generation-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/generation/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec generation-list paginated-generation-summary-list-spec
  "List genrations
  A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."
  ([] (generation-list nil))
  ([optional-params any?]
   (let [res (:data (generation-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-generation-summary-list-spec res st/string-transformer)
        res))))


(defn-spec generation-retrieve-with-http-info any?
  "Get genration
  A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/generation/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec generation-retrieve generation-detail-spec
  "Get genration
  A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."
  [id string?]
  (let [res (:data (generation-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode generation-detail-spec res st/string-transformer)
       res)))


(defn-spec pokedex-list-with-http-info any?
  "List pokedex
  A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."
  ([] (pokedex-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokedex/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec pokedex-list paginated-pokedex-summary-list-spec
  "List pokedex
  A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."
  ([] (pokedex-list nil))
  ([optional-params any?]
   (let [res (:data (pokedex-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokedex-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokedex-retrieve-with-http-info any?
  "Get pokedex
  A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokedex/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec pokedex-retrieve pokedex-detail-spec
  "Get pokedex
  A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."
  [id string?]
  (let [res (:data (pokedex-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokedex-detail-spec res st/string-transformer)
       res)))


(defn-spec version-group-list-with-http-info any?
  "List version groups
  Version groups categorize highly similar versions of the games."
  ([] (version-group-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/version-group/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec version-group-list paginated-version-group-summary-list-spec
  "List version groups
  Version groups categorize highly similar versions of the games."
  ([] (version-group-list nil))
  ([optional-params any?]
   (let [res (:data (version-group-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-version-group-summary-list-spec res st/string-transformer)
        res))))


(defn-spec version-group-retrieve-with-http-info any?
  "Get version group
  Version groups categorize highly similar versions of the games."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/version-group/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec version-group-retrieve version-group-detail-spec
  "Get version group
  Version groups categorize highly similar versions of the games."
  [id string?]
  (let [res (:data (version-group-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode version-group-detail-spec res st/string-transformer)
       res)))


(defn-spec version-list-with-http-info any?
  "List versions
  Versions of the games, e.g., Red, Blue or Yellow."
  ([] (version-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/version/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec version-list paginated-version-summary-list-spec
  "List versions
  Versions of the games, e.g., Red, Blue or Yellow."
  ([] (version-list nil))
  ([optional-params any?]
   (let [res (:data (version-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-version-summary-list-spec res st/string-transformer)
        res))))


(defn-spec version-retrieve-with-http-info any?
  "Get version
  Versions of the games, e.g., Red, Blue or Yellow."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/version/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec version-retrieve version-detail-spec
  "Get version
  Versions of the games, e.g., Red, Blue or Yellow."
  [id string?]
  (let [res (:data (version-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode version-detail-spec res st/string-transformer)
       res)))


