<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RegionDetail
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
     * @DTA\Data(field="locations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection178::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection178::class})
     * @var \App\DTO\Collection178|null
     */
    public $locations;

    /**
     * @DTA\Data(field="main_generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $main_generation;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection179::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection179::class})
     * @var \App\DTO\Collection179|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection180::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection180::class})
     * @var \App\DTO\Collection180|null
     */
    public $pokedexes;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection181::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection181::class})
     * @var \App\DTO\Collection181|null
     */
    public $version_groups;

}
