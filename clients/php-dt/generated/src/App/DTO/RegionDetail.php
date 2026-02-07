<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RegionDetail
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
     * @DTA\Data(field="locations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection178::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection178::class})
     */
    public ?\App\DTO\Collection178 $locations = null;

    /**
     * @DTA\Data(field="main_generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $main_generation = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection179::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection179::class})
     */
    public ?\App\DTO\Collection179 $names = null;

    /**
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection180::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection180::class})
     */
    public ?\App\DTO\Collection180 $pokedexes = null;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection181::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection181::class})
     */
    public ?\App\DTO\Collection181 $version_groups = null;

}
