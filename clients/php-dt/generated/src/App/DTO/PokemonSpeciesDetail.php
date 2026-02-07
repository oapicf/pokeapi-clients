<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpeciesDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order = null;

    /**
     * @DTA\Data(field="gender_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $gender_rate = null;

    /**
     * @DTA\Data(field="capture_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $capture_rate = null;

    /**
     * @DTA\Data(field="base_happiness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $base_happiness = null;

    /**
     * @DTA\Data(field="is_baby", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_baby = null;

    /**
     * @DTA\Data(field="is_legendary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_legendary = null;

    /**
     * @DTA\Data(field="is_mythical", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_mythical = null;

    /**
     * @DTA\Data(field="hatch_counter", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $hatch_counter = null;

    /**
     * @DTA\Data(field="has_gender_differences", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_gender_differences = null;

    /**
     * @DTA\Data(field="forms_switchable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $forms_switchable = null;

    /**
     * @DTA\Data(field="growth_rate")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GrowthRateSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GrowthRateSummary::class})
     */
    public ?\App\DTO\GrowthRateSummary $growth_rate = null;

    /**
     * @DTA\Data(field="pokedex_numbers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection165::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection165::class})
     */
    public ?\App\DTO\Collection165 $pokedex_numbers = null;

    /**
     * @DTA\Data(field="egg_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection166::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection166::class})
     */
    public ?\App\DTO\Collection166 $egg_groups = null;

    /**
     * @DTA\Data(field="color")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonColorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonColorSummary::class})
     */
    public ?\App\DTO\PokemonColorSummary $color = null;

    /**
     * @DTA\Data(field="shape")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonShapeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonShapeSummary::class})
     */
    public ?\App\DTO\PokemonShapeSummary $shape = null;

    /**
     * @DTA\Data(field="evolves_from_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $evolves_from_species = null;

    /**
     * @DTA\Data(field="evolution_chain")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainSummary::class})
     */
    public ?\App\DTO\EvolutionChainSummary $evolution_chain = null;

    /**
     * @DTA\Data(field="habitat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonHabitatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonHabitatSummary::class})
     */
    public ?\App\DTO\PokemonHabitatSummary $habitat = null;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection167::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection167::class})
     */
    public ?\App\DTO\Collection167 $names = null;

    /**
     * @DTA\Data(field="pal_park_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection168::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection168::class})
     */
    public ?\App\DTO\Collection168 $pal_park_encounters = null;

    /**
     * @DTA\Data(field="form_descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection169::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection169::class})
     */
    public ?\App\DTO\Collection169 $form_descriptions = null;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection170::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection170::class})
     */
    public ?\App\DTO\Collection170 $flavor_text_entries = null;

    /**
     * @DTA\Data(field="genera")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection171::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection171::class})
     */
    public ?\App\DTO\Collection171 $genera = null;

    /**
     * @DTA\Data(field="varieties")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection172::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection172::class})
     */
    public ?\App\DTO\Collection172 $varieties = null;

}
