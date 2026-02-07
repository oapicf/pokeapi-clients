<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class NatureDetail
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
     * @DTA\Data(field="decreased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     * @var \App\DTO\StatSummary|null
     */
    public $decreased_stat;

    /**
     * @DTA\Data(field="increased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     * @var \App\DTO\StatSummary|null
     */
    public $increased_stat;

    /**
     * @DTA\Data(field="likes_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @var \App\DTO\BerryFlavorSummary|null
     */
    public $likes_flavor;

    /**
     * @DTA\Data(field="hates_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @var \App\DTO\BerryFlavorSummary|null
     */
    public $hates_flavor;

    /**
     * @DTA\Data(field="berries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection123::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection123::class})
     * @var \App\DTO\Collection123|null
     */
    public $berries;

    /**
     * @DTA\Data(field="pokeathlon_stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection124::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection124::class})
     * @var \App\DTO\Collection124|null
     */
    public $pokeathlon_stat_changes;

    /**
     * @DTA\Data(field="move_battle_style_preferences")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     * @var \App\DTO\Collection125|null
     */
    public $move_battle_style_preferences;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     * @var \App\DTO\Collection126|null
     */
    public $names;

}
