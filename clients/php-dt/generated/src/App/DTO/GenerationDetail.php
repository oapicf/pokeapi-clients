<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GenerationDetail
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
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection41::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection41::class})
     */
    public ?\App\DTO\Collection41 $abilities = null;

    /**
     * @DTA\Data(field="main_region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     */
    public ?\App\DTO\RegionSummary $main_region = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection42::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection42::class})
     */
    public ?\App\DTO\Collection42 $moves = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection43::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection43::class})
     */
    public ?\App\DTO\Collection43 $names = null;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection44::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection44::class})
     */
    public ?\App\DTO\Collection44 $pokemon_species = null;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection45::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection45::class})
     */
    public ?\App\DTO\Collection45 $types = null;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection46::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection46::class})
     */
    public ?\App\DTO\Collection46 $version_groups = null;

}
