<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ContestEffectDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="appeal")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $appeal = null;

    /**
     * @DTA\Data(field="jam")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $jam = null;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection21::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection21::class})
     */
    public ?\App\DTO\Collection21 $effect_entries = null;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     */
    public ?\App\DTO\Collection22 $flavor_text_entries = null;

}
