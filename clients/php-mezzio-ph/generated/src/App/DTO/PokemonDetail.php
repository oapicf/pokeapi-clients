<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDetail
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
     * @DTA\Data(field="base_experience", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $base_experience;

    /**
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $height;

    /**
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_default;

    /**
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order;

    /**
     * @DTA\Data(field="weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $weight;

    /**
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     * @var \App\DTO\Collection136|null
     */
    public $abilities;

    /**
     * @DTA\Data(field="past_abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection138::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection138::class})
     * @var \App\DTO\Collection138|null
     */
    public $past_abilities;

    /**
     * @DTA\Data(field="forms")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection139::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection139::class})
     * @var \App\DTO\Collection139|null
     */
    public $forms;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection140::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection140::class})
     * @var \App\DTO\Collection140|null
     */
    public $game_indices;

    /**
     * @DTA\Data(field="held_items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonDetailHeldItems::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonDetailHeldItems::class})
     * @var \App\DTO\PokemonDetailHeldItems|null
     */
    public $held_items;

    /**
     * @DTA\Data(field="location_area_encounters")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $location_area_encounters;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection143::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection143::class})
     * @var \App\DTO\Collection143|null
     */
    public $moves;

    /**
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @var \App\DTO\PokemonSpeciesSummary|null
     */
    public $species;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonDetailSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonDetailSprites::class})
     * @var \App\DTO\PokemonDetailSprites|null
     */
    public $sprites;

    /**
     * @DTA\Data(field="cries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonDetailCries::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonDetailCries::class})
     * @var \App\DTO\PokemonDetailCries|null
     */
    public $cries;

    /**
     * @DTA\Data(field="stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection145::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection145::class})
     * @var \App\DTO\Collection145|null
     */
    public $stats;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection146::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection146::class})
     * @var \App\DTO\Collection146|null
     */
    public $types;

    /**
     * @DTA\Data(field="past_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection148::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection148::class})
     * @var \App\DTO\Collection148|null
     */
    public $past_types;

}
