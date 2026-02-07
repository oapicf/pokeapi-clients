<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NatureDetail
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
     * @DTA\Data(field="decreased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     */
    public ?\App\DTO\StatSummary $decreased_stat = null;

    /**
     * @DTA\Data(field="increased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     */
    public ?\App\DTO\StatSummary $increased_stat = null;

    /**
     * @DTA\Data(field="likes_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     */
    public ?\App\DTO\BerryFlavorSummary $likes_flavor = null;

    /**
     * @DTA\Data(field="hates_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     */
    public ?\App\DTO\BerryFlavorSummary $hates_flavor = null;

    /**
     * @DTA\Data(field="berries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection123::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection123::class})
     */
    public ?\App\DTO\Collection123 $berries = null;

    /**
     * @DTA\Data(field="pokeathlon_stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection124::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection124::class})
     */
    public ?\App\DTO\Collection124 $pokeathlon_stat_changes = null;

    /**
     * @DTA\Data(field="move_battle_style_preferences")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     */
    public ?\App\DTO\Collection125 $move_battle_style_preferences = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     */
    public ?\App\DTO\Collection126 $names = null;

}
