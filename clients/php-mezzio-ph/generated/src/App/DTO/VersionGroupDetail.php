<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VersionGroupDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * Order for sorting. Almost by date of release, except similar versions are grouped together.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $order;

    /**
     * The generation this version was introduced in.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * A list of methods in which Pokémon can learn moves in this version group.
     * @DTA\Data(field="move_learn_methods")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection203::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection203::class})
     * @var \App\DTO\Collection203|null
     */
    public $move_learn_methods;

    /**
     * A list of Pokédexes introduces in this version group.
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection204::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection204::class})
     * @var \App\DTO\Collection204|null
     */
    public $pokedexes;

    /**
     * A list of regions that can be visited in this version group.
     * @DTA\Data(field="regions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection205::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection205::class})
     * @var \App\DTO\Collection205|null
     */
    public $regions;

    /**
     * The versions this version group owns.
     * @DTA\Data(field="versions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection206::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection206::class})
     * @var \App\DTO\Collection206|null
     */
    public $versions;

}
