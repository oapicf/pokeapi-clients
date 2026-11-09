//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/currency_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_price.g.dart';

/// ItemPrice
///
/// Properties:
/// * [purchasePrice] - The purchase price in this currency and version group, or null if unavailable.
/// * [sellPrice] - The sell price in this currency and version group, or null if unavailable.
/// * [currency] - The currency used for this price.
/// * [versionGroup] - The version group to which this price applies.
@BuiltValue()
abstract class ItemPrice implements Built<ItemPrice, ItemPriceBuilder> {
  /// The purchase price in this currency and version group, or null if unavailable.
  @BuiltValueField(wireName: r'purchase_price')
  int? get purchasePrice;

  /// The sell price in this currency and version group, or null if unavailable.
  @BuiltValueField(wireName: r'sell_price')
  int? get sellPrice;

  /// The currency used for this price.
  @BuiltValueField(wireName: r'currency')
  CurrencySummary get currency;

  /// The version group to which this price applies.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  ItemPrice._();

  factory ItemPrice([void updates(ItemPriceBuilder b)]) = _$ItemPrice;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemPriceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemPrice> get serializer => _$ItemPriceSerializer();
}

class _$ItemPriceSerializer implements PrimitiveSerializer<ItemPrice> {
  @override
  final Iterable<Type> types = const [ItemPrice, _$ItemPrice];

  @override
  final String wireName = r'ItemPrice';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemPrice object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.purchasePrice != null) {
      yield r'purchase_price';
      yield serializers.serialize(
        object.purchasePrice,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.sellPrice != null) {
      yield r'sell_price';
      yield serializers.serialize(
        object.sellPrice,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'currency';
    yield serializers.serialize(
      object.currency,
      specifiedType: const FullType(CurrencySummary),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemPrice object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemPriceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'purchase_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.purchasePrice = valueDes;
          break;
        case r'sell_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.sellPrice = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CurrencySummary),
          ) as CurrencySummary;
          result.currency.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemPrice deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemPriceBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


