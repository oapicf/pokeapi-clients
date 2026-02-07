<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokedexDetail
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
     * @DTA\Data(field="is_main_series", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_main_series = null;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection131::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection131::class})
     */
    public ?\App\DTO\Collection131 $descriptions = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     */
    public ?\App\DTO\Collection132 $names = null;

    /**
     * @DTA\Data(field="pokemon_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     */
    public ?\App\DTO\Collection133 $pokemon_entries = null;

    /**
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     */
    public ?\App\DTO\RegionSummary $region = null;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection134::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection134::class})
     */
    public ?\App\DTO\Collection134 $version_groups = null;

}
