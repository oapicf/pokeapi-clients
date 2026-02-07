<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TypeDetailDamageRelations
{
    /**
     * @DTA\Data(field="no_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection193::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection193::class})
     * @var \App\DTO\Collection193|null
     */
    public $no_damage_to;

    /**
     * @DTA\Data(field="half_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection194::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection194::class})
     * @var \App\DTO\Collection194|null
     */
    public $half_damage_to;

    /**
     * @DTA\Data(field="double_damage_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection195::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection195::class})
     * @var \App\DTO\Collection195|null
     */
    public $double_damage_to;

    /**
     * @DTA\Data(field="no_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection196::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection196::class})
     * @var \App\DTO\Collection196|null
     */
    public $no_damage_from;

    /**
     * @DTA\Data(field="half_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection197::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection197::class})
     * @var \App\DTO\Collection197|null
     */
    public $half_damage_from;

    /**
     * @DTA\Data(field="double_damage_from")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection198::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection198::class})
     * @var \App\DTO\Collection198|null
     */
    public $double_damage_from;

}
