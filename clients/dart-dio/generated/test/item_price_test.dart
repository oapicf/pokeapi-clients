import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ItemPrice
void main() {
  final instance = ItemPriceBuilder();
  // TODO add properties to the builder and call build()

  group(ItemPrice, () {
    // The purchase price in this currency and version group, or null if unavailable.
    // int purchasePrice
    test('to test the property `purchasePrice`', () async {
      // TODO
    });

    // The sell price in this currency and version group, or null if unavailable.
    // int sellPrice
    test('to test the property `sellPrice`', () async {
      // TODO
    });

    // The currency used for this price.
    // CurrencySummary currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // The version group to which this price applies.
    // VersionGroupSummary versionGroup
    test('to test the property `versionGroup`', () async {
      // TODO
    });

  });
}
