<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TypeDetailDamageRelations
{
    /**
     * @DTA\Data(field="no_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection193::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection193::class})
     */
    public ?\App\DTO\Collection193 $no_damage_to = null;

    /**
     * @DTA\Data(field="half_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection194::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection194::class})
     */
    public ?\App\DTO\Collection194 $half_damage_to = null;

    /**
     * @DTA\Data(field="double_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection195::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection195::class})
     */
    public ?\App\DTO\Collection195 $double_damage_to = null;

    /**
     * @DTA\Data(field="no_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection196::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection196::class})
     */
    public ?\App\DTO\Collection196 $no_damage_from = null;

    /**
     * @DTA\Data(field="half_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection197::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection197::class})
     */
    public ?\App\DTO\Collection197 $half_damage_from = null;

    /**
     * @DTA\Data(field="double_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection198::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection198::class})
     */
    public ?\App\DTO\Collection198 $double_damage_from = null;

}
