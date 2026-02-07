<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ContestEffectDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="appeal")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $appeal;

    /**
     * @DTA\Data(field="jam")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $jam;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection21::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection21::class})
     * @var \App\DTO\Collection21|null
     */
    public $effect_entries;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     * @var \App\DTO\Collection22|null
     */
    public $flavor_text_entries;

}
