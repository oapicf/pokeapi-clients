<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpeciesDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order;

    /**
     * @DTA\Data(field="gender_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gender_rate;

    /**
     * @DTA\Data(field="capture_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $capture_rate;

    /**
     * @DTA\Data(field="base_happiness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $base_happiness;

    /**
     * @DTA\Data(field="is_baby", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_baby;

    /**
     * @DTA\Data(field="is_legendary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_legendary;

    /**
     * @DTA\Data(field="is_mythical", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_mythical;

    /**
     * @DTA\Data(field="hatch_counter", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $hatch_counter;

    /**
     * @DTA\Data(field="has_gender_differences", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_gender_differences;

    /**
     * @DTA\Data(field="forms_switchable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $forms_switchable;

    /**
     * @DTA\Data(field="growth_rate")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GrowthRateSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GrowthRateSummary::class})
     * @var \App\DTO\GrowthRateSummary|null
     */
    public $growth_rate;

    /**
     * @DTA\Data(field="pokedex_numbers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection165::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection165::class})
     * @var \App\DTO\Collection165|null
     */
    public $pokedex_numbers;

    /**
     * @DTA\Data(field="egg_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection166::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection166::class})
     * @var \App\DTO\Collection166|null
     */
    public $egg_groups;

    /**
     * @DTA\Data(field="color")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonColorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonColorSummary::class})
     * @var \App\DTO\PokemonColorSummary|null
     */
    public $color;

    /**
     * @DTA\Data(field="shape")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonShapeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonShapeSummary::class})
     * @var \App\DTO\PokemonShapeSummary|null
     */
    public $shape;

    /**
     * @DTA\Data(field="evolves_from_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @var \App\DTO\PokemonSpeciesSummary|null
     */
    public $evolves_from_species;

    /**
     * @DTA\Data(field="evolution_chain")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @var \App\DTO\EvolutionChainSummary|null
     */
    public $evolution_chain;

    /**
     * @DTA\Data(field="habitat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonHabitatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonHabitatSummary::class})
     * @var \App\DTO\PokemonHabitatSummary|null
     */
    public $habitat;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection167::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection167::class})
     * @var \App\DTO\Collection167|null
     */
    public $names;

    /**
     * @DTA\Data(field="pal_park_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection168::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection168::class})
     * @var \App\DTO\Collection168|null
     */
    public $pal_park_encounters;

    /**
     * @DTA\Data(field="form_descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection169::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection169::class})
     * @var \App\DTO\Collection169|null
     */
    public $form_descriptions;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection170::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection170::class})
     * @var \App\DTO\Collection170|null
     */
    public $flavor_text_entries;

    /**
     * @DTA\Data(field="genera")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection171::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection171::class})
     * @var \App\DTO\Collection171|null
     */
    public $genera;

    /**
     * @DTA\Data(field="varieties")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection172::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection172::class})
     * @var \App\DTO\Collection172|null
     */
    public $varieties;

}
