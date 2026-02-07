<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AbilityDetail
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
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection1::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection1::class})
     * @var \App\DTO\Collection1|null
     */
    public $names;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection2::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection2::class})
     * @var \App\DTO\Collection2|null
     */
    public $effect_entries;

    /**
     * @DTA\Data(field="effect_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection4::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection4::class})
     * @var \App\DTO\Collection4|null
     */
    public $effect_changes;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     * @var \App\DTO\Collection5|null
     */
    public $flavor_text_entries;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     * @var \App\DTO\Collection6|null
     */
    public $pokemon;

}
