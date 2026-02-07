<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationDetail
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
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     */
    public ?\App\DTO\RegionSummary $region = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection79::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection79::class})
     */
    public ?\App\DTO\Collection79 $names = null;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection80::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection80::class})
     */
    public ?\App\DTO\Collection80 $game_indices = null;

    /**
     * @DTA\Data(field="areas")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection81::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection81::class})
     */
    public ?\App\DTO\Collection81 $areas = null;

}
