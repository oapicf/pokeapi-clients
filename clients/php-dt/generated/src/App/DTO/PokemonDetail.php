<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetail
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
     * @DTA\Data(field="base_experience", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $base_experience = null;

    /**
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $height = null;

    /**
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_default = null;

    /**
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order = null;

    /**
     * @DTA\Data(field="weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $weight = null;

    /**
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     */
    public ?\App\DTO\Collection136 $abilities = null;

    /**
     * @DTA\Data(field="past_abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection138::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection138::class})
     */
    public ?\App\DTO\Collection138 $past_abilities = null;

    /**
     * @DTA\Data(field="forms")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection139::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection139::class})
     */
    public ?\App\DTO\Collection139 $forms = null;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection140::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection140::class})
     */
    public ?\App\DTO\Collection140 $game_indices = null;

    /**
     * @DTA\Data(field="held_items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonDetailHeldItems::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonDetailHeldItems::class})
     */
    public ?\App\DTO\PokemonDetailHeldItems $held_items = null;

    /**
     * @DTA\Data(field="location_area_encounters")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $location_area_encounters = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection143::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection143::class})
     */
    public ?\App\DTO\Collection143 $moves = null;

    /**
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $species = null;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonDetailSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonDetailSprites::class})
     */
    public ?\App\DTO\PokemonDetailSprites $sprites = null;

    /**
     * @DTA\Data(field="cries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonDetailCries::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonDetailCries::class})
     */
    public ?\App\DTO\PokemonDetailCries $cries = null;

    /**
     * @DTA\Data(field="stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection145::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection145::class})
     */
    public ?\App\DTO\Collection145 $stats = null;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection146::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection146::class})
     */
    public ?\App\DTO\Collection146 $types = null;

    /**
     * @DTA\Data(field="past_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection148::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection148::class})
     */
    public ?\App\DTO\Collection148 $past_types = null;

}
