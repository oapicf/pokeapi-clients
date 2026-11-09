<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class VersionGroupDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * Order for sorting. Almost by date of release, except similar versions are grouped together.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $order = null;

    /**
     * The generation this version was introduced in.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * A list of methods in which Pokémon can learn moves in this version group.
     * @DTA\Data(field="move_learn_methods")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection203::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection203::class})
     */
    public ?\App\DTO\Collection203 $move_learn_methods = null;

    /**
     * A list of Pokédexes introduces in this version group.
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection204::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection204::class})
     */
    public ?\App\DTO\Collection204 $pokedexes = null;

    /**
     * A list of regions that can be visited in this version group.
     * @DTA\Data(field="regions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection205::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection205::class})
     */
    public ?\App\DTO\Collection205 $regions = null;

    /**
     * The versions this version group owns.
     * @DTA\Data(field="versions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection206::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection206::class})
     */
    public ?\App\DTO\Collection206 $versions = null;

}
