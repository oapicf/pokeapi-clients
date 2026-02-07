<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
{
    /**
     * @DTA\Data(field="gender")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     */
    public ?\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender $gender = null;

    /**
     * @DTA\Data(field="held_item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     */
    public ?\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender $held_item = null;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     */
    public ?\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender $item = null;

    /**
     * @DTA\Data(field="known_move")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $known_move = null;

    /**
     * @DTA\Data(field="known_move_type")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $known_move_type = null;

    /**
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender::class})
     */
    public ?\App\DTO\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender $location = null;

    /**
     * @DTA\Data(field="min_affection")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_affection = null;

    /**
     * @DTA\Data(field="min_beauty")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_beauty = null;

    /**
     * @DTA\Data(field="min_happiness")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_happiness = null;

    /**
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_level = null;

    /**
     * @DTA\Data(field="needs_overworld_rain")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $needs_overworld_rain = null;

    /**
     * @DTA\Data(field="party_species")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $party_species = null;

    /**
     * @DTA\Data(field="party_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $party_type = null;

    /**
     * @DTA\Data(field="relative_physical_stats")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $relative_physical_stats = null;

    /**
     * @DTA\Data(field="time_of_day")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $time_of_day = null;

    /**
     * @DTA\Data(field="trade_species")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $trade_species = null;

    /**
     * @DTA\Data(field="trigger")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $trigger = null;

    /**
     * @DTA\Data(field="turn_upside_down")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $turn_upside_down = null;

}
