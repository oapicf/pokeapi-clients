//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/berry_firmness_summary.dart';
import 'package:openapi/src/model/berry_flavor_map.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_detail.g.dart';

/// BerryDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [growthTime] - Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
/// * [maxHarvest] - The maximum number of these berries that can grow on one tree in Generation IV.
/// * [naturalGiftPower] - The power of the move \"Natural Gift\" when used with this Berry.
/// * [size] - The size of this Berry, in millimeters.
/// * [smoothness] - The smoothness of this Berry, used in making Pokéblocks or Poffins.
/// * [soilDryness] - The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
/// * [firmness] - The firmness of this berry, used in making Pokéblocks or Poffins.
/// * [flavors] - A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
/// * [item] - Berries are actually items. This is a reference to the item specific data for this berry.
/// * [naturalGiftType] - The type inherited by \"Natural Gift\" when used with this Berry.
@BuiltValue()
abstract class BerryDetail implements Built<BerryDetail, BerryDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
  @BuiltValueField(wireName: r'growth_time')
  int? get growthTime;

  /// The maximum number of these berries that can grow on one tree in Generation IV.
  @BuiltValueField(wireName: r'max_harvest')
  int? get maxHarvest;

  /// The power of the move \"Natural Gift\" when used with this Berry.
  @BuiltValueField(wireName: r'natural_gift_power')
  int? get naturalGiftPower;

  /// The size of this Berry, in millimeters.
  @BuiltValueField(wireName: r'size')
  int? get size;

  /// The smoothness of this Berry, used in making Pokéblocks or Poffins.
  @BuiltValueField(wireName: r'smoothness')
  int? get smoothness;

  /// The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
  @BuiltValueField(wireName: r'soil_dryness')
  int? get soilDryness;

  /// The firmness of this berry, used in making Pokéblocks or Poffins.
  @BuiltValueField(wireName: r'firmness')
  BerryFirmnessSummary? get firmness;

  /// A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
  @BuiltValueField(wireName: r'flavors')
  BuiltList<BerryFlavorMap> get flavors;

  /// Berries are actually items. This is a reference to the item specific data for this berry.
  @BuiltValueField(wireName: r'item')
  ItemSummary get item;

  /// The type inherited by \"Natural Gift\" when used with this Berry.
  @BuiltValueField(wireName: r'natural_gift_type')
  TypeSummary? get naturalGiftType;

  BerryDetail._();

  factory BerryDetail([void updates(BerryDetailBuilder b)]) = _$BerryDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryDetail> get serializer => _$BerryDetailSerializer();
}

class _$BerryDetailSerializer implements PrimitiveSerializer<BerryDetail> {
  @override
  final Iterable<Type> types = const [BerryDetail, _$BerryDetail];

  @override
  final String wireName = r'BerryDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.growthTime != null) {
      yield r'growth_time';
      yield serializers.serialize(
        object.growthTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.maxHarvest != null) {
      yield r'max_harvest';
      yield serializers.serialize(
        object.maxHarvest,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.naturalGiftPower != null) {
      yield r'natural_gift_power';
      yield serializers.serialize(
        object.naturalGiftPower,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.smoothness != null) {
      yield r'smoothness';
      yield serializers.serialize(
        object.smoothness,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.soilDryness != null) {
      yield r'soil_dryness';
      yield serializers.serialize(
        object.soilDryness,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'firmness';
    yield object.firmness == null ? null : serializers.serialize(
      object.firmness,
      specifiedType: const FullType.nullable(BerryFirmnessSummary),
    );
    yield r'flavors';
    yield serializers.serialize(
      object.flavors,
      specifiedType: const FullType(BuiltList, [FullType(BerryFlavorMap)]),
    );
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(ItemSummary),
    );
    yield r'natural_gift_type';
    yield object.naturalGiftType == null ? null : serializers.serialize(
      object.naturalGiftType,
      specifiedType: const FullType.nullable(TypeSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'growth_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.growthTime = valueDes;
          break;
        case r'max_harvest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxHarvest = valueDes;
          break;
        case r'natural_gift_power':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.naturalGiftPower = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'smoothness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.smoothness = valueDes;
          break;
        case r'soil_dryness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.soilDryness = valueDes;
          break;
        case r'firmness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BerryFirmnessSummary),
          ) as BerryFirmnessSummary?;
          if (valueDes == null) continue;
          result.firmness.replace(valueDes);
          break;
        case r'flavors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerryFlavorMap)]),
          ) as BuiltList<BerryFlavorMap>;
          result.flavors.replace(valueDes);
          break;
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemSummary),
          ) as ItemSummary;
          result.item.replace(valueDes);
          break;
        case r'natural_gift_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TypeSummary),
          ) as TypeSummary?;
          if (valueDes == null) continue;
          result.naturalGiftType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BerryDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryDetailBuilder();
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


