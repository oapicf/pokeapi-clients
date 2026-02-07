(ns pokéapi.api.pokemon
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
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-version :refer :all]
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
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner :refer :all]
            [pokéapi.specs.berry-firmness-detail :refer :all]
            [pokéapi.specs.paginated-generation-summary-list :refer :all]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method :refer :all]
            [pokéapi.specs.paginated-characteristic-summary-list :refer :all]
            [pokéapi.specs.paginated-item-attribute-summary-list :refer :all]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-location-area :refer :all]
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
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner :refer :all]
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
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner :refer :all]
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
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner :refer :all]
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


(defn-spec ability-list-with-http-info any?
  "
  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail."
  ([] (ability-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/ability/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec ability-list paginated-ability-summary-list-spec
  "
  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail."
  ([] (ability-list nil))
  ([optional-params any?]
   (let [res (:data (ability-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-ability-summary-list-spec res st/string-transformer)
        res))))


(defn-spec ability-retrieve-with-http-info any?
  "
  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/ability/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec ability-retrieve ability-detail-spec
  "
  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail."
  [id string?]
  (let [res (:data (ability-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode ability-detail-spec res st/string-transformer)
       res)))


(defn-spec characteristic-list-with-http-info any?
  "List charecterictics
  Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail."
  ([] (characteristic-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/characteristic/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec characteristic-list paginated-characteristic-summary-list-spec
  "List charecterictics
  Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail."
  ([] (characteristic-list nil))
  ([optional-params any?]
   (let [res (:data (characteristic-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-characteristic-summary-list-spec res st/string-transformer)
        res))))


(defn-spec characteristic-retrieve-with-http-info any?
  "Get characteristic
  Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/characteristic/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec characteristic-retrieve characteristic-detail-spec
  "Get characteristic
  Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail."
  [id string?]
  (let [res (:data (characteristic-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode characteristic-detail-spec res st/string-transformer)
       res)))


(defn-spec egg-group-list-with-http-info any?
  "List egg groups
  Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail."
  ([] (egg-group-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/egg-group/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec egg-group-list paginated-egg-group-summary-list-spec
  "List egg groups
  Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail."
  ([] (egg-group-list nil))
  ([optional-params any?]
   (let [res (:data (egg-group-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-egg-group-summary-list-spec res st/string-transformer)
        res))))


(defn-spec egg-group-retrieve-with-http-info any?
  "Get egg group
  Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/egg-group/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec egg-group-retrieve egg-group-detail-spec
  "Get egg group
  Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail."
  [id string?]
  (let [res (:data (egg-group-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode egg-group-detail-spec res st/string-transformer)
       res)))


(defn-spec gender-list-with-http-info any?
  "List genders
  Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail."
  ([] (gender-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/gender/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec gender-list paginated-gender-summary-list-spec
  "List genders
  Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail."
  ([] (gender-list nil))
  ([optional-params any?]
   (let [res (:data (gender-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-gender-summary-list-spec res st/string-transformer)
        res))))


(defn-spec gender-retrieve-with-http-info any?
  "Get gender
  Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/gender/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec gender-retrieve gender-detail-spec
  "Get gender
  Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail."
  [id string?]
  (let [res (:data (gender-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode gender-detail-spec res st/string-transformer)
       res)))


(defn-spec growth-rate-list-with-http-info any?
  "List growth rates
  Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail."
  ([] (growth-rate-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/growth-rate/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec growth-rate-list paginated-growth-rate-summary-list-spec
  "List growth rates
  Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail."
  ([] (growth-rate-list nil))
  ([optional-params any?]
   (let [res (:data (growth-rate-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-growth-rate-summary-list-spec res st/string-transformer)
        res))))


(defn-spec growth-rate-retrieve-with-http-info any?
  "Get growth rate
  Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/growth-rate/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec growth-rate-retrieve growth-rate-detail-spec
  "Get growth rate
  Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail."
  [id string?]
  (let [res (:data (growth-rate-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode growth-rate-detail-spec res st/string-transformer)
       res)))


(defn-spec move-damage-class-list-with-http-info any?
  "List move damage classes
  Damage classes moves can have, e.g. physical, special, or non-damaging."
  ([] (move-damage-class-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/move-damage-class/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec move-damage-class-list paginated-move-damage-class-summary-list-spec
  "List move damage classes
  Damage classes moves can have, e.g. physical, special, or non-damaging."
  ([] (move-damage-class-list nil))
  ([optional-params any?]
   (let [res (:data (move-damage-class-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-move-damage-class-summary-list-spec res st/string-transformer)
        res))))


(defn-spec move-damage-class-retrieve-with-http-info any?
  "Get move damage class
  Damage classes moves can have, e.g. physical, special, or non-damaging."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/move-damage-class/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec move-damage-class-retrieve move-damage-class-detail-spec
  "Get move damage class
  Damage classes moves can have, e.g. physical, special, or non-damaging."
  [id string?]
  (let [res (:data (move-damage-class-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode move-damage-class-detail-spec res st/string-transformer)
       res)))


(defn-spec nature-list-with-http-info any?
  "List natures
  Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail."
  ([] (nature-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/nature/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec nature-list paginated-nature-summary-list-spec
  "List natures
  Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail."
  ([] (nature-list nil))
  ([optional-params any?]
   (let [res (:data (nature-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-nature-summary-list-spec res st/string-transformer)
        res))))


(defn-spec nature-retrieve-with-http-info any?
  "Get nature
  Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/nature/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec nature-retrieve nature-detail-spec
  "Get nature
  Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail."
  [id string?]
  (let [res (:data (nature-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode nature-detail-spec res st/string-transformer)
       res)))


(defn-spec pokeathlon-stat-list-with-http-info any?
  "List pokeathlon stats
  Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail."
  ([] (pokeathlon-stat-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokeathlon-stat/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokeathlon-stat-list paginated-pokeathlon-stat-summary-list-spec
  "List pokeathlon stats
  Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail."
  ([] (pokeathlon-stat-list nil))
  ([optional-params any?]
   (let [res (:data (pokeathlon-stat-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokeathlon-stat-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokeathlon-stat-retrieve-with-http-info any?
  "Get pokeathlon stat
  Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokeathlon-stat/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokeathlon-stat-retrieve pokeathlon-stat-detail-spec
  "Get pokeathlon stat
  Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail."
  [id string?]
  (let [res (:data (pokeathlon-stat-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokeathlon-stat-detail-spec res st/string-transformer)
       res)))


(defn-spec pokemon-color-list-with-http-info any?
  "List pokemon colors
  Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown."
  ([] (pokemon-color-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokemon-color/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokemon-color-list paginated-pokemon-color-summary-list-spec
  "List pokemon colors
  Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown."
  ([] (pokemon-color-list nil))
  ([optional-params any?]
   (let [res (:data (pokemon-color-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokemon-color-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokemon-color-retrieve-with-http-info any?
  "Get pokemon color
  Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokemon-color/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokemon-color-retrieve pokemon-color-detail-spec
  "Get pokemon color
  Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown."
  [id string?]
  (let [res (:data (pokemon-color-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokemon-color-detail-spec res st/string-transformer)
       res)))


(defn-spec pokemon-form-list-with-http-info any?
  "List pokemon forms
  Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety."
  ([] (pokemon-form-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokemon-form/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokemon-form-list paginated-pokemon-form-summary-list-spec
  "List pokemon forms
  Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety."
  ([] (pokemon-form-list nil))
  ([optional-params any?]
   (let [res (:data (pokemon-form-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokemon-form-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokemon-form-retrieve-with-http-info any?
  "Get pokemon form
  Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokemon-form/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokemon-form-retrieve pokemon-form-detail-spec
  "Get pokemon form
  Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety."
  [id string?]
  (let [res (:data (pokemon-form-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokemon-form-detail-spec res st/string-transformer)
       res)))


(defn-spec pokemon-habitat-list-with-http-info any?
  "List pokemom habitas
  Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon."
  ([] (pokemon-habitat-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokemon-habitat/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokemon-habitat-list paginated-pokemon-habitat-summary-list-spec
  "List pokemom habitas
  Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon."
  ([] (pokemon-habitat-list nil))
  ([optional-params any?]
   (let [res (:data (pokemon-habitat-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokemon-habitat-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokemon-habitat-retrieve-with-http-info any?
  "Get pokemom habita
  Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokemon-habitat/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokemon-habitat-retrieve pokemon-habitat-detail-spec
  "Get pokemom habita
  Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon."
  [id string?]
  (let [res (:data (pokemon-habitat-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokemon-habitat-detail-spec res st/string-transformer)
       res)))


(defn-spec pokemon-list-with-http-info any?
  "List pokemon
  Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail."
  ([] (pokemon-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokemon/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokemon-list paginated-pokemon-summary-list-spec
  "List pokemon
  Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail."
  ([] (pokemon-list nil))
  ([optional-params any?]
   (let [res (:data (pokemon-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokemon-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokemon-retrieve-with-http-info any?
  "Get pokemon
  Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokemon/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokemon-retrieve pokemon-detail-spec
  "Get pokemon
  Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail."
  [id string?]
  (let [res (:data (pokemon-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokemon-detail-spec res st/string-transformer)
       res)))


(defn-spec pokemon-shape-list-with-http-info any?
  "List pokemon shapes
  Shapes used for sorting Pokémon in a Pokédex."
  ([] (pokemon-shape-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokemon-shape/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokemon-shape-list paginated-pokemon-shape-summary-list-spec
  "List pokemon shapes
  Shapes used for sorting Pokémon in a Pokédex."
  ([] (pokemon-shape-list nil))
  ([optional-params any?]
   (let [res (:data (pokemon-shape-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokemon-shape-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokemon-shape-retrieve-with-http-info any?
  "Get pokemon shape
  Shapes used for sorting Pokémon in a Pokédex."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokemon-shape/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokemon-shape-retrieve pokemon-shape-detail-spec
  "Get pokemon shape
  Shapes used for sorting Pokémon in a Pokédex."
  [id string?]
  (let [res (:data (pokemon-shape-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokemon-shape-detail-spec res st/string-transformer)
       res)))


(defn-spec pokemon-species-list-with-http-info any?
  "List pokemon species
  A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant."
  ([] (pokemon-species-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pokemon-species/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec pokemon-species-list paginated-pokemon-species-summary-list-spec
  "List pokemon species
  A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant."
  ([] (pokemon-species-list nil))
  ([optional-params any?]
   (let [res (:data (pokemon-species-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-pokemon-species-summary-list-spec res st/string-transformer)
        res))))


(defn-spec pokemon-species-retrieve-with-http-info any?
  "Get pokemon species
  A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/pokemon-species/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec pokemon-species-retrieve pokemon-species-detail-spec
  "Get pokemon species
  A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant."
  [id string?]
  (let [res (:data (pokemon-species-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode pokemon-species-detail-spec res st/string-transformer)
       res)))


(defn-spec stat-list-with-http-info any?
  "List stats
  Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles."
  ([] (stat-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/stat/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec stat-list paginated-stat-summary-list-spec
  "List stats
  Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles."
  ([] (stat-list nil))
  ([optional-params any?]
   (let [res (:data (stat-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-stat-summary-list-spec res st/string-transformer)
        res))))


(defn-spec stat-retrieve-with-http-info any?
  "Get stat
  Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/stat/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec stat-retrieve stat-detail-spec
  "Get stat
  Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles."
  [id string?]
  (let [res (:data (stat-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode stat-detail-spec res st/string-transformer)
       res)))


(defn-spec type-list-with-http-info any?
  "List types
  Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against."
  ([] (type-list-with-http-info nil))
  ([{:keys [limit offset q]} (s/map-of keyword? any?)]
   (call-api "/api/v2/type/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset "q" q }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["basicAuth" "cookieAuth"]})))

(defn-spec type-list paginated-type-summary-list-spec
  "List types
  Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against."
  ([] (type-list nil))
  ([optional-params any?]
   (let [res (:data (type-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode paginated-type-summary-list-spec res st/string-transformer)
        res))))


(defn-spec type-retrieve-with-http-info any?
  "Get types
  Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against."
  [id string?]
  (check-required-params id)
  (call-api "/api/v2/type/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["basicAuth" "cookieAuth"]}))

(defn-spec type-retrieve type-detail-spec
  "Get types
  Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against."
  [id string?]
  (let [res (:data (type-retrieve-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode type-detail-spec res st/string-transformer)
       res)))


