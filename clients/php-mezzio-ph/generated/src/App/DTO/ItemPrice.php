<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemPrice
{
    /**
     * The purchase price in this currency and version group, or null if unavailable.
     * @DTA\Data(field="purchase_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $purchase_price;

    /**
     * The sell price in this currency and version group, or null if unavailable.
     * @DTA\Data(field="sell_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $sell_price;

    /**
     * The currency used for this price.
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencySummary::class})
     * @var \App\DTO\CurrencySummary|null
     */
    public $currency;

    /**
     * The version group to which this price applies.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

}
