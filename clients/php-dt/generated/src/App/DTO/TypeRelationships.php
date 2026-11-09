<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TypeRelationships
{
    /**
     * A list of types this type has no effect on.
     * @DTA\Data(field="no_damage_to")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $no_damage_to = null;

    /**
     * A list of types this type is not very effect against.
     * @DTA\Data(field="half_damage_to")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $half_damage_to = null;

    /**
     * A list of types this type is very effect against.
     * @DTA\Data(field="double_damage_to")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $double_damage_to = null;

    /**
     * A list of types that have no effect on this type.
     * @DTA\Data(field="no_damage_from")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $no_damage_from = null;

    /**
     * A list of types that are not very effective against this type.
     * @DTA\Data(field="half_damage_from")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $half_damage_from = null;

    /**
     * A list of types that are very effective against this type.
     * @DTA\Data(field="double_damage_from")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $double_damage_from = null;

}
