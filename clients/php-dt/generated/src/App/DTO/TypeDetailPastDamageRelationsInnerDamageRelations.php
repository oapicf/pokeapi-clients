<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TypeDetailPastDamageRelationsInnerDamageRelations
{
    /**
     * @DTA\Data(field="no_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection199::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection199::class})
     */
    public ?\App\DTO\Collection199 $no_damage_to = null;

    /**
     * @DTA\Data(field="half_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection200::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection200::class})
     */
    public ?\App\DTO\Collection200 $half_damage_to = null;

    /**
     * @DTA\Data(field="double_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection201::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection201::class})
     */
    public ?\App\DTO\Collection201 $double_damage_to = null;

    /**
     * @DTA\Data(field="no_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection202::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection202::class})
     */
    public ?\App\DTO\Collection202 $no_damage_from = null;

    /**
     * @DTA\Data(field="half_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection203::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection203::class})
     */
    public ?\App\DTO\Collection203 $half_damage_from = null;

    /**
     * @DTA\Data(field="double_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection204::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection204::class})
     */
    public ?\App\DTO\Collection204 $double_damage_from = null;

}
