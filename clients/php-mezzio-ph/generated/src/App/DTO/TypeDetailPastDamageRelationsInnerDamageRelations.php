<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TypeDetailPastDamageRelationsInnerDamageRelations
{
    /**
     * @DTA\Data(field="no_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection199::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection199::class})
     * @var \App\DTO\Collection199|null
     */
    public $no_damage_to;

    /**
     * @DTA\Data(field="half_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection200::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection200::class})
     * @var \App\DTO\Collection200|null
     */
    public $half_damage_to;

    /**
     * @DTA\Data(field="double_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection201::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection201::class})
     * @var \App\DTO\Collection201|null
     */
    public $double_damage_to;

    /**
     * @DTA\Data(field="no_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection202::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection202::class})
     * @var \App\DTO\Collection202|null
     */
    public $no_damage_from;

    /**
     * @DTA\Data(field="half_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection203::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection203::class})
     * @var \App\DTO\Collection203|null
     */
    public $half_damage_from;

    /**
     * @DTA\Data(field="double_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection204::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection204::class})
     * @var \App\DTO\Collection204|null
     */
    public $double_damage_from;

}
