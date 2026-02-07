<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class VersionGroupDetail
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
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * @DTA\Data(field="move_learn_methods")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection215::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection215::class})
     */
    public ?\App\DTO\Collection215 $move_learn_methods = null;

    /**
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection216::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection216::class})
     */
    public ?\App\DTO\Collection216 $pokedexes = null;

    /**
     * @DTA\Data(field="regions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection217::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection217::class})
     */
    public ?\App\DTO\Collection217 $regions = null;

    /**
     * @DTA\Data(field="versions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection218::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection218::class})
     */
    public ?\App\DTO\Collection218 $versions = null;

}
