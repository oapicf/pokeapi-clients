(ns pokéapi.api.berries
  (:require [pokéapi.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [pokéapi.specs.paginated-growth-rate-summary-list :refer :all]
            [pokéapi.specs.egg-group-detail-pokemon-species-inner :refer :all]
            [pokéapi.specs.pal-park-area-summary :refer :all]
            [pokéapi.specs.version-summary :refer :all]
            [pokéapi.specs.item-attribute-summary :refer :all]
            [pokéapi.specs.move-detail-stat-changes-inner :refer :all]
            [pokéapi.specs.contest-effect-summary :refer :all]
            [pokéapi.specs.pokemon-color-name :refer :all]
            [pokéapi.specs.version-group-detail :refer :all]
            [pokéapi.specs.paginated-move-damage-class-summary-list :refer :all]
            [pokéapi.specs.berry-summary :refer :all]
            [pokéapi.specs.location-area-detail-encounter-method-rates-inner-version-details-inner :refer :all]
            [pokéapi.specs.item-attribute-name :refer :all]
            [pokéapi.specs.move-damage-class-description :refer :all]
            [pokéapi.specs.pokeathlon-stat-detail-affecting-natures-decrease-inner :refer :all]
            [pokéapi.specs.pokemon-shape-detail-awesome-names-inner :refer :all]
            [pokéapi.specs.pokemon-detail-past-abilities-inner :refer :all]
            [pokéapi.specs.region-summary :refer :all]
            [pokéapi.specs.evolution-chain-summary :refer :all]
            [pokéapi.specs.item-detail-held-by-pokemon-inner-version-details-inner :refer :all]
            [pokéapi.specs.paginated-pokemon-color-summary-list :refer :all]
            [pokéapi.specs.pokeathlon-stat-detail-affecting-natures :refer :all]
            [pokéapi.specs.paginated-version-group-summary-list :refer :all]
            [pokéapi.specs.super-contest-effect-flavor-text :refer :all]
            [pokéapi.specs.pal-park-area-detail :refer :all]
            [pokéapi.specs.pokedex-detail-pokemon-entries-inner :refer :all]
            [pokéapi.specs.pokemon-detail-past-types-inner :refer :all]
            [pokéapi.specs.region-name :refer :all]
            [pokéapi.specs.paginated-evolution-chain-summary-list :refer :all]
            [pokéapi.specs.item-attribute-description :refer :all]
            [pokéapi.specs.stat-summary :refer :all]
            [pokéapi.specs.contest-type-name :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.gender-detail :refer :all]
            [pokéapi.specs.growth-rate-detail :refer :all]
            [pokéapi.specs.berry-firmness-detail :refer :all]
            [pokéapi.specs.paginated-generation-summary-list :refer :all]
            [pokéapi.specs.paginated-characteristic-summary-list :refer :all]
            [pokéapi.specs.paginated-item-attribute-summary-list :refer :all]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            [pokéapi.specs.item-detail-machines-inner :refer :all]
            [pokéapi.specs.stat-detail-affecting-moves-increase-inner :refer :all]
            [pokéapi.specs.paginated-item-pocket-summary-list :refer :all]
            [pokéapi.specs.pokemon-form-detail-sprites :refer :all]
            [pokéapi.specs.nature-detail-pokeathlon-stat-changes-inner :refer :all]
            [pokéapi.specs.move-meta-category-detail :refer :all]
            [pokéapi.specs.move-learn-method-description :refer :all]
            [pokéapi.specs.paginated-move-meta-ailment-summary-list :refer :all]
            [pokéapi.specs.evolution-trigger-summary :refer :all]
            [pokéapi.specs.pokedex-detail :refer :all]
            [pokéapi.specs.encounter-method-summary :refer :all]
            [pokéapi.specs.move-target-description :refer :all]
            [pokéapi.specs.move-meta-category-description :refer :all]
            [pokéapi.specs.paginated-contest-type-summary-list :refer :all]
            [pokéapi.specs.type-detail-past-damage-relations-inner :refer :all]
            [pokéapi.specs.type-detail-damage-relations :refer :all]
            [pokéapi.specs.move-damage-class-name :refer :all]
            [pokéapi.specs.move-detail-contest-combos :refer :all]
            [pokéapi.specs.item-category-detail :refer :all]
            [pokéapi.specs.move-meta :refer :all]
            [pokéapi.specs.encounter-condition-name :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain :refer :all]
            [pokéapi.specs.stat-detail-affecting-natures :refer :all]
            [pokéapi.specs.move-detail-machines-inner-machine :refer :all]
            [pokéapi.specs.move-detail-effect-changes-inner-effect-entries-inner :refer :all]
            [pokéapi.specs.location-area-summary :refer :all]
            [pokéapi.specs.egg-group-name :refer :all]
            [pokéapi.specs.item-detail-sprites :refer :all]
            [pokéapi.specs.evolution-trigger-name :refer :all]
            [pokéapi.specs.paginated-move-target-summary-list :refer :all]
            [pokéapi.specs.type-game-index :refer :all]
            [pokéapi.specs.gender-summary :refer :all]
            [pokéapi.specs.paginated-type-summary-list :refer :all]
            [pokéapi.specs.gender-detail-pokemon-species-details-inner :refer :all]
            [pokéapi.specs.nature-battle-style-preference :refer :all]
            [pokéapi.specs.paginated-pokeathlon-stat-summary-list :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner :refer :all]
            [pokéapi.specs.paginated-encounter-method-summary-list :refer :all]
            [pokéapi.specs.evolution-chain-detail :refer :all]
            [pokéapi.specs.stat-detail-affecting-moves :refer :all]
            [pokéapi.specs.encounter-method-name :refer :all]
            [pokéapi.specs.pokemon-habitat-name :refer :all]
            [pokéapi.specs.pokeathlon-stat-summary :refer :all]
            [pokéapi.specs.growth-rate-summary :refer :all]
            [pokéapi.specs.pokemon-form-detail-form-names-inner :refer :all]
            [pokéapi.specs.paginated-item-category-summary-list :refer :all]
            [pokéapi.specs.pokemon-detail-held-items :refer :all]
            [pokéapi.specs.item-name :refer :all]
            [pokéapi.specs.move-target-detail :refer :all]
            [pokéapi.specs.language-detail :refer :all]
            [pokéapi.specs.paginated-super-contest-effect-summary-list :refer :all]
            [pokéapi.specs.paginated-berry-summary-list :refer :all]
            [pokéapi.specs.item-detail-held-by-pokemon-inner :refer :all]
            [pokéapi.specs.pokemon-stat :refer :all]
            [pokéapi.specs.characteristic-detail :refer :all]
            [pokéapi.specs.machine-summary :refer :all]
            [pokéapi.specs.ability-detail :refer :all]
            [pokéapi.specs.paginated-machine-summary-list :refer :all]
            [pokéapi.specs.ability-change-effect-text :refer :all]
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
            [pokéapi.specs.pokemon-detail-sprites :refer :all]
            [pokéapi.specs.growth-rate-description :refer :all]
            [pokéapi.specs.item-fling-effect-detail :refer :all]
            [pokéapi.specs.pokemon-species-detail-pal-park-encounters-inner :refer :all]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            [pokéapi.specs.ability-change :refer :all]
            [pokéapi.specs.pokeathlon-stat-detail :refer :all]
            [pokéapi.specs.location-area-name :refer :all]
            [pokéapi.specs.encounter-condition-value-name :refer :all]
            [pokéapi.specs.paginated-pokemon-species-summary-list :refer :all]
            [pokéapi.specs.move-battle-style-detail :refer :all]
            [pokéapi.specs.pokedex-description :refer :all]
            [pokéapi.specs.item-flavor-text :refer :all]
            [pokéapi.specs.pokemon-habitat-summary :refer :all]
            [pokéapi.specs.location-summary :refer :all]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            [pokéapi.specs.pokemon-species-flavor-text :refer :all]
            [pokéapi.specs.paginated-pokemon-shape-summary-list :refer :all]
            [pokéapi.specs.ability-name :refer :all]
            [pokéapi.specs.ability-summary :refer :all]
            [pokéapi.specs.pokemon-species-detail-varieties-inner :refer :all]
            [pokéapi.specs.item-fling-effect-effect-text :refer :all]
            [pokéapi.specs.paginated-nature-summary-list :refer :all]
            [pokéapi.specs.item-pocket-detail :refer :all]
            [pokéapi.specs.move-battle-style-summary :refer :all]
            [pokéapi.specs.nature-summary :refer :all]
            [pokéapi.specs.paginated-move-meta-category-summary-list :refer :all]
            [pokéapi.specs.paginated-ability-summary-list :refer :all]
            [pokéapi.specs.contest-type-detail :refer :all]
            [pokéapi.specs.paginated-encounter-condition-summary-list :refer :all]
            [pokéapi.specs.pokemon-dex-entry :refer :all]
            [pokéapi.specs.pokeathlon-stat-name :refer :all]
            [pokéapi.specs.pokemon-habitat-detail :refer :all]
            [pokéapi.specs.location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details :refer :all]
            [pokéapi.specs.move-meta-ailment-name :refer :all]
            [pokéapi.specs.contest-effect-flavor-text :refer :all]
            [pokéapi.specs.pal-park-area-detail-pokemon-encounters-inner :refer :all]
            [pokéapi.specs.item-pocket-name :refer :all]
            [pokéapi.specs.paginated-item-summary-list :refer :all]
            [pokéapi.specs.super-contest-effect-summary :refer :all]
            [pokéapi.specs.item-fling-effect-summary :refer :all]
            [pokéapi.specs.paginated-pokemon-summary-list :refer :all]
            [pokéapi.specs.item-effect-text :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.pokemon-form-detail :refer :all]
            [pokéapi.specs.move-target-name :refer :all]
            [pokéapi.specs.paginated-gender-summary-list :refer :all]
            [pokéapi.specs.move-change-effect-entries-inner :refer :all]
            [pokéapi.specs.berry-flavor-name :refer :all]
            [pokéapi.specs.move-detail-machines-inner :refer :all]
            [pokéapi.specs.stat-detail :refer :all]
            [pokéapi.specs.pokemon-detail-moves-inner :refer :all]
            [pokéapi.specs.nature-detail :refer :all]
            [pokéapi.specs.paginated-stat-summary-list :refer :all]
            [pokéapi.specs.type-detail-sprites-value-value :refer :all]
            [pokéapi.specs.paginated-location-area-summary-list :refer :all]
            [pokéapi.specs.location-area-detail :refer :all]
            [pokéapi.specs.version-name :refer :all]
            [pokéapi.specs.ability-effect-text :refer :all]
            [pokéapi.specs.move-meta-ailment-detail :refer :all]
            [pokéapi.specs.paginated-egg-group-summary-list :refer :all]
            [pokéapi.specs.move-flavor-text :refer :all]
            [pokéapi.specs.paginated-item-fling-effect-summary-list :refer :all]
            [pokéapi.specs.type-detail :refer :all]
            [pokéapi.specs.pokemon-detail-cries :refer :all]
            [pokéapi.specs.language-name :refer :all]
            [pokéapi.specs.generation-name :refer :all]
            [pokéapi.specs.move-damage-class-detail :refer :all]
            [pokéapi.specs.type-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.berry-flavor-detail-berries-inner-berry :refer :all]
            [pokéapi.specs.berry-detail :refer :all]
            [pokéapi.specs.paginated-language-summary-list :refer :all]
            [pokéapi.specs.berry-flavor-detail-berries-inner :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.berry-firmness-summary :refer :all]
            [pokéapi.specs.encounter-method-detail :refer :all]
            [pokéapi.specs.pokemon-color-detail :refer :all]
            [pokéapi.specs.encounter-condition-detail :refer :all]
            [pokéapi.specs.encounter-condition-summary :refer :all]
            [pokéapi.specs.pokemon-shape-summary :refer :all]
            [pokéapi.specs.nature-name :refer :all]
            [pokéapi.specs.pokeathlon-stat-detail-affecting-natures-increase-inner :refer :all]
            [pokéapi.specs.paginated-berry-flavor-summary-list :refer :all]
            [pokéapi.specs.pokemon-species-detail :refer :all]
            [pokéapi.specs.berry-flavor-detail :refer :all]
            [pokéapi.specs.machine-detail :refer :all]
            [pokéapi.specs.paginated-version-summary-list :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.pokemon-detail :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender :refer :all]
            [pokéapi.specs.contest-effect-effect-text :refer :all]
            [pokéapi.specs.move-battle-style-name :refer :all]
            [pokéapi.specs.characteristic-summary :refer :all]
            [pokéapi.specs.contest-type-summary :refer :all]
            [pokéapi.specs.move-meta-category-summary :refer :all]
            [pokéapi.specs.paginated-encounter-condition-value-summary-list :refer :all]
            [pokéapi.specs.paginated-pokemon-habitat-summary-list :refer :all]
            [pokéapi.specs.location-area-detail-encounter-method-rates-inner :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.move-learn-method-detail :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner :refer :all]
            [pokéapi.specs.pokemon-shape-detail-names-inner :refer :all]
            [pokéapi.specs.item-detail-baby-trigger-for :refer :all]
            [pokéapi.specs.location-name :refer :all]
            [pokéapi.specs.location-game-index :refer :all]
            [pokéapi.specs.move-meta-ailment-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.experience :refer :all]
            [pokéapi.specs.paginated-pal-park-area-summary-list :refer :all]
            [pokéapi.specs.berry-detail-flavors-inner-flavor :refer :all]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.berry-firmness-name :refer :all]
            [pokéapi.specs.type-detail-past-damage-relations-inner-damage-relations :refer :all]
            [pokéapi.specs.item-detail :refer :all]
            [pokéapi.specs.item-attribute-detail :refer :all]
            [pokéapi.specs.contest-effect-detail :refer :all]
            [pokéapi.specs.pokemon-detail-abilities-inner :refer :all]
            [pokéapi.specs.region-detail :refer :all]
            [pokéapi.specs.location-area-detail-pokemon-encounters-inner-version-details-inner :refer :all]
            [pokéapi.specs.characteristic-description :refer :all]
            [pokéapi.specs.pokemon-species-description :refer :all]
            [pokéapi.specs.move-learn-method-name :refer :all]
            [pokéapi.specs.paginated-contest-effect-summary-list :refer :all]
            [pokéapi.specs.type-detail-pokemon-inner :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner :refer :all]
            [pokéapi.specs.move-detail-effect-changes-inner :refer :all]
            [pokéapi.specs.move-learn-method-summary :refer :all]
            [pokéapi.specs.generation-detail :refer :all]
            [pokéapi.specs.paginated-berry-firmness-summary-list :refer :all]
            [pokéapi.specs.pokemon-shape-detail :refer :all]
            [pokéapi.specs.move-detail-contest-combos-normal :refer :all]
            [pokéapi.specs.pokemon-detail-moves-inner-version-group-details-inner :refer :all]
            [pokéapi.specs.pokemon-detail-types-inner :refer :all]
            [pokéapi.specs.paginated-pokedex-summary-list :refer :all]
            [pokéapi.specs.egg-group-detail :refer :all]
            [pokéapi.specs.item-game-index :refer :all]
            [pokéapi.specs.location-area-detail-pokemon-encounters-inner :refer :all]
            [pokéapi.specs.pal-park-area-name :refer :all]
            [pokéapi.specs.pokedex-name :refer :all]
            [pokéapi.specs.berry-detail-flavors-inner :refer :all]
            [pokéapi.specs.item-pocket-summary :refer :all]
            [pokéapi.specs.pokemon-game-index :refer :all]
            [pokéapi.specs.pokemon-color-summary :refer :all]
            [pokéapi.specs.paginated-move-summary-list :refer :all]
            [pokéapi.specs.pokemon-summary :refer :all]
            [pokéapi.specs.version-detail :refer :all]
            [pokéapi.specs.item-category-summary :refer :all]
            [pokéapi.specs.super-contest-effect-detail :refer :all]
            [pokéapi.specs.paginated-move-learn-method-summary-list :refer :all]
            [pokéapi.specs.paginated-region-summary-list :refer :all]
            [pokéapi.specs.move-name :refer :all]
            [pokéapi.specs.paginated-pokemon-form-summary-list :refer :all]
            [pokéapi.specs.paginated-location-summary-list :refer :all]
            [pokéapi.specs.item-category-name :refer :all]
            [pokéapi.specs.encounter-condition-value-detail :refer :all]
            [pokéapi.specs.pokedex-summary :refer :all]
            [pokéapi.specs.ability-flavor-text :refer :all]
            [pokéapi.specs.pokemon-species-detail-genera-inner :refer :all]
            )
  (:import (java.io File)))


(defn-spec berry-firmness-list-with-http-info any?
  "List berry firmness
  Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail."
  ([] (berry-firmness-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/berry-firmness/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec berry-firmness-list paginated-berry-firmness-summary-list-spec
  "List berry firmness
  Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail."
  ([] (berry-firmness-list nil))
  ([optional-params any?]
   (let [res (:data (berry-firmness-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-berry-firmness-summary-list-spec res st/string-transformer)
        res))))


(defn-spec berry-firmness-retrieve-with-http-info any?
  "Get berry by firmness
  Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/berry-firmness/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec berry-firmness-retrieve berry-firmness-detail-spec
  "Get berry by firmness
  Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail."
  [id string?]
  (let [res (:data (berry-firmness-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode berry-firmness-detail-spec res st/string-transformer)
       res)))


(defn-spec berry-flavor-list-with-http-info any?
  "List berry flavors
  Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail."
  ([] (berry-flavor-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/berry-flavor/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec berry-flavor-list paginated-berry-flavor-summary-list-spec
  "List berry flavors
  Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail."
  ([] (berry-flavor-list nil))
  ([optional-params any?]
   (let [res (:data (berry-flavor-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-berry-flavor-summary-list-spec res st/string-transformer)
        res))))


(defn-spec berry-flavor-retrieve-with-http-info any?
  "Get berries by flavor
  Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/berry-flavor/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec berry-flavor-retrieve berry-flavor-detail-spec
  "Get berries by flavor
  Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail."
  [id string?]
  (let [res (:data (berry-flavor-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode berry-flavor-detail-spec res st/string-transformer)
       res)))


(defn-spec berry-list-with-http-info any?
  "List berries
  Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail."
  ([] (berry-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/berry/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec berry-list paginated-berry-summary-list-spec
  "List berries
  Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail."
  ([] (berry-list nil))
  ([optional-params any?]
   (let [res (:data (berry-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-berry-summary-list-spec res st/string-transformer)
        res))))


(defn-spec berry-retrieve-with-http-info any?
  "Get a berry
  Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/berry/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec berry-retrieve berry-detail-spec
  "Get a berry
  Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail."
  [id string?]
  (let [res (:data (berry-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode berry-detail-spec res st/string-transformer)
       res)))


