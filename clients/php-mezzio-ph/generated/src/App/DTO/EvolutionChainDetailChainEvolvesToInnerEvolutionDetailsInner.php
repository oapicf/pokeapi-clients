<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
{
    /**
     * @DTA\Data(field="gender")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @var \App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender|null
     */
    public $gender;

    /**
     * @DTA\Data(field="held_item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @var \App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender|null
     */
    public $held_item;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @var \App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender|null
     */
    public $item;

    /**
     * @DTA\Data(field="known_move")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $known_move;

    /**
     * @DTA\Data(field="known_move_type")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $known_move_type;

    /**
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @var \App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender|null
     */
    public $location;

    /**
     * @DTA\Data(field="min_affection")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_affection;

    /**
     * @DTA\Data(field="min_beauty")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_beauty;

    /**
     * @DTA\Data(field="min_happiness")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_happiness;

    /**
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_level;

    /**
     * @DTA\Data(field="needs_overworld_rain")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $needs_overworld_rain;

    /**
     * @DTA\Data(field="party_species")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $party_species;

    /**
     * @DTA\Data(field="party_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $party_type;

    /**
     * @DTA\Data(field="relative_physical_stats")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $relative_physical_stats;

    /**
     * @DTA\Data(field="time_of_day")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $time_of_day;

    /**
     * @DTA\Data(field="trade_species")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $trade_species;

    /**
     * @DTA\Data(field="trigger")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $trigger;

    /**
     * @DTA\Data(field="turn_upside_down")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $turn_upside_down;

}
