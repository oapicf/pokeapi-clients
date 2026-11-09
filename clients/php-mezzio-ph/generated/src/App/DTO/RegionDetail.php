<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RegionDetail
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
     * A list of locations that can be found in this region.
     * @DTA\Data(field="locations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection181::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection181::class})
     * @var \App\DTO\Collection181|null
     */
    public $locations;

    /**
     * The generation this region was introduced in.
     * @DTA\Data(field="main_generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $main_generation;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection182::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection182::class})
     * @var \App\DTO\Collection182|null
     */
    public $names;

    /**
     * A list of pokédexes that catalogue Pokémon in this region.
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection183::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection183::class})
     * @var \App\DTO\Collection183|null
     */
    public $pokedexes;

    /**
     * A list of version groups where this region can be visited.
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection184::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection184::class})
     * @var \App\DTO\Collection184|null
     */
    public $version_groups;

}
