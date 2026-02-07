<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokedexDetail
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
     * @DTA\Data(field="is_main_series", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_main_series;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection131::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection131::class})
     * @var \App\DTO\Collection131|null
     */
    public $descriptions;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     * @var \App\DTO\Collection132|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     * @var \App\DTO\Collection133|null
     */
    public $pokemon_entries;

    /**
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     * @var \App\DTO\RegionSummary|null
     */
    public $region;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection134::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection134::class})
     * @var \App\DTO\Collection134|null
     */
    public $version_groups;

}
