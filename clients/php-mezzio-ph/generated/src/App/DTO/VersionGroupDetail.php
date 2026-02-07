<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VersionGroupDetail
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
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * @DTA\Data(field="move_learn_methods")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection215::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection215::class})
     * @var \App\DTO\Collection215|null
     */
    public $move_learn_methods;

    /**
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection216::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection216::class})
     * @var \App\DTO\Collection216|null
     */
    public $pokedexes;

    /**
     * @DTA\Data(field="regions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection217::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection217::class})
     * @var \App\DTO\Collection217|null
     */
    public $regions;

    /**
     * @DTA\Data(field="versions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection218::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection218::class})
     * @var \App\DTO\Collection218|null
     */
    public $versions;

}
