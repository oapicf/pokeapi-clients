# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def ability
      @ability ||= OpenapiClient::Api::Ability.new(@connection)
    end

    def berry
      @berry ||= OpenapiClient::Api::Berry.new(@connection)
    end

    def berry_firmness
      @berry_firmness ||= OpenapiClient::Api::BerryFirmness.new(@connection)
    end

    def berry_flavor
      @berry_flavor ||= OpenapiClient::Api::BerryFlavor.new(@connection)
    end

    def characteristic
      @characteristic ||= OpenapiClient::Api::Characteristic.new(@connection)
    end

    def contest_effect
      @contest_effect ||= OpenapiClient::Api::ContestEffect.new(@connection)
    end

    def contest_type
      @contest_type ||= OpenapiClient::Api::ContestType.new(@connection)
    end

    def egg_group
      @egg_group ||= OpenapiClient::Api::EggGroup.new(@connection)
    end

    def encounter_condition
      @encounter_condition ||= OpenapiClient::Api::EncounterCondition.new(@connection)
    end

    def encounter_condition_value
      @encounter_condition_value ||= OpenapiClient::Api::EncounterConditionValue.new(@connection)
    end

    def encounter_method
      @encounter_method ||= OpenapiClient::Api::EncounterMethod.new(@connection)
    end

    def evolution_chain
      @evolution_chain ||= OpenapiClient::Api::EvolutionChain.new(@connection)
    end

    def evolution_trigger
      @evolution_trigger ||= OpenapiClient::Api::EvolutionTrigger.new(@connection)
    end

    def gender
      @gender ||= OpenapiClient::Api::Gender.new(@connection)
    end

    def generation
      @generation ||= OpenapiClient::Api::Generation.new(@connection)
    end

    def growth_rate
      @growth_rate ||= OpenapiClient::Api::GrowthRate.new(@connection)
    end

    def item
      @item ||= OpenapiClient::Api::Item.new(@connection)
    end

    def item_attribute
      @item_attribute ||= OpenapiClient::Api::ItemAttribute.new(@connection)
    end

    def item_category
      @item_category ||= OpenapiClient::Api::ItemCategory.new(@connection)
    end

    def item_fling_effect
      @item_fling_effect ||= OpenapiClient::Api::ItemFlingEffect.new(@connection)
    end

    def item_pocket
      @item_pocket ||= OpenapiClient::Api::ItemPocket.new(@connection)
    end

    def language
      @language ||= OpenapiClient::Api::Language.new(@connection)
    end

    def location
      @location ||= OpenapiClient::Api::Location.new(@connection)
    end

    def location_area
      @location_area ||= OpenapiClient::Api::LocationArea.new(@connection)
    end

    def machine
      @machine ||= OpenapiClient::Api::Machine.new(@connection)
    end

    def move
      @move ||= OpenapiClient::Api::Move.new(@connection)
    end

    def move_ailment
      @move_ailment ||= OpenapiClient::Api::MoveAilment.new(@connection)
    end

    def move_battle_style
      @move_battle_style ||= OpenapiClient::Api::MoveBattleStyle.new(@connection)
    end

    def move_category
      @move_category ||= OpenapiClient::Api::MoveCategory.new(@connection)
    end

    def move_damage_class
      @move_damage_class ||= OpenapiClient::Api::MoveDamageClass.new(@connection)
    end

    def move_learn_method
      @move_learn_method ||= OpenapiClient::Api::MoveLearnMethod.new(@connection)
    end

    def move_target
      @move_target ||= OpenapiClient::Api::MoveTarget.new(@connection)
    end

    def nature
      @nature ||= OpenapiClient::Api::Nature.new(@connection)
    end

    def pal_park_area
      @pal_park_area ||= OpenapiClient::Api::PalParkArea.new(@connection)
    end

    def pokeathlon_stat
      @pokeathlon_stat ||= OpenapiClient::Api::PokeathlonStat.new(@connection)
    end

    def pokedex
      @pokedex ||= OpenapiClient::Api::Pokedex.new(@connection)
    end

    def pokemon
      @pokemon ||= OpenapiClient::Api::Pokemon.new(@connection)
    end

    def pokemon_color
      @pokemon_color ||= OpenapiClient::Api::PokemonColor.new(@connection)
    end

    def pokemon_form
      @pokemon_form ||= OpenapiClient::Api::PokemonForm.new(@connection)
    end

    def pokemon_habitat
      @pokemon_habitat ||= OpenapiClient::Api::PokemonHabitat.new(@connection)
    end

    def pokemon_shape
      @pokemon_shape ||= OpenapiClient::Api::PokemonShape.new(@connection)
    end

    def pokemon_species
      @pokemon_species ||= OpenapiClient::Api::PokemonSpecies.new(@connection)
    end

    def region
      @region ||= OpenapiClient::Api::Region.new(@connection)
    end

    def stat
      @stat ||= OpenapiClient::Api::Stat.new(@connection)
    end

    def super_contest_effect
      @super_contest_effect ||= OpenapiClient::Api::SuperContestEffect.new(@connection)
    end

    def type
      @type ||= OpenapiClient::Api::Type.new(@connection)
    end

    def version
      @version ||= OpenapiClient::Api::Version.new(@connection)
    end

    def version_group
      @version_group ||= OpenapiClient::Api::VersionGroup.new(@connection)
    end
  end
end
